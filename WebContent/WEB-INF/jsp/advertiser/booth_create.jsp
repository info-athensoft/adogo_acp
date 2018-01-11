<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- global variables settings -->
<c:set var="webapp_name" value="/acp"/>
<!-- END global variables settings -->

<!-- page variables  -->
<c:set var="inc_dir" value="../inc"/>
<!-- END page variables -->

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<title>Adogo | Booth - Create</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8"/>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<meta name="description" content=""/>
<meta name="author" content="Informatique Athensoft"/>

<link rel="shortcut icon" href="${webapp_name}/assets/athensoft/ico/favicon.ico"/>
      
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" />
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/font-awesome/css/font-awesome.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/simple-line-icons/simple-line-icons.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css"/>
<!-- END GLOBAL MANDATORY STYLES -->

<!-- BEGIN PAGE LEVEL PLUGINS -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/datatables/datatables.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/fancybox/source/jquery.fancybox.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-fileinput/bootstrap-fileinput.css"/>
<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN THEME GLOBAL STYLES -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/css/components.min.css" id="style_components"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/css/plugins.min.css"/>
<!-- END THEME GLOBAL STYLES -->

<!-- BEGIN THEME LAYOUT STYLES -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/layout.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/themes/blue.min.css" id="style_color" />
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/custom.min.css"/>
<!-- END THEME LAYOUT STYLES -->
</head>

