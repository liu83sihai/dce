<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="ctUserList" checkbox="true" pagination="true" fitColumns="false" title="用户信息表" actionUrl="ctUserController.do?datagrid" idField="id" fit="true" queryMode="group">
    <t:dgCol title="用户ID"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="用户名"  field="userName"    query="true"   queryMode="single"  width="100"></t:dgCol>
    <t:dgCol title="姓名"  field="trueName"   query="true"   queryMode="single" width="120"></t:dgCol>
    <t:dgCol title="现持仓"  field="balanceBonus"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="美元点"  field="balanceShopping"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="原始仓"  field="balanceIntegral"    queryMode="group"  width="120"></t:dgCol>
	<t:dgCol title="锁仓"  field="balanceDongjie"    queryMode="group"  width="120"></t:dgCol>
 	 <t:dgCol title="会员级别"  field="userLevel"    queryMode="group"  width="120"></t:dgCol>
      <t:dgCol title="推荐人id"  field="refereeid"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="接点人ID"  field="parentid"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
    
    <t:dgCol title="状态"  field="status"  dictionary="status" query="true"     queryMode="single"  width="80"></t:dgCol>
<%--     <t:dgCol title="用户邮箱"  field="email"    queryMode="group"  width="120"></t:dgCol> --%>
    <t:dgCol title="手机号"  field="mobile"   query="true"   queryMode="single"  width="120"></t:dgCol>
<%--     <t:dgCol title="用户密码"  field="userPassword"  hidden="true"  queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="二级密码"  field="twoPassword"  hidden="true"  queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="用户头像"  field="userFace"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="用户性别"  field="sex"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="登录次数"  field="loginTimes"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="最近登陆时间"  field="lastLoginTime"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="最近登陆IP"  field="lastLoginIp"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="regIp"  field="regIp"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="注册时间"  field="regTime"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="状态"  field="status"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="复消"  field="balanceRepeat"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="积分"  field="balanceCash"    queryMode="group"  width="120"></t:dgCol> --%>
<%--   <t:dgCol title="冻结余额"  field="forzenShopping"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="奖金累计"  field="totalBonus"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="复消累计"  field="totalRepeat"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="现金累计"  field="totalCash"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="积分累计"  field="totalIntegral"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="购物累计"  field="totalShopping"    queryMode="group"  width="120"></t:dgCol> --%>
<%--   <t:dgCol title="推荐人数"  field="refereeNumber"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="是否推荐够"  field="refereeStatus"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="下级人数"  field="sonNumber"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="是否服务中心"  field="isServerCenter"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="我的服务人"  field="myServerCenter"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="用户积分"  field="userscore"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="用户类型 "  field="userType"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="会员组"  field="userGroup"    queryMode="group"  width="120"></t:dgCol> --%>
<%--    <t:dgCol title="会员职务"  field="userPost"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="注册金额"  field="regMoney"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="已发分红"  field="yfMoney"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="封顶"  field="fdMoney"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="总业绩"  field="totalPerformance"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="已量碰业绩"  field="touchedPerformance"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="激活时间 "  field="activationTime"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="用户QQ"  field="userQq"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="用户微信号"  field="userWechat"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="用户OPENID"  field="openid"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="注册人"  field="register"    queryMode="group"  width="120"></t:dgCol> --%>
    <t:dgCol title="明文密码"  field="expressPassword"    queryMode="group"  width="120"></t:dgCol>
<%--     <t:dgCol title="累计分红"  field="totalDividends"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="分红累计天数"  field="dividendsDays"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="会员国家"  field="country"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="会员省份"  field="province"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="会员城市"  field="city"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="会员区县"  field="darea"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="ET币"  field="balanceEt"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="身份证号"  field="idnumber"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="银行类型"  field="banktype"    queryMode="group"  width="120"></t:dgCol> --%>
    <t:dgCol title="开户人"  field="bankUserName"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="卡号"  field="banknumber"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="支行"  field="bankContent"    queryMode="group"  width="120"></t:dgCol>
<%--     <t:dgCol title="密保问题a"  field="question1"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="密保问题b"  field="question2"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="密保问题c"  field="question3"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="密保答案a"  field="answer1"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="密保答案b"  field="answer2"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="密保答案c"  field="answer3"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="组id"  field="groupid"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="ticket"  field="ticket"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="购物币"  field="balanceGouwu"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="qrcodeStatus"  field="qrcodeStatus"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="分红时间"  field="bonusTime"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="是否空单激活"  field="isEmpty"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="爱心基金"  field="balanceHeart"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="已层碰的层数"  field="touchDistance"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="星级别"  field="kuoLevel"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="是否是回填单"  field="backfillStatus"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="剩余回填金额"  field="backfillMoney"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="回填剩余"  field="backfillSheng"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="一周可挂单次数"  field="guadanNum"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="每日静态"  field="allstatic"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="dis"  field="dis"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="释放时间"  field="releaseTime"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="是否商家"  field="isshop"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="isimport"  field="isimport"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="点位"  field="pos"    queryMode="group"  width="120"></t:dgCol> --%>
<%--     <t:dgCol title="isout"  field="isout"    queryMode="group"  width="120"></t:dgCol> --%>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
<%--    <t:dgDelOpt title="删除" url="ctUserController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/> --%>
   <t:dgToolBar title="录入" icon="icon-add" url="ctUserController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="ctUserController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="禁用" icon="icon-edit" url="ctUserController.do?doUpdate&status=1" funname="updateStatus"></t:dgToolBar>
   <t:dgToolBar title="恢复正常" icon="icon-edit" url="ctUserController.do?doUpdate&status=0" funname="updateStatus"></t:dgToolBar>
  	<t:dgToolBar title="组织结构" icon="icon-edit" url="ctUserController.do?userOrgin" funname="openUserTree" width="850" height="450"></t:dgToolBar>
   <t:dgToolBar title="推荐结构" icon="icon-edit" url="ctUserController.do?userRef" funname="openUserTree" width="680" height="400"></t:dgToolBar>
<%--    <t:dgToolBar title="批量删除"  icon="icon-remove" url="ctUserController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar> --%>
   <t:dgToolBar title="查看" icon="icon-search" url="ctUserController.do?goUpdate" funname="detail"></t:dgToolBar>
   <%-- <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar> --%>
   <%-- <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar> --%>
   <%-- <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar> --%>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/yisi/business/ctuser/ctUserList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 

 /**
  * 更新事件打开窗口
  * @param title 编辑框标题
  * @param addurl//目标页面地址
  * @param id//主键字段
  */

 function openUserTree(title,url, id,width,height,isRestful) {
 	gridname=id;
 	var rowsData = $('#'+id).datagrid('getSelections');
 	if (!rowsData || rowsData.length==0) {
 		tip('请选择查看的用户');
 		return;
 	}
 	if (rowsData.length>1) {
 		tip('请选择一条记录再编辑');
 		return;
 	}
 	if(isRestful!='undefined'&&isRestful){
 		url += '/'+rowsData[0].id;
 	}else{
 		url += '&id='+rowsData[0].id;
 	}
 	//alert(title + url + width+ height)
 	openwindow(title,url,'用户组织结构',width,height);
 }
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'ctUserController.do?upload', "ctUserList");
}

//导出
function ExportXls() {
	JeecgExcelExport("ctUserController.do?exportXls","ctUserList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("ctUserController.do?exportXlsByT","ctUserList");
}

 </script>