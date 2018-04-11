<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>数据词典</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  $(document).ready(function(){
	$('#tt').tabs({
	   onSelect:function(title){
	       $('#tt .panel-body').css('width','auto');
		}
	});
	$(".tabs-wrap").css('width','100%');
  });
 </script>
 </head>
 <body style="overflow-x: hidden;">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="loanDictController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${loanDictPage.id }">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right">
				<label class="Validform_label">编码:</label>
			</td>
			<td class="value">
		     	 <input id="code" name="code" type="text" style="width: 150px" class="inputxt"datatype="*" 
				ignore="checked"
		     	 >
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">编码</label>
			</td>
			<td align="right">
				<label class="Validform_label">名称:</label>
			</td>
			<td class="value">
		     	 <input id="name" name="name" type="text" style="width: 150px" class="inputxt"datatype="*" 
				ignore="checked"
		     	 >
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">名称</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">状态:</label>
			</td>
			<td class="value">
		     	 <input id="status" name="status" type="text" style="width: 150px" class="inputxt"datatype="*" 
				ignore="checked"
		     	 >
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">状态</label>
			</td>
			<td align="right">
				<label class="Validform_label">备注:</label>
			</td>
			<td class="value">
		     	 <input id="remark" name="remark" type="text" style="width: 150px" class="inputxt" 
				ignore="ignore"
		     	 >
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">备注</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">创建用户ID:</label>
			</td>
			<td class="value">
		     	 <input id="createuserid" name="createuserid" type="text" style="width: 150px" class="inputxt"datatype="*" 
				ignore="checked"
		     	 >
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">创建用户ID</label>
			</td>
			<td align="right">
				<label class="Validform_label">修改用户ID:</label>
			</td>
			<td class="value">
		     	 <input id="updateuserid" name="updateuserid" type="text" style="width: 150px" class="inputxt"datatype="*" 
				ignore="checked"
		     	 >
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">修改用户ID</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">创建时间:</label>
			</td>
			<td class="value">
					  <input id="createtime" name="createtime" type="text" style="width: 150px" 
							 class="Wdate" onClick="WdatePicker()" datatype="*" 
									ignore="checked"
							 >
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">创建时间</label>
			</td>
			<td align="right">
				<label class="Validform_label">修改时间:</label>
			</td>
			<td class="value">
					  <input id="updatetime" name="updatetime" type="text" style="width: 150px" 
							 class="Wdate" onClick="WdatePicker()" datatype="*" 
									ignore="checked"
							 >
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">修改时间</label>
			</td>
		</tr>
	</table>
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:800px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="loanDictController.do?tLoanDictDtlList&id=${loanDictPage.id}" icon="icon-search" title="数据词典明细" id="tLoanDictDtl"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 附表明细 模版 -->
	<table style="display:none">
	<tbody id="add_tLoanDictDtl_table_template">
		<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
					  	<input name="tLoanDictDtlList[#index#].dictid" maxlength="19" 
					  		type="text" class="inputxt"  style="width:120px;" datatype="*"
									ignore="checked"
					  		>
					  <label class="Validform_label" style="display: none;">数据字典ID</label>
				  </td>
				  <td align="left">
					  	<input name="tLoanDictDtlList[#index#].code" maxlength="50" 
					  		type="text" class="inputxt"  style="width:120px;" datatype="*"
									ignore="checked"
					  		>
					  <label class="Validform_label" style="display: none;">编码</label>
				  </td>
				  <td align="left">
					  	<input name="tLoanDictDtlList[#index#].name" maxlength="30" 
					  		type="text" class="inputxt"  style="width:120px;" datatype="*"
									ignore="checked"
					  		>
					  <label class="Validform_label" style="display: none;">名称</label>
				  </td>
				  <td align="left">
					  	<input name="tLoanDictDtlList[#index#].status" maxlength="1" 
					  		type="text" class="inputxt"  style="width:120px;" datatype="*"
									ignore="checked"
					  		>
					  <label class="Validform_label" style="display: none;">状态</label>
				  </td>
				  <td align="left">
					  	<input name="tLoanDictDtlList[#index#].remark" maxlength="200" 
					  		type="text" class="inputxt"  style="width:120px;" 
									ignore="ignore"
					  		>
					  <label class="Validform_label" style="display: none;">备注</label>
				  </td>
			</tr>
		 </tbody>
		</table>
 </body>
 <script src = "webpage/com/yisi/business/ctdict/loanDict.js"></script>
	