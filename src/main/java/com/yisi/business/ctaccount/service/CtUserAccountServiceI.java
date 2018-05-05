package com.yisi.business.ctaccount.service;
import com.yisi.business.ctaccount.entity.CtUserAccountEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;
import java.math.BigDecimal;

public interface CtUserAccountServiceI extends CommonService{
	
 	public void delete(CtUserAccountEntity entity) throws Exception;
 	
 	public Serializable save(CtUserAccountEntity entity) throws Exception;
 	
 	public void saveOrUpdate(CtUserAccountEntity entity) throws Exception;
 	/**
 	 * 
 	 * @param userId 用户ID
 	 * @param aType  修改账户
 	 * @param amount 修改的金额  +为增 -为减少
 	 * @param action  增add  减add
 	 * @throws Exception
 	 */
 	public void updateUserAcount(int userId,String aType,BigDecimal amount,String action,String remark) throws Exception;
 	
}
