package com.yisi.business.ctaccount.controller;
import com.yisi.business.ctaccount.entity.CtUserAccountEntity;
import com.yisi.business.ctaccount.service.CtUserAccountServiceI;
import com.yisi.business.ctuser.entity.CtUserEntity;
import com.yisi.business.util.AccountType;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import java.math.BigDecimal;

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
 * @Description: 用户账户类型
 * @author onlineGenerator
 * @date 2018-04-08 15:25:53
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/ctUserAccountController")
public class CtUserAccountController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(CtUserAccountController.class);

	@Autowired
	private CtUserAccountServiceI ctUserAccountService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 用户账户类型列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/yisi/business/ctaccount/ctUserAccountList");
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
//		CriteriaQuery cq = new CriteriaQuery(CtUserAccountEntity.class, dataGrid);
		
		CriteriaQuery cq = new CriteriaQuery(CtUserEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, ctUser, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.ctUserAccountService.getDataGridReturn(cq, true);
		List<CtUserEntity> userList = dataGrid.getResults();
		
		String accountSql = " select  amount originalamount,"
				+ "     (select  amount  from ct_user_account cub where cua.userid = cub.userid and cub.accounttype='current' limit 1) current,"
				+ "     (select amount  from ct_user_account cuc where cua.userid = cuc.userid and cuc.accounttype='point' limit 1) pointamount,"
				+ "     (select amount  from ct_user_account cud where cua.userid = cud.userid and cud.accounttype='score' limit 1) scoreamount"
				+ "  from "
				+ " ct_user_account cua "
				+ " where cua.userid = ?  and cua.accounttype='original'";
		for (CtUserEntity ctUserEntity : userList) {
			int userId = ctUserEntity.getId();
			List<Map<String,Object>> accountList = systemService.findForJdbc(accountSql,userId);
			if(null != accountList && accountList.size() > 0){
				Map<String,Object> accountMap = accountList.get(0);
				ctUserEntity.setBalanceIntegral((BigDecimal)accountMap.get("originalamount"));
				ctUserEntity.setBalanceBonus((BigDecimal)accountMap.get("current"));
				ctUserEntity.setBalanceCash((BigDecimal)accountMap.get("scoreamount"));
				ctUserEntity.setBalanceShopping((BigDecimal)accountMap.get("pointamount"));
				
			}
//			
		}
		
//		String viewSql = "  select  cu.id,user_name userName,mobile,    "
//				+ "  cua.amount originalamount,"
//				+ "  cub.amount amount,"
//				+ "  cuc.amount pointamount,"
//				+ "  cud.amount scoreamount "
//				+ "  from ct_user cu"
//				+ "  left join ct_user_account cua on  cu.id = cua.userid and cua.accounttype='original'"
//				+ "  left join ct_user_account cub on  cu.id = cub.userid and cub.accounttype='current'"
//				+ "  left join ct_user_account cuc on  cu.id = cuc.userid and cuc.accounttype='point'"
//				+ "  left join ct_user_account cud on  cu.id = cud.userid and cud.accounttype='score'"
//				+ "  where 1=1 ";
//		
//		long count = systemService.getCountForJdbc("select count(1) from ct_user");
//		List<Map<String,Object>> accountList = systemService.findForJdbcParam(viewSql, page, rows);
//		//查询条件组装器
////		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, ctUserAccount, request.getParameterMap());
//		try{
//		//自定义追加查询条件
//		}catch (Exception e) {
//			throw new BusinessException(e.getMessage());
//		}
//		cq.add();
//		dataGrid.setResults(accountList);
//		dataGrid.setTotal((int)count);
//		this.ctUserAccountService.getDataGridReturn(cq, true);
		dataGrid.setFooter("合计:,originalamount,pointamount:合计");
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除用户账户类型
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(CtUserAccountEntity ctUserAccount, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		ctUserAccount = systemService.getEntity(CtUserAccountEntity.class, ctUserAccount.getId());
		message = "用户账户类型删除成功";
		try{
			ctUserAccountService.delete(ctUserAccount);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "用户账户类型删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除用户账户类型
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "用户账户类型删除成功";
		try{
			for(String id:ids.split(",")){
				CtUserAccountEntity ctUserAccount = systemService.getEntity(CtUserAccountEntity.class, 
				Integer.parseInt(id)
				);
				ctUserAccountService.delete(ctUserAccount);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "用户账户类型删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加用户账户类型
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(CtUserAccountEntity ctUserAccount, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "用户账户类型添加成功";
		try{
			String action = request.getParameter("action");
			String remark = request.getParameter("remark");
			BigDecimal amount = ctUserAccount.getAmount();
			if(action.equals("sub")){
				amount = amount.negate();
			}
			String atype = ctUserAccount.getAccounttype();
			
			
			//修改账户金额
			ctUserAccountService.updateUserAcount(ctUserAccount.getUserid(), 
					atype, amount, action,remark);
			
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "用户账户类型添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新用户账户类型
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(CtUserAccountEntity ctUserAccount, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "用户账户类型更新成功";
		CtUserAccountEntity t = ctUserAccountService.get(CtUserAccountEntity.class, ctUserAccount.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(ctUserAccount, t);
			ctUserAccountService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "用户账户类型更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 用户账户类型新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(CtUserAccountEntity ctUserAccount, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(ctUserAccount.getId())) {
//			ctUserAccount = ctUserAccountService.get(CtUserAccountEntity.class, ctUserAccount.getId());
			CtUserEntity ctUser = systemService.getEntity(CtUserEntity.class, ctUserAccount.getId());
			ctUserAccount.setCtUser(ctUser);
			req.setAttribute("ctUserAccountPage", ctUserAccount);
		}
		String action = req.getParameter("action");
		if("add".equals(action)){
			return new ModelAndView("com/yisi/business/ctaccount/ctUserAccount-add");
		}else{
			return new ModelAndView("com/yisi/business/ctaccount/ctUserAccount-sub");
		}
	}
	/**
	 * 用户账户类型编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(CtUserAccountEntity ctUserAccount, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(ctUserAccount.getId())) {
			
			CtUserEntity ctUser = systemService.getEntity(CtUserEntity.class, ctUserAccount.getId());
			ctUserAccount.setCtUser(ctUser);
			req.setAttribute("ctUserAccountPage", ctUserAccount);
		}
		return new ModelAndView("com/yisi/business/ctaccount/ctUserAccount-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","ctUserAccountController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(CtUserAccountEntity ctUserAccount,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(CtUserAccountEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, ctUserAccount, request.getParameterMap());
		List<CtUserAccountEntity> ctUserAccounts = this.ctUserAccountService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"用户账户类型");
		modelMap.put(NormalExcelConstants.CLASS,CtUserAccountEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("用户账户类型列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,ctUserAccounts);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(CtUserAccountEntity ctUserAccount,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"用户账户类型");
    	modelMap.put(NormalExcelConstants.CLASS,CtUserAccountEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("用户账户类型列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
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
				List<CtUserAccountEntity> listCtUserAccountEntitys = ExcelImportUtil.importExcel(file.getInputStream(),CtUserAccountEntity.class,params);
				for (CtUserAccountEntity ctUserAccount : listCtUserAccountEntitys) {
					ctUserAccountService.save(ctUserAccount);
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
