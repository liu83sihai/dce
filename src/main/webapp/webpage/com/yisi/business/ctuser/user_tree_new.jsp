<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>form_nature</title>
<t:base type="jquery,easyui,tools"></t:base>

<!-- ztree -->
<link rel="stylesheet" type="text/css"
	href="plug-in/orgintree/bigcolorpicker.css">
<script type="text/javascript"
	src="plug-in/orgintree/jquery.colorpicker.js"></script>
<script type="text/javascript" src="plug-in/orgintree/layer.js"></script>
<link rel="stylesheet" href="plug-in/orgintree/layer.css"
	id="layui_layer_skinlayercss">
<script type="text/javascript" src="plug-in/orgintree/layer.ext.js"></script>
<link rel="stylesheet" href="plug-in/orgintree/layer.ext.css"
	id="layui_layer_skinlayerextcss">
<script type="text/javascript" src="plug-in/orgintree/laydate.js"></script>
<link type="text/css" rel="stylesheet"
	href="plug-in/orgintree/laydate.css">
<link type="text/css" rel="stylesheet"
	href="plug-in/orgintree/laydate(1).css" id="LayDateSkin">

<link rel="stylesheet" href="plug-in/orgintree/jquery.orgchart.css">
</head>
<body>
	<%-- <t:formvalid layout="div" formid="dd" dialog="" > --%>

	<div class="container-fluid">


		<style type="text/css">
div.orgChart div.node {
	display: -webkit-inline-box !important;
	display: -moz-inline-box !important;
	display: inline-box !important;
	-webkit-box-orient: vertical !important;
	-moz-box-orient: vertical !important;
	box-orient: vertical !important;
}

.box {
	display: -webkit-box;
	display: -moz-box;
	display: box;
	-webkit-box-orient: horizontal;
	-moz-box-orient: horizontal;
	box-orient: horizontal;
	-webkit-box-align: center;
	-moz-box-align: center;
	box-align: center;
	-webkit-box-pack: center;
	-moz-box-pack: center;
	box-pack: center;
}

.box span {
	display: block;
}

.box-f1 {
	-webkit-box-flex: 1;
	-moz-box-flex: 1;
	box-flex: 1;
}

