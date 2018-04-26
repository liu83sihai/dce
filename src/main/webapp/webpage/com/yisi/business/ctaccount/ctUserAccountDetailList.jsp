<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="ctUserAccountDetailList" checkbox="true" sortName="createtime" pagination="true" fitColumns="false" title="用户账户明细" actionUrl="ctUserAccountDetailController.do?datagrid" idField="id" fit="true" queryMode="group">
    <t:dgCol title="id"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
      <t:dgCol title="用户名"  field="ctUser.userName"  query="true"  queryMode="single"  width="120"></t:dgCol>
      <t:dgCol title="用户名称"  field="ctUser.trueName"   query="true"  queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="用户电话"  field="ctUser.mobile"    queryMode="group"  width="120"></t:dgCol>
   
    <t:dgCol title="金额"  field="amount"    queryMode="group"  width="80"></t:dgCol>
    <t:dgCol title="余额"  field="blanceamount"    queryMode="group"  width="80"></t:dgCol>
<%--     <t:dgCol title="增加减少"  field="moreorless"    queryMode="group"  width="80"></t:dgCol> --%>
    <t:dgCol title="流水类型"  field="incometype"  dictionary="iType"  query="true" queryMode="single"  width="120"></t:dgCol>
    <t:dgCol title="创建时间"  field="createtime" formatter="yyyy-MM-dd" query="true"  queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="账户类型"  field="accounttype"  dictionary="aType"  queryMode="single"  query="true" width="120"></t:dgCol>
    <t:dgCol title="remark"  field="remark"    queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
<%--    <t:dgDelOpt title="删除" url="ctUserAccountDetailController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/> --%>
<%--    <t:dgToolBar title="录入" icon="icon-add" url="ctUserAccountDetailController.do?goAdd" funname="add"></t:dgToolBar> --%>
<%--    <t:dgToolBar title="编辑" icon="icon-edit" url="ctUserAccountDetailController.do?goUpdate" funname="update"></t:dgToolBar> --%>
<%--    <t:dgToolBar title="批量删除"  icon="icon-remove" url="ctUserAccountDetailController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar> --%>
   <t:dgToolBar title="查看" icon="icon-search" url="ctUserAccountDetailController.do?goUpdate" funname="detail"></t:dgToolBar>
   <%-- <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar> --%>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <%-- <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar> --%>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/yisi/business/ctaccount/ctUserAccountDetailList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'ctUserAccountDetailController.do?upload', "ctUserAccountDetailList");
}

//导出
function ExportXls() {
	JeecgExcelExport("ctUserAccountDetailController.do?exportXls","ctUserAccountDetailList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("ctUserAccountDetailController.do?exportXlsByT","ctUserAccountDetailList");
}

 </script>