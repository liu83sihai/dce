package com.yisi.business.ctaccount.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

import com.yisi.business.ctuser.entity.CtUserEntity;

/**   
 * @Title: Entity
 * @Description: 用户账户类型
 * @author onlineGenerator
 * @date 2018-04-08 15:25:54
 * @version V1.0   
 *
 */
@Entity
@Table(name = "ct_user_account", schema = "")
@SuppressWarnings("serial")
public class CtUserAccountEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**用户ID*/
	private java.lang.Integer userid;
	
	private CtUserEntity ctUser;
	/**账户类型*/
	@Excel(name="账户类型")
	private java.lang.String accounttype;
	/**现持仓*/
	@Excel(name="现持仓")
	private java.math.BigDecimal amount;
	/**原始仓*/
	@Excel(name="原始仓")
	private java.math.BigDecimal originalamount;
	/**美元点*/
	@Excel(name="美元点")
	private java.math.BigDecimal pointamount;
	/**积分*/
	@Excel(name="积分")
	private java.math.BigDecimal scoreamount;
	/**锁仓*/
	@Excel(name="锁仓")
	private java.math.BigDecimal frozendeposit;
	/**累计支出金额*/
	@Excel(name="累计支出金额")
	private java.math.BigDecimal totalconsumeamount;
	/**累计收入金额*/
	@Excel(name="累计收入金额")
	private java.math.BigDecimal totalinocmeamount;
	/**当天收益金额*/
	@Excel(name="当天收益金额")
	private java.math.BigDecimal incomeamount;
	/**当天支出金额*/
	@Excel(name="当天支出金额")
	private java.math.BigDecimal consumeamount;
	/**累计提现金额*/
	@Excel(name="累计提现金额")
	private java.math.BigDecimal withdrawtotaldeposit;
	/**更新时间*/
	private java.util.Date updatetime;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID",nullable=false,length=10)
	public java.lang.Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  id
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  用户ID
	 */
	@Transient
	public java.lang.Integer getUserid(){
		return this.userid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户ID
	 */
	public void setUserid(java.lang.Integer userid){
		this.userid = userid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  账户类型
	 */
	@Column(name ="ACCOUNTTYPE",nullable=true,length=30)
	public java.lang.String getAccounttype(){
		return this.accounttype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  账户类型
	 */
	public void setAccounttype(java.lang.String accounttype){
		this.accounttype = accounttype;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  现持仓
	 */
	@Column(name ="AMOUNT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getAmount(){
		return this.amount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  现持仓
	 */
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  原始仓
	 */
	@Column(name ="ORIGINALAMOUNT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getOriginalamount(){
		return this.originalamount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  原始仓
	 */
	public void setOriginalamount(java.math.BigDecimal originalamount){
		this.originalamount = originalamount;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  美元点
	 */
	@Column(name ="POINTAMOUNT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getPointamount(){
		return this.pointamount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  美元点
	 */
	public void setPointamount(java.math.BigDecimal pointamount){
		this.pointamount = pointamount;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  积分
	 */
	@Column(name ="SCOREAMOUNT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getScoreamount(){
		return this.scoreamount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  积分
	 */
	public void setScoreamount(java.math.BigDecimal scoreamount){
		this.scoreamount = scoreamount;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  锁仓
	 */
	@Column(name ="FROZENDEPOSIT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getFrozendeposit(){
		return this.frozendeposit;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  锁仓
	 */
	public void setFrozendeposit(java.math.BigDecimal frozendeposit){
		this.frozendeposit = frozendeposit;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  累计支出金额
	 */
	@Column(name ="TOTALCONSUMEAMOUNT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getTotalconsumeamount(){
		return this.totalconsumeamount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  累计支出金额
	 */
	public void setTotalconsumeamount(java.math.BigDecimal totalconsumeamount){
		this.totalconsumeamount = totalconsumeamount;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  累计收入金额
	 */
	@Column(name ="TOTALINOCMEAMOUNT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getTotalinocmeamount(){
		return this.totalinocmeamount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  累计收入金额
	 */
	public void setTotalinocmeamount(java.math.BigDecimal totalinocmeamount){
		this.totalinocmeamount = totalinocmeamount;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  当天收益金额
	 */
	@Column(name ="INCOMEAMOUNT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getIncomeamount(){
		return this.incomeamount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  当天收益金额
	 */
	public void setIncomeamount(java.math.BigDecimal incomeamount){
		this.incomeamount = incomeamount;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  当天支出金额
	 */
	@Column(name ="CONSUMEAMOUNT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getConsumeamount(){
		return this.consumeamount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  当天支出金额
	 */
	public void setConsumeamount(java.math.BigDecimal consumeamount){
		this.consumeamount = consumeamount;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  累计提现金额
	 */
	@Column(name ="WITHDRAWTOTALDEPOSIT",nullable=true,length=12)
	public java.math.BigDecimal getWithdrawtotaldeposit(){
		return this.withdrawtotaldeposit;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  累计提现金额
	 */
	public void setWithdrawtotaldeposit(java.math.BigDecimal withdrawtotaldeposit){
		this.withdrawtotaldeposit = withdrawtotaldeposit;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新时间
	 */
	@Column(name ="UPDATETIME",nullable=false)
	public java.util.Date getUpdatetime(){
		return this.updatetime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新时间
	 */
	public void setUpdatetime(java.util.Date updatetime){
		this.updatetime = updatetime;
	}

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name ="userId",nullable=false)
	public CtUserEntity getCtUser() {
		return ctUser;
	}

	public void setCtUser(CtUserEntity ctUser) {
		this.ctUser = ctUser;
	}
	
	
}
