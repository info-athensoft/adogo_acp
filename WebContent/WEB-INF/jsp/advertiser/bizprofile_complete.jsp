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
<meta charset="utf-8" />
<title>Adogo | Business Profile - Complete</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8"/>
<meta content="width=device-width, initial-scale=1" name="viewport"/>
<meta content="" name="description" />
<meta content="" name="author" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
      
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
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput-typeahead.css"/>
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
<link rel="shortcut icon" href="${webapp_name}/assets/athensoft/ico/favicon.ico"/>
</head>

<body class="page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid">
<!-- BEGIN HEADER -->
<div class="page-header navbar navbar-fixed-top">
    <!-- BEGIN HEADER INNER -->
    <div class="page-header-inner ">
        <!-- BEGIN LOGO -->
        <jsp:include page="${inc_dir}/page-logo.jsp"></jsp:include>
        <!-- END LOGO -->
        <!-- BEGIN RESPONSIVE MENU TOGGLER -->
        <a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"> </a>
        <!-- END RESPONSIVE MENU TOGGLER -->
        <!-- BEGIN PAGE ACTIONS -->
        <!-- DOC: Remove "hide" class to enable the page header actions -->
        <jsp:include page="${inc_dir}/page-action.jsp"></jsp:include>
        <!-- END PAGE ACTIONS -->
        <!-- BEGIN PAGE TOP -->
        <jsp:include page="${inc_dir}/page-top.jsp"></jsp:include>
        <!-- END PAGE TOP -->
    </div>
    <!-- END HEADER INNER -->
</div>
<!-- END HEADER -->
<!-- BEGIN HEADER & CONTENT DIVIDER -->
<div class="clearfix"> </div>
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
            <!-- BEGIN THEME PANEL -->
            <jsp:include page="${inc_dir}/theme-panel.jsp"></jsp:include>
            <!-- END THEME PANEL -->
            <h1 class="page-title"> Advertiser | Business Profile <small>create a business profile</small></h1>
            <div class="page-bar">
                 <ul class="page-breadcrumb">
<li>
                         <i class="icon-home"></i>
                         <a href="${webapp_name}/">Home</a>
                        <i class="fa fa-angle-right"></i>
                    </li>
                    <li>
                        <a href="${webapp_name}/advertiser/">Advertiser</a>
                        <i class="fa fa-angle-right"></i>
                    </li>
                    <li>
                        <a href="${webapp_name}/advertiser/">Manage business</a>
                          <i class="fa fa-angle-right"></i>
                      </li>
                      <li>
                          <span>Edit business profile</span>
                      </li>
