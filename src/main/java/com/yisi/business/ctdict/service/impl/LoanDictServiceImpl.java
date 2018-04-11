package com.yisi.business.ctdict.service.impl;
import com.yisi.business.ctdict.service.LoanDictServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.yisi.business.ctdict.entity.LoanDictEntity;
import com.yisi.business.ctdict.entity.TLoanDictDtlEntity;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import java.util.ArrayList;
import java.util.UUID;
import java.io.Serializable;


@Service("loanDictService")
@Transactional
public class LoanDictServiceImpl extends CommonServiceImpl implements LoanDictServiceI {
	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((LoanDictEntity)entity);
 	}
	
	public void addMain(LoanDictEntity loanDict,
	        List<TLoanDictDtlEntity> tLoanDictDtlList){
			//保存主信息
			this.save(loanDict);
		
			/**保存-数据词典明细*/
			for(TLoanDictDtlEntity tLoanDictDtl:tLoanDictDtlList){
				//外键设置
				tLoanDictDtl.setDictid(loanDict.getId());
				this.save(tLoanDictDtl);
			}
			//执行新增操作配置的sql增强
 			this.doAddSql(loanDict);
	}

	
	public void updateMain(LoanDictEntity loanDict,
	        List<TLoanDictDtlEntity> tLoanDictDtlList) {
		//保存主表信息
		this.saveOrUpdate(loanDict);
		//===================================================================================
		//获取参数
		Object id0 = loanDict.getId();
		//===================================================================================
		//1.查询出数据库的明细数据-数据词典明细
	    String hql0 = "from TLoanDictDtlEntity where 1 = 1 AND dICTID = ? ";
	    List<TLoanDictDtlEntity> tLoanDictDtlOldList = this.findHql(hql0,id0);
		//2.筛选更新明细数据-数据词典明细
		if(tLoanDictDtlList!=null&&tLoanDictDtlList.size()>0){
		for(TLoanDictDtlEntity oldE:tLoanDictDtlOldList){
			boolean isUpdate = false;
				for(TLoanDictDtlEntity sendE:tLoanDictDtlList){
					//需要更新的明细数据-数据词典明细
					if(oldE.getId().equals(sendE.getId())){
		    			try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE,oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate= true;
		    			break;
		    		}
		    	}
	    		if(!isUpdate){
		    		//如果数据库存在的明细，前台没有传递过来则是删除-数据词典明细
		    		super.delete(oldE);
	    		}
	    		
			}
			//3.持久化新增的数据-数据词典明细
			for(TLoanDictDtlEntity tLoanDictDtl:tLoanDictDtlList){
				if(oConvertUtils.isEmpty(tLoanDictDtl.getId())){
					//外键设置
					tLoanDictDtl.setDictid(loanDict.getId());
					this.save(tLoanDictDtl);
				}
			}
		}
		//执行更新操作配置的sql增强
 		this.doUpdateSql(loanDict);
	}

	
	public void delMain(LoanDictEntity loanDict) {
		//删除主表信息
		this.delete(loanDict);
		//===================================================================================
		//获取参数
		Object id0 = loanDict.getId();
		//===================================================================================
		//删除-数据词典明细
	    String hql0 = "from TLoanDictDtlEntity where 1 = 1 AND dICTID = ? ";
	    List<TLoanDictDtlEntity> tLoanDictDtlOldList = this.findHql(hql0,id0);
		this.deleteAllEntitie(tLoanDictDtlOldList);
	}
	
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(LoanDictEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(LoanDictEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(LoanDictEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,LoanDictEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{code}",String.valueOf(t.getCode()));
 		sql  = sql.replace("#{name}",String.valueOf(t.getName()));
 		sql  = sql.replace("#{status}",String.valueOf(t.getStatus()));
 		sql  = sql.replace("#{remark}",String.valueOf(t.getRemark()));
 		sql  = sql.replace("#{createuserid}",String.valueOf(t.getCreateuserid()));
 		sql  = sql.replace("#{updateuserid}",String.valueOf(t.getUpdateuserid()));
 		sql  = sql.replace("#{createtime}",String.valueOf(t.getCreatetime()));
 		sql  = sql.replace("#{updatetime}",String.valueOf(t.getUpdatetime()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}