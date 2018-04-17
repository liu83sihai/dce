<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>用户信息表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="ctUserController.do?doAdd" >
		<input id="id" name="id" type="hidden" value="${ctUserPage.id }"/>
<%-- 		<input id="userPassword" name="userPassword" type="hidden" value="${ctUserPage.userPassword }"/> --%>
<%-- 		<input id="twoPassword" name="twoPassword" type="hidden" value="${ctUserPage.twoPassword }"/> --%>
<%-- 		<input id="refereeid" name="refereeid" type="hidden" value="${ctUserPage.refereeid }"/> --%>
<%-- 		<input id="parentid" name="parentid" type="hidden" value="${ctUserPage.parentid }"/> --%>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							用户编码:
						</label>
					</td>
					<td class="value">
					     	 <input id="userName" name="userName" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*"  validType="ct_user,user_name,id"
					     	  ignore="checked"
					     	  />
<%-- 					     	   <input id="userName" class="inputxt" name="userName" validType="t_s_base_user,userName,id" value="${user.userName }" datatype="s2-10" /> --%>
                    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用户名</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							姓名:
						</label>
					</td>
					<td class="value">
					     	 <input id="trueName" name="trueName" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">姓名</label>
						</td>
					</tr>
				<tr>
					
					<td align="right">
						<label class="Validform_label">
							手机号:
						</label>
					</td>
					<td class="value">
					     	 <input id="mobile" name="mobile" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">手机号</label>
						</td>
					
			
					<td align="right">
						<label class="Validform_label">
							会员级别:
						</label>
					</td>
					<td class="value">
					     	 <input id="userLevel" name="userLevel" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">会员级别</label>
						</td>
				</tr>
				<tr>
					
					<td align="right">
						<label class="Validform_label">
							推荐用户编号:
						</label>
					</td>
					<td class="value" colspan="3">
<!-- 					     	 <input id="refferUserName" name="refferUserName" type="text" style="width: 150px" class="inputxt"  -->
					     	
<!-- 					     	  ignore="ignore" -->
<!-- 					     	  /> -->
					     	   <input id="refferid" name="refereeid" type="hidden" />
                				<input name="refferUserName" id="refferUserName" class="inputxt"  readonly="readonly"   />
                			<t:choose hiddenName="refferid" hiddenid="id" textname="userName" inputTextname="refferUserName" url="ctUserController.do?list" 
                			name="ctUserList" icon="icon-search" title="用户列表" isclear="true" isInit="true"  width="600px" height="400px"></t:choose>
                
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">手机号</label>
						</td>
					</tr>
					<tr>
			
					<td align="right">
						<label class="Validform_label">
							接点用户编号:
						</label>
					</td>
					<td class="value" colspan="3">
<!-- 					     	 <input id="parentUserName" name="parentUserName" type="text" style="width: 150px" class="inputxt"  -->
<!-- 					     	  datatype="*"  -->
<!-- 					     	  ignore="checked" -->
<!-- 					     	  /> -->
					     	    <input id="parentid" name="parentid" type="hidden" />
                				<input name="parentUserName" id="parentUserName" class="inputxt"  readonly="readonly"   />
                			<t:choose hiddenName="parentid" hiddenid="id" textname="userName" inputTextname="parentUserName" url="ctUserController.do?list" 
                			name="ctUserList" icon="icon-search" title="用户列表" isclear="true" isInit="true"  width="600px" height="400px"></t:choose>
                
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">接点用户编号</label>
						</td>
				</tr>
				<tr>
					
					<td align="right">
						<label class="Validform_label">
							用户密码:
						</label>
					</td>
					<td class="value">
					     	 <input id="userPassword" name="userPassword" type="text" style="width: 150px" class="inputxt" 
					     	
					     	  ignore="ignore" value="123456"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用户密码</label>
						</td>
					
			
					<td align="right">
						<label class="Validform_label">
							支付密码:
						</label>
					</td>
					<td class="value">
					     	 <input id="twoPassword" name="twoPassword" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*"  value="123456"
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">接点用户编号</label>
						</td>
				</tr>

				<tr>
					<td align="right">
						<label class="Validform_label">
							身份证号:
						</label>
					</td>
					<td class="value">
					     	 <input id="idnumber" name="idnumber" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">身份证号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							银行类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="banktype" name="banktype" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">银行类型</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							开户人:
						</label>
					</td>
					<td class="value">
					     	 <input id="bankUserName" name="bankUserName" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">开户人</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							卡号:
						</label>
					</td>
					<td class="value">
					     	 <input id="banknumber" name="banknumber" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">卡号</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							支行:
						</label>
					</td>
					<td class="value">
					     	 <input id="bankContent" name="bankContent" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">支行</label>
						</td>
				
				
					<td align="right">
						<label class="Validform_label">
							点位:
						</label>
					</td>
					<td class="value">
					     	 <input id="pos" name="pos" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">点位</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/yisi/business/ctuser/ctUser.js"></script>		
