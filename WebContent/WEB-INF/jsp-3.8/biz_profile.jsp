<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="form_action" value="/admin/bizprofile/31001"/>

<!DOCTYPE html>
<!-- 
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.3.4
Version: 3.8.1
Author: KeenThemes
Website: http://www.keenthemes.com/
Contact: support@keenthemes.com
Follow: www.twitter.com/keenthemes
Like: www.facebook.com/keenthemes
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
License: You must have a valid license purchased only from themeforest(the above link) in order to legally use the theme for your project.
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>Adogo | Admin </title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta content="" name="description"/>
<meta content="" name="author"/>
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css">
<link href="/admin/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="/admin/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css">
<link href="/admin/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="/admin/assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css">
<link href="/admin/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link rel="stylesheet" type="text/css" href="/admin/assets/global/plugins/select2/select2.css"/>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME STYLES -->
<link href="/admin/assets/global/css/components.css" id="style_components" rel="stylesheet" type="text/css"/>
<link href="/admin/assets/global/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="/admin/assets/admin/layout2/css/layout.css" rel="stylesheet" type="text/css"/>
<link id="style_color" href="/admin/assets/admin/layout2/css/themes/grey.css" rel="stylesheet" type="text/css"/>
<link href="/admin/assets/admin/layout2/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<!-- DOC: Apply "page-header-fixed-mobile" and "page-footer-fixed-mobile" class to body element to force fixed header or footer in mobile devices -->
<!-- DOC: Apply "page-sidebar-closed" class to the body and "page-sidebar-menu-closed" class to the sidebar menu element to hide the sidebar by default -->
<!-- DOC: Apply "page-sidebar-hide" class to the body to make the sidebar completely hidden on toggle -->
<!-- DOC: Apply "page-sidebar-closed-hide-logo" class to the body element to make the logo hidden on sidebar toggle -->
<!-- DOC: Apply "page-sidebar-hide" class to body element to completely hide the sidebar on sidebar toggle -->
<!-- DOC: Apply "page-sidebar-fixed" class to have fixed sidebar -->
<!-- DOC: Apply "page-footer-fixed" class to the body element to have fixed footer -->
<!-- DOC: Apply "page-sidebar-reversed" class to put the sidebar on the right side -->
<!-- DOC: Apply "page-full-width" class to the body element to have full width page without the sidebar menu -->
<body class="page-boxed page-header-fixed page-container-bg-solid page-sidebar-closed-hide-logo ">
<!-- BEGIN HEADER -->
<div class="page-header navbar navbar-fixed-top">
	<!-- BEGIN HEADER INNER -->
	<div class="page-header-inner container">
		<!-- BEGIN LOGO -->
			<jsp:include page="page-logo.jsp"></jsp:include>
		<!-- END LOGO -->
		<!-- BEGIN RESPONSIVE MENU TOGGLER -->
		<a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse">
		</a>
		<!-- END RESPONSIVE MENU TOGGLER -->
		<!-- BEGIN PAGE ACTIONS -->
		<!-- DOC: Remove "hide" class to enable the page header actions -->
			<jsp:include page="page-action.jsp"></jsp:include>
		<!-- END PAGE ACTIONS -->
		<!-- BEGIN PAGE TOP -->
			<jsp:include page="page-top.jsp"></jsp:include>
		<!-- END PAGE TOP -->
	</div>
	<!-- END HEADER INNER -->
