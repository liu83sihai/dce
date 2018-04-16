<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="zh">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>组织结构图</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="renderer" content="webkit">

<script
	src="webpage/com/yisi/business/ctuser/user_tree_files/jquery.min.js"></script>

<script
	src="webpage/com/yisi/business/ctuser/user_tree_files/bootstrap.min.js"></script>

<script src="webpage/com/yisi/business/ctuser/user_tree_files/matrix.js"></script>

<link rel="stylesheet" type="text/css"
	href="webpage/com/yisi/business/ctuser/user_tree_files/bigcolorpicker.css">
<script type="text/javascript"
	src="webpage/com/yisi/business/ctuser/user_tree_files/jquery.colorpicker.js"></script>
<script type="text/javascript"
	src="webpage/com/yisi/business/ctuser/user_tree_files/layer.js"></script>
<link rel="stylesheet"
	href="webpage/com/yisi/business/ctuser/user_tree_files/layer.css"
	id="layui_layer_skinlayercss" style="">
<link rel="stylesheet"
	href="webpage/com/yisi/business/ctuser/user_tree_files/layer.ext.css"
	id="layui_layer_skinlayerextcss" style="">
<script type="text/javascript"
	src="webpage/com/yisi/business/ctuser/user_tree_files/laydate.js"></script>
<link type="text/css" rel="stylesheet"
	href="webpage/com/yisi/business/ctuser/user_tree_files/laydate.css"
	id="LayDateSkin">
<link type="text/css" rel="stylesheet"
	href="webpage/com/yisi/business/ctuser/user_tree_files/laydate(1).css"
	id="LayDateSkin">

