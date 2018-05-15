package com.yisi.business.ctaccount.controller;
import com.yisi.business.ctaccount.entity.CtUserAccountDetailEntity;
import com.yisi.business.ctaccount.service.CtUserAccountDetailServiceI;
import com.yisi.business.util.AccountType;
import com.yisi.business.util.IncomeType;

import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
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
import org.jeecgframework.p3.core.util.oConvertUtils;
import org.jeecgframework.p3.core.utils.common.StringUtils;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import java.io.OutputStream;
import org.jeecgframework.core.util.BrowserUtils;
import org.jeecgframework.core.util.DateUtils;
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
 * @Description: 用户账户明细
 * @author onlineGenerator
 * @date 2018-04-08 15:40:52
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/ctUserAccountDetailController")
public class CtUserAccountDetailController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(CtUserAccountDetailController.class);

	@Autowired
	private CtUserAccountDetailServiceI ctUserAccountDetailService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 用户账户明细列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/yisi/business/ctaccount/ctUserAccountDetailList");
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
	public void datagrid(CtUserAccountDetailEntity ctUserAccountDetail,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(CtUserAccountDetailEntity.class, dataGrid);
		
		String createDateStart = request.getParameter("createDateStart");
		
		//查询条件组装器
		ctUserAccountDetail.setSearchDate(null);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, ctUserAccountDetail, request.getParameterMap());
		try{
			//时间范围查询条件
	        String operatetime_begin = request.getParameter("searchDate_begin");
	        String operatetime_end = request.getParameter("searchDate_end");
	        if(oConvertUtils.isNotEmpty(operatetime_begin)){
	        	try {
					cq.ge("createtime", DateUtils.parseDate(operatetime_begin, "yyyy-MM-dd"));
				} catch (ParseException e) {
					logger.error(e);
				}
	        	cq.add();
	        }
	        if(oConvertUtils.isNotEmpty(operatetime_end)){
	        	try {
					cq.le("createtime", DateUtils.parseDate(operatetime_end, "yyyy-MM-dd"));
				} catch (ParseException e) {
					logger.error(e);
				}
	        	cq.add();
	        }
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.ctUserAccountDetailService.getDataGridReturn(cq, true);
//		if(StringUtils.isNotBlank(ctUserAccountDetail.getCtUser().getUserName()) )
//		dataGrid.setFooter("合计:,age,email:合计");
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除用户账户明细
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(CtUserAccountDetailEntity ctUserAccountDetail, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		ctUserAccountDetail = systemService.getEntity(CtUserAccountDetailEntity.class, ctUserAccountDetail.getId());
		message = "用户账户明细删除成功";
		try{
			ctUserAccountDetailService.delete(ctUserAccountDetail);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "用户账户明细删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除用户账户明细
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "用户账户明细删除成功";
		try{
			for(String id:ids.split(",")){
				CtUserAccountDetailEntity ctUserAccountDetail = systemService.getEntity(CtUserAccountDetailEntity.class, 
				Integer.parseInt(id)
				);
				ctUserAccountDetailService.delete(ctUserAccountDetail);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "用户账户明细删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加用户账户明细
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(CtUserAccountDetailEntity ctUserAccountDetail, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "用户账户明细添加成功";
		try{
			ctUserAccountDetailService.save(ctUserAccountDetail);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "用户账户明细添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新用户账户明细
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(CtUserAccountDetailEntity ctUserAccountDetail, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "用户账户明细更新成功";
		CtUserAccountDetailEntity t = ctUserAccountDetailService.get(CtUserAccountDetailEntity.class, ctUserAccountDetail.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(ctUserAccountDetail, t);
			ctUserAccountDetailService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "用户账户明细更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 用户账户明细新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(CtUserAccountDetailEntity ctUserAccountDetail, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(ctUserAccountDetail.getId())) {
			ctUserAccountDetail = ctUserAccountDetailService.getEntity(CtUserAccountDetailEntity.class, ctUserAccountDetail.getId());
			req.setAttribute("ctUserAccountDetailPage", ctUserAccountDetail);
		}
		return new ModelAndView("com/yisi/business/ctaccount/ctUserAccountDetail-add");
	}
	/**
	 * 用户账户明细编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(CtUserAccountDetailEntity ctUserAccountDetail, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(ctUserAccountDetail.getId())) {
			ctUserAccountDetail = ctUserAccountDetailService.getEntity(CtUserAccountDetailEntity.class, ctUserAccountDetail.getId());
			req.setAttribute("ctUserAccountDetailPage", ctUserAccountDetail);
		}
		return new ModelAndView("com/yisi/business/ctaccount/ctUserAccountDetail-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","ctUserAccountDetailController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(CtUserAccountDetailEntity ctUserAccountDetail,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(CtUserAccountDetailEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, ctUserAccountDetail, request.getParameterMap());
		List<CtUserAccountDetailEntity> ctUserAccountDetails = this.ctUserAccountDetailService.getListByCriteriaQuery(cq,false);
		
//		IncomeType it = new IncomeType();
		for (CtUserAccountDetailEntity cad : ctUserAccountDetails) {
			if(null != cad.getCtUser()){
				cad.setUserName(cad.getCtUser().getUserName() + "[" + cad.getCtUser().getTrueName()+ "]");
			}
			String incomeType = IncomeType.getTypeStByType(cad.getIncometype());
			String aType = AccountType.getTypeStByType(cad.getAccounttype());
			cad.setIncomeStr(incomeType);
			cad.setAccounttype(aType);
		}
		modelMap.put(NormalExcelConstants.FILE_NAME,"用户账户明细");
		modelMap.put(NormalExcelConstants.CLASS,CtUserAccountDetailEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("用户账户明细列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,ctUserAccountDetails);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(CtUserAccountDetailEntity ctUserAccountDetail,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"用户账户明细");
    	modelMap.put(NormalExcelConstants.CLASS,CtUserAccountDetailEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("用户账户明细列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
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
				List<CtUserAccountDetailEntity> listCtUserAccountDetailEntitys = ExcelImportUtil.importExcel(file.getInputStream(),CtUserAccountDetailEntity.class,params);
				for (CtUserAccountDetailEntity ctUserAccountDetail : listCtUserAccountDetailEntitys) {
					ctUserAccountDetailService.save(ctUserAccountDetail);
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
