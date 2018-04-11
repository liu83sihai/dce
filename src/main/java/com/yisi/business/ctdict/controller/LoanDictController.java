package com.yisi.business.ctdict.controller;
import com.yisi.business.ctdict.entity.LoanDictEntity;
import com.yisi.business.ctdict.service.LoanDictServiceI;
import com.yisi.business.ctdict.page.LoanDictPage;
import com.yisi.business.ctdict.entity.TLoanDictDtlEntity;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.ExceptionUtil;
import org.jeecgframework.core.util.ResourceUtil;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.io.IOException;
import java.util.Map;

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
 * @Description: 数据词典
 * @author onlineGenerator
 * @date 2018-04-10 14:58:27
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/loanDictController")
public class LoanDictController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(LoanDictController.class);

	@Autowired
	private LoanDictServiceI loanDictService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;

	/**
	 * 数据词典列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/yisi/business/ctdict/loanDictList");
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
	public void datagrid(LoanDictEntity loanDict,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(LoanDictEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, loanDict);
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.loanDictService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除数据词典
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(LoanDictEntity loanDict, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		loanDict = systemService.getEntity(LoanDictEntity.class, loanDict.getId());
		String message = "数据词典删除成功";
		try{
			loanDictService.delMain(loanDict);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "数据词典删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 批量删除数据词典
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		String message = "数据词典删除成功";
		try{
			for(String id:ids.split(",")){
				LoanDictEntity loanDict = systemService.getEntity(LoanDictEntity.class,
				Integer.parseInt(id)
				);
				loanDictService.delMain(loanDict);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "数据词典删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 添加数据词典
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(LoanDictEntity loanDict,LoanDictPage loanDictPage, HttpServletRequest request) {
		List<TLoanDictDtlEntity> tLoanDictDtlList =  loanDictPage.getTLoanDictDtlList();
		AjaxJson j = new AjaxJson();
		String message = "添加成功";
		try{
			loanDictService.addMain(loanDict, tLoanDictDtlList);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "数据词典添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	/**
	 * 更新数据词典
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(LoanDictEntity loanDict,LoanDictPage loanDictPage, HttpServletRequest request) {
		List<TLoanDictDtlEntity> tLoanDictDtlList =  loanDictPage.getTLoanDictDtlList();
		AjaxJson j = new AjaxJson();
		String message = "更新成功";
		try{
			loanDictService.updateMain(loanDict, tLoanDictDtlList);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "更新数据词典失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 数据词典新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(LoanDictEntity loanDict, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(loanDict.getId())) {
			loanDict = loanDictService.getEntity(LoanDictEntity.class, loanDict.getId());
			req.setAttribute("loanDictPage", loanDict);
		}
		return new ModelAndView("com/yisi/business/ctdict/loanDict-add");
	}
	
	/**
	 * 数据词典编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(LoanDictEntity loanDict, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(loanDict.getId())) {
			loanDict = loanDictService.getEntity(LoanDictEntity.class, loanDict.getId());
			req.setAttribute("loanDictPage", loanDict);
		}
		return new ModelAndView("com/yisi/business/ctdict/loanDict-update");
	}
	
	
	/**
	 * 加载明细列表[数据词典明细]
	 * 
	 * @return
	 */
	@RequestMapping(params = "tLoanDictDtlList")
	public ModelAndView tLoanDictDtlList(LoanDictEntity loanDict, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object id0 = loanDict.getId();
		//===================================================================================
		//查询-数据词典明细
	    String hql0 = "from TLoanDictDtlEntity where 1 = 1 AND dICTID = ? ";
	    try{
	    	List<TLoanDictDtlEntity> tLoanDictDtlEntityList = systemService.findHql(hql0,id0);
			req.setAttribute("tLoanDictDtlList", tLoanDictDtlEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/yisi/business/ctdict/tLoanDictDtlList");
	}

    /**
    * 导出excel
    *
    * @param request
    * @param response
    */
    @RequestMapping(params = "exportXls")
    public String exportXls(LoanDictEntity loanDict,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid,ModelMap map) {
    	CriteriaQuery cq = new CriteriaQuery(LoanDictEntity.class, dataGrid);
    	//查询条件组装器
    	org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, loanDict);
    	try{
    	//自定义追加查询条件
    	}catch (Exception e) {
    		throw new BusinessException(e.getMessage());
    	}
    	cq.add();
    	List<LoanDictEntity> list=this.loanDictService.getListByCriteriaQuery(cq, false);
    	List<LoanDictPage> pageList=new ArrayList<LoanDictPage>();
        if(list!=null&&list.size()>0){
        	for(LoanDictEntity entity:list){
        		try{
        		LoanDictPage page=new LoanDictPage();
        		   MyBeanUtils.copyBeanNotNull2Bean(entity,page);
            	    Object id0 = entity.getId();
				    String hql0 = "from TLoanDictDtlEntity where 1 = 1 AND dICTID = ? ";
        	        List<TLoanDictDtlEntity> tLoanDictDtlEntityList = systemService.findHql(hql0,id0);
            		page.setTLoanDictDtlList(tLoanDictDtlEntityList);
            		pageList.add(page);
            	}catch(Exception e){
            		logger.info(e.getMessage());
            	}
            }
        }
        map.put(NormalExcelConstants.FILE_NAME,"数据词典");
        map.put(NormalExcelConstants.CLASS,LoanDictPage.class);
        map.put(NormalExcelConstants.PARAMS,new ExportParams("数据词典列表", "导出人:Jeecg",
            "导出信息"));
        map.put(NormalExcelConstants.DATA_LIST,pageList);
        return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}

    /**
	 * 通过excel导入数据
	 * @param request
	 * @param
	 * @return
	 */
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
			params.setHeadRows(2);
			params.setNeedSave(true);
			try {
				List<LoanDictPage> list =  ExcelImportUtil.importExcel(file.getInputStream(), LoanDictPage.class, params);
				LoanDictEntity entity1=null;
				for (LoanDictPage page : list) {
					entity1=new LoanDictEntity();
					MyBeanUtils.copyBeanNotNull2Bean(page,entity1);
		            loanDictService.addMain(entity1, page.getTLoanDictDtlList());
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
	/**
	* 导出excel 使模板
	*/
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(ModelMap map) {
		map.put(NormalExcelConstants.FILE_NAME,"数据词典");
		map.put(NormalExcelConstants.CLASS,LoanDictPage.class);
		map.put(NormalExcelConstants.PARAMS,new ExportParams("数据词典列表", "导出人:"+ ResourceUtil.getSessionUserName().getRealName(),
		"导出信息"));
		map.put(NormalExcelConstants.DATA_LIST,new ArrayList());
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	* 导入功能跳转
	*
	* @return
	*/
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name", "loanDictController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
 
}