.box-bg:hover {
	background: #8CEA8C;
	color: #ffffff;
}
</style>
		
		<div class="builder builder-list-box">
			<!-- 顶部工具栏按钮 -->
			<div class="builder-container builder-list-container">
				<div id="zpmain">
					<div class="orgChart">
						<table cellpadding="0" cellspacing="0" border="0">
							<tbody>
								<tr class="nodes">
									<td class="node" colspan="4"><div
											class="node level0 node0 level0-node0 hasChildren shownChildren">
											<div class="box box-f1 box-bg" title="客户编号">
												<a
													href="http://fyt527.w1118.iyumi.pw/index.php?s=/admin/user/orgchart/id/2.html">0000</a>
											</div>
											<div class="box box-f1 box-bg" title="客户昵称">大陆</div>
											<div class="box box-f1 box-bg" title="客户等级">五级</div>
											<div class="box box-f1 box-bg" title="激活时间">2016-04-21
												16:47:58</div>
											<div class="box box-f1">
												<span class="box box-f1 box-bg" title="左区人数">5077</span><span
													class="box box-f1 box-bg" title="右区人数">8890</span>
											</div>
											<div class="box box-f1">
												<span class="box box-f1 box-bg" title="左区总业绩">36000</span> <span
													class="box box-f1 box-bg" title="右区总业绩">3597200</span>
											</div>
											<div class="box box-f1">
												<span class="box box-f1 box-bg" title="左区余业绩">0</span> <span
													class="box box-f1 box-bg" title="右区余业绩">3561200</span>
											</div>

										</div></td>
								</tr>
								<tr class="lines">
									<td colspan="4"><table cellpadding="0" cellspacing="0"
											border="0">
											<tbody>
												<tr class="lines x">
													<td class="line left"></td>
													<td class="line right"></td>
												</tr>
											</tbody>
										</table></td>
								</tr>
								<tr class="lines v">
									<td class="line left"></td>
									<td class="line right top"></td>
									<td class="line left top"></td>
									<td class="line right"></td>
								</tr>
								<tr>
									<td colspan="2"><table cellpadding="0" cellspacing="0"
											border="0">
											<tbody>
												<tr class="nodes">
													<td class="node" colspan="4"><div
															class="node level1 node0 level1-node0 hasChildren shownChildren">
															<div class="box box-f1 box-bg" title="客户编号">
																<a
																	href="http://fyt527.w1118.iyumi.pw/index.php?s=/admin/user/orgchart/id/3.html">jsl001</a>
															</div>
															<div class="box box-f1 box-bg" title="客户昵称">皮鸿煊</div>
															<div class="box box-f1 box-bg" title="客户等级">五级</div>
															<div class="box box-f1 box-bg" title="激活时间">2017-12-26
																19:19:41</div>
															<div class="box box-f1">
																<span class="box box-f1 box-bg" title="左区人数">5075</span><span
																	class="box box-f1 box-bg" title="右区人数">1</span>
															</div>
															<div class="box box-f1">
																<span class="box box-f1 box-bg" title="左区总业绩">36000</span>
																<span class="box box-f1 box-bg" title="右区总业绩">0</span>
															</div>
															<div class="box box-f1">
																<span class="box box-f1 box-bg" title="左区余业绩">36000</span>
																<span class="box box-f1 box-bg" title="右区余业绩">0</span>
															</div>

														</div></td>
												</tr>
												<tr class="lines">
													<td colspan="4"><table cellpadding="0" cellspacing="0"
															border="0">
															<tbody>
																<tr class="lines x">
																	<td class="line left"></td>
																	<td class="line right"></td>
																</tr>
															</tbody>
														</table></td>
												</tr>
												<tr class="lines v">
													<td class="line left"></td>
													<td class="line right top"></td>
													<td class="line left top"></td>
													<td class="line right"></td>
												</tr>
												<tr>
													<td colspan="2"><table cellpadding="0" cellspacing="0"
															border="0">
															<tbody>
																<tr class="nodes">
																	<td class="node" colspan="2"><div
																			class="node level2 node0 level2-node0">
																			<div class="box box-f1 box-bg" title="客户编号">
																				<a
																					href="http://fyt527.w1118.iyumi.pw/index.php?s=/admin/user/orgchart/id/4.html">jsl002</a>
																			</div>
																			<div class="box box-f1 box-bg" title="客户昵称">证书</div>
																			<div class="box box-f1 box-bg" title="客户等级">三级</div>
																			<div class="box box-f1 box-bg" title="激活时间">2017-12-26
																				19:20:35</div>
																			<div class="box box-f1">
																				<span class="box box-f1 box-bg" title="左区人数">5074</span><span
																					class="box box-f1 box-bg" title="右区人数">0</span>
																			</div>
																			<div class="box box-f1">
																				<span class="box box-f1 box-bg" title="左区总业绩">0</span>
																				<span class="box box-f1 box-bg" title="右区总业绩">0</span>
																			</div>
																			<div class="box box-f1">
																				<span class="box box-f1 box-bg" title="左区余业绩">0</span>
																				<span class="box box-f1 box-bg" title="右区余业绩">0</span>
																			</div>
																		</div></td>
																</tr>
															</tbody>
														</table></td>
													<td colspan="2"><table cellpadding="0" cellspacing="0"
															border="0">
															<tbody>
																<tr class="nodes">
																	<td class="node" colspan="2"><div
																			class="node level2 node1 level2-node1">
																			<div class="box box-f1 box-bg" title="客户编号">
																				<a
																					href="http://fyt527.w1118.iyumi.pw/index.php?s=/admin/user/orgchart/id/4981.html">jsl88888</a>
																			</div>
																			<div class="box box-f1 box-bg" title="客户昵称">赵丽颖</div>
																			<div class="box box-f1 box-bg" title="客户等级"></div>
																			<div class="box box-f1 box-bg" title="激活时间">无</div>
																			<div class="box box-f1">
																				<span class="box box-f1 box-bg" title="左区人数">0</span><span
																					class="box box-f1 box-bg" title="右区人数">0</span>
																			</div>
																			<div class="box box-f1">
																				<span class="box box-f1 box-bg" title="左区总业绩">0</span>
																				<span class="box box-f1 box-bg" title="右区总业绩">0</span>
																			</div>
																			<div class="box box-f1">
																				<span class="box box-f1 box-bg" title="左区余业绩">0</span>
																				<span class="box box-f1 box-bg" title="右区余业绩">0</span>
																			</div>
																		</div></td>
																</tr>
															</tbody>
														</table></td>
												</tr>
											</tbody>
										</table></td>
									<td colspan="2"><table cellpadding="0" cellspacing="0"
											border="0">
											<tbody>
												<tr class="nodes">
													<td class="node" colspan="4"><div
															class="node level1 node1 level1-node1 hasChildren shownChildren">
															<div class="box box-f1 box-bg" title="客户编号">
																<a
																	href="http://fyt527.w1118.iyumi.pw/index.php?s=/admin/user/orgchart/id/4982.html">a0001</a>
															</div>
															<div class="box box-f1 box-bg" title="客户昵称">公司0001</div>
															<div class="box box-f1 box-bg" title="客户等级">五级</div>
															<div class="box box-f1 box-bg" title="激活时间">无</div>
															<div class="box box-f1">
																<span class="box box-f1 box-bg" title="左区人数">8889</span><span
																	class="box box-f1 box-bg" title="右区人数">0</span>
															</div>
															<div class="box box-f1">
																<span class="box box-f1 box-bg" title="左区总业绩">3597200</span>
																<span class="box box-f1 box-bg" title="右区总业绩">0</span>
															</div>
															<div class="box box-f1">
																<span class="box box-f1 box-bg" title="左区余业绩">3597200</span>
																<span class="box box-f1 box-bg" title="右区余业绩">0</span>
															</div>

														</div></td>
												</tr>
												<tr class="lines">
													<td colspan="4"><table cellpadding="0" cellspacing="0"
															border="0">
															<tbody>
																<tr class="lines x">
																	<td class="line left"></td>
																	<td class="line right"></td>
																</tr>
															</tbody>
														</table></td>
												</tr>
												<tr class="lines v">
													<td class="line left"></td>
													<td class="line right top"></td>
													<td class="line left top"></td>
													<td class="line right"></td>
												</tr>
												<tr>
													<td colspan="2"><table cellpadding="0" cellspacing="0"
															border="0">
															<tbody>
																<tr class="nodes">
																	<td class="node" colspan="2"><div
																			class="node level2 node0 level2-node0">
																			<div class="box box-f1 box-bg" title="客户编号">
																				<a
																					href="http://fyt527.w1118.iyumi.pw/index.php?s=/admin/user/orgchart/id/4983.html">a0002</a>
																			</div>
																			<div class="box box-f1 box-bg" title="客户昵称">公司0002</div>
																			<div class="box box-f1 box-bg" title="客户等级">三级</div>
																			<div class="box box-f1 box-bg" title="激活时间">无</div>
																			<div class="box box-f1">
																				<span class="box box-f1 box-bg" title="左区人数">8888</span><span
																					class="box box-f1 box-bg" title="右区人数">0</span>
																			</div>
																			<div class="box box-f1">
																				<span class="box box-f1 box-bg" title="左区总业绩">3597200</span>
																				<span class="box box-f1 box-bg" title="右区总业绩">0</span>
																			</div>
																			<div class="box box-f1">
																				<span class="box box-f1 box-bg" title="左区余业绩">3597200</span>
																				<span class="box box-f1 box-bg" title="右区余业绩">0</span>
																			</div>
																		</div></td>
																</tr>
															</tbody>
														</table></td>
													<td colspan="2"><table cellpadding="0" cellspacing="0"
															border="0">
															<tbody>
																<tr class="nodes">
																	<td class="node" colspan="2"><div
																			class="node level2 node1 level2-node1">
																			<div class="box box-f1 box-bg">空</div>
																		</div></td>
																</tr>
															</tbody>
														</table></td>
												</tr>
											</tbody>
										</table></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div></div>
			</div>
		</div>
		<script src="plug-in/orgintree/jquery.orgchart.js"></script>
		<script>
	$(function() {
	    $("#organisation").orgChart({container: $("#zpmain")});
	});
</script>


	</div>
	</div>

	<!--end-main-container-part-->

	<!--Footer-part-->


	<!--end-Footer-part-->

	<script type="text/javascript" src="plug-in/orgintree/admin.js"></script>