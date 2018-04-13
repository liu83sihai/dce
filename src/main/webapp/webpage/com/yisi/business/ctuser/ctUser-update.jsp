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
<%-- 					<input id="userPassword" name="userPassword" type="hidden" value="${ctUserPage.userPassword }"> --%>
<%-- 					<input id="twoPassword" name="twoPassword" type="hidden" value="${ctUserPage.twoPassword }"> --%>
					<input id="refereeid" name="refereeid" type="hidden" value="${ctUserPage.refereeid }">
					<input id="parentid" name="parentid" type="hidden" value="${ctUserPage.parentid }">
					<input id="loginTimes" name="loginTimes" type="hidden" value="${ctUserPage.loginTimes }">
					<input id="lastLoginTime" name="lastLoginTime" type="hidden" value="${ctUserPage.lastLoginTime }">
					<input id="lastLoginIp" name="lastLoginIp" type="hidden" value="${ctUserPage.lastLoginIp }">
					<input id="regIp" name="regIp" type="hidden" value="${ctUserPage.regIp }">
					<input id="regTime" name="regTime" type="hidden" value="${ctUserPage.regTime }">
					<input id="status" name="status" type="hidden" value="${ctUserPage.status }">
					<input id="openid" name="openid" type="hidden" value="${ctUserPage.openid }">
					<input id="register" name="register" type="hidden" value="${ctUserPage.register }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								用户名:
							</label>
						</td>
						<td class="value">
						     	 <input id="userName" name="userName" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.userName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用户名</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								姓名:
							</label>
						</td>
						<td class="value">
						     	 <input id="trueName" name="trueName" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.trueName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">姓名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								用户邮箱:
							</label>
						</td>
						<td class="value">
						     	 <input id="email" name="email" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.email}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用户邮箱</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								手机号:
							</label>
						</td>
						<td class="value">
						     	 <input id="mobile" name="mobile" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.mobile}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">手机号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								用户头像:
							</label>
						</td>
						<td class="value">
						     	 <input id="userFace" name="userFace" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.userFace}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用户头像</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								原始仓:
							</label>
						</td>
						<td class="value">
						     	 <input id="balanceIntegral" name="balanceIntegral" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.balanceIntegral}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">原始仓</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								用户性别:
							</label>
						</td>
						<td class="value">
						     	 <input id="sex" name="sex" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.sex}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用户性别</label>
						</td>
					
						<td align="right">
							<label class="Validform_label">
								现持仓:
							</label>
						</td>
						<td class="value">
						     	 <input id="balanceBonus" name="balanceBonus" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.balanceBonus}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">现持仓</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								复消:
							</label>
						</td>
						<td class="value">
						     	 <input id="balanceRepeat" name="balanceRepeat" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.balanceRepeat}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">复消</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								积分:
							</label>
						</td>
						<td class="value">
						     	 <input id="balanceCash" name="balanceCash" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.balanceCash}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">积分</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								用户密码:
							</label>
						</td>
						<td class="value">
						     	 <input id="userPassword" name="userPassword" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.userPassword}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用户密码</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								支付密码:
							</label>
						</td>
						<td class="value">
						     	 <input id="twoPassword" name="twoPassword" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.twoPassword}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">支付密码</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								锁仓:
							</label>
						</td>
						<td class="value">
						     	 <input id="balanceDongjie" name="balanceDongjie" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.balanceDongjie}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">锁仓</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								余额账户:
							</label>
						</td>
						<td class="value">
						     	 <input id="balanceShopping" name="balanceShopping" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.balanceShopping}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">余额账户</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								冻结余额:
							</label>
						</td>
						<td class="value">
						     	 <input id="forzenShopping" name="forzenShopping" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.forzenShopping}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">冻结余额</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								奖金累计:
							</label>
						</td>
						<td class="value">
						     	 <input id="totalBonus" name="totalBonus" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.totalBonus}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">奖金累计</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								复消累计:
							</label>
						</td>
						<td class="value">
						     	 <input id="totalRepeat" name="totalRepeat" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.totalRepeat}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">复消累计</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								现金累计:
							</label>
						</td>
						<td class="value">
						     	 <input id="totalCash" name="totalCash" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.totalCash}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">现金累计</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								积分累计:
							</label>
						</td>
						<td class="value">
						     	 <input id="totalIntegral" name="totalIntegral" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.totalIntegral}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">积分累计</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								购物累计:
							</label>
						</td>
						<td class="value">
						     	 <input id="totalShopping" name="totalShopping" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.totalShopping}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">购物累计</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								推荐人数:
							</label>
						</td>
						<td class="value">
						     	 <input id="refereeNumber" name="refereeNumber" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.refereeNumber}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">推荐人数</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								是否推荐够:
							</label>
						</td>
						<td class="value">
						     	 <input id="refereeStatus" name="refereeStatus" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.refereeStatus}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">是否推荐够</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								下级人数:
							</label>
						</td>
						<td class="value">
						     	 <input id="sonNumber" name="sonNumber" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.sonNumber}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">下级人数</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								是否服务中心:
							</label>
						</td>
						<td class="value">
						     	 <input id="isServerCenter" name="isServerCenter" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.isServerCenter}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">是否服务中心</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								我的服务人:
							</label>
						</td>
						<td class="value">
						     	 <input id="myServerCenter" name="myServerCenter" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.myServerCenter}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">我的服务人</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								用户积分:
							</label>
						</td>
						<td class="value">
						     	 <input id="userscore" name="userscore" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.userscore}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用户积分</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								用户类型 :
							</label>
						</td>
						<td class="value">
						     	 <input id="userType" name="userType" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.userType}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用户类型 </label>
						</td>
						<td align="right">
							<label class="Validform_label">
								会员组:
							</label>
						</td>
						<td class="value">
						     	 <input id="userGroup" name="userGroup" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.userGroup}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">会员组</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								会员级别:
							</label>
						</td>
						<td class="value">
						     	 <input id="userLevel" name="userLevel" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.userLevel}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">会员级别</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								会员职务:
							</label>
						</td>
						<td class="value">
						     	 <input id="userPost" name="userPost" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.userPost}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">会员职务</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								注册金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="regMoney" name="regMoney" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.regMoney}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">注册金额</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								已发分红:
							</label>
						</td>
						<td class="value">
						     	 <input id="yfMoney" name="yfMoney" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.yfMoney}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">已发分红</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								封顶:
							</label>
						</td>
						<td class="value">
						     	 <input id="fdMoney" name="fdMoney" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.fdMoney}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">封顶</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								总业绩:
							</label>
						</td>
						<td class="value">
						     	 <input id="totalPerformance" name="totalPerformance" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.totalPerformance}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">总业绩</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								已量碰业绩:
							</label>
						</td>
						<td class="value">
						     	 <input id="touchedPerformance" name="touchedPerformance" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.touchedPerformance}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">已量碰业绩</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								激活时间 :
							</label>
						</td>
						<td class="value">
						     	 <input id="activationTime" name="activationTime" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.activationTime}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">激活时间 </label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								用户QQ:
							</label>
						</td>
						<td class="value">
						     	 <input id="userQq" name="userQq" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.userQq}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用户QQ</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								用户微信号:
							</label>
						</td>
						<td class="value">
						     	 <input id="userWechat" name="userWechat" type="text" style="width: 150px" class="inputxt" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.userWechat}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用户微信号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								明文密码:
							</label>
						</td>
						<td class="value">
						     	 <input id="expressPassword" name="expressPassword" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.expressPassword}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">明文密码</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								累计分红:
							</label>
						</td>
						<td class="value">
						     	 <input id="totalDividends" name="totalDividends" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.totalDividends}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">累计分红</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								分红累计天数:
							</label>
						</td>
						<td class="value">
						     	 <input id="dividendsDays" name="dividendsDays" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.dividendsDays}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">分红累计天数</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								会员国家:
							</label>
						</td>
						<td class="value">
						     	 <input id="country" name="country" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.country}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">会员国家</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								会员省份:
							</label>
						</td>
						<td class="value">
						     	 <input id="province" name="province" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.province}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">会员省份</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								会员城市:
							</label>
						</td>
						<td class="value">
						     	 <input id="city" name="city" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.city}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">会员城市</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								会员区县:
							</label>
						</td>
						<td class="value">
						     	 <input id="darea" name="darea" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.darea}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">会员区县</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								ET币:
							</label>
						</td>
						<td class="value">
						     	 <input id="balanceEt" name="balanceEt" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.balanceEt}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">ET币</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								身份证号:
							</label>
						</td>
						<td class="value">
						     	 <input id="idnumber" name="idnumber" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.idnumber}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">身份证号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								银行类型:
							</label>
						</td>
						<td class="value">
						     	 <input id="banktype" name="banktype" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.banktype}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">银行类型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								开户人:
							</label>
						</td>
						<td class="value">
						     	 <input id="bankUserName" name="bankUserName" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.bankUserName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">开户人</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								卡号:
							</label>
						</td>
						<td class="value">
						     	 <input id="banknumber" name="banknumber" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.banknumber}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">卡号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								支行:
							</label>
						</td>
						<td class="value">
						     	 <input id="bankContent" name="bankContent" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.bankContent}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">支行</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								密保问题a:
							</label>
						</td>
						<td class="value">
						     	 <input id="question1" name="question1" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.question1}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">密保问题a</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								密保问题b:
							</label>
						</td>
						<td class="value">
						     	 <input id="question2" name="question2" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.question2}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">密保问题b</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								密保问题c:
							</label>
						</td>
						<td class="value">
						     	 <input id="question3" name="question3" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.question3}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">密保问题c</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								密保答案a:
							</label>
						</td>
						<td class="value">
						     	 <input id="answer1" name="answer1" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.answer1}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">密保答案a</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								密保答案b:
							</label>
						</td>
						<td class="value">
						     	 <input id="answer2" name="answer2" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.answer2}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">密保答案b</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								密保答案c:
							</label>
						</td>
						<td class="value">
						     	 <input id="answer3" name="answer3" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.answer3}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">密保答案c</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								组id:
							</label>
						</td>
						<td class="value">
						     	 <input id="groupid" name="groupid" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.groupid}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">组id</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								ticket:
							</label>
						</td>
						<td class="value">
						     	 <input id="ticket" name="ticket" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.ticket}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">ticket</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								购物币:
							</label>
						</td>
						<td class="value">
						     	 <input id="balanceGouwu" name="balanceGouwu" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.balanceGouwu}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">购物币</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								qrcodeStatus:
							</label>
						</td>
						<td class="value">
						     	 <input id="qrcodeStatus" name="qrcodeStatus" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.qrcodeStatus}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">qrcodeStatus</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								分红时间:
							</label>
						</td>
						<td class="value">
						     	 <input id="bonusTime" name="bonusTime" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.bonusTime}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">分红时间</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								是否空单激活:
							</label>
						</td>
						<td class="value">
						     	 <input id="isEmpty" name="isEmpty" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.isEmpty}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">是否空单激活</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								爱心基金:
							</label>
						</td>
						<td class="value">
						     	 <input id="balanceHeart" name="balanceHeart" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.balanceHeart}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">爱心基金</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								已层碰的层数:
							</label>
						</td>
						<td class="value" colspan="3">
						  	 	<textarea id="touchDistance" style="width:450px;" class="inputxt" rows="6" name="touchDistance" 
						  	 	ignore="ignore"
						  	 	>${ctUserPage.touchDistance}</textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">已层碰的层数</label>
						</td>
