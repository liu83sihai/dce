<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="ctCurrencyList" checkbox="true" pagination="true" fitColumns="false" title="币种表" actionUrl="ctCurrencyController.do?datagrid" idField="id" fit="true" queryMode="group">
    <t:dgCol title="id"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="货币名称"  field="currencyName"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="币总数量"  field="currencyAllNum"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="开盘价"  field="priceOpen"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="涨停"  field="priceUp"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="跌停"  field="priceDown"    queryMode="group"  width="120"></t:dgCol>
     <t:dgCol title="提币手续费"  field="withFee"    queryMode="group"  width="120"></t:dgCol>
      <t:dgCol title="充币提币状态"  field="isCtstatus"  dictionary="ctstatus"  queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="是否交易"  field="isLock"   dictionary="islock"  width="120"></t:dgCol>
    
<%--     <t:dgCol title="货币logo"  field="currencyLogo"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="英文标识"  field="currencyMark"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="币种说明"  field="currencyContent"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="总市值"  field="currencyAllMoney"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="买入手续费"  field="currencyBuyFee"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="卖出手续费"  field="currencySellFee"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="卖出比例"  field="sellPre"    queryMode="group"  width="120"></t:dgCol> --%>
<%--    <t:dgCol title="链接地址"  field="currencyUrl"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="交易币种"  field="tradeCurrencyId"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="isLine"  field="isLine"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="portNumber"  field="portNumber"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="addTime"  field="addTime"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="status"  field="status"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="rpc路径"  field="rpcUrl"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="rpc密码"  field="rpcPwd"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="rpc账号"  field="rpcUser"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="最大提币额"  field="currencyAllTibi"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="跳转链接"  field="detailUrl"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="储存路径"  field="qianbaoUrl"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="钱包密钥"  field="qianbaoKey"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="发行价格"  field="priceFx"    queryMode="group"  width="120"></t:dgCol> --%>
<%--  <t:dgCol title="priceZnew"  field="priceZnew"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="sort"  field="sort"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="限制位数"  field="currencyDigitNum"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="guanwangUrl"  field="guanwangUrl"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="utime"  field="utime"    queryMode="group"  width="120"></t:dgCol> --%>
<%--   <t:dgCol title="卖出挂单量"  field="guadanum"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="买进量"  field="buynum"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="买入挂单量"  field="guabuynum"    queryMode="group"  width="120"></t:dgCol> --%>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="ctCurrencyController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="ctCurrencyController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="ctCurrencyController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="ctCurrencyController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="ctCurrencyController.do?goUpdate" funname="detail"></t:dgToolBar>
   <%-- <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar> --%>
   <%-- <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar> --%>
   <%-- <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar> --%>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/yisi/business/ctcurrency/ctCurrencyList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'ctCurrencyController.do?upload', "ctCurrencyList");
}

//导出
function ExportXls() {
	JeecgExcelExport("ctCurrencyController.do?exportXls","ctCurrencyList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("ctCurrencyController.do?exportXlsByT","ctCurrencyList");
}

 </script>