<body class="page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid">
    <!-- HEADER -->
    <div class="page-header navbar navbar-fixed-top">
        <!-- HEADER INNER -->
        <div class="page-header-inner ">
            <!-- LOGO -->
            <jsp:include page="${inc_dir}/page-logo.jsp"></jsp:include>
            <!-- BEGIN RESPONSIVE MENU TOGGLER -->
            <a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"> </a>
            <!-- BEGIN PAGE ACTIONS -->
            <jsp:include page="${inc_dir}/page-action.jsp"></jsp:include>
            <!-- BEGIN PAGE TOP -->
            <jsp:include page="${inc_dir}/page-top.jsp"></jsp:include>
        </div>
        <!-- END HEADER INNER -->
    </div>
    <!-- END HEADER -->
    <div class="clearfix"> </div>
    
    <!-- CONTAINER -->
    <div class="page-container">
        <!-- SIDEBAR -->
        <jsp:include page="${inc_dir}/page-sidebar.jsp"></jsp:include>
        <!-- END SIDEBAR -->
        
		<!-- CONTENT -->
        <div class="page-content-wrapper">
        <!-- CONTENT BODY -->
        <div class="page-content">
            <!-- PAGE HEADER-->
            <h1 class="page-title"> Advertiser | Booth <small>create a booth</small></h1>
            <div class="page-bar">
                <ul class="page-breadcrumb">
                	<li><i class="icon-home"></i><a href="${webapp_name}/">Home</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/advertiser/">Advertiser</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/advertiser/booth/">Booth</a><i class="fa fa-angle-right"></i></li>
                    <li><span>Create a Booth</span></li>
				</ul>
                <div class="page-toolbar">
	                <div class="btn-group pull-right">
	                    <button type="button" class="btn btn-fit-height grey-salt dropdown-toggle" 
	                     		data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true"> 
	                     		Quick Links <i class="fa fa-angle-down"></i>
	                    </button>
	                    <ul class="dropdown-menu pull-right" role="menu">
	                        <li><a href="${webapp_name}/advertiser/"><i class="icon-bag"></i> Advertiser Dashboard</a></li>
	                        <li><a href="${webapp_name}/advertiser/biz/"><i class="icon-bell"></i> Goto Business</a></li>
	                        <li><a href="${webapp_name}/advertiser/booth/"><i class="icon-shield"></i> Goto Booths</a></li>
	                        <li><a href="${webapp_name}/advertiser/adpost/"><i class="icon-user"></i> Goto Ad Post</a></li>
	                        <li class="divider"> </li>
	                        <li><a href="#"><i class="icon-bag"></i> Export Report</a></li>
	                    </ul>
	               	</div>
              	</div>
            </div>
            <!-- END PAGE HEADER-->
            
            <!-- ROW 1-->        
            <div class="row">
                <div class="col-md-12">
                    <div class="portlet light portlet-fit ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class=" icon-layers font-green"></i>
                                <span class="caption-subject font-green bold uppercase">Quick steps - Create a booth</span>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="mt-element-step">
                                <div class="row step-thin">
                                    <div class="col-md-4 bg-grey mt-step-col">
                                        <div class="mt-step-number bg-white font-grey">1</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Choose Business</div>
                                        <div class="mt-step-content font-grey-cascade">Choose a business for booths</div>
                                    </div>
                                    <div class="col-md-4 bg-grey mt-step-col done">
                                        <div class="mt-step-number bg-white font-grey">2</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Create Booth</div>
                                        <div class="mt-step-content font-grey-cascade">Input booth details</div>
                                    </div>
                                    <div class="col-md-4 bg-grey mt-step-col">
                                        <div class="mt-step-number bg-white font-grey">3</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Publish Booth</div>
                                        <div class="mt-step-content font-grey-cascade">Activate and publish</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                     </div>
                </div>
            </div>
			<!-- END ROW 1-->
			
			<!-- ROW DATA -->
			<input type="hidden" id="bizId" value="${bizProfile.bizId}"/>
			<input type="hidden" id="advertiserId" value="${bizProfile.advertiserId}"/>
			<!-- END ROW DATA -->
			
			<!-- ROW 2 -->
            <div class="row">
                <div class="col-md-12">
                    <div class="portlet light">
                        <div class="portlet-title">
                            <div class="caption">
                                Create a booth <span class="caption-helper"> under ${bizProfile.bizName} </span>
                            </div>
                            <div class="actions">
                                <a href="createBooth(); return false;" class="btn btn-circle btn-info">
                                    <span> Save and Create </span>
                                </a>
                                <div class="btn-group">
                                </div>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="row">
                    			<span class="col-md-3 bold"> Adogo Advertiser ID: </span>
                    			<span class="col-md-6">${bizProfile.advertiserId}</span>
                   			</div>
                            <div class="row">
                    			<span class="col-md-3 bold"> Adogo Business ID: </span>
                    			<span class="col-md-6">${bizProfile.bizId}</span>
                   			</div>
                   			<div class="row">
                    			<span class="col-md-3 bold"> Business Name: </span>
                    			<span class="col-md-6">${bizProfile.bizName}</span>
                   			</div>
                   			<div class="row">
                    			<span class="col-md-3 bold"> Industry Code: </span>
                    			<span class="col-md-6">${bizProfile.industryCode} : ${bizProfile.industryName}</span>
                   			</div>
                   			<div class="row">
                    			<span class="col-md-3 bold"> Business Description: </span>
                    			<span class="col-md-6">${bizProfile.bizDesc}</span>
                   			</div>
                   			
                   			<div class="row">
                    			<span class="col-md-3 bold"> Business Profile Status: </span>
                    			<c:choose>
									<c:when test = "${bizProfile.bizStatus == 1}">
										<span class="caption-helper col-md-6"><a class="btn btn-xs yellow">CREATED</a></span>
									</c:when>
							    	<c:when test = "${bizProfile.bizStatus == 2}">
							        	<span class="caption-helper col-md-6"><a class="btn btn-xs green-jungle">PUBLISHED</a></span>
							    	</c:when>
							    	<c:when test = "${bizProfile.bizStatus == 3}">
							            <span class="caption-helper col-md-6"><a class="btn btn-xs grey">DISABLED</a></span>
							    	</c:when>
							     	<c:when test = "${bizProfile.bizStatus == 4}">
							            <span class="caption-helper col-md-6"><a class="btn btn-xs red">TRASHED</a></span>
							    	</c:when>
							    	<c:when test = "${bizProfile.bizStatus == 5}">
							            <span class="caption-helper col-md-6"><a class="btn btn-xs purple">SUSPENDED</a></span>
							    	</c:when>
							   		<c:when test = "${bizProfile.bizStatus == 6}">
							        	<span class="caption-helper col-md-6"><a class="btn btn-xs red">BANNED</a></span>
							    	</c:when>
							    	<c:otherwise>
							            <span class="caption-helper col-md-6"><a class="btn btn-xs grey">UNKNOWN</a></span>
							     	</c:otherwise>
							    </c:choose>
                   			</div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END ROW 2-->
            
            <!-- ROW DATA -->
            <input type="hidden" id="userId" value="${sessionScope.userId}">
            <input type="hidden" id="advertiserId" value="${sessionScope.advertiserId}">
            <input type="hidden" id="bizId" value="${bizProfile.bizId}">
            <input type="hidden" id="bizName" value="${bizProfile.bizName}">
            <!-- END ROW DATA -->
            
            <!-- ROW 3 -->      
            <div class="row">
                <div class="col-md-8">
                	<!-- BOOTH PROFILE -->
                    <div class="portlet light">
                    	<div class="portlet-title">
                            <div class="caption font-red-sunglo">
                                <i class="icon-settings"></i>
                                <span class="caption-subject sbold uppercase">Booth Basic Info.</span>
                            </div>
                            <div class="actions">
                                <a class="btn btn-success" onclick="createBooth(); return false;">
                                    <i class="fa fa-check"></i> Quick Save</a>
                                <div class="btn-group">
	                                <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
	                                    <i class="fa fa-angle-down"></i>
	                                </a>
	                                <ul class="dropdown-menu pull-right">
	                                    <li>
	                                        <a href="javascript:;">
	                                            <i class="fa fa-pencil"></i> Edit </a>
	                                    </li>
	                                    <li>
	                                        <a href="javascript:;">
	                                            <i class="fa fa-trash-o"></i> Delete </a>
	                                    </li>
	                                    <li>
	                                        <a href="javascript:;">
	                                            <i class="fa fa-ban"></i> Ban </a>
	                                    </li>
	                                    <li class="divider"> </li>
	                                    <li>
	                                        <a href="javascript:;"> Make admin </a>
	                                    </li>
	                                </ul>
	                            </div>
                            </div>
                        </div>
                    	<div class="portlet-body form">
                            <div class="form-horizontal" role="form">
                                <div class="form-body">
                                            
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">Language</label>
                                        <div class="col-md-9">
                                            <select id="langNo" class="form-control" onchange="chooseLanguage();return false;">
                                            	<option value="0" selected="selected">--- Choose a language for the booth ---</option>
                                            	<option value="1033">English</option>
                                            	<option value="3084">French</option>
                                            	<option value="2052">Chinese (Simplified)</option>
                                            </select>
                                        </div>
                                    </div>
                                            
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">Booth Name</label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" placeholder="Enter text" id="langBoothName">
                                            <span class="help-inline" id="msgLangBoothName"></span>
                                        </div>
                                    </div>
                                            
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">Booth Category</label>
                                        <div class="col-md-6">
                                            <input type="text" class="form-control" placeholder="Choose" id="categoryNo">
                                        </div>
                                        <div class="col-md-3">
                                            <a class="btn btn-success" onclick="showCategoryList();return false;" id="boothCategoryChooser"> Choose </a>
                                        </div>
                                    </div>
                                            
                                    <div class="form-group" id="boothCategoryDiv">
                                        <label class="col-md-3 control-label"></label>
                                        <div class="col-md-9" id="boothCategoryList"></div>
                                    </div>
                                                                                        
                                    
                              </div>
                            </div>
                        </div>
                    </div>
                    <!-- END BOOTH PROFILE -->
                    
                    <!-- BOOTH COVER -->
                    <div class="portlet light">
                    	<div class="portlet-title">
                            <div class="caption font-red-sunglo">
                                <i class="icon-settings"></i>
                                <span class="caption-subject sbold uppercase">Booth Cover Image</span>
                            </div>
                    	</div>
                    	<div class="portlet-body form">
                            <div class="form-horizontal" role="form">
                                <div class="form-body" id="div_boothCover">
                                	<div class="row">
	                                	<div class="col-md-5">
			                       			<div class="fileinput fileinput-new" data-provides="fileinput">
			                                    <div class="fileinput-new thumbnail" style="width: 200px; height: 150px;">
			                                       	<!--  <img id="fileinput-new-img" src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image" alt=""/> -->
			                                       	<img id="fileinput-new-img" src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image" alt=""/>
												</div>
			                                    <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;">
												</div>
			                                    <div>
			                                        <span class="btn btn-sm default btn-file">
			                                        	<span class="fileinput-new btn-sm"> Select image </span>
			                                        	<span class="fileinput-exists btn-sm"> Change </span>
			                                        	<input type="file" id="ufile" name="...">
													</span>
			                                        <a href="javascript:;" class="btn btn-sm red fileinput-exists" data-dismiss="fileinput"> Remove </a>
			                                        <a href="javascript:;" class="btn btn-sm green fileinput-exists" data-dismiss="fileinput" onclick=" clickUpload('${bizProfile.advertiserId}','${bizProfile.bizId}')"> Upload </a>
			                                    </div>
			                                </div>
			                                
	                       				</div>
                       					<div class="col-md-7">
			                    		  	<div class="form-group">
			                              		<div class="col-md-12">
			                                  		<input type="text" id="adPost-cover-img-title" class="form-control" placeholder="Image Title">
			                              		</div>
			                              	</div>
			                            
			                             	<div class="form-group">
			                                	<div class="col-md-12">
			                                    	<input type="text" id="booth-cover-img-url" class="form-control" placeholder="Image URL" disabled="disabled">
			                                    	
			                                	</div>
			                            	</div>
			                            	<div class="form-group">
			                                	<div class="col-md-12">
			                                    	<span class="label label-danger">NOTE!</span> Image dimension must be in ratio of 4:3 at least by 400 x 300
			                                	</div>
			                            	</div> 
			                      		</div>
                       				</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- END BOOTH COVER -->
                    
                    <!-- BOOTH BANNER --> 		
                    <div class="portlet light">
                    	<div class="portlet-title">
                            <div class="caption font-red-sunglo">
                                <i class="icon-settings"></i>
                                <span class="caption-subject sbold uppercase">Booth Banner Image</span>
                            </div>
                            <div class="actions">
                                <div class="btn-group">
                                    <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
                                        <i class="fa fa-angle-down"></i>
                                    </a>
                                    <ul class="dropdown-menu pull-right">
                                        <li>
                                            <a href="javascript:;">
                                                <i class="fa fa-pencil"></i> Edit </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">
                                                <i class="fa fa-trash-o"></i> Delete </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">
                                                <i class="fa fa-ban"></i> Ban </a>
                                        </li>
                                        <li class="divider"> </li>
                                        <li>
                                            <a href="javascript:;"> Make admin </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    	<div class="portlet-body form">
                            <div class="form-horizontal" role="form">
                                <div class="form-body" id="div_boothBanner">
                                    <div class="row">
	                                	<div class="col-md-5">
			                       			<div class="fileinput fileinput-new" data-provides="fileinput">
			                                    <div class="fileinput-new thumbnail" style="width: 200px; height: 150px;">
			                                       	<!--  <img id="fileinput-new-img" src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image" alt=""/> -->
			                                       	<img id="fileinput-new-img_boothBanner" src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image" alt=""/>
												</div>
			                                    <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;">
												</div>
			                                    <div>
			                                        <span class="btn btn-sm default btn-file">
			                                        	<span class="fileinput-new btn-sm"> Select image </span>
			                                        	<span class="fileinput-exists btn-sm"> Change </span>
			                                        	<input type="file" id="ufile_boothBanner" name="...">
													</span>
			                                        <a href="javascript:;" class="btn btn-sm red fileinput-exists" data-dismiss="fileinput"> Remove </a>
			                                        <a href="javascript:;" class="btn btn-sm green fileinput-exists" data-dismiss="fileinput" onclick=" clickUploadBoothBanner('${bizProfile.advertiserId}','${bizProfile.bizId}')"> Upload </a>
			                                    </div>
			                                </div>
			                                
	                       				</div>
                       					<div class="col-md-7">
			                    		  	<div class="form-group">
			                              		<div class="col-md-12">
			                                  		<input type="text" id="booth-banner-img-title" class="form-control" placeholder="Image Title">
			                              		</div>
			                              	</div>
			                            
			                             	<div class="form-group">
			                                	<div class="col-md-12">
			                                    	<input type="text" id="booth-banner-img-url" class="form-control" placeholder="Image URL" disabled="disabled">
			                                	</div>
			                            	</div>
			                            	<div class="form-group">
			                                	<div class="col-md-12">
			                                    	<span class="label label-danger">NOTE!</span> Image dimension must be in ratio of 4:3 at least by 900 x 400
			                                	</div>
			                            	</div> 
			                      		</div>
                       				</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- END BOOTH BANNER -->
                    
                    <!-- BOOTH TEXT CONTENT -->	
                    <div class="portlet light">
                    	<div class="portlet-title">
                            <div class="caption font-red-sunglo">
                                <i class="icon-settings"></i>
                                <span class="caption-subject sbold uppercase">Booth Introduction</span>
                            </div>
                            <div class="actions">
                                <div class="btn-group">
                                    <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
                                        <i class="fa fa-angle-down"></i>
                                    </a>
                                    <ul class="dropdown-menu pull-right">
                                        <li>
                                            <a href="javascript:;">
                                                <i class="fa fa-pencil"></i> Edit </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">
                                                <i class="fa fa-trash-o"></i> Delete </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">
                                                <i class="fa fa-ban"></i> Ban </a>
                                        </li>
                                        <li class="divider"> </li>
                                        <li>
                                            <a href="javascript:;"> Make admin </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    	<div class="portlet-body form">
                            <div class="form-horizontal" role="form">
                                <div class="form-body">
                                	<div class="form-group">
                                        <label class="col-md-3 control-label">Booth Description</label>
                                        <div class="col-md-9">
                                            <textarea class="form-control" rows="4" id="langBizDesc" placeholder="usually put your business description here and should be in the chosen language"></textarea>
                                            <span class="help-inline" id="msgLangBizDesc1"></span>
                                        </div>
                                    </div>
                                
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">Text Title 1</label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" id="textTitle1" placeholder="write the title here"/>
                                            <span class="help-inline"> </span>
                                        </div>
                                        <label class="col-md-3 control-label">Text Content 1</label>
                                        <div class="col-md-9">
                                            <textarea class="form-control" rows="3" id="text1" placeholder="please input brief introduction to your company or yourself here"></textarea>
                                            <span class="help-inline" id="msgLangBizDesc2"></span>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">Text Title 2</label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" id="textTitle2" placeholder="write the title here"/>
                                            <span class="help-inline"> </span>
                                        </div>
                                        <label class="col-md-3 control-label">Text Content 2</label>
                                        <div class="col-md-9">
                                            <textarea class="form-control" rows="3" id="text2" placeholder="please briefly list your services or products your company is providing here"></textarea>
                                            <span class="help-inline" id="msgLangBizDesc3"></span>
                                        </div>
                                    </div>
                                     
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">Text Title 3</label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" id="textTitle3" placeholder="write the title here"/>
                                            <span class="help-inline"> </span>
                                        </div>
                                        <label class="col-md-3 control-label">Text Content 3</label>
                                        <div class="col-md-9">
                                            <textarea class="form-control" rows="3" id="text3" placeholder="please briefly list your strong points to other similar businesses here"></textarea>
                                            <span class="help-inline" id="msgLangBizDesc4"></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- END BOOTH TEXT CONTENT -->
                    
                    <!-- BOOTH CONTACT -->
            		<div class="portlet light">
            			<div class="portlet-title">
	                         <div class="caption">
	                             <i class="icon-equalizer font-red-sunglo"></i>
	                             <span class="caption-subject font-red-sunglo bold uppercase">Contact Information</span>
	                             <span class="caption-helper"></span>
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
	                        <div class="form-horizontal">
	                            <div class="form-body">
	                               	<div class="form-group">
	                                    <label class="col-md-3 control-label">Head Office Address</label>
	                                    <div class="col-md-9">
                                        	<div class="row">
                                        		<div class="col-md-3">
                                        			<input type="text" class="form-control" placeholder="Street no." id="streetNo" value="${hqAddress.streetNo}">
                                        		</div>
                                        		<div class="col-md-4">
                                        			<select class="form-control" id="streetType">
                                              			<option value="21">Rue</option>
                                              			<option value="22">Avenue/Av.</option>
                                              			<option value="23">Boulevard/Blvd.</option>
                                              			<option value="11">St.</option>
                                            		</select>
                                        		</div>
                                        		<div class="col-md-5">
                                        			<input type="text" class="form-control" placeholder="Street name" id="streetName" value="${hqAddress.streetName}">
                                        		</div>
                                        	</div>
                                        	<p></p>
                                        	<div class="row">
                                        		<div class="col-md-3">
                               						<select class="form-control" id="portType">
                                       					<option value="1">Port</option>
                                       					<option value="2">Suite</option>
                                       					<option value="3">Apt</option>
                                       					<option value="4">App</option>
                                   					</select>
                               					</div>
                                        		<div class="col-md-3">
                                        			<input type="text" class="form-control" placeholder="Port no." id="portNo" value="${hqAddress.portNo}">
                                        		</div>
                                        	</div>
                                        	<p></p>
                                        	<div class="row">
                                        		<div class="col-md-4">
                                        			<input type="text" class="form-control" placeholder="City" id="cityName"  value="${hqAddress.cityName}">
                                        		</div>
                                        		<div class="col-md-4">
                                        			<input type="text" class="form-control" placeholder="Province" id="provName"  value="${hqAddress.provName}">
                                        		</div>
                                        		<div class="col-md-4">
                                        			<input type="text" class="form-control" placeholder="Postal code" id="postalCode" value="${hqAddress.postalCode}">
                                        		</div>
                                        	</div>
                                         </div>
	                                </div>
	                                            
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">Phone no.</label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" placeholder="Phone no." id="bizPhone" value="${bizProfile.bizPhone}">
                                        </div>
	                                </div>
	                                            
	                                <div class="form-group">
                                    	<label class="col-md-3 control-label">Fax no.</label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" placeholder="Fax no." id="bizFax" value="${bizProfile.bizFax}">
                                        </div>
                                    </div>
	                                            
	                                <div class="form-group">
				                        <label class="col-md-3 control-label">Email</label>
	                                    <div class="col-md-9">
	                                    	<input type="text" class="form-control" placeholder="email" id="bizEmail" value="${bizProfile.bizEmail}">
	                                    </div>
				                    </div>
	                                            
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">Website</label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" placeholder="URL of your website or home page" id="bizWebsite" value="${bizProfile.bizWebsite}">
                                        </div>
                                    </div>
                                </div> 
	                            
	                        </div>
	                    </div>
            		</div>
            		<!-- END BOOTH CONTACT -->
                    
                    <!-- BUSINESS HOURS -->
                    <div class="portlet light">
                    			<div class="portlet-title">
                                    <div class="caption font-red-sunglo">
                                        <i class="icon-settings"></i>
                                        <span class="caption-subject sbold uppercase">Opening hours</span>
                                    </div>
                                    <div class="actions">
                                    	<button class="btn btn-success" onclick="saveBusinessHours(); return false;">
                                                <i class="fa fa-check"></i> Quick Save</button>
                                        <div class="btn-group">
                                            <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
                                                <i class="fa fa-angle-down"></i>
                                            </a>
                                            <ul class="dropdown-menu pull-right">
                                                <li>
                                                    <a href="javascript:;" onclick="saveBusinessHours(); return false;" >
                                                        <i class="fa fa-pencil"></i> Save this section </a>
                                                </li>
                                                <li>
                                                    <a href="javascript:;">
                                                        <i class="fa fa-trash-o"></i> Delete </a>
                                                </li>
                                                <li>
                                                    <a href="javascript:;">
                                                        <i class="fa fa-ban"></i> Ban </a>
                                                </li>
                                                <li class="divider"> </li>
                                                <li>
                                                    <a href="javascript:;"> Make admin </a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                    			<div class="portlet-body form">
                                    <div class="form-horizontal" role="form">
                                        <div class="form-body" id="blockui_buz_hrs_id">
                                        	
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Monday</label>
                                                <div class="col-md-4">
                                                    <input id="day1_start_time" type="text" class="form-control" placeholder="start time" value="9:00">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day1_end_time" type="text" class="form-control" placeholder="end time" value="17:00">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Tuesday</label>
                                                <div class="col-md-4">
                                                    <input id="day2_start_time" type="text" class="form-control" placeholder="start time"  value="9:00">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day2_end_time" type="text" class="form-control" placeholder="end time" value="17:00">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Wednesday</label>
                                                <div class="col-md-4">
                                                    <input id="day3_start_time" type="text" class="form-control" placeholder="start time" value="9:00">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day3_end_time" type="text" class="form-control" placeholder="end time" value="17:00">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Thursday</label>
                                                <div class="col-md-4">
                                                    <input id="day4_start_time" type="text" class="form-control" placeholder="start time"  value="9:00">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day4_end_time" type="text" class="form-control" placeholder="end time" value="17:00">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Friday</label>
                                                <div class="col-md-4">
                                                    <input id="day5_start_time" type="text" class="form-control" placeholder="start time" value="9:00">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day5_end_time" type="text" class="form-control" placeholder="end time" value="17:00">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Saturday</label>
                                                <div class="col-md-4">
                                                    <input id="day6_start_time" type="text" class="form-control" placeholder="start time" value="closed">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day6_end_time" type="text" class="form-control" placeholder="end time" value="closed">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Sunday</label>
                                                <div class="col-md-4">
                                                    <input id="day7_start_time" type="text" class="form-control" placeholder="start time" value="closed">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day7_end_time" type="text" class="form-control" placeholder="end time" value="closed">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Announcement</label>
                                                <div class="col-md-9">
                                                    <textarea id="comment" class="form-control" rows="2" placeholder="please input your announcement or reminding information about opening hours or special schedule of holidays for your clients"></textarea>
                                                    <p>
                                                    	<br/>
                                                    	<span class="label label-danger">NOTE!</span> You may input 12/24 hour style or CLOSE into each field, i.e. 10:00 am, 18h, CLOSE, etc.
                                                    </p>
                                                </div>
                                            </div>
                                            
                                        </div>
                                    	<div class="form-actions">
			                                <div class="row">
			                                    <div class="col-md-offset-3 col-md-7">
			                                        <a class="btn green" onclick="createBooth(); return false;">Save and Create</a>
			                                        <a class="btn default" onclick="cancelCreateBooth(); return false;">Cancel</a>
			                                    </div>
			                                </div>
		                            	</div>
                                    </div>
                                </div>
                    		</div>
                    <!-- END BUSINESS HOURS -->
                    
                    <!--
                    <div class="portlet light">
                    	<div class="portlet-title">
                            <div class="caption font-red-sunglo">
                                <i class="icon-settings"></i>
                                <span class="caption-subject sbold uppercase">Video Content</span>
                            </div>
                            <div class="actions">
                                <div class="btn-group">
                                      <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
                                          <i class="fa fa-angle-down"></i>
                                      </a>
                                      <ul class="dropdown-menu pull-right">
                                          <li>
                                              <a href="javascript:;">
                                                  <i class="fa fa-pencil"></i> Edit </a>
                                          </li>
                                          <li>
                                              <a href="javascript:;">
                                                  <i class="fa fa-trash-o"></i> Delete </a>
                                          </li>
                                          <li>
                                              <a href="javascript:;">
                                                  <i class="fa fa-ban"></i> Ban </a>
                                          </li>
                                          <li class="divider"> </li>
                                          <li>
                                              <a href="javascript:;"> Make admin </a>
                                          </li>
                                      </ul>
                                  </div>
                            </div>
                        </div>
                    	<div class="portlet-body form">
                            <div class="form-horizontal" role="form">
                                <div class="form-body">
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">Title</label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" placeholder="Enter text">
                                        </div>
                                    </div>
                                            
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">URL</label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" placeholder="Enter text">
                                        </div>
                                    </div>
                                        	
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">Short Description</label>
                                        <div class="col-md-9">
                                            <textarea class="form-control" rows="2"></textarea>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                     -->
                    
                    <!--  		
                    <div class="portlet light">
                    	<div class="portlet-title">
                            <div class="caption font-red-sunglo">
                                <i class="icon-settings"></i>
                                <span class="caption-subject sbold uppercase">Audio Content</span>
                            </div>
                            <div class="actions">
                                <div class="btn-group">
                                    <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
                                        <i class="fa fa-angle-down"></i>
                                    </a>
                                    <ul class="dropdown-menu pull-right">
                                        <li>
                                            <a href="javascript:;">
                                                <i class="fa fa-pencil"></i> Edit </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">
                                                <i class="fa fa-trash-o"></i> Delete </a>
                                        </li>
                                        <li>
                                            <a href="javascript:;">
                                                <i class="fa fa-ban"></i> Ban </a>
                                        </li>
                                        <li class="divider"> </li>
                                        <li>
                                            <a href="javascript:;"> Make admin </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    	<div class="portlet-body form">
                            <div class="form-horizontal" role="form">
                                 <div class="form-body">
                                     <div class="form-group">
                                         <label class="col-md-3 control-label">Title</label>
                                         <div class="col-md-9">
                                             <input type="text" class="form-control" placeholder="Enter text">
                                         </div>
                                     </div>
                                            
                                     <div class="form-group">
                                         <label class="col-md-3 control-label">URL</label>
                                         <div class="col-md-9">
                                             <input type="text" class="form-control" placeholder="Enter text">
                                         </div>
                                     </div>
                                        	
                                     <div class="form-group">
                                         <label class="col-md-3 control-label">Short Description</label>
                                         <div class="col-md-9">
                                             <textarea class="form-control" rows="2"></textarea>
                                         </div>
                                     </div>
                                </div>
                            </div>
                        </div>
                    </div>
            		-->
            	</div>
            	
            </div>
        	<!-- END ROW 3-->
        </div>
        <!-- END CONTENT BODY -->
        </div>
        <!-- END CONTENT -->
    </div>
    <!-- END CONTAINER -->
    
    <!-- FOOTER -->
    <jsp:include page="${inc_dir}/page-footer.jsp"></jsp:include>
    <!-- END FOOTER -->
            
