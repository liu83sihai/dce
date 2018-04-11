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
 * @Description: 数据词典
 * @author onlineGenerator
 * @date 2018-04-10 14:58:27
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_loan_dict", schema = "")
@SuppressWarnings("serial")
public class LoanDictEntity implements java.io.Serializable {
	/**主键ID*/
	private java.lang.Integer id;
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
	/**创建用户ID*/
    @Excel(name="创建用户ID")
	private java.lang.Integer createuserid;
	/**修改用户ID*/
    @Excel(name="修改用户ID")
	private java.lang.Integer updateuserid;
	/**创建时间*/
    @Excel(name="创建时间",format = "yyyy-MM-dd")
	private java.util.Date createtime;
	/**修改时间*/
    @Excel(name="修改时间",format = "yyyy-MM-dd")
	private java.util.Date updatetime;
	
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
	
	@Column(name ="NAME",nullable=false,length=50)
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
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  创建用户ID
	 */
	
	@Column(name ="CREATEUSERID",nullable=false,length=19)
	public java.lang.Integer getCreateuserid(){
		return this.createuserid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  创建用户ID
	 */
	public void setCreateuserid(java.lang.Integer createuserid){
		this.createuserid = createuserid;
	}
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  修改用户ID
	 */
	
	@Column(name ="UPDATEUSERID",nullable=false,length=19)
	public java.lang.Integer getUpdateuserid(){
		return this.updateuserid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  修改用户ID
	 */
	public void setUpdateuserid(java.lang.Integer updateuserid){
		this.updateuserid = updateuserid;
	}
	
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建时间
	 */
	
	@Column(name ="CREATETIME",nullable=false)
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  修改时间
	 */
	
	@Column(name ="UPDATETIME",nullable=false)
	public java.util.Date getUpdatetime(){
		return this.updatetime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  修改时间
	 */
	public void setUpdatetime(java.util.Date updatetime){
		this.updatetime = updatetime;
	}
	
}