</ul>
                  <div class="page-toolbar">
                      <div class="btn-group pull-right">
                          <button type="button" class="btn btn-fit-height grey-salt dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true"> Actions
                              <i class="fa fa-angle-down"></i>
                          </button>
                          <ul class="dropdown-menu pull-right" role="menu">
                              <li><a href="#"><i class="icon-bell"></i> Action</a></li>
                              <li><a href="#"><i class="icon-shield"></i> Another action</a></li>
                              <li><a href="#"><i class="icon-user"></i> Something else here</a></li>
                              <li class="divider"> </li>
                              <li><a href="#"><i class="icon-bag"></i> Separated link</a></li>
                          </ul>
                      </div>
                  </div>
              </div>
            <!-- END PAGE HEADER-->
            
            <div class="row">
                <div class="col-md-12">
                    <div class="portlet light portlet-fit ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class=" icon-layers font-green"></i>
                                <span class="caption-subject font-green bold uppercase">Quick steps</span>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="mt-element-step">
                                
                                <div class="row step-thin">
                                    <div class="mt-step-desc">
                                        <div class="font-dark bold uppercase">Register a business</div>
                                        <div class="caption-desc font-grey-cascade"></div>
                                        <br/>
                                    </div>
                                    <div class="col-md-4 bg-grey mt-step-col">
                                        <div class="mt-step-number bg-white font-grey">1</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Start</div>
                                        <div class="mt-step-content font-grey-cascade">Purchasing the item</div>
                                    </div>
                                    <div class="col-md-4 bg-grey mt-step-col">
                                        <div class="mt-step-number bg-white font-grey">2</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Create</div>
                                        <div class="mt-step-content font-grey-cascade">Purchasing the item</div>
                                    </div>
                                    <div class="col-md-4 bg-grey mt-step-col done">
                                        <div class="mt-step-number bg-white font-grey">3</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Complete</div>
                                        <div class="mt-step-content font-grey-cascade">Complete your payment</div>
                                    </div>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
            <div class="row">
                <div class="col-lg-12 col-xs-12 col-sm-12">
                    <div class="portlet light portlet-fit ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="icon-microphone font-dark hide"></i>
                                <span class="caption-subject bold font-dark uppercase"> Business #: ${bizProfile.bizId}</span>
                                <span class="caption-helper">managing business</span>
                            </div>
                            <div class="actions">
                                <div class="btn-group btn-group-devided" data-toggle="buttons">
                                    <label class="btn blue btn-outline btn-circle btn-sm active">
                                        <input type="radio" name="options" class="toggle" id="option1">Actions</label>
                                    <label class="btn  blue btn-outline btn-circle btn-sm">
                                        <input type="radio" name="options" class="toggle" id="option2">Tools</label>
                                </div>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="row">
                                <div class="col-md-3">
                                    <span class="caption-subject bold font-dark"> Business ID at Adogo: </span><br/>
                                    <span class="caption-subject bold font-dark"> Business Name: </span><br/>
                                    <span class="caption-subject bold font-dark"> Industry Code: </span><br/>
                                    <span class="caption-subject bold font-dark"> Created Date: </span><br/>
                                </div>
                                <div class="col-md-6">
                                    <span class="caption-subject font-dark"> ${bizProfile.bizId}</span><br/>
                                    <span class="caption-subject font-dark"> ${bizProfile.bizName}</span><br/>
                                    <span class="caption-subject font-dark"> ${bizProfile.industryCode}</span><br/>
                                    <span class="caption-subject font-dark"> ${bizProfile.createDate}</span><br/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            
            <!-- BEGIN ROW 2 -->
            <div class="row">
            	            	
            	<!-- BEGIN SECTION 2 -->
            	<div class="col-md-8">
            		<div class="portlet light">
            			<div class="portlet-title">
	                         <div class="caption">
	                             <i class="icon-equalizer font-red-sunglo"></i>
	                             <span class="caption-subject font-red-sunglo bold uppercase">On-line presences</span>
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
	                        <!-- BEGIN FORM-->
	                        <form action="#" class="form-horizontal">
	                        	<div class="form-body">
	                                <input type="hidden" id="userId" value="${bizProfile.userId}"/>
	                                <input type="hidden" id="advertiserId" value="${bizProfile.advertiserId}"/>
	                                <input type="hidden" id="bizId" value="${bizProfile.bizId}"/>
	                                
	                             	<div class="form-group">
	                                    <label class="col-md-3 control-label">Facebook</label>
	                                    <div class="col-md-9">
	                                    	<input type="hidden" id="presenceNo1" value="1"/>
	                                    	<input type="text" class="form-control" placeholder="URL of your facebook homepage" id="presenceURL1"/>
	                                    </div>
	                                 </div>
	                                 
	                             	<div class="form-group">
	                                    <label class="col-md-3 control-label">LinkedIn</label>
	                                    <div class="col-md-9">
	                                    	<input type="hidden" id="presenceNo2" value="2"/>
	                                    	<input type="text" class="form-control" placeholder="URL of your LinkedIn homepage" id="presenceURL2"/>
	                                   	</div>
	                                </div>
	                                 
	                             	<div class="form-group">
	                                	<label class="col-md-3 control-label">Twitter</label>
	                                    <div class="col-md-9">
	                                    	<input type="hidden" id="presenceNo3" value="3"/>
	                                    	<input type="text" class="form-control" placeholder="URL of your Twitter homepage" id="presenceURL3"/>
	                                    </div>
	                                </div>
	                                 
	                             	<div class="form-group">
	                                    <label class="col-md-3 control-label">Youtube</label>
	                                    <div class="col-md-9">
	                                    	<input type="hidden" id="presenceNo4" value="4"/>
	                                    	<input type="text" class="form-control" placeholder="URL of your Youtube homepage" id="presenceURL4"/>
	                                    </div>
	                                 </div>
	                                 
	                             	<div class="form-group">
	                                    <label class="col-md-3 control-label">Instagram</label>
	                                    <div class="col-md-9">
	                                    	<input type="hidden" id="presenceNo5" value="5"/>
	                                    	<input type="text" class="form-control" placeholder="URL of your Instagram homepage" id="presenceURL5"/>
	                                    </div>
	                                </div>
	                                 
	                             	<div class="form-group">
	                                    <label class="col-md-3 control-label">Pinterest</label>
	                                    <div class="col-md-9">
	                                    	<input type="hidden" id="presenceNo6" value="6"/>
	                                    	<input type="text" class="form-control" placeholder="URL of your Pinterest homepage" id="presenceURL6"/>
	                                    </div>
	                                </div>
	                            </div>
	                            <div class="form-actions">
	                                <div class="row">
	                                    <div class="col-md-offset-3 col-md-9">
	                                        <a class="btn green" onclick="saveBusinessOnlinePresence(event);">Save and Complete</a>
	                                        <button type="submit" class="btn default" onclick="">I'll do it later</button>
	                                        <button type="button" class="btn default" onclick="">Cancel</button>
	                                    </div>
	                                </div>
	                            </div>
	                        </form>
	                        <!-- END FORM-->
	                    </div>
                 	
	                    
            		</div>
            	</div>
            	<!-- END SECTION 2 -->
            </div>
            <!-- END ROW 2 -->
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
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/js.cookie.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery.blockui.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/datatable.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/datatables/datatables.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/fancybox/source/jquery.fancybox.pack.js"></script>

<!-- commented by Athens on 2017-11-30 -->
<!-- <script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.min.js"></script>  -->
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/typeahead/handlebars.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/typeahead/typeahead.bundle.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<!-- <script src="${webapp_name}/assets/global/scripts/app.min.js" type="text/javascript"></script> -->
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/app.js"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<!-- commented by Athens on 2017-11-30 -->
<!-- <script type="text/javascript" src="${webapp_name}/assets/pages/scripts/components-bootstrap-tagsinput.min.js"></script> -->
<!-- <script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/bizprofile.js"></script> -->
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/bizprofile-complete.js"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js"></script>

<!-- 
<script type="text/javascript" src="${webapp_name}/assets/layouts/global/scripts/quick-sidebar.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/global/scripts/quick-nav.min.js"></script>
 -->
<!-- END THEME LAYOUT SCRIPTS -->
<script>


</script>
</body>
</html>