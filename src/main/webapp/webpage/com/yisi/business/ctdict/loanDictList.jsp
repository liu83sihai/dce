<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="loanDictList" checkbox="true" fitColumns="false" title="数据词典" actionUrl="loanDictController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键ID"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="编码"  field="code"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="名称"  field="name"    queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="状态"  field="status"    queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="remark"    queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="创建用户ID"  field="createuserid"    queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="修改用户ID"  field="updateuserid"    queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="创建时间"  field="createtime" formatter="yyyy-MM-dd"   queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="修改时间"  field="updatetime" formatter="yyyy-MM-dd"   queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="loanDictController.do?doDel&id={id}"  urlclass="ace_button" urlfont="fa-trash-o"/>
<%--    <t:dgToolBar title="录入" icon="icon-add" url="loanDictController.do?goAdd" funname="add" width="100%" height="100%"></t:dgToolBar> --%>
   <t:dgToolBar title="编辑" icon="icon-edit" url="loanDictController.do?goUpdate" funname="update" width="600" height="400"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="loanDictController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="loanDictController.do?goUpdate" funname="detail" width="600" height="400"></t:dgToolBar>
<%--    <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar> --%>
<%--    <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar> --%>
<%--    <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar> --%>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/yisi/business/ctdict/loanDictList.js"></script>		
 <script type="text/javascript">
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'loanDictController.do?upload', "loanDictList");
}

//导出
function ExportXls() {
	JeecgExcelExport("loanDictController.do?exportXls","loanDictList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("loanDictController.do?exportXlsByT","loanDictList");
}
 </script>