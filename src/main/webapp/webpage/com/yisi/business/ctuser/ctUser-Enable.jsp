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
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="ctUserController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${ctUserPage.id }">
					<input id="action" name="action" type="hidden" value="0">
						<input id="status" name="status" type="hidden" value="0">
					
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					
					<tr>
						<td align="right">
							<label class="Validform_label">
								用户:
							</label>
						</td>
						<td class="value">
						     	 <input id="userName" name="userName" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.userName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">支行</label>
						</td>
						</tr>
						<tr>
						<td align="right">
							<label class="Validform_label">
								复原原因:
							</label>
						</td>
						<td class="value">
						     	 <input id="remark" name="remark" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 
						     	 value='${ctUserPage.remark}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">点位</label>
						</td>
					</tr>
					
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/yisi/business/ctuser/ctUser.js"></script>		
