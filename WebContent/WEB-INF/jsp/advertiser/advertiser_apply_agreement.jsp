<%@ page contentType="text/html; charset=utf-8"%>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- global variables settings -->
<c:set var="webapp_name" value="/acp" />

<!-- page variables  -->
<c:set var="inc_dir" value="../inc" />
<!-- ENDS page variables -->

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8" />
<title>Adogo | Advertiser - Application</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta http-equiv="Content-type" content="text/html; charset=utf-8" />

<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link rel="stylesheet" type="text/css"
	href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" />
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/global/plugins/font-awesome/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" />
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/global/plugins/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" />
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/global/plugins/datatables/datatables.min.css" />
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css" />
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/global/plugins/fancybox/source/jquery.fancybox.css" />
<link
	href="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.css"
	rel="stylesheet" type="text/css" />
<link
	href="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput-typeahead.css"
	rel="stylesheet" type="text/css" />
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL STYLES -->
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/global/css/components.min.css"
	id="style_components" />
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/global/css/plugins.min.css" />
<!-- END THEME GLOBAL STYLES -->
<!-- BEGIN THEME LAYOUT STYLES -->
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/layouts/layout2/css/layout.min.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/layouts/layout2/css/themes/blue.min.css"
	id="style_color" />
<link rel="stylesheet" type="text/css"
	href="${webapp_name}/assets/layouts/layout2/css/custom.min.css" />
<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon"
	href="${webapp_name}/assets/athensoft/ico/favicon.ico" />
</head>

<body
	class="page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid">
	<!-- BEGIN HEADER -->
	<div class="page-header navbar navbar-fixed-top">
		<!-- BEGIN HEADER INNER -->
		<div class="page-header-inner ">
			<!-- BEGIN LOGO -->
			<jsp:include page="${inc_dir}/page-logo.jsp"></jsp:include>
			<!-- BEGIN RESPONSIVE MENU TOGGLER -->
			<a href="javascript:;" class="menu-toggler responsive-toggler"
				data-toggle="collapse" data-target=".navbar-collapse"> </a>
			<!-- BEGIN PAGE ACTIONS -->
			<!-- DOC: Remove "hide" class to enable the page header actions -->
			<jsp:include page="${inc_dir}/page-action.jsp"></jsp:include>
			<!-- BEGIN PAGE TOP -->
			<jsp:include page="${inc_dir}/page-top.jsp"></jsp:include>
		</div>
		<!-- END HEADER INNER -->
	</div>
	<!-- END HEADER -->
	<!-- BEGIN HEADER & CONTENT DIVIDER -->
	<div class="clearfix"></div>
	<!-- END HEADER & CONTENT DIVIDER -->
	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<jsp:include page="${inc_dir}/page-sidebar.jsp"></jsp:include>
		<!-- END SIDEBAR -->
		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper">
			<!-- BEGIN CONTENT BODY -->
			<div class="page-content">
				<!-- BEGIN PAGE HEADER-->
				<h1 class="page-title">
					Advertiser | Application<small> in easy way </small>
				</h1>
				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li>
							<i class="fa fa-home"></i>
							<a href="${webapp_name}/index">Home</a>
							<i class="fa fa-angle-right"></i>
						</li>
						<li><a href="#">Apply for Advertiser</a>
					</ul>
					<div class="page-toolbar">
						<div class="btn-group pull-right">
							<button type="button"
								class="btn btn-fit-height grey-salt dropdown-toggle"
								data-toggle="dropdown" data-hover="dropdown" data-delay="1000"
								data-close-others="true">
								Quick Links <i class="fa fa-angle-down"></i>
							</button>
							<ul class="dropdown-menu pull-right" role="menu">
								<li><a href="#"><i class="icon-bell"></i> Quick Links</a></li>
								<li><a href="#"><i class="icon-shield"></i> Another
										action</a></li>
								<li><a href="#"><i class="icon-user"></i> Something
										else here</a></li>
								<li class="divider"></li>
								<li><a href="#"><i class="icon-bag"></i> Separated link</a></li>
							</ul>
						</div>
					</div>
				</div>
				<!-- END PAGE HEADER-->
				
			<!-- ROW STEP -->
            <div class="row">
                <div class="col-md-12">
                    <div class="portlet light portlet-fit ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class=" icon-layers font-green"></i>
                                <span class="caption-subject font-green bold uppercase">Quick steps - Apply for Advertiser</span>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="mt-element-step">
                                <div class="row step-thin">
                                    <!-- 
                                    <div class="mt-step-desc">
                                        <div class="font-dark bold uppercase">Register a business</div>
                                        <div class="caption-desc font-grey-cascade"></div>
                                    </div>  -->
                                    <div class="col-md-4 bg-grey mt-step-col done">
                                        <div class="mt-step-number bg-white font-grey">1</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Agreement</div>
                                        <div class="mt-step-content font-grey-cascade">Read Agreement and Terms</div>
                                    </div>
                                    <div class="col-md-4 bg-grey mt-step-col">
                                        <div class="mt-step-number bg-white font-grey">2</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Quiz</div>
                                        <div class="mt-step-content font-grey-cascade">Take a quiz without filling form</div>
                                    </div>
                                    <div class="col-md-4 bg-grey mt-step-col">
                                        <div class="mt-step-number bg-white font-grey">3</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Complete</div>
                                        <div class="mt-step-content font-grey-cascade">Become an Adogo Advertiser</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END ROW STEP -->
				
			<div class="row">
					<div class="col-md-12">
						<!-- Begin: life time stats -->
						<div class="portlet light">
							<div class="portlet-title">
								<div class="caption">
									Apply for Advertiser <span class="caption-helper">to build your booth, post your Ad and more</span>
								</div>
								<div class="actions">
									<a href="${webapp_name}/index" class="btn btn-circle btn-info">
										<span> Home </span>
									</a>
								</div>
							</div>
							<div class="portlet-body">
								<div class="table-container">
									<div class="table-actions-wrapper">
										<span> </span> <select
											class="table-group-action-input form-control input-inline input-small input-sm"
											name="groupOption">
											<option value="">Select...</option>
											<option value="1">Publish</option>
											<option value="2">Wait to post</option>
											<option value="3">Delete</option>
											<option value="4">Out of date</option>
											<option value="5">Suspend</option>
										</select>
										<button class="btn btn-sm yellow table-group-action-submit">
											<i class="fa fa-check"></i> Submit
										</button>
									</div>

								</div>
							</div>
						</div>
						<!-- End: life time stats -->
					</div>
				</div>

			<div class="row">
					<div class="col-md-12">

						<div class="portlet light ">
							<div class="portlet-title">
								<div class="caption">
									<i class="icon-equalizer font-red-sunglo"></i> <span
										class="caption-subject font-red-sunglo bold uppercase">SERVICE
										AGREEMENT</span> <span class="caption-helper">for all
										advertisers</span>
								</div>
								<div class="actions">
									<a class="btn btn-circle btn-icon-only btn-default"
										href="javascript:;"> <i class="icon-cloud-upload"></i>
									</a> <a class="btn btn-circle btn-icon-only btn-default"
										href="javascript:;"> <i class="icon-wrench"></i>
									</a> <a class="btn btn-circle btn-icon-only btn-default"
										href="javascript:;"> <i class="icon-trash"></i>
									</a>
								</div>
							</div>
							<div class="portlet-body form">
								<!-- BEGIN FORM-->
								<form action="#" class="form-horizontal">
									<div class="form-body">
										<div class="form-group last">
											<div class="col-md-1"></div>
											<div class="col-md-10">
												<jsp:include page="advertiser_apply_agreement_inc.jsp"></jsp:include>
											</div>
											<div class="col-md-1"></div>
										</div>
									</div>
									<div class="form-actions">
										<div class="row">
											<div class="col-md-offset-3 col-md-4">
												<a href="${webapp_name}/index" type="button" class="btn default">I
													don't agree</a> 
												<a href="${webapp_name}/advertiser/apply/quiz"
													class="btn green">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;I
													Agree&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
											</div>
										</div>
									</div>
								</form>
								<!-- END FORM-->
							</div>
						</div>

					</div>
				</div>

			</div>
			<!-- END CONTENT BODY -->
		</div>
		<!-- END CONTENT -->
		<!-- BEGIN ${webapp_name} SIDEBAR -->
		<!-- Removed to quick_sidebar.html -->
		<!-- END QUICK SIDEBAR -->
	</div>
	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->
	<jsp:include page="${inc_dir}/page-footer.jsp"></jsp:include>
	<!-- END FOOTER -->

	<!--[if lt IE 9]>
