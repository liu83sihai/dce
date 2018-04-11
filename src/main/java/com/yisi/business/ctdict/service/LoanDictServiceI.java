package com.yisi.business.ctdict.service;
import com.yisi.business.ctdict.entity.LoanDictEntity;
import com.yisi.business.ctdict.entity.TLoanDictDtlEntity;

import java.util.List;
import org.jeecgframework.core.common.service.CommonService;
import java.io.Serializable;

public interface LoanDictServiceI extends CommonService{
	
 	public <T> void delete(T entity);
	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(LoanDictEntity loanDict,
	        List<TLoanDictDtlEntity> tLoanDictDtlList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(LoanDictEntity loanDict,
	        List<TLoanDictDtlEntity> tLoanDictDtlList);
	public void delMain (LoanDictEntity loanDict);
	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(LoanDictEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(LoanDictEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(LoanDictEntity t);
}
