package com.yisi.business.ctaccount.service.impl;
import com.yisi.business.ctaccount.service.CtUserAccountServiceI;
import com.yisi.business.ctuser.entity.CtUserEntity;
import com.yisi.business.util.AccountType;
import com.yisi.business.util.IncomeType;

import org.apache.commons.lang3.StringUtils;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

import com.yisi.business.ctaccount.entity.CtUserAccountDetailEntity;
import com.yisi.business.ctaccount.entity.CtUserAccountEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.io.Serializable;
import java.math.BigDecimal;

import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;

@Service("ctUserAccountService")
@Transactional
public class CtUserAccountServiceImpl extends CommonServiceImpl implements CtUserAccountServiceI {

	//更新用户金额
	public void updateUserAcount(int userId,String aType,BigDecimal amount,String action) throws Exception{
		
		  //判断用户是否存在此帐户 没有刚增加
        String listSql = " select * from ct_user_account where userId= ?"  
        			   + " and accounttype = ?"  ;
//        long count = this.getCountForJdbc(countSql);
        
        List<Map<String,Object>> cuaList = this.findForJdbc(listSql,userId,aType);
        
        
        if (CollectionUtils.isEmpty(cuaList)) {
//        	CtUserAccountEntity cua = new CtUserAccountEntity();
//        	CtUserEntity ctUser = new CtUserEntity();
//        	ctUser.setId(0);
//        	cua.setCtUser(ctUser);
//        	cua.setUpdatetime(new Date());
//        	this.save(cua);
        	return;
        } 
        Map cua = cuaList.get(0);
        BigDecimal oldAmount = (BigDecimal)cua.get("amount");
        oldAmount = null == oldAmount ? BigDecimal.ZERO : oldAmount;
		//更新语句
		String updateSql = "UPDATE ct_user_account set amount = ifnull(amount,0) + ?," ;
		String updateUserSql = "UPDATE ct_user set " ;
		
		//原始仓账户
		if(aType.equals(AccountType.original.getAccountType())){
			amount = getAmount(action, oldAmount, amount);
			
//			updateSql +=  "originalamount = ifnull(originalamount,0)+" + amount + ",";
			updateUserSql = updateUserSql +  "balance_integral =  case when ifnull(balance_integral,0)+(" + amount + ") >0 "
						   + "then  ifnull(balance_integral, 0)+(" + amount+ ")  else 0 end,";
		//现持仓账户
		}else if(aType.equals(AccountType.current.getAccountType())){
//			oldAmount = cua.getAmount();
			amount = getAmount(action, oldAmount, amount);
			
//			updateUserSql +=  "balance_bonus = ifnull(balance_bonus,0)+(" + amount + "),"
			updateUserSql =  updateUserSql +  "balance_bonus =  case when ifnull(balance_bonus,0)+(" + amount + ") >0 "
					   + "then  ifnull(balance_bonus, 0)+(" + amount+ ")  else 0 end,";
			
//			updateSql +=  "amount = ifnull(amount,0)+" + amount + ",";
			//积分
		}else if(aType.equals(AccountType.score.getAccountType())){
//			oldAmount = cua.getScoreamount();
			amount = getAmount(action, oldAmount, amount);
			
//			updateUserSql +=  "balance_cash = ifnull(balance_cash,0)+(" + amount + "),";
			updateUserSql =  updateUserSql +  "balance_cash =  case when ifnull(balance_cash,0)+(" + amount + ") >0 "
					   + "then  ifnull(balance_cash, 0)+(" + amount+ ")  else 0 end,";
//			updateSql +=  "scoreamount = ifnull(scoreamount,0)+" + amount + ",";
			//美元点
		}else if(aType.equals(AccountType.point.getAccountType())){
//			oldAmount = cua.getPointamount();
			amount = getAmount(action, oldAmount, amount);
			
//			updateUserSql +=  "balance_shopping = ifnull(balance_shopping,0)+(" + amount + "),";
			updateUserSql =  updateUserSql +  "balance_shopping =  case when ifnull(balance_shopping,0)+(" + amount + ") >0 "
					   + "then  ifnull(balance_shopping, 0)+(" + amount+ ")  else 0 end,";
//			updateSql +=  "pointamount = ifnull(pointamount,0)+" + amount + ",";
		}
		
		String type = "+";
		if("add".equals(action)){
			updateSql +=  "totalInocmeAmount = ifnull(totalInocmeAmount,0)+(" + amount + "),";
			updateSql +=  "incomeAmount = ifnull(incomeAmount,0)+(" + amount + "),";
		}else{
			updateSql +=  "totalConsumeAmount = ifnull(totalConsumeAmount,0)+(" + amount + "),";
			updateSql +=  "consumeAmount = ifnull(consumeAmount,0)+(" + amount + "),";
			 type = "-";
		}
		
		updateSql = updateSql +  "updateTime = now() "
				  + "WHERE userId = ?  and accounttype = ? ";
		this.executeSql(updateSql, amount, userId,aType);		
		updateUserSql = updateUserSql 
				+ " dis=dis WHERE id = ? ";
		this.executeSql(updateUserSql, userId);		

        // 增加用户消费列表
        CtUserAccountDetailEntity uaDetail = new CtUserAccountDetailEntity();
        uaDetail.setAmount(amount);
        uaDetail.setBlanceamount(oldAmount.add(amount));
        uaDetail.setCreatetime(new Date());
        uaDetail.setIncometype(IncomeType.TYPE_USER_CHANTE.getIncomeType());
        uaDetail.setMoreorless(type);
        uaDetail.setAccounttype(aType);
        uaDetail.setRemark(IncomeType.TYPE_USER_CHANTE.getRemark());
        CtUserEntity ctUser = new CtUserEntity();
    	ctUser.setId(userId);
        uaDetail.setCtUser(ctUser);
        this.save(uaDetail);
		
	}
 	
	private BigDecimal getAmount( String action,BigDecimal oldAmount,BigDecimal amount){
		if(action.equals("sub")){
			if(oldAmount.add(amount).compareTo(BigDecimal.ZERO) <0){
				return oldAmount.negate();
			}
		}
		 return amount; 
	}

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
//		map.put("originalamount", t.getOriginalamount());
//		map.put("pointamount", t.getPointamount());
//		map.put("scoreamount", t.getScoreamount());
//		map.put("frozendeposit", t.getFrozendeposit());
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
// 		sql  = sql.replace("#{originalamount}",String.valueOf(t.getOriginalamount()));
// 		sql  = sql.replace("#{pointamount}",String.valueOf(t.getPointamount()));
// 		sql  = sql.replace("#{scoreamount}",String.valueOf(t.getScoreamount()));
// 		sql  = sql.replace("#{frozendeposit}",String.valueOf(t.getFrozendeposit()));
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