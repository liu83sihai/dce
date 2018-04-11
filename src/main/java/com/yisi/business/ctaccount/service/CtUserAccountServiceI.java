package com.yisi.business.ctaccount.service;
import com.yisi.business.ctaccount.entity.CtUserAccountEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface CtUserAccountServiceI extends CommonService{
	
 	public void delete(CtUserAccountEntity entity) throws Exception;
 	
 	public Serializable save(CtUserAccountEntity entity) throws Exception;
 	
 	public void saveOrUpdate(CtUserAccountEntity entity) throws Exception;
 	
}
