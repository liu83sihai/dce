package com.yisi.business.ctcurrency.entity;

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
 * @Description: 币种表
 * @author onlineGenerator
 * @date 2018-04-12 14:07:20
 * @version V1.0   
 *
 */
@Entity
@Table(name = "ct_currency", schema = "")
@SuppressWarnings("serial")
public class CtCurrencyEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**货币名称*/
	@Excel(name="货币名称")
	private java.lang.String currencyName;
	/**货币logo*/
	@Excel(name="货币logo")
	private java.lang.String currencyLogo;
	/**英文标识*/
	@Excel(name="英文标识")
	private java.lang.String currencyMark;
	/**币种说明*/
	@Excel(name="币种说明")
	private java.lang.String currencyContent;
	/**总市值*/
	@Excel(name="总市值")
	private java.math.BigDecimal currencyAllMoney;
	/**币总数量*/
	@Excel(name="币总数量")
	private java.math.BigDecimal currencyAllNum;
	/**买入手续费*/
	@Excel(name="买入手续费")
	private java.lang.Double currencyBuyFee;
	/**卖出手续费*/
	@Excel(name="卖出手续费")
	private java.lang.Double currencySellFee;
	/**卖出比例*/
	@Excel(name="卖出比例")
	private java.lang.String sellPre;
	/**提币手续费*/
	@Excel(name="提币手续费")
	private java.math.BigDecimal withFee;
	/**链接地址*/
	@Excel(name="链接地址")
	private java.lang.String currencyUrl;
	/**交易币种*/
	@Excel(name="交易币种")
	private java.lang.Integer tradeCurrencyId;
	/**isLine*/
	@Excel(name="isLine")
	private java.lang.Integer isLine;
	/**是否交易*/
	@Excel(name="是否交易")
	private java.lang.Integer isLock;
	/**portNumber*/
	@Excel(name="portNumber")
	private java.lang.Integer portNumber;
	/**addTime*/
	@Excel(name="addTime")
	private java.lang.Integer addTime;
	/**status*/
	@Excel(name="status")
	private java.lang.Integer status;
	/**rpc路径*/
	@Excel(name="rpc路径")
	private java.lang.String rpcUrl;
	/**rpc密码*/
	@Excel(name="rpc密码")
	private java.lang.String rpcPwd;
	/**rpc账号*/
	@Excel(name="rpc账号")
	private java.lang.String rpcUser;
	/**最大提币额*/
	@Excel(name="最大提币额")
	private java.lang.Integer currencyAllTibi;
	/**跳转链接*/
	@Excel(name="跳转链接")
	private java.lang.String detailUrl;
	/**储存路径*/
	@Excel(name="储存路径")
	private java.lang.String qianbaoUrl;
	/**钱包密钥*/
	@Excel(name="钱包密钥")
	private java.lang.String qianbaoKey;
	/**发行价格*/
	@Excel(name="发行价格")
	private java.math.BigDecimal priceFx;
	/**涨停*/
	@Excel(name="涨停")
	private java.math.BigDecimal priceUp;
	/**开盘价*/
	@Excel(name="开盘价")
	private java.math.BigDecimal priceOpen;
	/**跌停*/
	@Excel(name="跌停")
	private java.math.BigDecimal priceDown;
	/**priceZnew*/
	@Excel(name="priceZnew")
	private java.math.BigDecimal priceZnew;
	/**sort*/
	@Excel(name="sort")
	private java.lang.Integer sort;
	/**限制位数*/
	@Excel(name="限制位数")
	private java.lang.Integer currencyDigitNum;
	/**guanwangUrl*/
	@Excel(name="guanwangUrl")
	private java.lang.String guanwangUrl;
	/**utime*/
	@Excel(name="utime")
	private java.lang.Integer utime;
	/**充币提币状态*/
	@Excel(name="充币提币状态")
	private java.lang.Integer isCtstatus;
	/**卖出挂单量*/
	@Excel(name="卖出挂单量")
	private java.math.BigDecimal guadanum;
	/**买进量*/
	@Excel(name="买进量")
	private java.math.BigDecimal buynum;
	/**买入挂单量*/
	@Excel(name="买入挂单量")
	private java.math.BigDecimal guabuynum;
	
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  货币名称
	 */
	@Column(name ="CURRENCY_NAME",nullable=false,length=32)
	public java.lang.String getCurrencyName(){
		return this.currencyName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  货币名称
	 */
	public void setCurrencyName(java.lang.String currencyName){
		this.currencyName = currencyName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  货币logo
	 */
	@Column(name ="CURRENCY_LOGO",nullable=false,length=255)
	public java.lang.String getCurrencyLogo(){
		return this.currencyLogo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  货币logo
	 */
	public void setCurrencyLogo(java.lang.String currencyLogo){
		this.currencyLogo = currencyLogo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  英文标识
	 */
	@Column(name ="CURRENCY_MARK",nullable=false,length=32)
	public java.lang.String getCurrencyMark(){
		return this.currencyMark;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  英文标识
	 */
	public void setCurrencyMark(java.lang.String currencyMark){
		this.currencyMark = currencyMark;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  币种说明
	 */
	@Column(name ="CURRENCY_CONTENT",nullable=false,length=2555)
	public java.lang.String getCurrencyContent(){
		return this.currencyContent;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  币种说明
	 */
	public void setCurrencyContent(java.lang.String currencyContent){
		this.currencyContent = currencyContent;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  总市值
	 */
	@Column(name ="CURRENCY_ALL_MONEY",nullable=false,scale=2,length=40)
	public java.math.BigDecimal getCurrencyAllMoney(){
		return this.currencyAllMoney;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  总市值
	 */
	public void setCurrencyAllMoney(java.math.BigDecimal currencyAllMoney){
		this.currencyAllMoney = currencyAllMoney;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  币总数量
	 */
	@Column(name ="CURRENCY_ALL_NUM",nullable=true,scale=4,length=40)
	public java.math.BigDecimal getCurrencyAllNum(){
		return this.currencyAllNum;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  币总数量
	 */
	public void setCurrencyAllNum(java.math.BigDecimal currencyAllNum){
		this.currencyAllNum = currencyAllNum;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  买入手续费
	 */
	@Column(name ="CURRENCY_BUY_FEE",nullable=false,scale=2,length=64)
	public java.lang.Double getCurrencyBuyFee(){
		return this.currencyBuyFee;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  买入手续费
	 */
	public void setCurrencyBuyFee(java.lang.Double currencyBuyFee){
		this.currencyBuyFee = currencyBuyFee;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  卖出手续费
	 */
	@Column(name ="CURRENCY_SELL_FEE",nullable=false,scale=2,length=64)
	public java.lang.Double getCurrencySellFee(){
		return this.currencySellFee;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  卖出手续费
	 */
	public void setCurrencySellFee(java.lang.Double currencySellFee){
		this.currencySellFee = currencySellFee;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  卖出比例
	 */
	@Column(name ="SELL_PRE",nullable=true,length=50)
	public java.lang.String getSellPre(){
		return this.sellPre;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  卖出比例
	 */
	public void setSellPre(java.lang.String sellPre){
		this.sellPre = sellPre;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  提币手续费
	 */
	@Column(name ="WITH_FEE",nullable=true,scale=8,length=40)
	public java.math.BigDecimal getWithFee(){
		return this.withFee;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  提币手续费
	 */
	public void setWithFee(java.math.BigDecimal withFee){
		this.withFee = withFee;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  链接地址
	 */
	@Column(name ="CURRENCY_URL",nullable=false,length=128)
	public java.lang.String getCurrencyUrl(){
		return this.currencyUrl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  链接地址
	 */
	public void setCurrencyUrl(java.lang.String currencyUrl){
		this.currencyUrl = currencyUrl;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  交易币种
	 */
	@Column(name ="TRADE_CURRENCY_ID",nullable=false,length=10)
	public java.lang.Integer getTradeCurrencyId(){
		return this.tradeCurrencyId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  交易币种
	 */
	public void setTradeCurrencyId(java.lang.Integer tradeCurrencyId){
		this.tradeCurrencyId = tradeCurrencyId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  isLine
	 */
	@Column(name ="IS_LINE",nullable=false,length=3)
	public java.lang.Integer getIsLine(){
		return this.isLine;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  isLine
	 */
	public void setIsLine(java.lang.Integer isLine){
		this.isLine = isLine;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否交易
	 */
	@Column(name ="IS_LOCK",nullable=false,length=3)
	public java.lang.Integer getIsLock(){
		return this.isLock;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否交易
	 */
	public void setIsLock(java.lang.Integer isLock){
		this.isLock = isLock;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  portNumber
	 */
	@Column(name ="PORT_NUMBER",nullable=false,length=10)
	public java.lang.Integer getPortNumber(){
		return this.portNumber;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  portNumber
	 */
	public void setPortNumber(java.lang.Integer portNumber){
		this.portNumber = portNumber;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  addTime
	 */
	@Column(name ="ADD_TIME",nullable=false,length=10)
	public java.lang.Integer getAddTime(){
		return this.addTime;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  addTime
	 */
	public void setAddTime(java.lang.Integer addTime){
		this.addTime = addTime;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  status
	 */
	@Column(name ="STATUS",nullable=false,length=3)
	public java.lang.Integer getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  status
	 */
	public void setStatus(java.lang.Integer status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  rpc路径
	 */
	@Column(name ="RPC_URL",nullable=false,length=255)
	public java.lang.String getRpcUrl(){
		return this.rpcUrl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  rpc路径
	 */
	public void setRpcUrl(java.lang.String rpcUrl){
		this.rpcUrl = rpcUrl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  rpc密码
	 */
	@Column(name ="RPC_PWD",nullable=false,length=255)
	public java.lang.String getRpcPwd(){
		return this.rpcPwd;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  rpc密码
	 */
	public void setRpcPwd(java.lang.String rpcPwd){
		this.rpcPwd = rpcPwd;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  rpc账号
	 */
	@Column(name ="RPC_USER",nullable=false,length=255)
	public java.lang.String getRpcUser(){
		return this.rpcUser;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  rpc账号
	 */
	public void setRpcUser(java.lang.String rpcUser){
		this.rpcUser = rpcUser;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  最大提币额
	 */
	@Column(name ="CURRENCY_ALL_TIBI",nullable=false,length=10)
	public java.lang.Integer getCurrencyAllTibi(){
		return this.currencyAllTibi;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  最大提币额
	 */
	public void setCurrencyAllTibi(java.lang.Integer currencyAllTibi){
		this.currencyAllTibi = currencyAllTibi;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  跳转链接
	 */
	@Column(name ="DETAIL_URL",nullable=false,length=64)
	public java.lang.String getDetailUrl(){
		return this.detailUrl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  跳转链接
	 */
	public void setDetailUrl(java.lang.String detailUrl){
		this.detailUrl = detailUrl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  储存路径
	 */
	@Column(name ="QIANBAO_URL",nullable=false,length=64)
	public java.lang.String getQianbaoUrl(){
		return this.qianbaoUrl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  储存路径
	 */
	public void setQianbaoUrl(java.lang.String qianbaoUrl){
		this.qianbaoUrl = qianbaoUrl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  钱包密钥
	 */
	@Column(name ="QIANBAO_KEY",nullable=false,length=64)
	public java.lang.String getQianbaoKey(){
		return this.qianbaoKey;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  钱包密钥
	 */
	public void setQianbaoKey(java.lang.String qianbaoKey){
		this.qianbaoKey = qianbaoKey;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  发行价格
	 */
	@Column(name ="PRICE_FX",nullable=false,scale=4,length=50)
	public java.math.BigDecimal getPriceFx(){
		return this.priceFx;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  发行价格
	 */
	public void setPriceFx(java.math.BigDecimal priceFx){
		this.priceFx = priceFx;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  涨停
	 */
	@Column(name ="PRICE_UP",nullable=false,scale=4,length=50)
	public java.math.BigDecimal getPriceUp(){
		return this.priceUp;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  涨停
	 */
	public void setPriceUp(java.math.BigDecimal priceUp){
		this.priceUp = priceUp;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  开盘价
	 */
	@Column(name ="PRICE_OPEN",nullable=true,scale=4,length=50)
	public java.math.BigDecimal getPriceOpen(){
		return this.priceOpen;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  开盘价
	 */
	public void setPriceOpen(java.math.BigDecimal priceOpen){
		this.priceOpen = priceOpen;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  跌停
	 */
	@Column(name ="PRICE_DOWN",nullable=false,scale=4,length=50)
	public java.math.BigDecimal getPriceDown(){
		return this.priceDown;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  跌停
	 */
	public void setPriceDown(java.math.BigDecimal priceDown){
		this.priceDown = priceDown;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  priceZnew
	 */
	@Column(name ="PRICE_ZNEW",nullable=true,scale=4,length=50)
	public java.math.BigDecimal getPriceZnew(){
		return this.priceZnew;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  priceZnew
	 */
	public void setPriceZnew(java.math.BigDecimal priceZnew){
		this.priceZnew = priceZnew;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  sort
	 */
	@Column(name ="SORT",nullable=false,length=10)
	public java.lang.Integer getSort(){
		return this.sort;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  sort
	 */
	public void setSort(java.lang.Integer sort){
		this.sort = sort;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  限制位数
	 */
	@Column(name ="CURRENCY_DIGIT_NUM",nullable=false,length=10)
	public java.lang.Integer getCurrencyDigitNum(){
		return this.currencyDigitNum;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  限制位数
	 */
	public void setCurrencyDigitNum(java.lang.Integer currencyDigitNum){
		this.currencyDigitNum = currencyDigitNum;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  guanwangUrl
	 */
	@Column(name ="GUANWANG_URL",nullable=true,length=128)
	public java.lang.String getGuanwangUrl(){
		return this.guanwangUrl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  guanwangUrl
	 */
	public void setGuanwangUrl(java.lang.String guanwangUrl){
		this.guanwangUrl = guanwangUrl;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  utime
	 */
	@Column(name ="UTIME",nullable=true,length=10)
	public java.lang.Integer getUtime(){
		return this.utime;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  utime
	 */
	public void setUtime(java.lang.Integer utime){
		this.utime = utime;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  充币提币状态
	 */
	@Column(name ="IS_CTSTATUS",nullable=true,length=10)
	public java.lang.Integer getIsCtstatus(){
		return this.isCtstatus;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  充币提币状态
	 */
	public void setIsCtstatus(java.lang.Integer isCtstatus){
		this.isCtstatus = isCtstatus;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  卖出挂单量
	 */
	@Column(name ="GUADANUM",nullable=true,scale=4,length=50)
	public java.math.BigDecimal getGuadanum(){
		return this.guadanum;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  卖出挂单量
	 */
	public void setGuadanum(java.math.BigDecimal guadanum){
		this.guadanum = guadanum;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  买进量
	 */
	@Column(name ="BUYNUM",nullable=true,scale=4,length=50)
	public java.math.BigDecimal getBuynum(){
		return this.buynum;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  买进量
	 */
	public void setBuynum(java.math.BigDecimal buynum){
		this.buynum = buynum;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  买入挂单量
	 */
	@Column(name ="GUABUYNUM",nullable=true,scale=4,length=50)
	public java.math.BigDecimal getGuabuynum(){
		return this.guabuynum;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  买入挂单量
	 */
	public void setGuabuynum(java.math.BigDecimal guabuynum){
		this.guabuynum = guabuynum;
	}
}
