<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="userStaticList" checkbox="true" pagination="true" fitColumns="false" title="用户静态分红" actionUrl="userStaticController.do?datagrid" idField="id" fit="true" queryMode="group">
    <t:dgCol title="id"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="用户"  field="ctUser.userName"  query="true" queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="会员级别"  field="ctUser.userLevel"  query="true" queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="每日返利"  field="money"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="返利总额"  field="totalmoney"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="已返"  field="yfBonus"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="状态"  field="status"  dictionary="sStatus"  queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="类型"  field="type"    dictionary="sType" queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="statictime"  field="statictime"    queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="userStaticController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="userStaticController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="userStaticController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="userStaticController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="userStaticController.do?goUpdate" funname="detail"></t:dgToolBar>
   <%-- <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar> --%>
   <%-- <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar> --%>
   <%-- <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar> --%>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/yisi/business/ctaccount/userStaticList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'userStaticController.do?upload', "userStaticList");
}

//导出
function ExportXls() {
	JeecgExcelExport("userStaticController.do?exportXls","userStaticList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("userStaticController.do?exportXlsByT","userStaticList");
}

 </script>