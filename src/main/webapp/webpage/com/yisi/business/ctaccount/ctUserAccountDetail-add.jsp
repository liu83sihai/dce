<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>用户账户明细</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="ctUserAccountDetailController.do?doAdd" >
		<input id="id" name="id" type="hidden" value="${ctUserAccountDetailPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							用户ID:
						</label>
					</td>
					<td class="value">
					     	 <input id="userid" name="userid" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用户ID</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="amount" name="amount" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">金额</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							余额:
						</label>
					</td>
					<td class="value">
					     	 <input id="blanceamount" name="blanceamount" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">余额</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							增加减少:
						</label>
					</td>
					<td class="value">
					     	 <input id="moreorless" name="moreorless" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">增加减少</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							流水类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="incometype" name="incometype" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">流水类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							创建时间:
						</label>
					</td>
					<td class="value">
							   <input id="createtime" name="createtime" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()" 
					      						 
					      						ignore="ignore"
					      						/>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">创建时间</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							atype:
						</label>
					</td>
					<td class="value">
					     	 <input id="accounttype" name="accounttype" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">atype</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							remark:
						</label>
					</td>
					<td class="value">
					     	 <input id="remark" name="remark" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">remark</label>
						</td>
				</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/yisi/business/ctaccount/ctUserAccountDetail.js"></script>		
