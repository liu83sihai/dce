package com.yisi.business.ctaccount.service.impl;
import com.yisi.business.ctaccount.service.CtUserAccountServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.yisi.business.ctaccount.entity.CtUserAccountEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.io.Serializable;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;

@Service("ctUserAccountService")
@Transactional
public class CtUserAccountServiceImpl extends CommonServiceImpl implements CtUserAccountServiceI {

	
 	public void delete(CtUserAccountEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(CtUserAccountEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(CtUserAccountEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(CtUserAccountEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 更新操作增强业务
	 * @param t
	 * @return
	 */
	private void doUpdateBus(CtUserAccountEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 删除操作增强业务
	 * @param id
	 * @return
	 */
	private void doDelBus(CtUserAccountEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(CtUserAccountEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("userid", t.getUserid());
		map.put("accounttype", t.getAccounttype());
		map.put("amount", t.getAmount());
		map.put("originalamount", t.getOriginalamount());
		map.put("pointamount", t.getPointamount());
		map.put("scoreamount", t.getScoreamount());
		map.put("frozendeposit", t.getFrozendeposit());
		map.put("totalconsumeamount", t.getTotalconsumeamount());
		map.put("totalinocmeamount", t.getTotalinocmeamount());
		map.put("incomeamount", t.getIncomeamount());
		map.put("consumeamount", t.getConsumeamount());
		map.put("withdrawtotaldeposit", t.getWithdrawtotaldeposit());
		map.put("updatetime", t.getUpdatetime());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,CtUserAccountEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{userid}",String.valueOf(t.getUserid()));
 		sql  = sql.replace("#{accounttype}",String.valueOf(t.getAccounttype()));
 		sql  = sql.replace("#{amount}",String.valueOf(t.getAmount()));
 		sql  = sql.replace("#{originalamount}",String.valueOf(t.getOriginalamount()));
 		sql  = sql.replace("#{pointamount}",String.valueOf(t.getPointamount()));
 		sql  = sql.replace("#{scoreamount}",String.valueOf(t.getScoreamount()));
 		sql  = sql.replace("#{frozendeposit}",String.valueOf(t.getFrozendeposit()));
 		sql  = sql.replace("#{totalconsumeamount}",String.valueOf(t.getTotalconsumeamount()));
 		sql  = sql.replace("#{totalinocmeamount}",String.valueOf(t.getTotalinocmeamount()));
 		sql  = sql.replace("#{incomeamount}",String.valueOf(t.getIncomeamount()));
 		sql  = sql.replace("#{consumeamount}",String.valueOf(t.getConsumeamount()));
 		sql  = sql.replace("#{withdrawtotaldeposit}",String.valueOf(t.getWithdrawtotaldeposit()));
 		sql  = sql.replace("#{updatetime}",String.valueOf(t.getUpdatetime()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
 	
 	/**
	 * 执行JAVA增强
	 */
 	private void executeJavaExtend(String cgJavaType,String cgJavaValue,Map<String,Object> data) throws Exception {
 		if(StringUtil.isNotEmpty(cgJavaValue)){
			Object obj = null;
			try {
				if("class".equals(cgJavaType)){
					//因新增时已经校验了实例化是否可以成功，所以这块就不需要再做一次判断
					obj = MyClassLoader.getClassByScn(cgJavaValue).newInstance();
				}else if("spring".equals(cgJavaType)){
					obj = ApplicationContextUtil.getContext().getBean(cgJavaValue);
				}
				if(obj instanceof CgformEnhanceJavaInter){
					CgformEnhanceJavaInter javaInter = (CgformEnhanceJavaInter) obj;
					javaInter.execute("ct_user_account",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}