</div>
<!-- END HEADER -->
<div class="clearfix">
</div>
<div class="container">
	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
			<jsp:include page="page-sidebar.jsp"></jsp:include>
		<!-- END SIDEBAR -->
		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper">
			<div class="page-content">
				<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
				<div class="modal fade" id="portlet-config" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
								<h4 class="modal-title">Modal title</h4>
							</div>
							<div class="modal-body">
								 Widget settings form goes here
							</div>
							<div class="modal-footer">
								<button type="button" class="btn blue">Save changes</button>
								<button type="button" class="btn default" data-dismiss="modal">Close</button>
							</div>
						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal-dialog -->
				</div>
				<!-- /.modal -->
				<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
				<!-- BEGIN STYLE CUSTOMIZER -->
				<div class="theme-panel">
					<div class="toggler tooltips" data-container="body" data-placement="left" data-html="true" data-original-title="Click to open advance theme customizer panel">
						<i class="icon-settings"></i>
					</div>
					<div class="toggler-close">
						<i class="icon-close"></i>
					</div>
					<div class="theme-options">
						<div class="theme-option theme-colors clearfix">
							<span>
							THEME COLOR </span>
							<ul>
								<li class="color-default current tooltips" data-style="default" data-container="body" data-original-title="Default">
								</li>
								<li class="color-grey tooltips" data-style="grey" data-container="body" data-original-title="Grey">
								</li>
								<li class="color-blue tooltips" data-style="blue" data-container="body" data-original-title="Blue">
								</li>
								<li class="color-dark tooltips" data-style="dark" data-container="body" data-original-title="Dark">
								</li>
								<li class="color-light tooltips" data-style="light" data-container="body" data-original-title="Light">
								</li>
							</ul>
						</div>
						<div class="theme-option">
							<span>
							Theme Style </span>
							<select class="layout-style-option form-control input-small">
								<option value="square" selected="selected">Square corners</option>
								<option value="rounded">Rounded corners</option>
							</select>
						</div>
						<div class="theme-option">
							<span>
							Layout </span>
							<select class="layout-option form-control input-small">
								<option value="fluid" selected="selected">Fluid</option>
								<option value="boxed">Boxed</option>
							</select>
						</div>
						<div class="theme-option">
							<span>
							Header </span>
							<select class="page-header-option form-control input-small">
								<option value="fixed" selected="selected">Fixed</option>
								<option value="default">Default</option>
							</select>
						</div>
						<div class="theme-option">
							<span>
							Top Dropdown</span>
							<select class="page-header-top-dropdown-style-option form-control input-small">
								<option value="light" selected="selected">Light</option>
								<option value="dark">Dark</option>
							</select>
						</div>
						<div class="theme-option">
							<span>
							Sidebar Mode</span>
							<select class="sidebar-option form-control input-small">
								<option value="fixed">Fixed</option>
								<option value="default" selected="selected">Default</option>
							</select>
						</div>
						<div class="theme-option">
							<span>
							Sidebar Style</span>
							<select class="sidebar-style-option form-control input-small">
								<option value="default" selected="selected">Default</option>
								<option value="compact">Compact</option>
							</select>
						</div>
						<div class="theme-option">
							<span>
							Sidebar Menu </span>
							<select class="sidebar-menu-option form-control input-small">
								<option value="accordion" selected="selected">Accordion</option>
								<option value="hover">Hover</option>
							</select>
						</div>
						<div class="theme-option">
							<span>
							Sidebar Position </span>
							<select class="sidebar-pos-option form-control input-small">
								<option value="left" selected="selected">Left</option>
								<option value="right">Right</option>
							</select>
						</div>
						<div class="theme-option">
							<span>
							Footer </span>
							<select class="page-footer-option form-control input-small">
								<option value="fixed">Fixed</option>
								<option value="default" selected="selected">Default</option>
							</select>
						</div>
					</div>
				</div>
				<!-- END STYLE CUSTOMIZER -->
				<!-- BEGIN PAGE HEADER-->
				<h3 class="page-title">
				Business Profile <small>form layouts</small>
				</h3>
				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li>
							<i class="fa fa-home"></i>
							<a href="index.html">Home</a>
							<i class="fa fa-angle-right"></i>
						</li>
						<li>
							<a href="#">Form Stuff</a>
							<i class="fa fa-angle-right"></i>
						</li>
						<li>
							<a href="#">Form Layouts</a>
						</li>
					</ul>
					<div class="page-toolbar">
						<div class="btn-group pull-right">
							<button type="button" class="btn btn-fit-height grey-salt dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true">
							Actions <i class="fa fa-angle-down"></i>
							</button>
							<ul class="dropdown-menu pull-right" role="menu">
								<li>
									<a href="#">Action</a>
								</li>
								<li>
									<a href="#">Another action</a>
								</li>
								<li>
									<a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a href="#">Separated link</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<!-- END PAGE HEADER-->
				
				<!-- BEGIN PAGE CONTENT-->
				<div class="row">
					<div class="col-md-12">
						<div class="tabbable tabbable-custom tabbable-noborder tabbable-reversed">
							<ul class="nav nav-tabs">
								<li class="active">
									<a href="#tab_2" data-toggle="tab">
									View </a>
								</li>
							</ul>
							<div class="tab-content">
								<div class="tab-pane active" id="tab_2">
									<div class="portlet box green">
										<div class="portlet-title">
											<div class="caption">
												<i class="fa fa-gift"></i>Form Sample
											</div>
											<div class="tools">
												<a href="javascript:;" class="collapse">
												</a>
												<a href="#portlet-config" data-toggle="modal" class="config">
												</a>
												<a href="javascript:;" class="reload">
												</a>
												<a href="javascript:;" class="remove">
												</a>
											</div>
										</div>
										<div class="portlet-body form">
											<!-- BEGIN FORM-->
											<form action="${form_action}" class="form-horizontal" method="POST">
												<div class="form-body">
													<h3 class="form-section">Home - Personal Info</h3>
													<div class="row">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">First Name</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" placeholder="your first name" name="cp_firstname" value="${businessProfile.cp_firstname}">
																	<span class="help-block"></span>
																</div>
															</div>
														</div>
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Last Name</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" placeholder="your last name" name="cp_lastname">
																	<span class="help-block"></span>
																</div>
															</div>
														</div>
														<!--/span-->
														<!-- 
														<div class="col-md-6">
															<div class="form-group has-error">
																<label class="control-label col-md-3">Last Name</label>
																<div class="col-md-9">
																	<select name="foo" class="select2me form-control">
																		<option value="1">Abc</option>
																		<option value="1">Abc</option>
																		<option value="1">This is a really long value that breaks the fluid design for a select2</option>
																	</select>
																	<span class="help-block">
																	This field has error. </span>
																</div>
															</div>
														</div>
														 -->
														<!--/span-->
													</div>
													<!--/row-->
													<div class="row">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Title</label>
																<div class="col-md-9">
																	<select class="form-control" name="cp_title">
																		<option value="1">Mr.</option>
																		<option value="2">Mrs.</option>
																		<option value="3">Ms.</option>
																		<option value="4">Dr.</option>
																		<option value="5">PhD.</option>
																	</select>
																	<span class="help-block">Select your title. </span>
																</div>
															</div>
														</div>
														<!--/span-->
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Nick Name</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" placeholder="your nick name" name="cp_nickname">
																	<span class="help-block">
																	This is inline help </span>
																</div>
															</div>
														</div>
														<!-- 
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Date of Birth</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" placeholder="dd/mm/yyyy">
																</div>
															</div>
														</div>
														 -->
														<!--/span-->
													</div>
													<!--/row-->
													<div class="row">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Show my</label>
																<div class="col-md-9">
																	<div class="radio-list">
																		<label class="radio-inline">
																		<input type="radio" name="cp_showtype" value="1"/>
																		Real name </label>
																		<label class="radio-inline">
																		<input type="radio" name="cp_showtype" value="2" checked/>
																		Nick name </label>
																	</div>
																</div>
															</div>
														</div>
														 
														<div class="col-md-6">
														<!--
															<div class="form-group">
																<label class="control-label col-md-3">Category</label>
																<div class="col-md-9">
																	<select class="select2_category form-control" data-placeholder="Choose a Category" tabindex="1">
																		<option value="Category 1">Category 1</option>
																		<option value="Category 2">Category 2</option>
																		<option value="Category 3">Category 5</option>
																		<option value="Category 4">Category 4</option>
																	</select>
																</div>
															</div>
														-->
														</div>
														 
														<!--/span-->
														
														<!--/span-->
													</div>
													
													
													<h3 class="form-section">Home - Business Info</h3>
													<div class="row">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">What we provide</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="biz_offer">
																</div>
															</div>
														</div>
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Competences</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="biz_competency">
																</div>
															</div>
														</div>
													</div>
													
													<h3 class="form-section">Reach us - Location</h3>
													<!--/row-->
													<div class="row">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Address line 1</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="loc_addr_line1">
																</div>
															</div>
														</div>
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Address line 2</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="loc_addr_line2">
																</div>
															</div>
														</div>
													</div>
													<div class="row">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">City</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="loc_city">
																</div>
															</div>
														</div>
														<!--/span-->
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Province/State</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="loc_prov">
																</div>
															</div>
														</div>
														<!--/span-->
													</div>
													<!--/row-->
													
													<div class="row">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Post Code</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="loc_postalcode">
																	<span class="help-block">
																	Example: H4B 1N2 </span>
																</div>
															</div>
														</div>
														<!--/span-->
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Country</label>
																<div class="col-md-9">
																	<select class="form-control" name="loc_country">
																		<option>Canada</option>
																		<option>China</option>
																		<option>United States</option>
																	</select>
																</div>
															</div>
														</div>
														<!--/span-->
													</div>
													<div class="row">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Location name</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="loc_name">
																	<span class="help-block">
																	Example: Station Guy-Concordia </span>
																</div>
															</div>
														</div>
														<!--/span-->
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Location description</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="loc_desc">
																	<span class="help-block">
																	Example: near Provigo </span>
																</div>
															</div>
														</div>
														<!--/span-->
													</div>
													<!--/row-->
													
													
													<h3 class="form-section">Reach us - Phone number &amp; Fax</h3>
													<div class="row">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Telephone #1</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="biz_tel1">
																	<span class="help-block">
																	Example: 514-1234567 </span>
																</div>
															</div>
														</div>
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Telephone #2</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="biz_tel2">
																	<span class="help-block">
																	Example: 514-1234567 </span>
																</div>
															</div>
														</div>
													</div>
													<div class="row">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Cell phone</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="biz_cell1">
																	<span class="help-block">
																	Example: 514-1234567 </span>
																</div>
															</div>
														</div>
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Fax no.</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="biz_fax1">
																	<span class="help-block">
																	Example: 514-1234567 </span>
																</div>
															</div>
														</div>														
													</div>
													
													<!-- email -->
													<h3 class="form-section">Reach us - Email</h3>
													<div class="row">
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Email #1</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="biz_email1">
																	<span class="help-block">
																	Example: 123@abc.com </span>
																</div>
															</div>
														</div>
														<div class="col-md-6">
															<div class="form-group">
																<label class="control-label col-md-3">Email #2</label>
																<div class="col-md-9">
																	<input type="text" class="form-control" name="biz_email2">
																	<span class="help-block">
																	Example: 123@abc.com </span>
																</div>
															</div>
														</div>
													</div>
																										
												</div>
												<div class="form-actions">
													<div class="row">
														<div class="col-md-6">
															<div class="row">
																<div class="col-md-offset-3 col-md-9">
																	<button type="submit" class="btn green">Submit</button>
																	<button type="button" class="btn default">Cancel</button>
																</div>
															</div>
														</div>
														<div class="col-md-6">
														</div>
													</div>
												</div>
											</form>
											<!-- END FORM-->
										</div>
									</div>
									
								</div>
								
								
								
								<div class="tab-pane" id="tab_7">
									<div class="portlet box blue ">
										<div class="portlet-title">
											<div class="caption">
												<i class="fa fa-gift"></i>Form Sample
											</div>
											<div class="tools">
												<a href="javascript:;" class="collapse">
												</a>
												<a href="#portlet-config" data-toggle="modal" class="config">
												</a>
												<a href="javascript:;" class="reload">
												</a>
												<a href="javascript:;" class="remove">
												</a>
											</div>
										</div>
										<div class="portlet-body form">
											<!-- BEGIN FORM-->
											<form action="#" class="form-horizontal form-bordered form-label-stripped">
												<div class="form-body">
													<div class="form-group">
														<label class="control-label col-md-3">First Name</label>
														<div class="col-md-9">
															<input type="text" placeholder="small" class="form-control"/>
															<span class="help-block">
															This is inline help </span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Last Name</label>
														<div class="col-md-9">
															<input type="text" placeholder="medium" class="form-control"/>
															<span class="help-block">
															This is inline help </span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Gender</label>
														<div class="col-md-9">
															<select class="form-control">
																<option value="">Male</option>
																<option value="">Female</option>
															</select>
															<span class="help-block">
															Select your gender. </span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Date of Birth</label>
														<div class="col-md-9">
															<input type="text" class="form-control" placeholder="dd/mm/yyyy">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Category</label>
														<div class="col-md-9">
															<select class="form-control select2_category">
																<option value="Category 1">Category 1</option>
																<option value="Category 2">Category 2</option>
																<option value="Category 3">Category 5</option>
																<option value="Category 4">Category 4</option>
															</select>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Multi-Value Select</label>
														<div class="col-md-9">
															<select class="form-control select2_sample1" multiple>
																<optgroup label="NFC EAST">
																<option>Dallas Cowboys</option>
																<option>New York Giants</option>
																<option>Philadelphia Eagles</option>
																<option>Washington Redskins</option>
																</optgroup>
																<optgroup label="NFC NORTH">
																<option>Chicago Bears</option>
																<option>Detroit Lions</option>
																<option>Green Bay Packers</option>
																<option>Minnesota Vikings</option>
																</optgroup>
																<optgroup label="NFC SOUTH">
																<option>Atlanta Falcons</option>
																<option>Carolina Panthers</option>
																<option>New Orleans Saints</option>
																<option>Tampa Bay Buccaneers</option>
																</optgroup>
																<optgroup label="NFC WEST">
																<option>Arizona Cardinals</option>
																<option>St. Louis Rams</option>
																<option>San Francisco 49ers</option>
																<option>Seattle Seahawks</option>
																</optgroup>
																<optgroup label="AFC EAST">
																<option>Buffalo Bills</option>
																<option>Miami Dolphins</option>
																<option>New England Patriots</option>
																<option>New York Jets</option>
																</optgroup>
																<optgroup label="AFC NORTH">
																<option>Baltimore Ravens</option>
																<option>Cincinnati Bengals</option>
																<option>Cleveland Browns</option>
																<option>Pittsburgh Steelers</option>
																</optgroup>
																<optgroup label="AFC SOUTH">
																<option>Houston Texans</option>
																<option>Indianapolis Colts</option>
																<option>Jacksonville Jaguars</option>
																<option>Tennessee Titans</option>
																</optgroup>
																<optgroup label="AFC WEST">
																<option>Denver Broncos</option>
																<option>Kansas City Chiefs</option>
																<option>Oakland Raiders</option>
																<option>San Diego Chargers</option>
																</optgroup>
															</select>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Loading Data</label>
														<div class="col-md-9">
															<input type="hidden" class="form-control select2_sample2">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Tags Support List</label>
														<div class="col-md-9">
															<input type="hidden" class="form-control select2_sample3" value="red, blue">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Membership</label>
														<div class="col-md-9">
															<div class="radio-list">
																<label>
																<input type="radio" name="optionsRadios2" value="option1"/>
																Free </label>
																<label>
																<input type="radio" name="optionsRadios2" value="option2" checked/>
																Professional </label>
															</div>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Street</label>
														<div class="col-md-9">
															<input type="text" class="form-control">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">City</label>
														<div class="col-md-9">
															<input type="text" class="form-control">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">State</label>
														<div class="col-md-9">
															<input type="text" class="form-control">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Post Code</label>
														<div class="col-md-9">
															<input type="text" class="form-control">
														</div>
													</div>
													<div class="form-group last">
														<label class="control-label col-md-3">Country</label>
														<div class="col-md-9">
															<select class="form-control">
															</select>
														</div>
													</div>
												</div>
												<div class="form-actions">
													<div class="row">
														<div class="col-md-offset-3 col-md-9">
															<button type="submit" class="btn green"><i class="fa fa-check"></i> Submit</button>
															<button type="button" class="btn default">Cancel</button>
														</div>
													</div>
												</div>
											</form>
											<!-- END FORM-->
										</div>
									</div>
									<div class="portlet light bordered form-fit">
										<div class="portlet-title">
											<div class="caption">
												<i class="icon-user font-blue-hoki"></i>
												<span class="caption-subject font-blue-hoki bold uppercase">Form Sample</span>
												<span class="caption-helper">demo form...</span>
											</div>
											<div class="actions">
												<a class="btn btn-circle btn-icon-only btn-default" href="javascript:;">
												<i class="icon-cloud-upload"></i>
												</a>
												<a class="btn btn-circle btn-icon-only btn-default" href="javascript:;">
												<i class="icon-wrench"></i>
												</a>
												<a class="btn btn-circle btn-icon-only btn-default" href="javascript:;">
												<i class="icon-trash"></i>
												</a>
											</div>
										</div>
										<div class="portlet-body form">
											<!-- BEGIN FORM-->
											<form action="#" class="form-horizontal form-bordered form-label-stripped">
												<div class="form-body">
													<div class="form-group">
														<label class="control-label col-md-3">First Name</label>
														<div class="col-md-9">
															<input type="text" placeholder="small" class="form-control"/>
															<span class="help-block">
															This is inline help </span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Last Name</label>
														<div class="col-md-9">
															<input type="text" placeholder="medium" class="form-control"/>
															<span class="help-block">
															This is inline help </span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Gender</label>
														<div class="col-md-9">
															<select class="form-control">
																<option value="">Male</option>
																<option value="">Female</option>
															</select>
															<span class="help-block">
															Select your gender. </span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Date of Birth</label>
														<div class="col-md-9">
															<input type="text" class="form-control" placeholder="dd/mm/yyyy">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Category</label>
														<div class="col-md-9">
															<select class="form-control select2_category">
																<option value="Category 1">Category 1</option>
																<option value="Category 2">Category 2</option>
																<option value="Category 3">Category 5</option>
																<option value="Category 4">Category 4</option>
															</select>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Multi-Value Select</label>
														<div class="col-md-9">
															<select class="form-control select2_sample1" multiple>
																<optgroup label="NFC EAST">
																<option>Dallas Cowboys</option>
																<option>New York Giants</option>
																<option>Philadelphia Eagles</option>
																<option>Washington Redskins</option>
																</optgroup>
																<optgroup label="NFC NORTH">
																<option>Chicago Bears</option>
																<option>Detroit Lions</option>
																<option>Green Bay Packers</option>
																<option>Minnesota Vikings</option>
																</optgroup>
																<optgroup label="NFC SOUTH">
																<option>Atlanta Falcons</option>
																<option>Carolina Panthers</option>
																<option>New Orleans Saints</option>
																<option>Tampa Bay Buccaneers</option>
																</optgroup>
																<optgroup label="NFC WEST">
																<option>Arizona Cardinals</option>
																<option>St. Louis Rams</option>
																<option>San Francisco 49ers</option>
																<option>Seattle Seahawks</option>
																</optgroup>
																<optgroup label="AFC EAST">
																<option>Buffalo Bills</option>
																<option>Miami Dolphins</option>
																<option>New England Patriots</option>
																<option>New York Jets</option>
																</optgroup>
																<optgroup label="AFC NORTH">
																<option>Baltimore Ravens</option>
																<option>Cincinnati Bengals</option>
																<option>Cleveland Browns</option>
																<option>Pittsburgh Steelers</option>
																</optgroup>
																<optgroup label="AFC SOUTH">
																<option>Houston Texans</option>
																<option>Indianapolis Colts</option>
																<option>Jacksonville Jaguars</option>
																<option>Tennessee Titans</option>
																</optgroup>
																<optgroup label="AFC WEST">
																<option>Denver Broncos</option>
																<option>Kansas City Chiefs</option>
																<option>Oakland Raiders</option>
																<option>San Diego Chargers</option>
																</optgroup>
															</select>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Loading Data</label>
														<div class="col-md-9">
															<input type="hidden" class="form-control select2_sample2">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Tags Support List</label>
														<div class="col-md-9">
															<input type="hidden" class="form-control select2_sample3" value="red, blue">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Membership</label>
														<div class="col-md-9">
															<div class="radio-list">
																<label>
																<input type="radio" name="optionsRadios2" value="option1"/>
																Free </label>
																<label>
																<input type="radio" name="optionsRadios2" value="option2" checked/>
																Professional </label>
															</div>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Street</label>
														<div class="col-md-9">
															<input type="text" class="form-control">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">City</label>
														<div class="col-md-9">
															<input type="text" class="form-control">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">State</label>
														<div class="col-md-9">
															<input type="text" class="form-control">
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">Post Code</label>
														<div class="col-md-9">
															<input type="text" class="form-control">
														</div>
													</div>
													<div class="form-group last">
														<label class="control-label col-md-3">Country</label>
														<div class="col-md-9">
															<select class="form-control">
															</select>
														</div>
													</div>
												</div>
												<div class="form-actions">
													<div class="row">
														<div class="col-md-offset-3 col-md-9">
															<button type="submit" class="btn green"><i class="fa fa-check"></i> Submit</button>
															<button type="button" class="btn default">Cancel</button>
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
					</div>
				</div>
				<!-- END PAGE CONTENT-->
			</div>
		</div>
		<!-- END CONTENT -->
		<!-- BEGIN QUICK SIDEBAR -->
		<!--Cooming Soon...-->
		<!-- END QUICK SIDEBAR -->
	</div>
	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->
		<jsp:include page="page-footer.jsp"></jsp:include>
	<!-- END FOOTER -->
</div>
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="/admin/assets/global/plugins/respond.min.js"></script>
<script src="/admin/assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->
<script src="/admin/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="/admin/assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
<!-- IMPORTANT! Load jquery-ui.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
<script src="/admin/assets/global/plugins/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
<script src="/admin/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="/admin/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="/admin/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="/admin/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="/admin/assets/global/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="/admin/assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="/admin/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="/admin/assets/global/plugins/select2/select2.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="/admin/assets/global/scripts/metronic.js" type="text/javascript"></script>
<script src="/admin/assets/admin/layout2/scripts/layout.js" type="text/javascript"></script>
<script src="/admin/assets/admin/layout2/scripts/demo.js" type="text/javascript"></script>
<script src="/admin/assets/admin/pages/scripts/form-samples.js"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
	jQuery(document).ready(function() {    
   	// initiate layout and plugins
   	Metronic.init(); // init metronic core components
	Layout.init(); // init current layout
	Demo.init(); // init demo features
   	FormSamples.init();
});
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>