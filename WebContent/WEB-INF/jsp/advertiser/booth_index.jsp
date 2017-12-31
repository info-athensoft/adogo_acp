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
<title>Adogo | Booth - Index</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8"/>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<meta name="description" content=""/>
<meta name="author" content="Informatique Athensoft"/>

<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/font-awesome/css/font-awesome.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/simple-line-icons/simple-line-icons.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/morris/morris.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/fullcalendar/fullcalendar.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/jqvmap.css"/>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL STYLES -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/css/components.min.css" id="style_components"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/css/plugins.min.css"/>
<!-- END THEME GLOBAL STYLES -->
<!-- BEGIN THEME LAYOUT STYLES -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/layout.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/themes/blue.min.css" id="style_color"/>
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
            <div class="page-sidebar-wrapper">
                <!-- END SIDEBAR -->
                <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
                <!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
                <jsp:include page="${inc_dir}/page-sidebar.jsp"></jsp:include>
                <!-- END SIDEBAR -->
            </div>
            <!-- END SIDEBAR -->
            <!-- BEGIN CONTENT -->
            <div class="page-content-wrapper">
                <!-- BEGIN CONTENT BODY -->
                <div class="page-content">
                    <!-- BEGIN PAGE HEADER-->
                    <!-- BEGIN THEME PANEL -->
                    <!-- END THEME PANEL -->
                    <h1 class="page-title"> Advertiser | Booth <small>home</small></h1>
                    <div class="page-bar">
                        <ul class="page-breadcrumb">
                            <li><i class="icon-home"></i><a href="${webapp_name}/">Home</a><i class="fa fa-angle-right"></i></li>
                            <li><a href="${webapp_name}/advertiser/">Advertiser</a><i class="fa fa-angle-right"></i></li>
                            <li><a href="${webapp_name}/advertiser/booth/">Booth</a><i class="fa fa-angle-right"></i></li>
                            <li><span>Booth Home</span></li>
                        </ul>
                        <div class="page-toolbar">
                            <div class="btn-group pull-right">
                                <button type="button" class="btn btn-fit-height grey-salt dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true"> Quick Links
                                    <i class="fa fa-angle-down"></i>
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
                                                <div class="font-dark bold uppercase">Publish a booth</div>
                                                <div class="caption-desc font-grey-cascade"></div>
                                                <br/>
                                            </div>
                                            <div class="col-md-4 bg-grey mt-step-col done">
                                                <div class="mt-step-number bg-white font-grey">1</div>
                                                <div class="mt-step-title uppercase font-grey-cascade">Choose Business</div>
                                                <div class="mt-step-content font-grey-cascade">Choose a business for booths</div>
                                            </div>
                                            <div class="col-md-4 bg-grey mt-step-col">
                                                <div class="mt-step-number bg-white font-grey">2</div>
                                                <div class="mt-step-title uppercase font-grey-cascade">Create Booth</div>
                                                <div class="mt-step-content font-grey-cascade">Input booth information</div>
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
                    
                    
                    <div class="row">
                    </div>
                    
                    <!-- TEST -->
                    <!-- 
                    <div class="row">
                        <div class="col-lg-6 col-xs-12 col-sm-12">
                        	<c:forEach items="${listVOBizProfileBooth}" var="voBizProfileBooth">
                        		<p>Business ID: ${voBizProfileBooth.bizProfile.bizId}</p>
                        		<c:forEach items="${voBizProfileBooth.listBooth}" var="booth">
                        			<p>Business Name: ${booth.bizName}</p>
                        			<p>Booth Name: ${booth.boothName}</p>
                        			<p>Booth Desc: ${booth.bizDesc}</p>
                        		</c:forEach>	
                        	</c:forEach>
                        </div>
                    </div>
                     -->
                    <!-- END TEST -->
                    
                    
                    
                    <!-- PRETEST -->
                    <c:forEach items="${listVOBizProfileBooth}" var="voBizProfileBooth">
                    <div class="row">
                        <div class="col-lg-12 col-xs-12 col-sm-12">
                            <div class="portlet light portlet-fit ">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class="icon-microphone font-dark hide"></i>
                                        <span class="caption-subject bold font-dark uppercase"> Business #: ${voBizProfileBooth.bizProfile.bizId}</span>
                                        <span class="caption-helper">managing booth</span>
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
                                            <span class="caption-subject bold font-dark"> Primary Business Name: </span><br/>
                                            <span class="caption-subject bold font-dark"> Secondary Business Name: </span><br/>
                                            <span class="caption-subject bold font-dark"> Industry Code: </span><br/>
                                            <span class="caption-subject bold font-dark"> Created Date: </span><br/>
                                        </div>
                                        <div class="col-md-6">
                                            <span class="caption-subject font-dark"> ${voBizProfileBooth.bizProfile.bizId}</span><br/>
                                            <span class="caption-subject font-dark"> ${voBizProfileBooth.bizProfile.bizName}</span><br/>
                                            <span class="caption-subject font-dark"> ${voBizProfileBooth.bizProfile.bizName2}</span><br/>
                                            <span class="caption-subject font-dark"> ${voBizProfileBooth.bizProfile.industryCode}</span><br/>
                                            <span class="caption-subject font-dark"> ${voBizProfileBooth.bizProfile.createDate}</span><br/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="portlet light portlet-fit ">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class="icon-microphone font-dark hide"></i>
                                        <span class="caption-subject bold font-dark uppercase"> ${voBizProfileBooth.bizProfile.bizName} </span>
                                        <span class="caption-helper"> only one booth for each language</span>
                                    </div>
                                    <div class="actions">
                                        <a href="${webapp_name}/advertiser/booth/create.html?bizId=${voBizProfileBooth.bizProfile.bizId}" class="btn btn-circle btn-info">
		                                    <span class="hidden-xs"> Create a booth </span>
		                                </a>
                                    </div>
                                </div>
                                <div class="portlet-body">
                                    <div class="row">
                                    	<div class="col-sm-12 col-md-3">
                                            <div class="thumbnail">
                                                <img src="${webapp_name}/assets/athensoft/booth-logo/03.jpg" alt="" style="width: 100%;">
                                                <div class="caption">
                                                    <h4>CREATE A NEW BOOTH</h4>
                                                    <p> Create a booth in a specific language for the branding online presence</p>
                                                    <p>
                                                        <a href="/acp/advertiser/booth/create.html?bizId=${voBizProfileBooth.bizProfile.bizId}" class="btn green"> Create Now </a>
                                                        <a href="javascript:;" class="btn default"> Help </a>
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                    
                                    	<c:forEach items="${voBizProfileBooth.listBooth}" var="booth">
                                    	<div class="col-sm-12 col-md-3">
                                            <div class="thumbnail">
                                                <img src="${webapp_name}/assets/athensoft/booth-logo/01.jpg" alt="" style="width: 100%;">
                                                <div class="caption">
                                                    <h4>${booth.boothName}</h4>
                                                    <p>  ${booth.bizDesc} </p>
                                                    <p>
                                                        <a href="/acp/advertiser/booth/edit.html?boothId=${booth.boothId}" class="btn blue"> Edit </a>
                                                        <a href="javascript:;" class="btn default"> Preview </a>
                                                        <span class="badge badge-danger">${langMapObj.getLangName(booth.langNo)}</span>
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                        </c:forEach>
                                        
                                                                               
                                        
                                    </div>
                                </div>
                            </div>
                            		
                            		
                            		
                                  
                        </div>
                    </div>
                    </c:forEach>
                    <!-- END PRETEST -->
                    
                </div>
                <!-- END CONTENT BODY -->
            </div>
            <!-- END CONTENT -->
            <!-- BEGIN QUICK SIDEBAR -->
            
            <!-- END QUICK SIDEBAR -->
        </div>
        <!-- END CONTAINER -->
        <!-- BEGIN FOOTER -->
        <jsp:include page="${inc_dir}/page-footer.jsp"></jsp:include>
        <!-- END FOOTER -->
        <!-- BEGIN QUICK NAV -->
        
        <!-- END QUICK NAV -->
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
   <script src="${webapp_name}/assets/global/plugins/moment.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/morris/morris.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/morris/raphael-min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/counterup/jquery.waypoints.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/counterup/jquery.counterup.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/amcharts/amcharts/amcharts.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/amcharts/amcharts/serial.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/amcharts/amcharts/pie.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/amcharts/amcharts/radar.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/amcharts/amcharts/themes/light.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/amcharts/amcharts/themes/patterns.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/amcharts/amcharts/themes/chalk.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/amcharts/ammap/ammap.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/amcharts/ammap/maps/js/worldLow.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/amcharts/amstockcharts/amstock.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/fullcalendar/fullcalendar.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/horizontal-timeline/horizontal-timeline.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/flot/jquery.flot.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/flot/jquery.flot.resize.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/flot/jquery.flot.categories.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/jquery-easypiechart/jquery.easypiechart.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/jquery.sparkline.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/jquery.vmap.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.russia.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.world.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.europe.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.germany.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.usa.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/data/jquery.vmap.sampledata.js" type="text/javascript"></script>
   <!-- END PAGE LEVEL PLUGINS -->
   <!-- BEGIN THEME GLOBAL SCRIPTS -->
   <script src="${webapp_name}/assets/global/scripts/app.min.js" type="text/javascript"></script>
   <!-- END THEME GLOBAL SCRIPTS -->
   <!-- BEGIN PAGE LEVEL SCRIPTS -->
   <script src="${webapp_name}/assets/pages/scripts/dashboard.min.js" type="text/javascript"></script>
   <!-- END PAGE LEVEL SCRIPTS -->
   <!-- BEGIN THEME LAYOUT SCRIPTS -->
   <script src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/layouts/global/scripts/quick-sidebar.min.js" type="text/javascript"></script>
   <script src="${webapp_name}/assets/layouts/global/scripts/quick-nav.min.js" type="text/javascript"></script>
   <!-- END THEME LAYOUT SCRIPTS -->
   <script>
       
   </script>
</body>

</html>