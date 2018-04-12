package com.yisi.business.ctaccount.service;
import com.yisi.business.ctaccount.entity.UserStaticEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface UserStaticServiceI extends CommonService{
	
 	public void delete(UserStaticEntity entity) throws Exception;
 	
 	public Serializable save(UserStaticEntity entity) throws Exception;
 	
 	public void saveOrUpdate(UserStaticEntity entity) throws Exception;
 	
}