<style type="text/css">
@media ( max-width : 767px) {
	#search {
		display: block;
	}
}
</style>
</head>
<body>
	<div id="content">
		<!--breadcrumbs-->

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
			<link rel="stylesheet"
				href="webpage/com/yisi/business/ctuser/user_tree_files/jquery.orgchart.css">

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
														href="ctUserController.do?userOrgin&id=${topMap.id}">${topMap.userName }</a>
												</div>
												<div class="box box-f1 box-bg" title="客户昵称">${topMap.trueName }</div>
												<div class="box box-f1 box-bg" title="客户等级">${topMap.userLevel }级</div>

												<div class="box box-f1">
													<span class="box box-f1 box-bg" title="左区余业绩">${topMap.leftNumber }</span> <span
														class="box box-f1 box-bg" title="右区余业绩">${topMap.rightNumber }</span>
												</div>
												<div class="box box-f1 box-bg" title="客户等级">${topMap.active }</div>

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
														href="ctUserController.do?userOrgin&id=${childMap11.id }">${childMap11.userName }</a>
														</div>
														<div class="box box-f1 box-bg" title="客户昵称">${childMap11.trueName }</div>
														<div class="box box-f1 box-bg" title="客户等级">${childMap11.userLevel }级</div>
		
														<div class="box box-f1">
															<span class="box box-f1 box-bg" title="左区余业绩">${childMap11.leftNumber }</span> <span
																class="box box-f1 box-bg" title="右区余业绩">${childMap11.rightNumber }</span>
														</div>
														<div class="box box-f1 box-bg" title="客户等级">${childMap11.active }</div>

															</div></td>
													</tr>
													<tr class="lines">
														<td colspan="4"><table cellpadding="0"
																cellspacing="0" border="0">
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
														<td colspan="2"><table cellpadding="0"
																cellspacing="0" border="0">
																<tbody>
																	<tr class="nodes">
																		<td class="node" colspan="2"><div
																				class="node level2 node0 level2-node0">
																				<div class="box box-f1 box-bg" title="客户编号">
													<a
														href="ctUserController.do?userOrgin&id=${childMap21.id }">${childMap21.userName }</a>
														</div>
														<div class="box box-f1 box-bg" title="客户昵称">${childMap21.trueName }</div>
														<div class="box box-f1 box-bg" title="客户等级">${childMap21.userLevel }级</div>
		
														<div class="box box-f1">
															<span class="box box-f1 box-bg" title="左区余业绩">${childMap21.leftNumber }</span> <span
																class="box box-f1 box-bg" title="右区余业绩">${childMap21.rightNumber }</span>
														</div>
														<div class="box box-f1 box-bg" title="客户等级">${childMap21.active }</div>

																			</div></td>
																	</tr>
																</tbody>
															</table></td>
														<td colspan="2"><table cellpadding="0"
																cellspacing="0" border="0">
																<tbody>
																	<tr class="nodes">
																		<td class="node" colspan="2"><div
																				class="node level2 node1 level2-node1">
																				<div class="box box-f1 box-bg" title="客户编号">
													<a
														href="ctUserController.do?userOrgin&id=${childMap22.id }">${childMap22.userName }</a>
														</div>
														<div class="box box-f1 box-bg" title="客户昵称">${childMap22.trueName }</div>
														<div class="box box-f1 box-bg" title="客户等级">${childMap22.userLevel }级</div>
		
														<div class="box box-f1">
															<span class="box box-f1 box-bg" title="左区余业绩">${childMap22.leftNumber }</span> <span
																class="box box-f1 box-bg" title="右区余业绩">${childMap22.rightNumber }</span>
														</div>
														<div class="box box-f1 box-bg" title="客户等级">${childMap22.active }</div>

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
														href="ctUserController.do?userOrgin&id=${childMap12.id }">${childMap12.userName }</a>
														</div>
														<div class="box box-f1 box-bg" title="客户昵称">${childMap12.trueName }</div>
														<div class="box box-f1 box-bg" title="客户等级">${childMap12.userLevel }级</div>
		
														<div class="box box-f1">
															<span class="box box-f1 box-bg" title="左区余业绩">${childMap12.leftNumber }</span> <span
																class="box box-f1 box-bg" title="右区余业绩">${childMap12.rightNumber }</span>
														</div>
														<div class="box box-f1 box-bg" title="客户等级">${childMap12.active }</div>


															</div></td>
													</tr>
													<tr class="lines">
														<td colspan="4"><table cellpadding="0"
																cellspacing="0" border="0">
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
														<td colspan="2"><table cellpadding="0"
																cellspacing="0" border="0">
																<tbody>
																	<tr class="nodes">
																		<td class="node" colspan="2"><div
																				class="node level2 node0 level2-node0">
																				<div class="box box-f1 box-bg" title="客户编号">
													<a
														href="ctUserController.do?userOrgin&id=${childMap23.id }">${childMap23.userName }</a>
														</div>
														<div class="box box-f1 box-bg" title="客户昵称">${childMap23.trueName }</div>
														<div class="box box-f1 box-bg" title="客户等级">${childMap23.userLevel }级</div>
		
														<div class="box box-f1">
															<span class="box box-f1 box-bg" title="左区余业绩">${childMap23.leftNumber }</span> <span
																class="box box-f1 box-bg" title="右区余业绩">${childMap23.rightNumber }</span>
														</div>
														<div class="box box-f1 box-bg" title="客户等级">${childMap23.active }</div>

																			</div></td>
																	</tr>
																</tbody>
															</table></td>
														<td colspan="2"><table cellpadding="0"
																cellspacing="0" border="0">
																<tbody>
																	<tr class="nodes">
																		<td class="node" colspan="2"><div
																				class="node level2 node1 level2-node1">
																				<div class="box box-f1 box-bg" title="客户编号">
													<a
														href="ctUserController.do?userOrgin&id=${childMap24.id }">${childMap24.userName }</a>
														</div>
														<div class="box box-f1 box-bg" title="客户昵称">${childMap24.trueName }</div>
														<div class="box box-f1 box-bg" title="客户等级">${childMap24.userLevel }级</div>
		
														<div class="box box-f1">
															<span class="box box-f1 box-bg" title="左区余业绩">${childMap24.leftNumber }</span> <span
																class="box box-f1 box-bg" title="右区余业绩">${childMap24.rightNumber }</span>
														</div>
														<div class="box box-f1 box-bg" title="客户等级">${childMap24.active }</div>

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
			<script
				src="webpage/com/yisi/business/ctuser/user_tree_files/jquery.orgchart.js"></script>
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

	<script type="text/javascript"
		src="webpage/com/yisi/business/ctuser/user_tree_files/admin.js"></script>

</body>
</html>