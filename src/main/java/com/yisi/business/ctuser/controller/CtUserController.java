package com.yisi.business.ctuser.controller;
import com.alibaba.fastjson.JSONObject;
import com.yisi.business.ctuser.entity.CtUserEntity;
import com.yisi.business.ctuser.service.CtUserServiceI;
import com.yisi.business.util.HttpUtil;
import com.yisi.business.util.MD5Encrypt;

import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.common.TreeChildCount;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import java.io.OutputStream;
import org.jeecgframework.core.util.BrowserUtils;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.TemplateExportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.vo.TemplateExcelConstants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jeecgframework.core.util.ResourceUtil;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.util.Map;
import java.util.HashMap;
import org.jeecgframework.core.util.ExceptionUtil;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.net.URI;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

/**   
 * @Title: Controller  
 * @Description: 用户信息表
 * @author onlineGenerator
 * @date 2018-04-08 15:10:57
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/ctUserController")
public class CtUserController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(CtUserController.class);

	@Autowired
	private CtUserServiceI ctUserService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	
	private String CREATE_USER_URL = "http://103.43.71.126:8090/dce-app/user/reg.do";

	/**
	 * 用户信息表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/yisi/business/ctuser/ctUserList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(CtUserEntity ctUser,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(CtUserEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, ctUser, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.ctUserService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除用户信息表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(CtUserEntity ctUser, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		ctUser = systemService.getEntity(CtUserEntity.class, ctUser.getId());
		message = "用户信息表删除成功";
		try{
			ctUserService.delete(ctUser);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "用户信息表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除用户信息表
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "用户信息表删除成功";
		try{
			for(String id:ids.split(",")){
				CtUserEntity ctUser = systemService.getEntity(CtUserEntity.class, 
				Integer.parseInt(id)
				);
				ctUserService.delete(ctUser);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "用户信息表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加用户信息表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(CtUserEntity ctUser, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "用户信息表添加成功";
		
		  JSONObject jsonObject = new JSONObject();
	        jsonObject.put("userName", ctUser.getUserName());
	        jsonObject.put("trueName", ctUser.getTrueName());
	        jsonObject.put("mobile", ctUser.getMobile());
	        
	        jsonObject.put("idnumber", ctUser.getIdnumber());
	        
	        jsonObject.put("refereeUserName", request.getParameter("refferUserName"));
	        jsonObject.put("parentUserName",  request.getParameter("parentUserName"));
	        
	        jsonObject.put("pos", ctUser.getPos());
	        jsonObject.put("banktype", ctUser.getBanktype());
	        
	        jsonObject.put("bankUserName", ctUser.getBankUserName());
	        jsonObject.put("banknumber", ctUser.getBanknumber());
	        jsonObject.put("bankContent", ctUser.getBankContent());
	       
	        jsonObject.put("userPassword", ctUser.getUserPassword());
	        jsonObject.put("twoPassword", ctUser.getTwoPassword());
	        
	       
		
		try{
//			ctUserService.save(ctUser);
			 Map<String, Object> resultMap =  HttpUtil.post(CREATE_USER_URL, jsonObject);
			 message = (String)resultMap.get("msg");
			 systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "用户信息表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新用户信息表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(CtUserEntity ctUser, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "用户信息表更新成功";
		CtUserEntity t = ctUserService.get(CtUserEntity.class, ctUser.getId());
		
		
		try {
			String oldPassword = t.getUserPassword();
			String newPassword = ctUser.getUserPassword();
			
			String oldTwoPassword = t.getTwoPassword();
			String newTwoPassword = ctUser.getTwoPassword();
			if(!oldPassword.equals(newPassword)){
				String md5Password = MD5Encrypt.getMessageDigest(newPassword);
				ctUser.setUserPassword(md5Password);
			}
			
			if(!oldTwoPassword.equals(newTwoPassword)){
				String md5Password = MD5Encrypt.getMessageDigest(newTwoPassword);
				ctUser.setTwoPassword(md5Password);
			}
			
			MyBeanUtils.copyBeanNotNull2Bean(ctUser, t);
			ctUserService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "用户信息表更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 用户信息表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(CtUserEntity ctUser, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(ctUser.getId())) {
			ctUser = ctUserService.getEntity(CtUserEntity.class, ctUser.getId());
			req.setAttribute("ctUserPage", ctUser);
		}
		return new ModelAndView("com/yisi/business/ctuser/ctUser-add");
	}
	/**
	 * 用户信息表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "userOrgin")
	public ModelAndView userOrgin(CtUserEntity ctUser, HttpServletRequest req) {
		int userId = ctUser.getId();
		String reqParentid = req.getParameter("topParentid");
	
		if (StringUtil.isNotEmpty(userId)) {
			ctUser = ctUserService.getEntity(CtUserEntity.class, userId);
			//顶级用户信息
			Map<String,Object> topMap = conMap(ctUser.getUserName(),ctUser.getTrueName(),ctUser.getUserLevel(),
					0,0,ctUser.getStatus(),userId);
			if(StringUtils.isBlank(reqParentid)){
				reqParentid = "" + userId;
			}
			int parentId = ctUser.getParentid();
			if(("" + userId).equals(reqParentid)){
				parentId = userId;
			}
			
			req.setAttribute("topMap", topMap);
			req.setAttribute("parentId", parentId);
			req.setAttribute("topParentid", reqParentid);
			//用户子信息
			String childSql = "SELECT b.id,b.user_name  userName,b.true_name trueName,"
							+ "		case when b.status =0 then '正常' else '禁用' end as active ,b.total_performance, "
							+ " b.referee_number,b.user_level userLevel,b.reg_time,a.distance, "
							+ "	a.lr_district,a.position "
							+ " FROM   ct_user_parent  a "
							+ " LEFT JOIN  ct_user b ON a.userid =b.id  "
							+ " where a.parentid = ?";
			List<Map<String,Object>> childList = systemService.findForJdbc(childSql, userId);
			for (Map<String, Object> map : childList) {
				String position = (String)map.get("position");
				int distance = (int)map.get("distance");
				req.setAttribute("childMap" +distance +position  , map);
			}
			
			
		}	
		return new ModelAndView("com/yisi/business/ctuser/user_tree");
	}
	
	public Map<String,Object> conMap(String userName,String trueName,int userLevel,
			int leftNumber,int rightNumber,int status,int userId){
		Map<String,Object> topMap = new HashMap<String,Object>();
		topMap.put("userName", userName);
		topMap.put("trueName", trueName);
		topMap.put("userLevel", userLevel);
		topMap.put("leftNumber",leftNumber);
		topMap.put("rightNumber",rightNumber);
		topMap.put("id",userId);
		String statues = "正常";
		if(status == 1){
			statues = "禁用";
		}
		topMap.put("active",statues);
		
		return topMap;
	}
	/**
	 * 用户信息表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "userRef")
	public ModelAndView userRef(CtUserEntity ctUser, HttpServletRequest req) {
		int userId = ctUser.getId();
		if (StringUtil.isNotEmpty(userId)) {
			ctUser = ctUserService.getEntity(CtUserEntity.class, userId);
			req.setAttribute("ctUserPage", ctUser);
		}	
		
		//ztree同步加载
//		String listSql = "	select cu.id,up.refereeid pid,cu.true_name name from  ct_user_referee  up "
//						+ "	left join ct_user cu on up.userid=cu.id	"
//						+ " where up.userid=?";
		List<Map<String, Object>> userList = new ArrayList<Map<String, Object>>();
		
		getUserRef(userId,userList,1);
		
		JSONArray jsonArray=JSONArray.fromObject(userList);
		req.setAttribute("regions", jsonArray.toString().replaceAll("pid","pId"));
		
		return new ModelAndView("com/yisi/business/ctuser/user_ref");
	}
	/**
	 * Ztree
	 * 获取所有的用户结点数据
	 * @return
	 */
	public List<Map<String, Object>> getZtreeData(long parentId,List<Map<String, Object>> userList){
		
		
		String parentSql = "	select cu.id,up.parentid pid,cu.user_name name from ct_user_parent  up "
				+"	left join ct_user cu on up.userid=cu.id"
				+ " where up.parentid=?";
		
			List<Map<String, Object>> tempList = systemService.findForJdbc(parentSql, parentId);
			if(null != tempList && tempList.size()>0){
				userList.addAll(tempList);
				for (Map<String, Object> map : tempList) {
					long tempId = (long) map.get("id");
					getZtreeData(tempId,userList);
				}
				
				
				
			}
		
		
		return tempList;
	}
	/**
	 * Ztree
	 * 获取所有的用户推荐数据
	 * @return
	 */
	public List<Map<String, Object>> getUserRef(long parentId,List<Map<String, Object>> userList,int distance){
		
		
//		String parentSql = "	select cu.id,up.refereeid pid,cu.user_name name from  ct_user_referee  up "
//						 + "	left join ct_user cu on up.userid=cu.id	"
//						 + " 	where up.userid = ?";
		
		String parentSql =  " SELECT  CONCAT(b.true_name,'[',b.user_name,']') AS name, "
						 +  " b.id,a.refereeid pid,a.distance "
						 +  " FROM  ct_user_referee a "
						 + " LEFT JOIN  ct_user b ON a.userid =b.id  "
						 +  " where a.refereeid = ? "
						+ "		and  a.distance <= ? ";
		
		
		List<Map<String, Object>> tempList = systemService.findForJdbc(parentSql, parentId,distance);
		if(null != tempList && tempList.size()>0){
			userList.addAll(tempList);
			for (Map<String, Object> map : tempList) {
				long tempId = (long) map.get("id");
				int tempDistance = (int) map.get("distance");
				getUserRef(tempId,userList,tempDistance);
			}
			
			
			
		}
		
		
		return tempList;
	}
	/**
	 * 用户信息表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(CtUserEntity ctUser, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(ctUser.getId())) {
			ctUser = ctUserService.getEntity(CtUserEntity.class, ctUser.getId());
			req.setAttribute("ctUserPage", ctUser);
		}
		return new ModelAndView("com/yisi/business/ctuser/ctUser-update");
	}
	/**
	 * 用户信息表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goChongzhi")
	public ModelAndView goChongzhi(CtUserEntity ctUser, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(ctUser.getId())) {
			ctUser = ctUserService.getEntity(CtUserEntity.class, ctUser.getId());
			req.setAttribute("ctUserPage", ctUser);
		}
		return new ModelAndView("com/yisi/business/ctuser/ctUser-chongzhi");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","ctUserController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(CtUserEntity ctUser,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(CtUserEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, ctUser, request.getParameterMap());
		List<CtUserEntity> ctUsers = this.ctUserService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"用户信息表");
		modelMap.put(NormalExcelConstants.CLASS,CtUserEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("用户信息表列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,ctUsers);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(CtUserEntity ctUser,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"用户信息表");
    	modelMap.put(NormalExcelConstants.CLASS,CtUserEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("用户信息表列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
    	"导出信息"));
    	modelMap.put(NormalExcelConstants.DATA_LIST,new ArrayList());
    	return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<CtUserEntity> listCtUserEntitys = ExcelImportUtil.importExcel(file.getInputStream(),CtUserEntity.class,params);
				for (CtUserEntity ctUser : listCtUserEntitys) {
					ctUserService.save(ctUser);
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(ExceptionUtil.getExceptionMessage(e));
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return j;
	}
	
	
}
