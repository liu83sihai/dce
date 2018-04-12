package com.yisi.business.ctcurrency.service;
import com.yisi.business.ctcurrency.entity.CtCurrencyEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface CtCurrencyServiceI extends CommonService{
	
 	public void delete(CtCurrencyEntity entity) throws Exception;
 	
 	public Serializable save(CtCurrencyEntity entity) throws Exception;
 	
 	public void saveOrUpdate(CtCurrencyEntity entity) throws Exception;
 	
}
