package com.yisi.business.ctuser.service.impl;
import com.yisi.business.ctuser.service.CtUserServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.yisi.business.ctuser.entity.CtUserEntity;
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

@Service("ctUserService")
@Transactional
public class CtUserServiceImpl extends CommonServiceImpl implements CtUserServiceI {

	
 	public void delete(CtUserEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(CtUserEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(CtUserEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(CtUserEntity t) throws Exception{
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
	private void doUpdateBus(CtUserEntity t) throws Exception{
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
	private void doDelBus(CtUserEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(CtUserEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("user_name", t.getUserName());
		map.put("true_name", t.getTrueName());
		map.put("email", t.getEmail());
		map.put("mobile", t.getMobile());
		map.put("user_password", t.getUserPassword());
		map.put("two_password", t.getTwoPassword());
		map.put("user_face", t.getUserFace());
		map.put("balance_integral", t.getBalanceIntegral());
		map.put("sex", t.getSex());
		map.put("login_times", t.getLoginTimes());
		map.put("last_login_time", t.getLastLoginTime());
		map.put("last_login_ip", t.getLastLoginIp());
		map.put("reg_ip", t.getRegIp());
		map.put("reg_time", t.getRegTime());
		map.put("status", t.getStatus());
		map.put("balance_bonus", t.getBalanceBonus());
		map.put("balance_repeat", t.getBalanceRepeat());
		map.put("balance_cash", t.getBalanceCash());
		map.put("balance_dongjie", t.getBalanceDongjie());
		map.put("balance_shopping", t.getBalanceShopping());
		map.put("forzen_shopping", t.getForzenShopping());
		map.put("total_bonus", t.getTotalBonus());
		map.put("total_repeat", t.getTotalRepeat());
		map.put("total_cash", t.getTotalCash());
		map.put("total_integral", t.getTotalIntegral());
		map.put("total_shopping", t.getTotalShopping());
		map.put("refereeid", t.getRefereeid());
		map.put("parentid", t.getParentid());
		map.put("referee_number", t.getRefereeNumber());
		map.put("referee_status", t.getRefereeStatus());
		map.put("son_number", t.getSonNumber());
		map.put("is_server_center", t.getIsServerCenter());
		map.put("my_server_center", t.getMyServerCenter());
		map.put("userscore", t.getUserscore());
		map.put("user_type", t.getUserType());
		map.put("user_group", t.getUserGroup());
		map.put("user_level", t.getUserLevel());
		map.put("user_post", t.getUserPost());
		map.put("reg_money", t.getRegMoney());
		map.put("yf_money", t.getYfMoney());
		map.put("fd_money", t.getFdMoney());
		map.put("total_performance", t.getTotalPerformance());
		map.put("touched_performance", t.getTouchedPerformance());
		map.put("activation_time", t.getActivationTime());
		map.put("user_qq", t.getUserQq());
		map.put("user_wechat", t.getUserWechat());
		map.put("openid", t.getOpenid());
		map.put("register", t.getRegister());
		map.put("express_password", t.getExpressPassword());
		map.put("total_dividends", t.getTotalDividends());
		map.put("dividends_days", t.getDividendsDays());
		map.put("country", t.getCountry());
		map.put("province", t.getProvince());
		map.put("city", t.getCity());
		map.put("darea", t.getDarea());
		map.put("balance_et", t.getBalanceEt());
		map.put("idnumber", t.getIdnumber());
		map.put("banktype", t.getBanktype());
		map.put("bank_user_name", t.getBankUserName());
		map.put("banknumber", t.getBanknumber());
		map.put("bank_content", t.getBankContent());
		map.put("question1", t.getQuestion1());
		map.put("question2", t.getQuestion2());
		map.put("question3", t.getQuestion3());
		map.put("answer1", t.getAnswer1());
		map.put("answer2", t.getAnswer2());
		map.put("answer3", t.getAnswer3());
		map.put("groupid", t.getGroupid());
		map.put("ticket", t.getTicket());
		map.put("balance_gouwu", t.getBalanceGouwu());
		map.put("qrcode_status", t.getQrcodeStatus());
		map.put("bonus_time", t.getBonusTime());
		map.put("is_empty", t.getIsEmpty());
		map.put("balance_heart", t.getBalanceHeart());
		map.put("touch_distance", t.getTouchDistance());
		map.put("kuo_level", t.getKuoLevel());
		map.put("backfill_status", t.getBackfillStatus());
		map.put("backfill_money", t.getBackfillMoney());
		map.put("backfill_sheng", t.getBackfillSheng());
		map.put("guadan_num", t.getGuadanNum());
		map.put("allstatic", t.getAllstatic());
		map.put("dis", t.getDis());
		map.put("release_time", t.getReleaseTime());
		map.put("isshop", t.getIsshop());
		map.put("isimport", t.getIsimport());
		map.put("pos", t.getPos());
		map.put("isout", t.getIsout());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,CtUserEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{user_name}",String.valueOf(t.getUserName()));
 		sql  = sql.replace("#{true_name}",String.valueOf(t.getTrueName()));
 		sql  = sql.replace("#{email}",String.valueOf(t.getEmail()));
 		sql  = sql.replace("#{mobile}",String.valueOf(t.getMobile()));
 		sql  = sql.replace("#{user_password}",String.valueOf(t.getUserPassword()));
 		sql  = sql.replace("#{two_password}",String.valueOf(t.getTwoPassword()));
 		sql  = sql.replace("#{user_face}",String.valueOf(t.getUserFace()));
 		sql  = sql.replace("#{balance_integral}",String.valueOf(t.getBalanceIntegral()));
 		sql  = sql.replace("#{sex}",String.valueOf(t.getSex()));
 		sql  = sql.replace("#{login_times}",String.valueOf(t.getLoginTimes()));
 		sql  = sql.replace("#{last_login_time}",String.valueOf(t.getLastLoginTime()));
 		sql  = sql.replace("#{last_login_ip}",String.valueOf(t.getLastLoginIp()));
 		sql  = sql.replace("#{reg_ip}",String.valueOf(t.getRegIp()));
 		sql  = sql.replace("#{reg_time}",String.valueOf(t.getRegTime()));
 		sql  = sql.replace("#{status}",String.valueOf(t.getStatus()));
 		sql  = sql.replace("#{balance_bonus}",String.valueOf(t.getBalanceBonus()));
 		sql  = sql.replace("#{balance_repeat}",String.valueOf(t.getBalanceRepeat()));
 		sql  = sql.replace("#{balance_cash}",String.valueOf(t.getBalanceCash()));
 		sql  = sql.replace("#{balance_dongjie}",String.valueOf(t.getBalanceDongjie()));
 		sql  = sql.replace("#{balance_shopping}",String.valueOf(t.getBalanceShopping()));
 		sql  = sql.replace("#{forzen_shopping}",String.valueOf(t.getForzenShopping()));
 		sql  = sql.replace("#{total_bonus}",String.valueOf(t.getTotalBonus()));
 		sql  = sql.replace("#{total_repeat}",String.valueOf(t.getTotalRepeat()));
 		sql  = sql.replace("#{total_cash}",String.valueOf(t.getTotalCash()));
 		sql  = sql.replace("#{total_integral}",String.valueOf(t.getTotalIntegral()));
 		sql  = sql.replace("#{total_shopping}",String.valueOf(t.getTotalShopping()));
 		sql  = sql.replace("#{refereeid}",String.valueOf(t.getRefereeid()));
 		sql  = sql.replace("#{parentid}",String.valueOf(t.getParentid()));
 		sql  = sql.replace("#{referee_number}",String.valueOf(t.getRefereeNumber()));
 		sql  = sql.replace("#{referee_status}",String.valueOf(t.getRefereeStatus()));
 		sql  = sql.replace("#{son_number}",String.valueOf(t.getSonNumber()));
 		sql  = sql.replace("#{is_server_center}",String.valueOf(t.getIsServerCenter()));
 		sql  = sql.replace("#{my_server_center}",String.valueOf(t.getMyServerCenter()));
 		sql  = sql.replace("#{userscore}",String.valueOf(t.getUserscore()));
 		sql  = sql.replace("#{user_type}",String.valueOf(t.getUserType()));
 		sql  = sql.replace("#{user_group}",String.valueOf(t.getUserGroup()));
 		sql  = sql.replace("#{user_level}",String.valueOf(t.getUserLevel()));
 		sql  = sql.replace("#{user_post}",String.valueOf(t.getUserPost()));
 		sql  = sql.replace("#{reg_money}",String.valueOf(t.getRegMoney()));
 		sql  = sql.replace("#{yf_money}",String.valueOf(t.getYfMoney()));
 		sql  = sql.replace("#{fd_money}",String.valueOf(t.getFdMoney()));
 		sql  = sql.replace("#{total_performance}",String.valueOf(t.getTotalPerformance()));
 		sql  = sql.replace("#{touched_performance}",String.valueOf(t.getTouchedPerformance()));
 		sql  = sql.replace("#{activation_time}",String.valueOf(t.getActivationTime()));
 		sql  = sql.replace("#{user_qq}",String.valueOf(t.getUserQq()));
 		sql  = sql.replace("#{user_wechat}",String.valueOf(t.getUserWechat()));
 		sql  = sql.replace("#{openid}",String.valueOf(t.getOpenid()));
 		sql  = sql.replace("#{register}",String.valueOf(t.getRegister()));
 		sql  = sql.replace("#{express_password}",String.valueOf(t.getExpressPassword()));
 		sql  = sql.replace("#{total_dividends}",String.valueOf(t.getTotalDividends()));
 		sql  = sql.replace("#{dividends_days}",String.valueOf(t.getDividendsDays()));
 		sql  = sql.replace("#{country}",String.valueOf(t.getCountry()));
 		sql  = sql.replace("#{province}",String.valueOf(t.getProvince()));
 		sql  = sql.replace("#{city}",String.valueOf(t.getCity()));
 		sql  = sql.replace("#{darea}",String.valueOf(t.getDarea()));
 		sql  = sql.replace("#{balance_et}",String.valueOf(t.getBalanceEt()));
 		sql  = sql.replace("#{idnumber}",String.valueOf(t.getIdnumber()));
 		sql  = sql.replace("#{banktype}",String.valueOf(t.getBanktype()));
 		sql  = sql.replace("#{bank_user_name}",String.valueOf(t.getBankUserName()));
 		sql  = sql.replace("#{banknumber}",String.valueOf(t.getBanknumber()));
 		sql  = sql.replace("#{bank_content}",String.valueOf(t.getBankContent()));
 		sql  = sql.replace("#{question1}",String.valueOf(t.getQuestion1()));
 		sql  = sql.replace("#{question2}",String.valueOf(t.getQuestion2()));
 		sql  = sql.replace("#{question3}",String.valueOf(t.getQuestion3()));
 		sql  = sql.replace("#{answer1}",String.valueOf(t.getAnswer1()));
 		sql  = sql.replace("#{answer2}",String.valueOf(t.getAnswer2()));
 		sql  = sql.replace("#{answer3}",String.valueOf(t.getAnswer3()));
 		sql  = sql.replace("#{groupid}",String.valueOf(t.getGroupid()));
 		sql  = sql.replace("#{ticket}",String.valueOf(t.getTicket()));
 		sql  = sql.replace("#{balance_gouwu}",String.valueOf(t.getBalanceGouwu()));
 		sql  = sql.replace("#{qrcode_status}",String.valueOf(t.getQrcodeStatus()));
 		sql  = sql.replace("#{bonus_time}",String.valueOf(t.getBonusTime()));
 		sql  = sql.replace("#{is_empty}",String.valueOf(t.getIsEmpty()));
 		sql  = sql.replace("#{balance_heart}",String.valueOf(t.getBalanceHeart()));
 		sql  = sql.replace("#{touch_distance}",String.valueOf(t.getTouchDistance()));
 		sql  = sql.replace("#{kuo_level}",String.valueOf(t.getKuoLevel()));
 		sql  = sql.replace("#{backfill_status}",String.valueOf(t.getBackfillStatus()));
 		sql  = sql.replace("#{backfill_money}",String.valueOf(t.getBackfillMoney()));
 		sql  = sql.replace("#{backfill_sheng}",String.valueOf(t.getBackfillSheng()));
 		sql  = sql.replace("#{guadan_num}",String.valueOf(t.getGuadanNum()));
 		sql  = sql.replace("#{allstatic}",String.valueOf(t.getAllstatic()));
 		sql  = sql.replace("#{dis}",String.valueOf(t.getDis()));
 		sql  = sql.replace("#{release_time}",String.valueOf(t.getReleaseTime()));
 		sql  = sql.replace("#{isshop}",String.valueOf(t.getIsshop()));
 		sql  = sql.replace("#{isimport}",String.valueOf(t.getIsimport()));
 		sql  = sql.replace("#{pos}",String.valueOf(t.getPos()));
 		sql  = sql.replace("#{isout}",String.valueOf(t.getIsout()));
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
					javaInter.execute("ct_user",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}