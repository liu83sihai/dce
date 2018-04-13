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
					     	 <input id="currencyName" name="currencyName" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">货币名称</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							货币logo:
						</label>
					</td>
					<td class="value">
					     	 <input id="currencyLogo" name="currencyLogo" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">货币logo</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							英文标识:
						</label>
					</td>
					<td class="value">
					     	 <input id="currencyMark" name="currencyMark" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">英文标识</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							币种说明:
						</label>
					</td>
					<td class="value">
						  	 <textarea style="width:600px;" class="inputxt" rows="6" id="currencyContent" name="currencyContent" 
						  	 ignore="checked"
						  	 ></textarea>
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
					     	 <input id="currencyAllMoney" name="currencyAllMoney" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">总市值</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							币总数量:
						</label>
					</td>
					<td class="value">
					     	 <input id="currencyAllNum" name="currencyAllNum" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">币总数量</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							买入手续费:
						</label>
					</td>
					<td class="value">
					     	 <input id="currencyBuyFee" name="currencyBuyFee" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">买入手续费</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							卖出手续费:
						</label>
					</td>
					<td class="value">
					     	 <input id="currencySellFee" name="currencySellFee" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
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
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">卖出比例</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							提币手续费:
						</label>
					</td>
					<td class="value">
					     	 <input id="withFee" name="withFee" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">提币手续费</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							链接地址:
						</label>
					</td>
					<td class="value">
					     	 <input id="currencyUrl" name="currencyUrl" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">链接地址</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							交易币种:
						</label>
					</td>
					<td class="value">
					     	 <input id="tradeCurrencyId" name="tradeCurrencyId" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">交易币种</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							isLine:
						</label>
					</td>
					<td class="value">
					     	 <input id="isLine" name="isLine" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">isLine</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							是否交易:
						</label>
					</td>
					<td class="value">
					     	 <input id="isLock" name="isLock" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">是否交易</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							portNumber:
						</label>
					</td>
					<td class="value">
					     	 <input id="portNumber" name="portNumber" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">portNumber</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							addTime:
						</label>
					</td>
					<td class="value">
					     	 <input id="addTime" name="addTime" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">addTime</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							status:
						</label>
					</td>
					<td class="value">
					     	 <input id="status" name="status" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">status</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							rpc路径:
						</label>
					</td>
					<td class="value">
					     	 <input id="rpcUrl" name="rpcUrl" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">rpc路径</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							rpc密码:
						</label>
					</td>
					<td class="value">
					     	 <input id="rpcPwd" name="rpcPwd" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">rpc密码</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							rpc账号:
						</label>
					</td>
					<td class="value">
					     	 <input id="rpcUser" name="rpcUser" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">rpc账号</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							最大提币额:
						</label>
					</td>
					<td class="value">
					     	 <input id="currencyAllTibi" name="currencyAllTibi" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">最大提币额</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							跳转链接:
						</label>
					</td>
					<td class="value">
					     	 <input id="detailUrl" name="detailUrl" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">跳转链接</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							储存路径:
						</label>
					</td>
					<td class="value">
					     	 <input id="qianbaoUrl" name="qianbaoUrl" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">储存路径</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							钱包密钥:
						</label>
					</td>
					<td class="value">
					     	 <input id="qianbaoKey" name="qianbaoKey" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">钱包密钥</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							发行价格:
						</label>
					</td>
					<td class="value">
					     	 <input id="priceFx" name="priceFx" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">发行价格</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							涨停:
						</label>
					</td>
					<td class="value">
					     	 <input id="priceUp" name="priceUp" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">涨停</label>
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
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">开盘价</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							跌停:
						</label>
					</td>
					<td class="value">
					     	 <input id="priceDown" name="priceDown" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">跌停</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							priceZnew:
						</label>
					</td>
					<td class="value">
					     	 <input id="priceZnew" name="priceZnew" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">priceZnew</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							sort:
						</label>
					</td>
					<td class="value">
					     	 <input id="sort" name="sort" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">sort</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							限制位数:
						</label>
					</td>
					<td class="value">
					     	 <input id="currencyDigitNum" name="currencyDigitNum" type="text" style="width: 150px" class="inputxt" 
					     	  datatype="*" 
					     	  ignore="checked"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">限制位数</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							guanwangUrl:
						</label>
					</td>
					<td class="value">
					     	 <input id="guanwangUrl" name="guanwangUrl" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">guanwangUrl</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							utime:
						</label>
					</td>
					<td class="value">
					     	 <input id="utime" name="utime" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">utime</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							充币提币状态:
						</label>
					</td>
					<td class="value">
					     	 <input id="isCtstatus" name="isCtstatus" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">充币提币状态</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							卖出挂单量:
						</label>
					</td>
					<td class="value">
					     	 <input id="guadanum" name="guadanum" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">卖出挂单量</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							买进量:
						</label>
					</td>
					<td class="value">
					     	 <input id="buynum" name="buynum" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">买进量</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							买入挂单量:
						</label>
					</td>
					<td class="value">
					     	 <input id="guabuynum" name="guabuynum" type="text" style="width: 150px" class="inputxt" 
					     	  
					     	  ignore="ignore"
					     	  />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">买入挂单量</label>
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
  <script src = "webpage/com/yisi/business/ctcurrency/ctCurrency.js"></script>		
