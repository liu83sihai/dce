package com.yisi.business.ctaccount.service;
import com.yisi.business.ctaccount.entity.CtUserAccountDetailEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface CtUserAccountDetailServiceI extends CommonService{
	
 	public void delete(CtUserAccountDetailEntity entity) throws Exception;
 	
 	public Serializable save(CtUserAccountDetailEntity entity) throws Exception;
 	
 	public void saveOrUpdate(CtUserAccountDetailEntity entity) throws Exception;
 	
}
