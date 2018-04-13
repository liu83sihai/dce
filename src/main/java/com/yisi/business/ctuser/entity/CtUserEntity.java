package com.yisi.business.ctuser.entity;

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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 用户信息表
 * @author onlineGenerator
 * @date 2018-04-08 15:10:57
 * @version V1.0   
 *
 */
@Entity
@Table(name = "ct_user", schema = "")
@SuppressWarnings("serial")
public class CtUserEntity implements java.io.Serializable {
	/**用户ID*/
	private java.lang.Integer id;
	/**用户名*/
	@Excel(name="用户名")
	private java.lang.String userName;
	/**姓名*/
	@Excel(name="姓名")
	private java.lang.String trueName;
	/**用户邮箱*/
	@Excel(name="用户邮箱")
	private java.lang.String email;
	/**手机号*/
	@Excel(name="手机号")
	private java.lang.String mobile;
	/**用户密码*/
	private java.lang.String userPassword;
	/**二级密码*/
	private java.lang.String twoPassword;
	/**用户头像*/
	@Excel(name="用户头像")
	private java.lang.Integer userFace;
	/**原始仓*/
	@Excel(name="原始仓")
	private java.math.BigDecimal balanceIntegral;
	/**用户性别*/
	@Excel(name="用户性别")
	private String sex;
	/**登录次数*/
	@Excel(name="登录次数")
	private java.lang.Integer loginTimes;
	/**最近登陆时间*/
	@Excel(name="最近登陆时间")
	private java.lang.Long lastLoginTime;
	/**最近登陆IP*/
	@Excel(name="最近登陆IP")
	private java.lang.String lastLoginIp;
	/**regIp*/
	@Excel(name="regIp")
	private java.lang.String regIp;
	/**注册时间*/
	@Excel(name="注册时间")
	private java.lang.Long regTime;
	/**状态*/
	@Excel(name="状态")
	private java.lang.Integer status;
	/**现持仓*/
	@Excel(name="现持仓")
	private java.math.BigDecimal balanceBonus;
	/**复消*/
	@Excel(name="复消")
	private java.math.BigDecimal balanceRepeat;
	/**积分*/
	@Excel(name="积分")
	private java.math.BigDecimal balanceCash;
	/**锁仓*/
	@Excel(name="锁仓")
	private java.math.BigDecimal balanceDongjie;
	/**余额账户*/
	@Excel(name="余额账户")
	private java.math.BigDecimal balanceShopping;
	/**冻结余额*/
	@Excel(name="冻结余额")
	private java.math.BigDecimal forzenShopping;
	/**奖金累计*/
	@Excel(name="奖金累计")
	private java.math.BigDecimal totalBonus;
	/**复消累计*/
	@Excel(name="复消累计")
	private java.math.BigDecimal totalRepeat;
	/**现金累计*/
	@Excel(name="现金累计")
	private java.math.BigDecimal totalCash;
	/**积分累计*/
	@Excel(name="积分累计")
	private java.math.BigDecimal totalIntegral;
	/**购物累计*/
	@Excel(name="购物累计")
	private java.math.BigDecimal totalShopping;
	/**推荐人id*/
	private java.lang.Integer refereeid;
	/**接点人ID*/
	private java.lang.Integer parentid;
	/**推荐人数*/
	@Excel(name="推荐人数")
	private java.lang.Integer refereeNumber;
	/**是否推荐够*/
	@Excel(name="是否推荐够")
	private java.lang.Integer refereeStatus;
	/**下级人数*/
	@Excel(name="下级人数")
	private java.lang.Integer sonNumber;
	/**是否服务中心*/
	@Excel(name="是否服务中心")
	private java.lang.Integer isServerCenter;
	/**我的服务人*/
	@Excel(name="我的服务人")
	private java.lang.Integer myServerCenter;
	/**用户积分*/
	@Excel(name="用户积分")
	private java.lang.Integer userscore;
	/**用户类型 */
	@Excel(name="用户类型 ")
	private java.lang.Integer userType;
	/**会员组*/
	@Excel(name="会员组")
	private java.lang.Integer userGroup;
	/**会员级别*/
	@Excel(name="会员级别")
	private java.lang.Integer userLevel;
	/**会员职务*/
	@Excel(name="会员职务")
	private java.lang.Integer userPost;
	/**注册金额*/
	@Excel(name="注册金额")
	private java.math.BigDecimal regMoney;
	/**已发分红*/
	@Excel(name="已发分红")
	private java.math.BigDecimal yfMoney;
	/**封顶*/
	@Excel(name="封顶")
	private java.math.BigDecimal fdMoney;
	/**总业绩*/
	@Excel(name="总业绩")
	private java.math.BigDecimal totalPerformance;
	/**已量碰业绩*/
	@Excel(name="已量碰业绩")
	private java.lang.String touchedPerformance;
	/**激活时间 */
	@Excel(name="激活时间 ")
	private java.lang.Integer activationTime;
	/**用户QQ*/
	@Excel(name="用户QQ")
	private java.lang.Integer userQq;
	/**用户微信号*/
	@Excel(name="用户微信号")
	private java.lang.String userWechat;
	/**用户OPENID*/
	@Excel(name="用户OPENID")
	private java.lang.String openid;
	/**注册人*/
	@Excel(name="注册人")
	private java.lang.String register;
	/**明文密码*/
	@Excel(name="明文密码")
	private java.lang.String expressPassword;
	/**累计分红*/
	@Excel(name="累计分红")
	private java.math.BigDecimal totalDividends;
	/**分红累计天数*/
	@Excel(name="分红累计天数")
	private java.lang.Integer dividendsDays;
	/**会员国家*/
	@Excel(name="会员国家")
	private java.lang.Integer country;
	/**会员省份*/
	@Excel(name="会员省份")
	private java.lang.Integer province;
	/**会员城市*/
	@Excel(name="会员城市")
	private java.lang.Integer city;
	/**会员区县*/
	@Excel(name="会员区县")
	private java.lang.Integer darea;
	/**ET币*/
	@Excel(name="ET币")
	private java.math.BigDecimal balanceEt;
	/**身份证号*/
	@Excel(name="身份证号")
	private java.lang.String idnumber;
	/**银行类型*/
	@Excel(name="银行类型")
	private java.lang.Integer banktype;
	/**开户人*/
	@Excel(name="开户人")
	private java.lang.String bankUserName;
	/**卡号*/
	@Excel(name="卡号")
	private java.lang.String banknumber;
	/**支行*/
	@Excel(name="支行")
	private java.lang.String bankContent;
	/**密保问题a*/
	@Excel(name="密保问题a")
	private java.lang.String question1;
	/**密保问题b*/
	@Excel(name="密保问题b")
	private java.lang.String question2;
	/**密保问题c*/
	@Excel(name="密保问题c")
	private java.lang.String question3;
	/**密保答案a*/
	@Excel(name="密保答案a")
	private java.lang.String answer1;
	/**密保答案b*/
	@Excel(name="密保答案b")
	private java.lang.String answer2;
	/**密保答案c*/
	@Excel(name="密保答案c")
	private java.lang.String answer3;
	/**组id*/
	@Excel(name="组id")
	private java.lang.Integer groupid;
	/**ticket*/
	@Excel(name="ticket")
	private java.lang.String ticket;
	/**购物币*/
	@Excel(name="购物币")
	private java.math.BigDecimal balanceGouwu;
	/**qrcodeStatus*/
	@Excel(name="qrcodeStatus")
	private java.lang.Integer qrcodeStatus;
	/**分红时间*/
	@Excel(name="分红时间")
	private java.lang.Integer bonusTime;
	/**是否空单激活*/
	@Excel(name="是否空单激活")
	private java.lang.Integer isEmpty;
	/**爱心基金*/
	@Excel(name="爱心基金")
	private java.math.BigDecimal balanceHeart;
	/**已层碰的层数*/
	@Excel(name="已层碰的层数")
	private java.lang.String touchDistance;
	/**星级别*/
	@Excel(name="星级别")
	private java.lang.Integer kuoLevel;
	/**是否是回填单*/
	@Excel(name="是否是回填单")
	private java.lang.Integer backfillStatus;
	/**剩余回填金额*/
	@Excel(name="剩余回填金额")
	private java.math.BigDecimal backfillMoney;
	/**回填剩余*/
	@Excel(name="回填剩余")
	private java.lang.String backfillSheng;
	/**一周可挂单次数*/
	@Excel(name="一周可挂单次数")
	private java.lang.Integer guadanNum;
	/**每日静态*/
	@Excel(name="每日静态")
	private java.lang.String allstatic;
	/**dis*/
	@Excel(name="dis")
	private java.lang.Integer dis;
	/**释放时间*/
	@Excel(name="释放时间")
	private java.lang.Integer releaseTime;
	/**是否商家*/
	@Excel(name="是否商家")
	private java.lang.Integer isshop;
	/**isimport*/
	@Excel(name="isimport")
	private java.lang.Integer isimport;
	/**点位*/
	@Excel(name="点位")
	private java.lang.Integer pos;
	/**isout*/
	@Excel(name="isout")
	private java.lang.Integer isout;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  用户ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID",nullable=false,length=10)
	public java.lang.Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户ID
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用户名
	 */
	@Column(name ="USER_NAME",nullable=false,length=32)
	public java.lang.String getUserName(){
		return this.userName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用户名
	 */
	public void setUserName(java.lang.String userName){
		this.userName = userName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  姓名
	 */
	@Column(name ="TRUE_NAME",nullable=false,length=32)
	public java.lang.String getTrueName(){
		return this.trueName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  姓名
	 */
	public void setTrueName(java.lang.String trueName){
		this.trueName = trueName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用户邮箱
	 */
	@Column(name ="EMAIL",nullable=true,length=32)
	public java.lang.String getEmail(){
		return this.email;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用户邮箱
	 */
	public void setEmail(java.lang.String email){
		this.email = email;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  手机号
	 */
	@Column(name ="MOBILE",nullable=true,length=11)
	public java.lang.String getMobile(){
		return this.mobile;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  手机号
	 */
	public void setMobile(java.lang.String mobile){
		this.mobile = mobile;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用户密码
	 */
	@Column(name ="USER_PASSWORD",nullable=false,length=64)
	public java.lang.String getUserPassword(){
		return this.userPassword;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用户密码
	 */
	public void setUserPassword(java.lang.String userPassword){
		this.userPassword = userPassword;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  二级密码
	 */
	@Column(name ="TWO_PASSWORD",nullable=false,length=64)
	public java.lang.String getTwoPassword(){
		return this.twoPassword;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  二级密码
	 */
	public void setTwoPassword(java.lang.String twoPassword){
		this.twoPassword = twoPassword;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  用户头像
	 */
	@Column(name ="USER_FACE",nullable=false,length=10)
	public java.lang.Integer getUserFace(){
		return this.userFace;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户头像
	 */
	public void setUserFace(java.lang.Integer userFace){
		this.userFace = userFace;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  原始仓
	 */
	@Column(name ="BALANCE_INTEGRAL",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getBalanceIntegral(){
		return this.balanceIntegral;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  原始仓
	 */
	public void setBalanceIntegral(java.math.BigDecimal balanceIntegral){
		this.balanceIntegral = balanceIntegral;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  用户性别
	 */
	@Column(name ="SEX",nullable=false)
	public String getSex(){
		return this.sex;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户性别
	 */
	public void setSex(String sex){
		this.sex = sex;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  登录次数
	 */
	@Column(name ="LOGIN_TIMES",nullable=false,length=10)
	public java.lang.Integer getLoginTimes(){
		return this.loginTimes;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  登录次数
	 */
	public void setLoginTimes(java.lang.Integer loginTimes){
		this.loginTimes = loginTimes;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  最近登陆时间
	 */
	@Column(name ="LAST_LOGIN_TIME",nullable=false)
	public java.lang.Long getLastLoginTime(){
		return this.lastLoginTime;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  最近登陆时间
	 */
	public void setLastLoginTime(java.lang.Long lastLoginTime){
		this.lastLoginTime = lastLoginTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  最近登陆IP
	 */
	@Column(name ="LAST_LOGIN_IP",nullable=false,length=20)
	public java.lang.String getLastLoginIp(){
		return this.lastLoginIp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  最近登陆IP
	 */
	public void setLastLoginIp(java.lang.String lastLoginIp){
		this.lastLoginIp = lastLoginIp;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  regIp
	 */
	@Column(name ="REG_IP",nullable=true,length=20)
	public java.lang.String getRegIp(){
		return this.regIp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  regIp
	 */
	public void setRegIp(java.lang.String regIp){
		this.regIp = regIp;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  注册时间
	 */
	@Column(name ="REG_TIME",nullable=false,length=10)
	public java.lang.Long getRegTime(){
		return this.regTime;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  注册时间
	 */
	public void setRegTime(java.lang.Long regTime){
		this.regTime = regTime;
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
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  现持仓
	 */
	@Column(name ="BALANCE_BONUS",nullable=true,scale=2,length=11)
	public java.math.BigDecimal getBalanceBonus(){
		return this.balanceBonus;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  现持仓
	 */
	public void setBalanceBonus(java.math.BigDecimal balanceBonus){
		this.balanceBonus = balanceBonus;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  复消
	 */
	@Column(name ="BALANCE_REPEAT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getBalanceRepeat(){
		return this.balanceRepeat;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  复消
	 */
	public void setBalanceRepeat(java.math.BigDecimal balanceRepeat){
		this.balanceRepeat = balanceRepeat;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  积分
	 */
	@Column(name ="BALANCE_CASH",nullable=true,scale=2,length=11)
	public java.math.BigDecimal getBalanceCash(){
		return this.balanceCash;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  积分
	 */
	public void setBalanceCash(java.math.BigDecimal balanceCash){
		this.balanceCash = balanceCash;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  锁仓
	 */
	@Column(name ="BALANCE_DONGJIE",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getBalanceDongjie(){
		return this.balanceDongjie;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  锁仓
	 */
	public void setBalanceDongjie(java.math.BigDecimal balanceDongjie){
		this.balanceDongjie = balanceDongjie;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  余额账户
	 */
	@Column(name ="BALANCE_SHOPPING",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getBalanceShopping(){
		return this.balanceShopping;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  余额账户
	 */
	public void setBalanceShopping(java.math.BigDecimal balanceShopping){
		this.balanceShopping = balanceShopping;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  冻结余额
	 */
	@Column(name ="FORZEN_SHOPPING",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getForzenShopping(){
		return this.forzenShopping;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  冻结余额
	 */
	public void setForzenShopping(java.math.BigDecimal forzenShopping){
		this.forzenShopping = forzenShopping;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  奖金累计
	 */
	@Column(name ="TOTAL_BONUS",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getTotalBonus(){
		return this.totalBonus;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  奖金累计
	 */
	public void setTotalBonus(java.math.BigDecimal totalBonus){
		this.totalBonus = totalBonus;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  复消累计
	 */
	@Column(name ="TOTAL_REPEAT",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getTotalRepeat(){
		return this.totalRepeat;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  复消累计
	 */
	public void setTotalRepeat(java.math.BigDecimal totalRepeat){
		this.totalRepeat = totalRepeat;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  现金累计
	 */
	@Column(name ="TOTAL_CASH",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getTotalCash(){
		return this.totalCash;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  现金累计
	 */
	public void setTotalCash(java.math.BigDecimal totalCash){
		this.totalCash = totalCash;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  积分累计
	 */
	@Column(name ="TOTAL_INTEGRAL",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getTotalIntegral(){
		return this.totalIntegral;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  积分累计
	 */
	public void setTotalIntegral(java.math.BigDecimal totalIntegral){
		this.totalIntegral = totalIntegral;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  购物累计
	 */
	@Column(name ="TOTAL_SHOPPING",nullable=true,scale=1,length=11)
	public java.math.BigDecimal getTotalShopping(){
		return this.totalShopping;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  购物累计
	 */
	public void setTotalShopping(java.math.BigDecimal totalShopping){
		this.totalShopping = totalShopping;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  推荐人id
	 */
	@Column(name ="REFEREEID",nullable=true,length=10)
	public java.lang.Integer getRefereeid(){
		return this.refereeid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  推荐人id
	 */
	public void setRefereeid(java.lang.Integer refereeid){
		this.refereeid = refereeid;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  接点人ID
	 */
	@Column(name ="PARENTID",nullable=true,length=10)
	public java.lang.Integer getParentid(){
		return this.parentid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  接点人ID
	 */
	public void setParentid(java.lang.Integer parentid){
		this.parentid = parentid;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  推荐人数
	 */
	@Column(name ="REFEREE_NUMBER",nullable=true,length=10)
	public java.lang.Integer getRefereeNumber(){
		return this.refereeNumber;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  推荐人数
	 */
	public void setRefereeNumber(java.lang.Integer refereeNumber){
		this.refereeNumber = refereeNumber;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否推荐够
	 */
	@Column(name ="REFEREE_STATUS",nullable=true,length=3)
	public java.lang.Integer getRefereeStatus(){
		return this.refereeStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否推荐够
	 */
	public void setRefereeStatus(java.lang.Integer refereeStatus){
		this.refereeStatus = refereeStatus;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  下级人数
	 */
	@Column(name ="SON_NUMBER",nullable=false,length=3)
	public java.lang.Integer getSonNumber(){
		return this.sonNumber;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  下级人数
	 */
	public void setSonNumber(java.lang.Integer sonNumber){
		this.sonNumber = sonNumber;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否服务中心
	 */
	@Column(name ="IS_SERVER_CENTER",nullable=false,length=3)
	public java.lang.Integer getIsServerCenter(){
		return this.isServerCenter;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否服务中心
	 */
	public void setIsServerCenter(java.lang.Integer isServerCenter){
		this.isServerCenter = isServerCenter;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  我的服务人
	 */
	@Column(name ="MY_SERVER_CENTER",nullable=false,length=10)
	public java.lang.Integer getMyServerCenter(){
		return this.myServerCenter;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  我的服务人
	 */
	public void setMyServerCenter(java.lang.Integer myServerCenter){
		this.myServerCenter = myServerCenter;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  用户积分
	 */
	@Column(name ="USERSCORE",nullable=false,length=10)
	public java.lang.Integer getUserscore(){
		return this.userscore;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户积分
	 */
	public void setUserscore(java.lang.Integer userscore){
		this.userscore = userscore;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  用户类型 
	 */
	@Column(name ="USER_TYPE",nullable=false,length=3)
	public java.lang.Integer getUserType(){
		return this.userType;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户类型 
	 */
	public void setUserType(java.lang.Integer userType){
		this.userType = userType;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  会员组
	 */
	@Column(name ="USER_GROUP",nullable=false,length=3)
	public java.lang.Integer getUserGroup(){
		return this.userGroup;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  会员组
	 */
	public void setUserGroup(java.lang.Integer userGroup){
		this.userGroup = userGroup;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  会员级别
	 */
	@Column(name ="USER_LEVEL",nullable=false,length=3)
	public java.lang.Integer getUserLevel(){
		return this.userLevel;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  会员级别
	 */
	public void setUserLevel(java.lang.Integer userLevel){
		this.userLevel = userLevel;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  会员职务
	 */
	@Column(name ="USER_POST",nullable=false,length=3)
	public java.lang.Integer getUserPost(){
		return this.userPost;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  会员职务
	 */
	public void setUserPost(java.lang.Integer userPost){
		this.userPost = userPost;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  注册金额
	 */
	@Column(name ="REG_MONEY",nullable=false,scale=4,length=30)
	public java.math.BigDecimal getRegMoney(){
		return this.regMoney;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  注册金额
	 */
	public void setRegMoney(java.math.BigDecimal regMoney){
		this.regMoney = regMoney;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  已发分红
	 */
	@Column(name ="YF_MONEY",nullable=false,scale=4,length=30)
	public java.math.BigDecimal getYfMoney(){
		return this.yfMoney;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  已发分红
	 */
	public void setYfMoney(java.math.BigDecimal yfMoney){
		this.yfMoney = yfMoney;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  封顶
	 */
	@Column(name ="FD_MONEY",nullable=false,scale=4,length=30)
	public java.math.BigDecimal getFdMoney(){
		return this.fdMoney;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  封顶
	 */
	public void setFdMoney(java.math.BigDecimal fdMoney){
		this.fdMoney = fdMoney;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  总业绩
	 */
	@Column(name ="TOTAL_PERFORMANCE",nullable=false,scale=4,length=30)
	public java.math.BigDecimal getTotalPerformance(){
		return this.totalPerformance;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  总业绩
	 */
	public void setTotalPerformance(java.math.BigDecimal totalPerformance){
		this.totalPerformance = totalPerformance;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  已量碰业绩
	 */
	@Column(name ="TOUCHED_PERFORMANCE",nullable=false,scale=4,length=30)
	public java.lang.String getTouchedPerformance(){
		return this.touchedPerformance;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  已量碰业绩
	 */
	public void setTouchedPerformance(java.lang.String touchedPerformance){
		this.touchedPerformance = touchedPerformance;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  激活时间 
	 */
	@Column(name ="ACTIVATION_TIME",nullable=false,length=10)
	public java.lang.Integer getActivationTime(){
		return this.activationTime;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  激活时间 
	 */
	public void setActivationTime(java.lang.Integer activationTime){
		this.activationTime = activationTime;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  用户QQ
	 */
	@Column(name ="USER_QQ",nullable=false,length=10)
	public java.lang.Integer getUserQq(){
		return this.userQq;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户QQ
	 */
	public void setUserQq(java.lang.Integer userQq){
		this.userQq = userQq;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用户微信号
	 */
	@Column(name ="USER_WECHAT",nullable=false,length=32)
	public java.lang.String getUserWechat(){
		return this.userWechat;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用户微信号
	 */
	public void setUserWechat(java.lang.String userWechat){
		this.userWechat = userWechat;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用户OPENID
	 */
	@Column(name ="OPENID",nullable=false,length=32)
	public java.lang.String getOpenid(){
		return this.openid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用户OPENID
	 */
	public void setOpenid(java.lang.String openid){
		this.openid = openid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  注册人
	 */
	@Column(name ="REGISTER",nullable=false,length=32)
	public java.lang.String getRegister(){
		return this.register;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  注册人
	 */
	public void setRegister(java.lang.String register){
		this.register = register;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  明文密码
	 */
	@Column(name ="EXPRESS_PASSWORD",nullable=false,length=32)
	public java.lang.String getExpressPassword(){
		return this.expressPassword;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  明文密码
	 */
	public void setExpressPassword(java.lang.String expressPassword){
		this.expressPassword = expressPassword;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  累计分红
	 */
	@Column(name ="TOTAL_DIVIDENDS",nullable=false,scale=4,length=11)
	public java.math.BigDecimal getTotalDividends(){
		return this.totalDividends;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  累计分红
	 */
	public void setTotalDividends(java.math.BigDecimal totalDividends){
		this.totalDividends = totalDividends;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  分红累计天数
	 */
	@Column(name ="DIVIDENDS_DAYS",nullable=false,length=10)
	public java.lang.Integer getDividendsDays(){
		return this.dividendsDays;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  分红累计天数
	 */
	public void setDividendsDays(java.lang.Integer dividendsDays){
		this.dividendsDays = dividendsDays;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  会员国家
	 */
	@Column(name ="COUNTRY",nullable=false,length=10)
	public java.lang.Integer getCountry(){
		return this.country;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  会员国家
	 */
	public void setCountry(java.lang.Integer country){
		this.country = country;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  会员省份
	 */
	@Column(name ="PROVINCE",nullable=false,length=10)
	public java.lang.Integer getProvince(){
		return this.province;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  会员省份
	 */
	public void setProvince(java.lang.Integer province){
		this.province = province;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  会员城市
	 */
	@Column(name ="CITY",nullable=false,length=10)
	public java.lang.Integer getCity(){
		return this.city;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  会员城市
	 */
	public void setCity(java.lang.Integer city){
		this.city = city;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  会员区县
	 */
	@Column(name ="DAREA",nullable=false,length=10)
	public java.lang.Integer getDarea(){
		return this.darea;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  会员区县
	 */
	public void setDarea(java.lang.Integer darea){
		this.darea = darea;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  ET币
	 */
	@Column(name ="BALANCE_ET",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getBalanceEt(){
		return this.balanceEt;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  ET币
	 */
	public void setBalanceEt(java.math.BigDecimal balanceEt){
		this.balanceEt = balanceEt;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  身份证号
	 */
	@Column(name ="IDNUMBER",nullable=true,length=18)
	public java.lang.String getIdnumber(){
		return this.idnumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身份证号
	 */
	public void setIdnumber(java.lang.String idnumber){
		this.idnumber = idnumber;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  银行类型
	 */
	@Column(name ="BANKTYPE",nullable=true,length=3)
	public java.lang.Integer getBanktype(){
		return this.banktype;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  银行类型
	 */
	public void setBanktype(java.lang.Integer banktype){
		this.banktype = banktype;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  开户人
	 */
	@Column(name ="BANK_USER_NAME",nullable=true,length=50)
	public java.lang.String getBankUserName(){
		return this.bankUserName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  开户人
	 */
	public void setBankUserName(java.lang.String bankUserName){
		this.bankUserName = bankUserName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  卡号
	 */
	@Column(name ="BANKNUMBER",nullable=true,length=20)
	public java.lang.String getBanknumber(){
		return this.banknumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  卡号
	 */
	public void setBanknumber(java.lang.String banknumber){
		this.banknumber = banknumber;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  支行
	 */
	@Column(name ="BANK_CONTENT",nullable=true,length=255)
	public java.lang.String getBankContent(){
		return this.bankContent;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  支行
	 */
	public void setBankContent(java.lang.String bankContent){
		this.bankContent = bankContent;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  密保问题a
	 */
	@Column(name ="QUESTION1",nullable=true,length=255)
	public java.lang.String getQuestion1(){
		return this.question1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  密保问题a
	 */
	public void setQuestion1(java.lang.String question1){
		this.question1 = question1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  密保问题b
	 */
	@Column(name ="QUESTION2",nullable=true,length=255)
	public java.lang.String getQuestion2(){
		return this.question2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  密保问题b
	 */
	public void setQuestion2(java.lang.String question2){
		this.question2 = question2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  密保问题c
	 */
	@Column(name ="QUESTION3",nullable=true,length=255)
	public java.lang.String getQuestion3(){
		return this.question3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  密保问题c
	 */
	public void setQuestion3(java.lang.String question3){
		this.question3 = question3;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  密保答案a
	 */
	@Column(name ="ANSWER1",nullable=true,length=255)
	public java.lang.String getAnswer1(){
		return this.answer1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  密保答案a
	 */
	public void setAnswer1(java.lang.String answer1){
		this.answer1 = answer1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  密保答案b
	 */
	@Column(name ="ANSWER2",nullable=true,length=255)
	public java.lang.String getAnswer2(){
		return this.answer2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  密保答案b
	 */
	public void setAnswer2(java.lang.String answer2){
		this.answer2 = answer2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  密保答案c
	 */
	@Column(name ="ANSWER3",nullable=true,length=255)
	public java.lang.String getAnswer3(){
		return this.answer3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  密保答案c
	 */
	public void setAnswer3(java.lang.String answer3){
		this.answer3 = answer3;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  组id
	 */
	@Column(name ="GROUPID",nullable=true,length=10)
	public java.lang.Integer getGroupid(){
		return this.groupid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  组id
	 */
	public void setGroupid(java.lang.Integer groupid){
		this.groupid = groupid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  ticket
	 */
	@Column(name ="TICKET",nullable=true,length=500)
	public java.lang.String getTicket(){
		return this.ticket;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  ticket
	 */
	public void setTicket(java.lang.String ticket){
		this.ticket = ticket;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  购物币
	 */
	@Column(name ="BALANCE_GOUWU",nullable=true,scale=2,length=11)
	public java.math.BigDecimal getBalanceGouwu(){
		return this.balanceGouwu;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  购物币
	 */
	public void setBalanceGouwu(java.math.BigDecimal balanceGouwu){
		this.balanceGouwu = balanceGouwu;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  qrcodeStatus
	 */
	@Column(name ="QRCODE_STATUS",nullable=true,length=3)
	public java.lang.Integer getQrcodeStatus(){
		return this.qrcodeStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  qrcodeStatus
	 */
	public void setQrcodeStatus(java.lang.Integer qrcodeStatus){
		this.qrcodeStatus = qrcodeStatus;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  分红时间
	 */
	@Column(name ="BONUS_TIME",nullable=false,length=10)
	public java.lang.Integer getBonusTime(){
		return this.bonusTime;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  分红时间
	 */
	public void setBonusTime(java.lang.Integer bonusTime){
		this.bonusTime = bonusTime;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否空单激活
	 */
	@Column(name ="IS_EMPTY",nullable=false,length=3)
	public java.lang.Integer getIsEmpty(){
		return this.isEmpty;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否空单激活
	 */
	public void setIsEmpty(java.lang.Integer isEmpty){
		this.isEmpty = isEmpty;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  爱心基金
	 */
	@Column(name ="BALANCE_HEART",nullable=true,scale=4,length=11)
	public java.math.BigDecimal getBalanceHeart(){
		return this.balanceHeart;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  爱心基金
	 */
	public void setBalanceHeart(java.math.BigDecimal balanceHeart){
		this.balanceHeart = balanceHeart;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  已层碰的层数
	 */
	@Column(name ="TOUCH_DISTANCE",nullable=true,length=5000)
	public java.lang.String getTouchDistance(){
		return this.touchDistance;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  已层碰的层数
	 */
	public void setTouchDistance(java.lang.String touchDistance){
		this.touchDistance = touchDistance;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  星级别
	 */
	@Column(name ="KUO_LEVEL",nullable=true,length=10)
	public java.lang.Integer getKuoLevel(){
		return this.kuoLevel;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  星级别
	 */
	public void setKuoLevel(java.lang.Integer kuoLevel){
		this.kuoLevel = kuoLevel;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否是回填单
	 */
	@Column(name ="BACKFILL_STATUS",nullable=true,length=3)
	public java.lang.Integer getBackfillStatus(){
		return this.backfillStatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否是回填单
	 */
	public void setBackfillStatus(java.lang.Integer backfillStatus){
		this.backfillStatus = backfillStatus;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  剩余回填金额
	 */
	@Column(name ="BACKFILL_MONEY",nullable=true,scale=2,length=10)
	public java.math.BigDecimal getBackfillMoney(){
		return this.backfillMoney;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  剩余回填金额
	 */
	public void setBackfillMoney(java.math.BigDecimal backfillMoney){
		this.backfillMoney = backfillMoney;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  回填剩余
	 */
	@Column(name ="BACKFILL_SHENG",nullable=true,scale=2,length=10)
	public java.lang.String getBackfillSheng(){
		return this.backfillSheng;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  回填剩余
	 */
	public void setBackfillSheng(java.lang.String backfillSheng){
		this.backfillSheng = backfillSheng;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  一周可挂单次数
	 */
	@Column(name ="GUADAN_NUM",nullable=true,length=10)
	public java.lang.Integer getGuadanNum(){
		return this.guadanNum;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  一周可挂单次数
	 */
	public void setGuadanNum(java.lang.Integer guadanNum){
		this.guadanNum = guadanNum;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  每日静态
	 */
	@Column(name ="ALLSTATIC",nullable=false,scale=2,length=11)
	public java.lang.String getAllstatic(){
		return this.allstatic;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  每日静态
	 */
	public void setAllstatic(java.lang.String allstatic){
		this.allstatic = allstatic;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  dis
	 */
	@Column(name ="DIS",nullable=false,length=10)
	public java.lang.Integer getDis(){
		return this.dis;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  dis
	 */
	public void setDis(java.lang.Integer dis){
		this.dis = dis;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  释放时间
	 */
	@Column(name ="RELEASE_TIME",nullable=false,length=10)
	public java.lang.Integer getReleaseTime(){
		return this.releaseTime;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  释放时间
	 */
	public void setReleaseTime(java.lang.Integer releaseTime){
		this.releaseTime = releaseTime;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否商家
	 */
	@Column(name ="ISSHOP",nullable=false,length=3)
	public java.lang.Integer getIsshop(){
		return this.isshop;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否商家
	 */
	public void setIsshop(java.lang.Integer isshop){
		this.isshop = isshop;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  isimport
	 */
	@Column(name ="ISIMPORT",nullable=false,length=3)
	public java.lang.Integer getIsimport(){
		return this.isimport;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  isimport
	 */
	public void setIsimport(java.lang.Integer isimport){
		this.isimport = isimport;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  点位
	 */
	@Column(name ="POS",nullable=false,length=3)
	public java.lang.Integer getPos(){
		return this.pos;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  点位
	 */
	public void setPos(java.lang.Integer pos){
		this.pos = pos;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  isout
	 */
	@Column(name ="ISOUT",nullable=false,length=3)
	public java.lang.Integer getIsout(){
		return this.isout;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  isout
	 */
	public void setIsout(java.lang.Integer isout){
		this.isout = isout;
	}
	
	
	
}
