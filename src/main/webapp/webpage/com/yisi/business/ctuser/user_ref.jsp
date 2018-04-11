<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>form_nature</title>
<t:base type="jquery,easyui,tools"></t:base>

<!-- ztree -->
<link rel="stylesheet" type="text/css" href="plug-in/ztree/css/zTreeStyle.css"></link>
<script type="text/javascript" src="plug-in/ztree/js/jquery.ztree.core-3.5.min.js" ></script>
<script type="text/javascript" src="plug-in/ztree/js/jquery.ztree.excheck-3.5.min.js"></script>
</head>
<body>
<t:formvalid layout="div" formid="dd" dialog="" >
 <legend>用户推荐树</legend>
 <fieldset>
 	<div class="zTreeDemoBackground left">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
 </fieldset>
 
  
</t:formvalid>


</body>
</html>
<script type="text/javascript">
var setting = {
		check: {
			enable: true
		},
		view: {
			dblClickExpand: true
		},
		data: {
			simpleData: {
				enable: true,
				rootPId: "6"
			}
		}
	};
function printobj(obj){
	var str='[';
	for(var a in obj){
		str+=a+':'+obj[a]+",";
	}
	str+=0+':0]';
	return str;
}
function getTremValueuserName() {
	return $("#userNameAuto").val();
}
$(function() {
	//ztree
	var zNodes=eval('${regions}');
	$.fn.zTree.init($("#treeDemo"), setting, zNodes);
	
	
	/*-------------------------------------------文件上传----------------------------------------------*/
	
	/*-------------------------------------------自动补全----------------------------------------------*/
	$("#userNameAuto").autocomplete("jeecgFormDemoController.do?getAutocompleteData", {
        max: 5,
        minChars: 1,
        width: 200,
        scrollHeight: 100,
        matchContains: true,
        autoFill: false,
        extraParams: {
            featureClass: "P",
            style: "full",
            maxRows: 10,
            labelField: "userName",
            valueField: "userName",
            searchField: "userName",
            entityName: "TSUser",
            trem: getTremValueuserName
        },
        parse: function(data) {
            return jeecgAutoParse.call(this, data);
        },
        formatItem: function(row, i, max) {
            return row['userName'];
        }
    }).result(function(event, row, formatted) {
        $("#userNameAuto").val(row['userName']);
    });
	/*-------------------------------------------自动补全----------------------------------------------*/
	
});


</script>
