<%@ page language="java" contentType="text/html; charset=utf8"%>
<%
	String jsLibraryPath = request.getContextPath();

	String randomStr = String.valueOf(Math.round(Math.random() * 200000));
%>

<link rel="shortcut icon"
	href="<%=jsLibraryPath%>/resources/favicon.ico">
<link rel="stylesheet" type="text/css"
	href="<%=jsLibraryPath%>/resources/css/bootstrap.min.css?v=3.3.6?r=<%=randomStr%>">
<link rel="stylesheet" type="text/css"
	href="<%=jsLibraryPath%>/resources/css/font-awesome.min.css?v=4.4.0?r=<%=randomStr%>">
<link rel="stylesheet" type="text/css"
	href="<%=jsLibraryPath%>/resources/css/plugins/bootstrap-table/bootstrap-table.min.css?r=<%=randomStr%>">
<link rel="stylesheet" type="text/css"
	href="<%=jsLibraryPath%>/resources/css/animate.css?r=<%=randomStr%>">
<link rel="stylesheet" type="text/css"
	href="<%=jsLibraryPath%>/resources/css/style.css?v=4.1.0?r=<%=randomStr%>">

<!-- 全局js -->
<script type="text/javascript"
	src="<%=jsLibraryPath%>/resources/js/jquery.min.js?v=2.1.4?r=<%=randomStr%>"></script>
<script type="text/javascript"
	src="<%=jsLibraryPath%>/resources/js/bootstrap.min.js?v=3.3.6?r=<%=randomStr%>"></script>
<script type="text/javascript"
	src="<%=jsLibraryPath%>/resources/js/plugins/metisMenu/jquery.metisMenu.js?r=<%=randomStr%>"></script>
<script type="text/javascript"
	src="<%=jsLibraryPath%>/resources/js/plugins/slimscroll/jquery.slimscroll.min.js?r=<%=randomStr%>"></script>
<script type="text/javascript"
	src="<%=jsLibraryPath%>/resources/js/plugins/layer/layer.min.js?r=<%=randomStr%>"></script>

<!-- 自定义js -->
<script type="text/javascript"
	src="<%=jsLibraryPath%>/resources/js/hAdmin.js?v=4.1.0?r=<%=randomStr%>"></script>
<script type="text/javascript"
	src="<%=jsLibraryPath%>/resources/js/index.js?r=<%=randomStr%>"></script>

<!-- 第三方插件 -->
<script type="text/javascript"
	src="<%=jsLibraryPath%>/resources/js/plugins/pace/pace.min.js?r=<%=randomStr%>"></script>

<!-- Bootstrap table -->
<script type="text/javascript"
	src="<%=jsLibraryPath%>/resources/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script type="text/javascript"
	src="<%=jsLibraryPath%>/resources/js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
<script type="text/javascript"
	src="<%=jsLibraryPath%>/resources/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">

<!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
<![endif]-->
