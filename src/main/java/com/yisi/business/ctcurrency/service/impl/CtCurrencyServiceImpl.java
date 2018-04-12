package com.yisi.business.ctcurrency.service.impl;
import com.yisi.business.ctcurrency.service.CtCurrencyServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.yisi.business.ctcurrency.entity.CtCurrencyEntity;
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

@Service("ctCurrencyService")
@Transactional
public class CtCurrencyServiceImpl extends CommonServiceImpl implements CtCurrencyServiceI {

	
 	public void delete(CtCurrencyEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(CtCurrencyEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(CtCurrencyEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(CtCurrencyEntity t) throws Exception{
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
	private void doUpdateBus(CtCurrencyEntity t) throws Exception{
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
	private void doDelBus(CtCurrencyEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(CtCurrencyEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("currency_name", t.getCurrencyName());
		map.put("currency_logo", t.getCurrencyLogo());
		map.put("currency_mark", t.getCurrencyMark());
		map.put("currency_content", t.getCurrencyContent());
		map.put("currency_all_money", t.getCurrencyAllMoney());
		map.put("currency_all_num", t.getCurrencyAllNum());
		map.put("currency_buy_fee", t.getCurrencyBuyFee());
		map.put("currency_sell_fee", t.getCurrencySellFee());
		map.put("sell_pre", t.getSellPre());
		map.put("with_fee", t.getWithFee());
		map.put("currency_url", t.getCurrencyUrl());
		map.put("trade_currency_id", t.getTradeCurrencyId());
		map.put("is_line", t.getIsLine());
		map.put("is_lock", t.getIsLock());
		map.put("port_number", t.getPortNumber());
		map.put("add_time", t.getAddTime());
		map.put("status", t.getStatus());
		map.put("rpc_url", t.getRpcUrl());
		map.put("rpc_pwd", t.getRpcPwd());
		map.put("rpc_user", t.getRpcUser());
		map.put("currency_all_tibi", t.getCurrencyAllTibi());
		map.put("detail_url", t.getDetailUrl());
		map.put("qianbao_url", t.getQianbaoUrl());
		map.put("qianbao_key", t.getQianbaoKey());
		map.put("price_fx", t.getPriceFx());
		map.put("price_up", t.getPriceUp());
		map.put("price_open", t.getPriceOpen());
		map.put("price_down", t.getPriceDown());
		map.put("price_znew", t.getPriceZnew());
		map.put("sort", t.getSort());
		map.put("currency_digit_num", t.getCurrencyDigitNum());
		map.put("guanwang_url", t.getGuanwangUrl());
		map.put("utime", t.getUtime());
		map.put("is_ctstatus", t.getIsCtstatus());
		map.put("guadanum", t.getGuadanum());
		map.put("buynum", t.getBuynum());
		map.put("guabuynum", t.getGuabuynum());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,CtCurrencyEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{currency_name}",String.valueOf(t.getCurrencyName()));
 		sql  = sql.replace("#{currency_logo}",String.valueOf(t.getCurrencyLogo()));
 		sql  = sql.replace("#{currency_mark}",String.valueOf(t.getCurrencyMark()));
 		sql  = sql.replace("#{currency_content}",String.valueOf(t.getCurrencyContent()));
 		sql  = sql.replace("#{currency_all_money}",String.valueOf(t.getCurrencyAllMoney()));
 		sql  = sql.replace("#{currency_all_num}",String.valueOf(t.getCurrencyAllNum()));
 		sql  = sql.replace("#{currency_buy_fee}",String.valueOf(t.getCurrencyBuyFee()));
 		sql  = sql.replace("#{currency_sell_fee}",String.valueOf(t.getCurrencySellFee()));
 		sql  = sql.replace("#{sell_pre}",String.valueOf(t.getSellPre()));
 		sql  = sql.replace("#{with_fee}",String.valueOf(t.getWithFee()));
 		sql  = sql.replace("#{currency_url}",String.valueOf(t.getCurrencyUrl()));
 		sql  = sql.replace("#{trade_currency_id}",String.valueOf(t.getTradeCurrencyId()));
 		sql  = sql.replace("#{is_line}",String.valueOf(t.getIsLine()));
 		sql  = sql.replace("#{is_lock}",String.valueOf(t.getIsLock()));
 		sql  = sql.replace("#{port_number}",String.valueOf(t.getPortNumber()));
 		sql  = sql.replace("#{add_time}",String.valueOf(t.getAddTime()));
 		sql  = sql.replace("#{status}",String.valueOf(t.getStatus()));
 		sql  = sql.replace("#{rpc_url}",String.valueOf(t.getRpcUrl()));
 		sql  = sql.replace("#{rpc_pwd}",String.valueOf(t.getRpcPwd()));
 		sql  = sql.replace("#{rpc_user}",String.valueOf(t.getRpcUser()));
 		sql  = sql.replace("#{currency_all_tibi}",String.valueOf(t.getCurrencyAllTibi()));
 		sql  = sql.replace("#{detail_url}",String.valueOf(t.getDetailUrl()));
 		sql  = sql.replace("#{qianbao_url}",String.valueOf(t.getQianbaoUrl()));
 		sql  = sql.replace("#{qianbao_key}",String.valueOf(t.getQianbaoKey()));
 		sql  = sql.replace("#{price_fx}",String.valueOf(t.getPriceFx()));
 		sql  = sql.replace("#{price_up}",String.valueOf(t.getPriceUp()));
 		sql  = sql.replace("#{price_open}",String.valueOf(t.getPriceOpen()));
 		sql  = sql.replace("#{price_down}",String.valueOf(t.getPriceDown()));
 		sql  = sql.replace("#{price_znew}",String.valueOf(t.getPriceZnew()));
 		sql  = sql.replace("#{sort}",String.valueOf(t.getSort()));
 		sql  = sql.replace("#{currency_digit_num}",String.valueOf(t.getCurrencyDigitNum()));
 		sql  = sql.replace("#{guanwang_url}",String.valueOf(t.getGuanwangUrl()));
 		sql  = sql.replace("#{utime}",String.valueOf(t.getUtime()));
 		sql  = sql.replace("#{is_ctstatus}",String.valueOf(t.getIsCtstatus()));
 		sql  = sql.replace("#{guadanum}",String.valueOf(t.getGuadanum()));
 		sql  = sql.replace("#{buynum}",String.valueOf(t.getBuynum()));
 		sql  = sql.replace("#{guabuynum}",String.valueOf(t.getGuabuynum()));
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
					javaInter.execute("ct_currency",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}