<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>用户账户类型</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="ctUserAccountController.do?doAdd" >
		<input id="id" name="id" type="hidden" value="${ctUserAccountPage.id }"/>
		<input id="userid" name="userid" type="hidden" value="${ctUserAccountPage.userid }"/>
		<input id="updatetime" name="updatetime" type="hidden" value="${ctUserAccountPage.updatetime }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							账户类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="accounttype" name="accounttype" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">账户类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							现持仓:
						</label>
					</td>
					<td class="value">
					     	 <input id="amount" name="amount" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">现持仓</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							原始仓:
						</label>
					</td>
					<td class="value">
					     	 <input id="originalamount" name="originalamount" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">原始仓</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							美元点:
						</label>
					</td>
					<td class="value">
					     	 <input id="pointamount" name="pointamount" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">美元点</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							积分:
						</label>
					</td>
					<td class="value">
					     	 <input id="scoreamount" name="scoreamount" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">积分</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							锁仓:
						</label>
					</td>
					<td class="value">
					     	 <input id="frozendeposit" name="frozendeposit" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">锁仓</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							累计支出金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="totalconsumeamount" name="totalconsumeamount" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">累计支出金额</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							累计收入金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="totalinocmeamount" name="totalinocmeamount" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">累计收入金额</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							当天收益金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="incomeamount" name="incomeamount" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">当天收益金额</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							当天支出金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="consumeamount" name="consumeamount" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">当天支出金额</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							累计提现金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="withdrawtotaldeposit" name="withdrawtotaldeposit" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">累计提现金额</label>
						</td>
				</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/yisi/business/ctaccount/ctUserAccount.js"></script>		
