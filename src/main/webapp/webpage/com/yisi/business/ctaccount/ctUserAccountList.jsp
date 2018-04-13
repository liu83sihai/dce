<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="ctUserAccountList" checkbox="true" pagination="true" fitColumns="false" title="用户账户类型" actionUrl="ctUserAccountController.do?datagrid" idField="id" fit="true" queryMode="group">
    <t:dgCol title="id"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="用户名"  field="userName"    queryMode="single" query="true" width="120"></t:dgCol>
<%--    	<t:dgCol title="用户名称"  field="ctUser.trueName"   query="true"  queryMode="single"  width="120"></t:dgCol> --%>
    <t:dgCol title="用户电话"  field="mobile"    queryMode="group"  width="120"></t:dgCol>
<%--     <t:dgCol title="账户类型"  field="accounttype"    dictionary="aType"  queryMode="single"  query="true"  width="100"></t:dgCol> --%>
    <t:dgCol title="现持仓"  field="amount"    queryMode="group"  width="100"></t:dgCol>
    <t:dgCol title="原始仓"  field="originalamount"    queryMode="group"  width="100"></t:dgCol>
    <t:dgCol title="美元点"  field="pointamount"    queryMode="group"  width="100"></t:dgCol>
    <t:dgCol title="积分"  field="scoreamount"    queryMode="group"  width="100"></t:dgCol>
    <t:dgCol title="锁仓"  field="frozendeposit"    queryMode="group"  width="100"></t:dgCol>
<%--     <t:dgCol title="累计支出金额"  field="totalconsumeamount"    queryMode="group"  width="100"></t:dgCol> --%>
<%--     <t:dgCol title="累计收入金额"  field="totalinocmeamount"    queryMode="group"  width="100"></t:dgCol> --%>
<%--     <t:dgCol title="当天收益金额"  field="incomeamount"    queryMode="group"  width="100"></t:dgCol> --%>
<%--     <t:dgCol title="当天支出金额"  field="consumeamount"    queryMode="group"  width="100"></t:dgCol> --%>
<%--     <t:dgCol title="累计提现金额"  field="withdrawtotaldeposit"    queryMode="group"  width="100"></t:dgCol> --%>
    <t:dgCol title="更新时间"  field="updatetime" formatter="yyyy-MM-dd"   queryMode="group"  width="100"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
<%--    <t:dgDelOpt title="删除" url="ctUserAccountController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/> --%>
   <t:dgToolBar title="充值" icon="icon-add" url="ctUserAccountController.do?goAdd&action=add" funname="update"></t:dgToolBar>
   <t:dgToolBar title="减值" icon="icon-edit" url="ctUserAccountController.do?goAdd&action=sub" funname="update"></t:dgToolBar>
<%--    <t:dgToolBar title="批量删除"  icon="icon-remove" url="ctUserAccountController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar> --%>
   <t:dgToolBar title="查看" icon="icon-search" url="ctUserAccountController.do?goUpdate" funname="detail"></t:dgToolBar>
   <%-- <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar> --%>
   <%-- <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar> --%>
   <%-- <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar> --%>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/yisi/business/ctaccount/ctUserAccountList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 /**
  * 更新事件打开窗口
  * @param title 编辑框标题
  * @param addurl//目标页面地址
  * @param id//主键字段
  */

 function updateAmount(title,url, id,width,height,isRestful) {
 	gridname=id;
 	var rowsData = $('#'+id).datagrid('getSelections');
 	if (!rowsData || rowsData.length==0) {
 		tip('请选择编辑项目');
 		return;
 	}
 	if (rowsData.length>1) {
 		tip('请选择一条记录再编辑');
 		return;
 	}
 	if(isRestful!='undefined'&&isRestful){
 		url += '/'+rowsData[0].id;
 	}else{
 		url += '&userid='+rowsData[0].id;
 	}
 	alert(url);
 	createwindow(title,url,width,height);
 }
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'ctUserAccountController.do?upload', "ctUserAccountList");
}

//导出
function ExportXls() {
	JeecgExcelExport("ctUserAccountController.do?exportXls","ctUserAccountList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("ctUserAccountController.do?exportXlsByT","ctUserAccountList");
}

 </script>