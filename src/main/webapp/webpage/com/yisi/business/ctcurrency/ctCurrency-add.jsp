<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>币种表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="ctCurrencyController.do?doAdd" >
		<input id="id" name="id" type="hidden" value="${ctCurrencyPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								货币名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="currencyName" name="currencyName" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctCurrencyPage.currencyName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">货币名称</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								币总数量:
							</label>
						</td>
						<td class="value">
						     	 <input id="currencyAllNum" name="currencyAllNum" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctCurrencyPage.currencyAllNum}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">币总数量</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								开盘价:
							</label>
						</td>
						<td class="value">
						     	 <input id="priceOpen" name="priceOpen" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctCurrencyPage.priceOpen}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">开盘价</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								跌停:
							</label>
						</td>
						<td class="value">
						     	 <input id="priceDown" name="priceDown" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctCurrencyPage.priceDown}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">跌停</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								提币手续费:
							</label>
						</td>
						<td class="value">
						     	 <input id="withFee" name="withFee" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctCurrencyPage.withFee}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">提币手续费</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								涨停:
							</label>
						</td>
						<td class="value">
						     	 <input id="priceUp" name="priceUp" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctCurrencyPage.priceUp}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">涨停</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								充币提币状态:
							</label>
						</td>
						<td class="value">
						     	 
						     	 	 <t:dictSelect field="isCtstatus" hasLabel="false" 
						     	   typeGroupCode="ctstatus" defaultVal='${userStaticPage.isCtstatus}'></t:dictSelect>
						     	 
						     	 
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">充币提币状态</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								是否交易:
							</label>
						</td>
						<td class="value">
						     	 	 <t:dictSelect field="isLock" hasLabel="false" 
						     	   typeGroupCode="islock" defaultVal='${userStaticPage.isLock}'></t:dictSelect>
						     	 
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">是否交易</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								英文标识:
							</label>
						</td>
						<td class="value">
						     	 <input id="currencyMark" name="currencyMark" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctCurrencyPage.currencyMark}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">英文标识</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								币种说明:
							</label>
						</td>
						<td class="value">
<!-- 						  	 	<textarea id="currencyContent" style="width:600px;" class="inputxt" rows="6" name="currencyContent"  -->
<!-- 						  	 	ignore="checked" -->
<%-- 						  	 	>${ctCurrencyPage.currencyContent}</textarea> --%>
						  	 		 <input id="currencyContent" name="currencyContent" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctCurrencyPage.currencyContent}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">币种说明</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								总市值:
							</label>
						</td>
						<td class="value">
						     	 <input id="currencyAllMoney" name="currencyAllMoney" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctCurrencyPage.currencyAllMoney}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">总市值</label>
						</td>
						
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								买入手续费:
							</label>
						</td>
						<td class="value">
						     	 <input id="currencyBuyFee" name="currencyBuyFee" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctCurrencyPage.currencyBuyFee}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">买入手续费</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								卖出手续费:
							</label>
						</td>
						<td class="value">
						     	 <input id="currencySellFee" name="currencySellFee" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctCurrencyPage.currencySellFee}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">卖出手续费</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								卖出比例:
							</label>
						</td>
						<td class="value">
						     	 <input id="sellPre" name="sellPre" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${ctCurrencyPage.sellPre}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">卖出比例</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								发行价格:
							</label>
						</td>
						<td class="value">
						     	 <input id="priceFx" name="priceFx" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctCurrencyPage.priceFx}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">发行价格</label>
						</td>
						
					</tr>
					
					
					<tr>
						<td align="right">
							<label class="Validform_label">
								最大提币额:
							</label>
						</td>
						<td class="value">
						     	 <input id="currencyAllTibi" name="currencyAllTibi" type="text" style="width: 150px" class="inputxt" datatype="*" 
						     	 ignore="checked" 
						     	 value='${ctCurrencyPage.currencyAllTibi}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">最大提币额</label>
						</td>
						
					</tr>
					
					
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/yisi/business/ctcurrency/ctCurrency.js"></script>		