<!--[if lt IE 9]>
<script src="${webapp_name}/assets/global/plugins/respond.min.js"></script>
<script src="${webapp_name}/assets/global/plugins/excanvas.min.js"></script> 
<script src="${webapp_name}/assets/global/plugins/ie8.fix.min.js"></script> 
<![endif]-->
<!-- BEGIN CORE PLUGINS -->
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/js.cookie.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery.blockui.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-wysihtml5/wysihtml5-0.3.0.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-markdown/lib/markdown.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-summernote/summernote.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/datatable.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/datatables/datatables.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/fancybox/source/jquery.fancybox.pack.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/plupload/js/plupload.full.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-fileinput/bootstrap-fileinput.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/typeahead/handlebars.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/typeahead/typeahead.bundle.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<!-- <script src="${webapp_name}/assets/global/scripts/app.min.js" type="text/javascript"></script> -->
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/app.js"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js"></script>
<!-- END THEME LAYOUT SCRIPTS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/global-validate.js"></script>

<!-- END PAGE LEVEL SCRIPTS -->

<!--
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/booth.js"></script> 
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/adpost.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/adpost-create.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/temp/adpost-create-test.js"></script>
 -->
 <script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/booth-create.js"></script>
 <script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/booth-upload.js"></script>

<script>
jQuery(document).ready(function() {
	//var advertiserId = '${bizProfile.advertiserId}';
	//EventNewsEdit.init(advertiserId);		//TODO to change
	
	
	//booth Category no
	$("#boothCategoryDiv").hide();
	
	$("#boothCategoryList").html(
			"1,1,1,1<br/>1,1,1,1<br/>"
	);
})

</script>
</body>
</html>