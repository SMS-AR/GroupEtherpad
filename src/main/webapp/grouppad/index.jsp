<%@ page language="java" contentType="text/html; charset=utf8"%>
<%@ include file="common/include_header.jsp"%>
<html>
<head>
<title>群智感知协同写作系统</title>
</head>

<body class="fixed-sidebar full-height-layout gray-bg"
	style="overflow: hidden">
	<div id="wrapper">
		<!--左侧导航开始-->
		<nav class="navbar-default navbar-static-side" role="navigation">
			<div class="nav-close">
				<i class="fa fa-times-circle"></i>
			</div>
			<div class="sidebar-collapse">
				<ul class="nav" id="side-menu">
					<li class="nav-header">
						<div class="dropdown profile-element">
							<a data-toggle="dropdown" class="dropdown-toggle" href="#"> <span
								class="clear"> <span class="block m-t-xs"
									style="font-size: 20px;"> <i class="fa fa-line-chart"></i>
										<strong class="font-bold">群智感知</strong>
								</span>
							</span>
							</a>
						</div>
						<div class="logo-element">groupEtherpad</div>
					</li>
					<li><a class="J_menuItem" href="index_v1.html"> <i
							class="fa fa-home"></i> <span class="nav-label">主页</span>
					</a></li>
					<li class="line dk"></li>
					<li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
						<span class="ng-scope">系统</span>
					</li>
					<li><a class="J_menuItem" href="grouppad/system/user/user_list.jsp">
						<i class="fa fa-user"></i> 
						<span class="nav-label">用户管理</span>
					</a></li>
					<li><a href="#">
						<i class="fa fa-group"></i> 
						<span class="nav-label">角色管理</span>
					</a></li>
					<li><a href="#">
						<i class="fa fa-navicon"></i> 
						<span class="nav-label">菜单管理</span>
					</a></li>
					<li><a href="#">
						<i class="fa fa-book"></i> 
						<span class="nav-label">资源管理</span>
					</a></li>
					<li><a href="#">
						<i class="fa fa-gear"></i> 
						<span class="nav-label">用户授权</span>
					</a></li>
					<li class="line dk"></li>
					<li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
						<span class="ng-scope">分类</span>
					</li>
					<li><a href="#"><i class="fa fa-flask"></i> <span
							class="nav-label">UI元素</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a class="J_menuItem" href="typography.html">排版</a></li>
							<li><a href="#">字体图标 <span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
									<li><a class="J_menuItem" href="fontawesome.html">Font
											Awesome</a></li>
									<li><a class="J_menuItem" href="glyphicons.html">Glyphicon</a>
									</li>
									<li><a class="J_menuItem" href="iconfont.html">阿里巴巴矢量图标库</a>
									</li>
								</ul></li>
							<li><a href="#">拖动排序 <span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
									<li><a class="J_menuItem" href="draggable_panels.html">拖动面板</a>
									</li>
									<li><a class="J_menuItem" href="agile_board.html">任务清单</a>
									</li>
								</ul></li>
							<li><a class="J_menuItem" href="buttons.html">按钮</a></li>
							<li><a class="J_menuItem" href="tabs_panels.html">选项卡
									&amp; 面板</a></li>
							<li><a class="J_menuItem" href="notifications.html">通知
									&amp; 提示</a></li>
							<li><a class="J_menuItem" href="badges_labels.html">徽章，标签，进度条</a>
							</li>
							<li><a class="J_menuItem" href="grid_options.html">栅格</a></li>
							<li><a class="J_menuItem" href="plyr.html">视频、音频</a></li>
							<li><a href="#">弹框插件 <span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
									<li><a class="J_menuItem" href="layer.html">Web弹层组件layer</a>
									</li>
									<li><a class="J_menuItem" href="modal_window.html">模态窗口</a>
									</li>
									<li><a class="J_menuItem" href="sweetalert.html">SweetAlert</a>
									</li>
								</ul></li>
							<li><a href="#">树形视图 <span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
									<li><a class="J_menuItem" href="jstree.html">jsTree</a></li>
									<li><a class="J_menuItem" href="tree_view.html">Bootstrap
											Tree View</a></li>
									<li><a class="J_menuItem" href="nestable_list.html">nestable</a>
									</li>
								</ul></li>
							<li><a class="J_menuItem" href="toastr_notifications.html">Toastr通知</a>
							</li>
							<li><a class="J_menuItem" href="diff.html">文本对比</a></li>
							<li><a class="J_menuItem" href="spinners.html">加载动画</a></li>
							<li><a class="J_menuItem" href="widgets.html">小部件</a></li>
						</ul></li>
					<li><a href="#"><i class="fa fa-table"></i> <span
							class="nav-label">表格</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a class="J_menuItem" href="table_basic.html">基本表格</a></li>
							<li><a class="J_menuItem" href="table_data_tables.html">DataTables</a>
							</li>
							<li><a class="J_menuItem" href="table_jqgrid.html">jqGrid</a>
							</li>
							<li><a class="J_menuItem" href="table_foo_table.html">Foo
									Tables</a></li>
							<li><a class="J_menuItem" href="table_bootstrap.html">Bootstrap
									Table <span class="label label-danger pull-right">推荐</span>
							</a></li>
						</ul></li>
					<li class="line dk"></li>
					<li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
						<span class="ng-scope">分类</span>
					</li>
					<li><a href="#"><i class="fa fa-picture-o"></i> <span
							class="nav-label">相册</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a class="J_menuItem" href="basic_gallery.html">基本图库</a>
							</li>
							<li><a class="J_menuItem" href="carousel.html">图片切换</a></li>
							<li><a class="J_menuItem" href="blueimp.html">Blueimp相册</a>
							</li>
						</ul></li>
					<li><a class="J_menuItem" href="css_animation.html"><i
							class="fa fa-magic"></i> <span class="nav-label">CSS动画</span></a></li>
					<li><a href="#"><i class="fa fa-cutlery"></i> <span
							class="nav-label">工具 </span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a class="J_menuItem" href="form_builder.html">表单构建器</a>
							</li>
						</ul></li>

				</ul>
			</div>
		</nav>
		<!--左侧导航结束-->
		<!--右侧部分开始-->
		<div id="page-wrapper" class="gray-bg dashbard-1">
			<div class="row border-bottom">
				<nav class="navbar navbar-static-top" role="navigation"
					style="margin-bottom: 0">
					<div class="navbar-header">
						<a class="navbar-minimalize minimalize-styl-2 btn btn-info "
							href="#"><i class="fa fa-bars"></i> </a>
						<form role="search" class="navbar-form-custom" method="post"
							action="search_results.html">
							<div class="form-group">
								<input type="text" placeholder="请输入您需要查找的内容 …"
									class="form-control" name="top-search" id="top-search">
							</div>
						</form>
					</div>
					<ul class="nav navbar-top-links navbar-right">
						<li class="dropdown"><a class="dropdown-toggle count-info"
							data-toggle="dropdown" href="#"> <i class="fa fa-envelope"></i>
								<span class="label label-warning">16</span>
						</a>
							<ul class="dropdown-menu dropdown-messages">
								<li class="m-t-xs">
									<div class="dropdown-messages-box">
										<a href="profile.html" class="pull-left"> <img alt="image"
											class="img-circle" src="img/a7.jpg">
										</a>
										<div class="media-body">
											<small class="pull-right">46小时前</small> <strong>小四</strong>
											是不是只有我死了,你们才不骂爵迹 <br> <small class="text-muted">3天前
												2014.11.8</small>
										</div>
									</div>
								</li>
								<li class="divider"></li>
								<li>
									<div class="dropdown-messages-box">
										<a href="profile.html" class="pull-left"> <img alt="image"
											class="img-circle" src="img/a4.jpg">
										</a>
										<div class="media-body ">
											<small class="pull-right text-navy">25小时前</small> <strong>二愣子</strong>
											呵呵 <br> <small class="text-muted">昨天</small>
										</div>
									</div>
								</li>
								<li class="divider"></li>
								<li>
									<div class="text-center link-block">
										<a class="J_menuItem" href="mailbox.html"> <i
											class="fa fa-envelope"></i> <strong> 查看所有消息</strong>
										</a>
									</div>
								</li>
							</ul></li>
						<li class="dropdown"><a class="dropdown-toggle count-info"
							data-toggle="dropdown" href="#"> <i class="fa fa-bell"></i> <span
								class="label label-primary">8</span>
						</a>
							<ul class="dropdown-menu dropdown-alerts">
								<li><a href="mailbox.html">
										<div>
											<i class="fa fa-envelope fa-fw"></i> 您有16条未读消息 <span
												class="pull-right text-muted small">4分钟前</span>
										</div>
								</a></li>
								<li class="divider"></li>
								<li><a href="profile.html">
										<div>
											<i class="fa fa-qq fa-fw"></i> 3条新回复 <span
												class="pull-right text-muted small">12分钟钱</span>
										</div>
								</a></li>
								<li class="divider"></li>
								<li>
									<div class="text-center link-block">
										<a class="J_menuItem" href="notifications.html"> <strong>查看所有
										</strong> <i class="fa fa-angle-right"></i>
										</a>
									</div>
								</li>
							</ul></li>
					</ul>
				</nav>
			</div>
			<div class="row J_mainContent" id="content-main">
				<iframe id="J_iframe" width="100%" height="100%"
					src="<%=request.getContextPath()%>/pad	" frameborder="0" data-id="common/home.jsp"
					seamless></iframe>
			</div>
		</div>
		<!--右侧部分结束-->
	</div>

</body>

</html>
