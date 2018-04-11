package com.yisi.business.ctuser.service;
import com.yisi.business.ctuser.entity.CtUserEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface CtUserServiceI extends CommonService{
	
 	public void delete(CtUserEntity entity) throws Exception;
 	
 	public Serializable save(CtUserEntity entity) throws Exception;
 	
 	public void saveOrUpdate(CtUserEntity entity) throws Exception;
 	
}