<!-- 						<td align="right"> -->
<!-- 							<label class="Validform_label"> -->
<!-- 								星级别: -->
<!-- 							</label> -->
<!-- 						</td> -->
<!-- 						<td class="value"> -->
<!-- 						     	 <input id="kuoLevel" name="kuoLevel" type="text" style="width: 150px" class="inputxt"   -->
<!-- 						     	 ignore="ignore"  -->
<%-- 						     	 value='${ctUserPage.kuoLevel}'> --%>
<!-- 							<span class="Validform_checktip"></span> -->
<!-- 							<label class="Validform_label" style="display: none;">星级别</label> -->
<!-- 						</td> -->
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								是否是回填单:
							</label>
						</td>
						<td class="value">
						     	 <input id="backfillStatus" name="backfillStatus" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.backfillStatus}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">是否是回填单</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								剩余回填金额:
							</label>
						</td>
						<td class="value">
						     	 <input id="backfillMoney" name="backfillMoney" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.backfillMoney}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">剩余回填金额</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								回填剩余:
							</label>
						</td>
						<td class="value">
						     	 <input id="backfillSheng" name="backfillSheng" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.backfillSheng}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">回填剩余</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								一周可挂单次数:
							</label>
						</td>
						<td class="value">
						     	 <input id="guadanNum" name="guadanNum" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctUserPage.guadanNum}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">一周可挂单次数</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								每日静态:
							</label>
						</td>
						<td class="value">
						     	 <input id="allstatic" name="allstatic" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.allstatic}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">每日静态</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								dis:
							</label>
						</td>
						<td class="value">
						     	 <input id="dis" name="dis" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.dis}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">dis</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								释放时间:
							</label>
						</td>
						<td class="value">
						     	 <input id="releaseTime" name="releaseTime" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.releaseTime}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">释放时间</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								是否商家:
							</label>
						</td>
						<td class="value">
						     	 <input id="isshop" name="isshop" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.isshop}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">是否商家</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								isimport:
							</label>
						</td>
						<td class="value">
						     	 <input id="isimport" name="isimport" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.isimport}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">isimport</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								点位:
							</label>
						</td>
						<td class="value">
						     	 <input id="pos" name="pos" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.pos}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">点位</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								isout:
							</label>
						</td>
						<td class="value">
						     	 <input id="isout" name="isout" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctUserPage.isout}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">isout</label>
						</td>
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/yisi/business/ctuser/ctUser.js"></script>		
