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
					Advertiser | Application <small>in easy way</small>
				</h1>
				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><i class="fa fa-home"></i> <a href="${webapp_name}/index">Home</a>
							<i class="fa fa-angle-right"></i></li>
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
								<li><a href="#"><i class="icon-bell"></i> Action</a></li>
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
									<i class=" icon-layers font-green"></i> <span
										class="caption-subject font-green bold uppercase">Quick
										steps - Apply for Advertiser</span>
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
										<div class="col-md-4 bg-grey mt-step-col">
											<div class="mt-step-number bg-white font-grey">1</div>
											<div class="mt-step-title uppercase font-grey-cascade">Agreement</div>
											<div class="mt-step-content font-grey-cascade">Read
												Agreement and Terms</div>
										</div>
										<div class="col-md-4 bg-grey mt-step-col done">
											<div class="mt-step-number bg-white font-grey">2</div>
											<div class="mt-step-title uppercase font-grey-cascade">Quiz</div>
											<div class="mt-step-content font-grey-cascade">Take a
												quiz as a quick tour</div>
										</div>
										<div class="col-md-4 bg-grey mt-step-col">
											<div class="mt-step-number bg-white font-grey">3</div>
											<div class="mt-step-title uppercase font-grey-cascade">Complete</div>
											<div class="mt-step-content font-grey-cascade">Become
												an Adogo Advertiser</div>
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
						<div class="portlet light">
							<div class="portlet-title">
								<div class="caption">
									Quiz for Advertiser <span class="caption-helper"></span>
								</div>
								<div class="actions">
									<a href="${webapp_name}/index" class="btn btn-circle btn-info">
										<span> Home </span>
									</a>
									<div class="btn-group"></div>
								</div>
							</div>
						</div>
					</div>
				</div>


				<div class="row">
                        <div class="col-md-12">
                            <div class="portlet light " id="form_wizard_1">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class=" icon-layers font-red"></i>
                                        <span class="caption-subject font-red bold uppercase"> Form Wizard -
                                            <span class="step-title"> Step 1 of 4 </span>
                                        </span>
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
                                    <form class="form-horizontal" action="#" id="submit_form" method="POST">
                                        <div class="form-wizard">
                                            <div class="form-body">
                                                <ul class="nav nav-pills nav-justified steps">
                                                    <li>
                                                        <a href="#tab1" data-toggle="tab" class="step">
                                                            <span class="number"> 1 </span>
                                                            <span class="desc">
                                                                <i class="fa fa-check"></i> Account Setup </span>
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#tab2" data-toggle="tab" class="step">
                                                            <span class="number"> 2 </span>
                                                            <span class="desc">
                                                                <i class="fa fa-check"></i> Profile Setup </span>
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#tab3" data-toggle="tab" class="step active">
                                                            <span class="number"> 3 </span>
                                                            <span class="desc">
                                                                <i class="fa fa-check"></i> Billing Setup </span>
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#tab4" data-toggle="tab" class="step">
                                                            <span class="number"> 4 </span>
                                                            <span class="desc">
                                                                <i class="fa fa-check"></i> Confirm </span>
                                                        </a>
                                                    </li>
                                                </ul>
                                                <div id="bar" class="progress progress-striped" role="progressbar">
                                                    <div class="progress-bar progress-bar-success"> </div>
                                                </div>
                                                <div class="tab-content">
                                                    <div class="alert alert-danger display-none">
                                                        <button class="close" data-dismiss="alert"></button> You have some form errors. Please check below. </div>
                                                    <div class="alert alert-success display-none">
                                                        <button class="close" data-dismiss="alert"></button> Your form validation is successful! </div>
                                                    
                                                    <div class="tab-pane active" id="tab1">
                                                        <h3 class="block">Provide your account details</h3>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Username
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <input type="text" class="form-control" name="username" />
                                                                <span class="help-block"> Provide your username </span>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Password
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <input type="password" class="form-control" name="password" id="submit_form_password" />
                                                                <span class="help-block"> Provide your password. </span>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Confirm Password
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <input type="password" class="form-control" name="rpassword" />
                                                                <span class="help-block"> Confirm your password </span>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Email
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <input type="text" class="form-control" name="email" />
                                                                <span class="help-block"> Provide your email address </span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="tab-pane" id="tab2">
                                                        <h3 class="block">Provide your profile details</h3>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Fullname
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <input type="text" class="form-control" name="fullname" />
                                                                <span class="help-block"> Provide your fullname </span>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Phone Number
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <input type="text" class="form-control" name="phone" />
                                                                <span class="help-block"> Provide your phone number </span>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Gender
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <div class="radio-list">
                                                                    <label>
                                                                        <input type="radio" name="gender" value="M" data-title="Male" /> Male </label>
                                                                    <label>
                                                                        <input type="radio" name="gender" value="F" data-title="Female" /> Female </label>
                                                                </div>
                                                                <div id="form_gender_error"> </div>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Address
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <input type="text" class="form-control" name="address" />
                                                                <span class="help-block"> Provide your street address </span>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">City/Town
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <input type="text" class="form-control" name="city" />
                                                                <span class="help-block"> Provide your city or town </span>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Country</label>
                                                            <div class="col-md-4">
                                                                <select name="country" id="country_list" class="form-control">
                                                                    <option value=""></option>
                                                                    <option value="CA">Canada</option>
                                                                    <option value="CV">Cape Verde</option>
                                                                    <option value="KY">Cayman Islands</option>
                                                                    <option value="CF">Central African Republic</option>
                                                                    <option value="TD">Chad</option>
                                                                    <option value="CL">Chile</option>
                                                                    <option value="CN">China</option>
                                                                </select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Remarks</label>
                                                            <div class="col-md-4">
                                                                <textarea class="form-control" rows="3" name="remarks"></textarea>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="tab-pane" id="tab3">
                                                        <h3 class="block">Provide your billing and credit card details</h3>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Card Holder Name
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <input type="text" class="form-control" name="card_name" />
                                                                <span class="help-block"> </span>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Card Number
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <input type="text" class="form-control" name="card_number" />
                                                                <span class="help-block"> </span>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">CVC
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <input type="text" placeholder="" class="form-control" name="card_cvc" />
                                                                <span class="help-block"> </span>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Expiration(MM/YYYY)
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <input type="text" placeholder="MM/YYYY" maxlength="7" class="form-control" name="card_expiry_date" />
                                                                <span class="help-block"> e.g 11/2020 </span>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Payment Options
                                                                <span class="required"> * </span>
                                                            </label>
                                                            <div class="col-md-4">
                                                                <div class="checkbox-list">
                                                                    <label>
                                                                        <input type="checkbox" name="payment[]" value="1" data-title="Auto-Pay with this Credit Card." /> Auto-Pay with this Credit Card </label>
                                                                    <label>
                                                                        <input type="checkbox" name="payment[]" value="2" data-title="Email me monthly billing." /> Email me monthly billing </label>
                                                                </div>
                                                                <div id="form_payment_error"> </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="tab-pane" id="tab4">
                                                        <h3 class="block">Confirm your account</h3>
                                                        <h4 class="form-section">Account</h4>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Username:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="username"> </p>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Email:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="email"> </p>
                                                            </div>
                                                        </div>
                                                        <h4 class="form-section">Profile</h4>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Fullname:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="fullname"> </p>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Gender:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="gender"> </p>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Phone:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="phone"> </p>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Address:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="address"> </p>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">City/Town:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="city"> </p>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Country:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="country"> </p>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Remarks:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="remarks"> </p>
                                                            </div>
                                                        </div>
                                                        <h4 class="form-section">Billing</h4>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Card Holder Name:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="card_name"> </p>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Card Number:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="card_number"> </p>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">CVC:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="card_cvc"> </p>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Expiration:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="card_expiry_date"> </p>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label col-md-3">Payment Options:</label>
                                                            <div class="col-md-4">
                                                                <p class="form-control-static" data-display="payment[]"> </p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-actions">
                                                <div class="row">
                                                    <div class="col-md-offset-3 col-md-9">
                                                        <a href="javascript:;" class="btn default button-previous">
                                                            <i class="fa fa-angle-left"></i> Back </a>
                                                        <a href="javascript:;" class="btn btn-outline green button-next"> Continue
                                                            <i class="fa fa-angle-right"></i>
                                                        </a>
                                                        <a href="javascript:;" class="btn green button-submit"> Submit
                                                            <i class="fa fa-check"></i>
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                

				<!-- 
				<div class="row">
					<div class="col-md-12">
						<div class="portlet light ">
							<div class="portlet-title">
								<div class="caption">
									<i class="icon-equalizer font-red-sunglo"></i> <span
										class="caption-subject font-red-sunglo bold uppercase">Quiz</span>
									<span class="caption-helper">become an advertiser</span>
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
								<form action="#" class="form-horizontal">
									<div class="form-body">
										<div id="quiz_knowledge">
										<div class="form-group">
											<label class="col-md-2 control-label">Knowledge 1:</label>
											<div class="col-md-5">
												<label class="control-label"><strong>What is Adogo?</strong></label> <span
													class="help-block"> It is an innovated, evolving web-based presence for everyone to do online branding and marketing which connects life and business.</span>
											</div>
										</div>

										<div class="form-group">
											<label class="col-md-2 control-label">Knowledge 2:</label>
											<div class="col-md-5">
												<label class="control-label">What is Adogo providing?</label> <span class="help-block"> Your legal
													company name or real business name</span>
											</div>
										</div>

										<div class="form-group">
											<label class="col-md-2 control-label">Knowledge 3:</label>
											<div class="col-md-5">
												<label class="control-label">What are the roles of
													Adogo?</label> <span class="help-block"> Your legal company
													name or real business name</span>
											</div>
										</div>

										<div class="form-group">
											<label class="col-md-2 control-label">Knowledge 4:</label>
											<div class="col-md-5">
												<label class="control-label">What benefits can you
													get when being as an Advertiser at Adogo?</label> <span
													class="help-block"> Your legal company name or real
													business name</span>
											</div>
										</div>

										<div class="form-group">
											<label class="col-md-2 control-label">Knowledge 5:</label>
											<div class="col-md-5">
												<label class="control-label">What is the first thing
													you should do right after passing this quiz?</label> <span
													class="help-block"> Your legal company name or real
													business name</span>
											</div>
										</div>

										<div class="form-group">
											<label class="col-md-2 control-label">Knowledge 5:</label>
											<div class="col-md-7">
												<label class="control-label">Is it necessary for you
													to choose a published business under which you may start to
													build up a booth?</label> <span class="help-block"> Your
													legal company name or real business name</span>
											</div>
										</div>

										<div class="form-group">
											<label class="col-md-2 control-label">Knowledge 6:</label>
											<div class="col-md-5">
												<label class="control-label">Is it true that one
													business may contain multiple booths?</label> <span
													class="help-block"> Your legal company name or real
													business name</span>
											</div>
										</div>

										<div class="form-group">
											<label class="col-md-2 control-label">Knowledge 7:</label>
											<div class="col-md-5">
												<label class="control-label">How many booths are
													allowed to set for each language?</label> <span class="help-block">
													Your legal company name or real business name</span>
											</div>
										</div>
										
										<div class="form-group">
											<label class="col-md-2 control-label">Knowledge 8:</label>
											<div class="col-md-5">
												<label class="control-label">What is a booth?</label> <span class="help-block">
													Your legal company name or real business name</span>
											</div>
										</div>
										
										</div>
										
										<div id="quiz_question_1">
											<div class="form-group">
												<label class="col-md-2 control-label">Question 1:</label>
												<div class="col-md-5">
													<label class="control-label">What is Adogo?</label>
													<p>&nbsp;</p>
	                                                <div class="mt-radio-list">
	                                                    <label class="mt-radio mt-radio-outline"> A. It is an e-commerce site like eBay, Amazon, etc.
	                                                        <input type="radio" value="1" name="test" />
	                                                        <span></span>
	                                                    </label>
	                                                    <label class="mt-radio mt-radio-outline"> B. It is a yellow-page-like site.
	                                                        <input type="radio" value="1" name="test" />
	                                                        <span></span>
	                                                    </label>
	                                                    <label class="mt-radio mt-radio-outline"> C. It is an ad-posting-like site.
	                                                        <input type="radio" value="1" name="test" />
	                                                        <span></span>
	                                                    </label>
	                                                    <label class="mt-radio mt-radio-outline"> D. It is an innovated, evolving web-based presence for everyone to do online branding and marketing which connects life and business.
	                                                        <input type="radio" value="1" name="test" />
	                                                        <span></span>
	                                                    </label>
	                                                </div>
												</div>
											</div>
										</div>
										
										<div id="quiz_question_2">
											<div class="form-group">
												<label class="col-md-2 control-label">Question 2:</label>
												<div class="col-md-5">
													<label class="control-label">What outstanding features make Adogo so different from other advertising website?</label>
													<p>&nbsp;</p>
	                                                <div class="mt-radio-list">
	                                                    <label class="mt-radio mt-radio-outline"> A. The Virtual Booth functioning as a micro-website conveys your CI (company image) to public.
	                                                        <input type="radio" value="1" name="test" />
	                                                        <span></span>
	                                                    </label>
	                                                    <label class="mt-radio mt-radio-outline"> B. The Ad Post shown in one-page style makes it possible to express in various measures.
	                                                        <input type="radio" value="1" name="test" />
	                                                        <span></span>
	                                                    </label>
	                                                    <label class="mt-radio mt-radio-outline"> C. 
	                                                        <input type="radio" value="1" name="test" />
	                                                        <span></span>
	                                                    </label>
	                                                    <label class="mt-radio mt-radio-outline"> D. All of above
	                                                        <input type="radio" value="1" name="test" />
	                                                        <span></span>
	                                                    </label>
	                                                </div>
												</div>
											</div>
										</div>
										
										<div id="quiz_question_3">
											<div class="form-group">
												<label class="col-md-2 control-label">Question 3:</label>
												<div class="col-md-5">
													<label class="control-label">What is Adogo?</label>
													<p>&nbsp;</p>
	                                                <div class="mt-radio-list">
	                                                    <label class="mt-radio mt-radio-outline"> Radio 1
	                                                        <input type="radio" value="1" name="test" />
	                                                        <span></span>
	                                                    </label>
	                                                    <label class="mt-radio mt-radio-outline"> Radio 2
	                                                        <input type="radio" value="1" name="test" />
	                                                        <span></span>
	                                                    </label>
	                                                    <label class="mt-radio mt-radio-outline"> Radio 3
	                                                        <input type="radio" value="1" name="test" />
	                                                        <span></span>
	                                                    </label>
	                                                </div>
												</div>
											</div>
										</div>
										
										
									</div>
									<div class="form-actions">
										<div class="row">
											<div class="col-md-offset-3 col-md-4" id="form_action_last">
												<button type="submit" class="btn green" id="btn_submit"
													onclick="return false;">Submit</button>
												<button type="button" class="btn default" id="btn_cancel"
													onclick=";return false;">Cancel</button>
											</div>
											<div class="col-md-offset-3 col-md-4" id="form_action">
												<button type="submit" class="btn green" id="btn_prev"
													onclick="prevPage();">Previous</button>
												<button type="submit" class="btn green" id="btn_next"
													onclick="nextPage();">Next</button>
											</div>
										</div>
									</div>
								</form>
								
								
								
							</div>
						</div>

					</div>
				</div>


			</div>
				 -->			
		<!-- END CONTENT BODY -->
		</div>
		<!-- END CONTENT -->
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
	<script src="${webapp_name}/assets/global/plugins/jquery.min.js"
		type="text/javascript"></script>
	<script
		src="${webapp_name}/assets/global/plugins/bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="${webapp_name}/assets/global/plugins/js.cookie.min.js"
		type="text/javascript"></script>
	<script
		src="${webapp_name}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
		type="text/javascript"></script>
	<script
		src="${webapp_name}/assets/global/plugins/jquery.blockui.min.js"
		type="text/javascript"></script>
	<script
		src="${webapp_name}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"
		type="text/javascript"></script>
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script
		src="${webapp_name}/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js"
		type="text/javascript"></script>
	<script
		src="${webapp_name}/assets/global/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js"
		type="text/javascript"></script>
	<script
		src="${webapp_name}/assets/global/plugins/fancybox/source/jquery.fancybox.pack.js"
		type="text/javascript"></script>
	<!-- 
	<script
		src="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.min.js"
		type="text/javascript"></script> -->
	<script
		src="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.js"
		type="text/javascript"></script>
	<script
		src="${webapp_name}/assets/global/plugins/typeahead/handlebars.min.js"
		type="text/javascript"></script>
	<script
		src="${webapp_name}/assets/global/plugins/typeahead/typeahead.bundle.min.js"
		type="text/javascript"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN THEME GLOBAL SCRIPTS -->
	<!-- <script src="${webapp_name}/assets/global/scripts/app.min.js" type="text/javascript"></script> -->
	<script type="text/javascript" src="${webapp_name}/assets/global/scripts/app.js"></script>
	<!-- END THEME GLOBAL SCRIPTS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<!-- <script type="text/javascript" src="${webapp_name}/assets/pages/scripts/components-bootstrap-tagsinput.min.js"></script> -->
	
	<!-- END PAGE LEVEL SCRIPTS -->
	<!-- BEGIN THEME LAYOUT SCRIPTS -->
	<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js"></script>
	<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js"></script>

	<!-- END THEME LAYOUT SCRIPTS -->
	<script type="text/javascript" src="${webapp_name}/assets/global/plugins/select2/js/select2.full.min.js"></script>
	<script type="text/javascript" src="${webapp_name}/assets/pages/scripts/form-wizard.js"></script>
	<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery-validation/js/jquery.validate.min.js"></script>
    <script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery-validation/js/additional-methods.min.js"></script>
    <script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-wizard/jquery.bootstrap.wizard.min.js"></script>
	<script>
	 	
		var currentPage = 0;
		var maxPage = 3;
		
		function nextPage(){
			$("#quiz_knowledge").hide();
			
			if(currentPage >= maxPage){
				$("#form_action_last").show();
				$("#form_action").hide();
				currentPage = maxPage;
			}else{	
				
				$("#quiz_question_"+currentPage).hide();
				currentPage = currentPage+1;
				if(currentPage > 0){
					$("#btn_prev").show();
				}
				$("#quiz_question_"+currentPage).show(1000);
			}
			
		}
		
		function prevPage(){
			if(currentPage<=0){
				$("#quiz_knowledge").show();
				$("#btn_prev").hide();
				currentPage = 0;
			}else{
				
				$("#btn_prev").show();
				
				if(currentPage == 1){
					$("#quiz_question_"+currentPage).hide();
					currentPage = currentPage-1;
					$("#quiz_knowledge").show();
					$("#btn_prev").hide();
								
				}else{
					$("#quiz_question_"+currentPage).hide();
					currentPage = currentPage-1;
					$("#quiz_question_"+currentPage).show(1000);
				}
				
			}
		}
		
		$(document).ready(function(){
			$("#form_action_last").hide();
			$("#btn_prev").hide();
			$("#quiz_question_1").hide();
			$("#quiz_question_2").hide();
			$("#quiz_question_3").hide();
		});
	</script>
</body>
</html>