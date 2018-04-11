<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addTLoanDictDtlBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delTLoanDictDtlBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addTLoanDictDtlBtn').bind('click', function(){   
 		 var tr =  $("#add_tLoanDictDtl_table_template tr").clone();
	 	 $("#add_tLoanDictDtl_table").append(tr);
	 	 resetTrNum('add_tLoanDictDtl_table');
	 	 return false;
    });  
	$('#delTLoanDictDtlBtn').bind('click', function(){   
      	$("#add_tLoanDictDtl_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_tLoanDictDtl_table'); 
        return false;
    }); 
    $(document).ready(function(){
    	$(".datagrid-toolbar").parent().css("width","auto");
    	if(location.href.indexOf("load=detail")!=-1){
			$(":input").attr("disabled","true");
			$(".datagrid-toolbar").hide();
		}
		//将表格的表头固定
	    $("#tLoanDictDtl_table").createhftable({
	    	height:'300px',
			width:'auto',
			fixFooter:false
			});
    });
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addTLoanDictDtlBtn" href="#">添加</a> <a id="delTLoanDictDtlBtn" href="#">删除</a> 
</div>
<table border="0" cellpadding="2" cellspacing="0" id="tLoanDictDtl_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">序号</td>
		<td align="center" bgcolor="#EEEEEE" style="width: 25px;">操作</td>
				 
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						编码
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						名称
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						状态
				  </td>
				  <td align="left" bgcolor="#EEEEEE" style="width: 126px;">
						备注
				  </td>
	</tr>
	<tbody id="add_tLoanDictDtl_table">
	<c:if test="${fn:length(tLoanDictDtlList)  > 0 }">
		<c:forEach items="${tLoanDictDtlList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
					<input name="tLoanDictDtlList[${stuts.index }].id" type="hidden" value="${poVal.id }"/>
					<input name="tLoanDictDtlList[${stuts.index }].dictid" type="hidden" value="${poVal.dictid }"/>
				 
				   <td align="left">
					  	<input name="tLoanDictDtlList[${stuts.index }].code" maxlength="50" 
					  		type="text" class="inputxt"  style="width:120px;" datatype="*" value="${poVal.code }">
					  <label class="Validform_label" style="display: none;">编码</label>
				   </td>
				   <td align="left">
					  	<input name="tLoanDictDtlList[${stuts.index }].name" maxlength="30" 
					  		type="text" class="inputxt"  style="width:120px;" datatype="*" value="${poVal.name }">
					  <label class="Validform_label" style="display: none;">名称</label>
				   </td>
				   <td align="left">
					  	<input name="tLoanDictDtlList[${stuts.index }].status" maxlength="1" 
					  		type="text" class="inputxt"  style="width:120px;" datatype="*" value="${poVal.status }">
					  <label class="Validform_label" style="display: none;">状态</label>
				   </td>
				   <td align="left">
					  	<input name="tLoanDictDtlList[${stuts.index }].remark" maxlength="200" 
					  		type="text" class="inputxt"  style="width:120px;"  value="${poVal.remark }">
					  <label class="Validform_label" style="display: none;">备注</label>
				   </td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
