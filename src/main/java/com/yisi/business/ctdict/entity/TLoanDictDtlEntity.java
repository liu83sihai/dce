package com.yisi.business.ctdict.entity;
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
 * @Description: 数据词典明细
 * @author onlineGenerator
 * @date 2018-04-10 14:58:27
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_loan_dict_dtl", schema = "")
@SuppressWarnings("serial")
public class TLoanDictDtlEntity implements java.io.Serializable {
	/**主键ID*/
	private java.lang.Integer id;
	/**数据字典ID*/
    @Excel(name="数据字典ID")
	private java.lang.Integer dictid;
	/**编码*/
    @Excel(name="编码")
	private java.lang.String code;
	/**名称*/
    @Excel(name="名称")
	private java.lang.String name;
	/**状态*/
    @Excel(name="状态")
	private java.lang.String status;
	/**备注*/
    @Excel(name="备注")
	private java.lang.String remark;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  主键ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name ="ID",nullable=false,length=19)
	public java.lang.Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  主键ID
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  数据字典ID
	 */
	
	@Column(name ="DICTID",nullable=false,length=19)
	public java.lang.Integer getDictid(){
		return this.dictid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  数据字典ID
	 */
	public void setDictid(java.lang.Integer dictid){
		this.dictid = dictid;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  编码
	 */
	
	@Column(name ="CODE",nullable=false,length=50)
	public java.lang.String getCode(){
		return this.code;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  编码
	 */
	public void setCode(java.lang.String code){
		this.code = code;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  名称
	 */
	
	@Column(name ="NAME",nullable=false,length=30)
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  名称
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  状态
	 */
	
	@Column(name ="STATUS",nullable=false,length=1)
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  状态
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	
	@Column(name ="REMARK",nullable=true,length=200)
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}
	
}
