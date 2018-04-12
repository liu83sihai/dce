<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>用户静态分红</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="userStaticController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${userStaticPage.id }">
					<input id="userid" name="userid" type="hidden" value="${userStaticPage.userid }">
					<input id="ctUser.id" name="ctUser.id" type="hidden" value="${userStaticPage.ctUser.id }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								每日返利:
							</label>
						</td>
						<td class="value">
						     	 <input id="money" name="money" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${userStaticPage.money}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">每日返利</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								返利总额:
							</label>
						</td>
						<td class="value">
						     	 <input id="totalmoney" name="totalmoney" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${userStaticPage.totalmoney}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">返利总额</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								已返:
							</label>
						</td>
						<td class="value">
						     	 <input id="yfBonus" name="yfBonus" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${userStaticPage.yfBonus}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">已返</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								状态:
							</label>
						</td>
						<td class="value">
						     	
						     	 <t:dictSelect field="status" hasLabel="false" 
						     	   typeGroupCode="sStatus" defaultVal='${userStaticPage.status}'></t:dictSelect>
						     	 
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">状态</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								类型:
							</label>
						</td>
						<td class="value">
						     	 	 <t:dictSelect field="type" hasLabel="false"
						     	   typeGroupCode="stype" defaultVal='${userStaticPage.type}'></t:dictSelect>
						     	 
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">类型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								statictime:
							</label>
						</td>
						<td class="value">
						     	 <input id="statictime" name="statictime" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${userStaticPage.statictime}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">statictime</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/yisi/business/ctaccount/userStatic.js"></script>		
