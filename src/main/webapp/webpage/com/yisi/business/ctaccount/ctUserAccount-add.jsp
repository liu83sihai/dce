<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>用户账户类型</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="ctUserAccountController.do?doAdd" >
		<input id="id" name="id" type="hidden" value="${ctUserAccountPage.id }"/>
		<input id="userid" name="userid" type="hidden" value="${ctUserAccountPage.ctUser.id }"/>
		<input id="action" name="action" type="hidden" value="add"/>
		<input id="updatetime" name="updatetime" type="hidden" value="${ctUserAccountPage.updatetime }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							用户名:
						</label>
					</td>
					<td class="value">
					     	  <input id="userName" name="userName" type="text"  style="width: 150px" class="inputxt" 
					     	  readOnly=true value="${ctUserAccountPage.ctUser.userName }"
					     	  />
					     	 
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">账户类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							账户类型:
						</label>
					</td>
					<td class="value">
					     	 
					     	  <t:dictSelect field="accounttype" datatype="*" typeGroupCode="atype" hasLabel="false" ></t:dictSelect>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">账户类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							增加金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="amount" name="amount" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="d"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">增加金额</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							备注:
						</label>
					</td>
					<td class="value">
					     	 <input id="remark" name="remark" type="text" style="width: 150px" class="inputxt" 
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注:</label>
						</td>
				</tr>
				
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/yisi/business/ctaccount/ctUserAccount.js"></script>		
