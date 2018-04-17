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
					<input id="email" name="email" type="hidden" value="${ctUserPage.email }">
					<input id="userFace" name="userFace" type="hidden" value="${ctUserPage.userFace }">
					<input id="sex" name="sex" type="hidden" value="${ctUserPage.sex }">
					<input id="forzenShopping" name="forzenShopping" type="hidden" value="${ctUserPage.forzenShopping }">
					<input id="totalBonus" name="totalBonus" type="hidden" value="${ctUserPage.totalBonus }">
					<input id="totalRepeat" name="totalRepeat" type="hidden" value="${ctUserPage.totalRepeat }">
					<input id="totalCash" name="totalCash" type="hidden" value="${ctUserPage.totalCash }">
					<input id="totalIntegral" name="totalIntegral" type="hidden" value="${ctUserPage.totalIntegral }">
					<input id="totalShopping" name="totalShopping" type="hidden" value="${ctUserPage.totalShopping }">
					<input id="refereeNumber" name="refereeNumber" type="hidden" value="${ctUserPage.refereeNumber }">
					<input id="refereeStatus" name="refereeStatus" type="hidden" value="${ctUserPage.refereeStatus }">
					<input id="sonNumber" name="sonNumber" type="hidden" value="${ctUserPage.sonNumber }">
					<input id="isServerCenter" name="isServerCenter" type="hidden" value="${ctUserPage.isServerCenter }">
					<input id="myServerCenter" name="myServerCenter" type="hidden" value="${ctUserPage.myServerCenter }">
					<input id="userscore" name="userscore" type="hidden" value="${ctUserPage.userscore }">
					<input id="userType" name="userType" type="hidden" value="${ctUserPage.userType }">
					<input id="userGroup" name="userGroup" type="hidden" value="${ctUserPage.userGroup }">
					<input id="userPost" name="userPost" type="hidden" value="${ctUserPage.userPost }">
					<input id="regMoney" name="regMoney" type="hidden" value="${ctUserPage.regMoney }">
					<input id="yfMoney" name="yfMoney" type="hidden" value="${ctUserPage.yfMoney }">
					<input id="fdMoney" name="fdMoney" type="hidden" value="${ctUserPage.fdMoney }">
					<input id="totalPerformance" name="totalPerformance" type="hidden" value="${ctUserPage.totalPerformance }">
					<input id="touchedPerformance" name="touchedPerformance" type="hidden" value="${ctUserPage.touchedPerformance }">
					<input id="activationTime" name="activationTime" type="hidden" value="${ctUserPage.activationTime }">
					<input id="userQq" name="userQq" type="hidden" value="${ctUserPage.userQq }">
					<input id="userWechat" name="userWechat" type="hidden" value="${ctUserPage.userWechat }">
					<input id="expressPassword" name="expressPassword" type="hidden" value="${ctUserPage.expressPassword }">
					<input id="totalDividends" name="totalDividends" type="hidden" value="${ctUserPage.totalDividends }">
					<input id="dividendsDays" name="dividendsDays" type="hidden" value="${ctUserPage.dividendsDays }">
					<input id="country" name="country" type="hidden" value="${ctUserPage.country }">
					<input id="province" name="province" type="hidden" value="${ctUserPage.province }">
					<input id="city" name="city" type="hidden" value="${ctUserPage.city }">
					<input id="darea" name="darea" type="hidden" value="${ctUserPage.darea }">
					<input id="balanceEt" name="balanceEt" type="hidden" value="${ctUserPage.balanceEt }">
					<input id="question1" name="question1" type="hidden" value="${ctUserPage.question1 }">
					<input id="question2" name="question2" type="hidden" value="${ctUserPage.question2 }">
					<input id="question3" name="question3" type="hidden" value="${ctUserPage.question3 }">
					<input id="answer1" name="answer1" type="hidden" value="${ctUserPage.answer1 }">
					<input id="answer2" name="answer2" type="hidden" value="${ctUserPage.answer2 }">
					<input id="answer3" name="answer3" type="hidden" value="${ctUserPage.answer3 }">
					<input id="groupid" name="groupid" type="hidden" value="${ctUserPage.groupid }">
					<input id="isout" name="isout" type="hidden" value="${ctUserPage.isout }">
					<input id="isimport" name="isimport" type="hidden" value="${ctUserPage.isimport }">
					<input id="isshop" name="isshop" type="hidden" value="${ctUserPage.isshop }">
					<input id="releaseTime" name="releaseTime" type="hidden" value="${ctUserPage.releaseTime }">
					<input id="dis" name="dis" type="hidden" value="${ctUserPage.dis }">
					<input id="allstatic" name="allstatic" type="hidden" value="${ctUserPage.allstatic }">
					<input id="guadanNum" name="guadanNum" type="hidden" value="${ctUserPage.guadanNum }">
					<input id="backfillSheng" name="backfillSheng" type="hidden" value="${ctUserPage.backfillSheng }">
					<input id="backfillMoney" name="backfillMoney" type="hidden" value="${ctUserPage.backfillMoney }">
					<input id="backfillStatus" name="backfillStatus" type="hidden" value="${ctUserPage.backfillStatus }">
					<input id="touchDistance" name="touchDistance" type="hidden" value="${ctUserPage.touchDistance }">
					<input id="balanceHeart" name="balanceHeart" type="hidden" value="${ctUserPage.balanceHeart }">
					<input id="isEmpty" name="isEmpty" type="hidden" value="${ctUserPage.isEmpty }">
					<input id="bonusTime" name="bonusTime" type="hidden" value="${ctUserPage.bonusTime }">
					<input id="qrcodeStatus" name="qrcodeStatus" type="hidden" value="${ctUserPage.qrcodeStatus }">
					<input id="balanceGouwu" name="balanceGouwu" type="hidden" value="${ctUserPage.balanceGouwu }">
					<input id="ticket" name="ticket" type="hidden" value="${ctUserPage.ticket }">
					<input id="banktype" name="banktype" type="hidden" value="${ctUserPage.banktype }">
		
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
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								原始仓:
							</label>
						</td>
						<td class="value">
						     	 <input id="balanceIntegral" name="balanceIntegral" type="text" style="width: 150px" class="inputxt"  
						     	  readonly="true"
						     	 value='${ctUserPage.balanceIntegral}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">原始仓</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								现持仓:
							</label>
						</td>
						<td class="value">
						     	 <input id="balanceBonus" name="balanceBonus" type="text" style="width: 150px" class="inputxt"  
						     	   readonly="true"
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
						     	 ignore="ignore"   readonly="true"
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
						     	 ignore="ignore"   readonly="true"
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
						     	 ignore="ignore"   readonly="true"
						     	 value='${ctUserPage.balanceDongjie}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">锁仓</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								美元账户:
							</label>
						</td>
						<td class="value">
						     	 <input id="balanceShopping" name="balanceShopping" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore"  readonly="true"
						     	 value='${ctUserPage.balanceShopping}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">余额账户</label>
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
								点位:
							</label>
						</td>
						<td class="value">
						     	 <input id="pos" name="pos" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked"  readonly="readonly"
						     	 value='${ctUserPage.pos}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">点位</label>
						</td>
					</tr>
					
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/yisi/business/ctuser/ctUser.js"></script>		
