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
 * @Description: 用户静态分红
 * @author onlineGenerator
 * @date 2018-04-12 10:49:14
 * @version V1.0   
 *
 */
@Entity
@Table(name = "ct_user_static", schema = "")
@SuppressWarnings("serial")
public class UserStaticEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**用户ID*/
	private java.lang.Integer userid;
	private CtUserEntity ctUser;
	/**每日返利*/
	@Excel(name="每日返利")
	private java.math.BigDecimal money;
	/**返利总额*/
	@Excel(name="返利总额")
	private java.math.BigDecimal totalmoney;
	/**已返*/
	@Excel(name="已返")
	private java.math.BigDecimal yfBonus;
	/**状态*/
	@Excel(name="状态")
	private java.lang.Integer status;
	/**类型*/
	@Excel(name="类型")
	private java.lang.Integer type;
	/**statictime*/
	@Excel(name="statictime")
	private java.lang.Integer statictime;
	
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
	 *@return: java.math.BigDecimal  每日返利
	 */
	@Column(name ="MONEY",nullable=false,scale=4,length=11)
	public java.math.BigDecimal getMoney(){
		return this.money;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  每日返利
	 */
	public void setMoney(java.math.BigDecimal money){
		this.money = money;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  返利总额
	 */
	@Column(name ="TOTALMONEY",nullable=false,scale=4,length=11)
	public java.math.BigDecimal getTotalmoney(){
		return this.totalmoney;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  返利总额
	 */
	public void setTotalmoney(java.math.BigDecimal totalmoney){
		this.totalmoney = totalmoney;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  已返
	 */
	@Column(name ="YF_BONUS",nullable=false,scale=4,length=11)
	public java.math.BigDecimal getYfBonus(){
		return this.yfBonus;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  已返
	 */
	public void setYfBonus(java.math.BigDecimal yfBonus){
		this.yfBonus = yfBonus;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  状态
	 */
	@Column(name ="STATUS",nullable=false,length=3)
	public java.lang.Integer getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  状态
	 */
	public void setStatus(java.lang.Integer status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  类型
	 */
	@Column(name ="TYPE",nullable=false,length=3)
	public java.lang.Integer getType(){
		return this.type;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  类型
	 */
	public void setType(java.lang.Integer type){
		this.type = type;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  statictime
	 */
	@Column(name ="STATICTIME",nullable=false,length=10)
	public java.lang.Integer getStatictime(){
		return this.statictime;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  statictime
	 */
	public void setStatictime(java.lang.Integer statictime){
		this.statictime = statictime;
	}
}