<script src="${webapp_name}/assets/global/plugins/respond.min.js"></script>
<script src="${webapp_name}/assets/global/plugins/excanvas.min.js"></script> 
<script src="${webapp_name}/assets/global/plugins/ie8.fix.min.js"></script> 
<![endif]-->
	<!-- BEGIN CORE PLUGINS -->
	<script src="${webapp_name}/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
	<script src="${webapp_name}/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="${webapp_name}/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
	<script src="${webapp_name}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
	<script src="${webapp_name}/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
	<script src="${webapp_name}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script src="${webapp_name}/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js" type="text/javascript"></script>
	<script src="${webapp_name}/assets/global/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js" type="text/javascript"></script>
	<script src="${webapp_name}/assets/global/plugins/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script>
	<!-- 
	<script
		src="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.min.js"
		type="text/javascript"></script>
	 -->	
	<script src="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.js" type="text/javascript"></script>
	<script src="${webapp_name}/assets/global/plugins/typeahead/handlebars.min.js" type="text/javascript"></script>
	<script src="${webapp_name}/assets/global/plugins/typeahead/typeahead.bundle.min.js" type="text/javascript"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN THEME GLOBAL SCRIPTS -->
	<!-- <script src="${webapp_name}/assets/global/scripts/app.min.js" type="text/javascript"></script> -->
	<script src="${webapp_name}/assets/global/scripts/app.js" type="text/javascript"></script>
	<!-- END THEME GLOBAL SCRIPTS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<!-- 
	<script type="text/javascript"
		src="${webapp_name}/assets/pages/scripts/components-bootstrap-tagsinput.min.js"></script>
	 -->
	
	<!-- END PAGE LEVEL SCRIPTS -->
	<!-- BEGIN THEME LAYOUT SCRIPTS -->
	<script src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js" type="text/javascript"></script>
	<script src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js" type="text/javascript"></script>

	<!-- END THEME LAYOUT SCRIPTS -->
<script>
</script>
</body>
</html>