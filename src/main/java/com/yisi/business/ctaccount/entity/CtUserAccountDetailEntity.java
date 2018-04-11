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
 * @Description: 用户账户明细
 * @author onlineGenerator
 * @date 2018-04-08 15:40:52
 * @version V1.0   
 *
 */
@Entity
@Table(name = "ct_user_account_detail", schema = "")
@SuppressWarnings("serial")
public class CtUserAccountDetailEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**用户ID*/
	@Excel(name="用户ID")
	private java.lang.Integer userid;
	
	private CtUserEntity ctUser;
	/**金额*/
	@Excel(name="金额")
	private java.math.BigDecimal amount;
	/**余额*/
	@Excel(name="余额")
	private java.math.BigDecimal blanceamount;
	/**增加减少*/
	@Excel(name="增加减少")
	private java.lang.String moreorless;
	/**流水类型*/
	@Excel(name="流水类型")
	private java.lang.Integer incometype;
	/**创建时间*/
	@Excel(name="创建时间",format = "yyyy-MM-dd")
	private java.util.Date createtime;
	/**atype*/
	@Excel(name="atype")
	private java.lang.String accounttype;
	/**remark*/
	@Excel(name="remark")
	private java.lang.String remark;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID",nullable=false,length=19)
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
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name ="userId",nullable=false)
	public CtUserEntity getCtUser() {
		return ctUser;
	}

	public void setCtUser(CtUserEntity ctUser) {
		this.ctUser = ctUser;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  金额
	 */
	@Column(name ="AMOUNT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getAmount(){
		return this.amount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  金额
	 */
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  余额
	 */
	@Column(name ="BLANCEAMOUNT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getBlanceamount(){
		return this.blanceamount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  余额
	 */
	public void setBlanceamount(java.math.BigDecimal blanceamount){
		this.blanceamount = blanceamount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  增加减少
	 */
	@Column(name ="MOREORLESS",nullable=true,length=100)
	public java.lang.String getMoreorless(){
		return this.moreorless;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  增加减少
	 */
	public void setMoreorless(java.lang.String moreorless){
		this.moreorless = moreorless;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  流水类型
	 */
	@Column(name ="INCOMETYPE",nullable=true,length=10)
	public java.lang.Integer getIncometype(){
		return this.incometype;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  流水类型
	 */
	public void setIncometype(java.lang.Integer incometype){
		this.incometype = incometype;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建时间
	 */
	@Column(name ="CREATETIME",nullable=true)
	public java.util.Date getCreatetime(){
		return this.createtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建时间
	 */
	public void setCreatetime(java.util.Date createtime){
		this.createtime = createtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  atype
	 */
	@Column(name ="ACCOUNTTYPE",nullable=true,length=50)
	public java.lang.String getAccounttype(){
		return this.accounttype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  atype
	 */
	public void setAccounttype(java.lang.String accounttype){
		this.accounttype = accounttype;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  remark
	 */
	@Column(name ="REMARK",nullable=true,length=500)
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  remark
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}
}
