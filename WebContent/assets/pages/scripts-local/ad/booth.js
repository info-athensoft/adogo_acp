/*booth_edit.jsp*/

/* create adpost - button:Save AdPost */

function saveBusinessHours(){
	//alert("saveBusinessHours called!");
	
	var businessHoursObject = getBusinessHoursObject();
	
	//alert("saveAdPost(), adPostLang="+adPostLang);
	
	$.ajax({
		type:"post",
		url:"saveBusinessHours",
		dataType:"json",
		data: {	businessHoursJSONString : JSON.stringify(businessHoursObject) },
		timeout : 5000,
		success:function(data){	

		}		
	});
}

function getBusinessHoursObject(){	
//		create a json object
    var p1 = $("#business_id").val();
    var p2 = $("#day1_start_time").val();        
    var p3 = $("#day1_end_time").val();
    var p4 = $("#day2_start_time").val();        
    var p5 = $("#day2_end_time").val();
    var p6 = $("#day3_start_time").val();        
    var p7 = $("#day3_end_time").val();
    var p8 = $("#day4_start_time").val();        
    var p9 = $("#day4_end_time").val();
    var p10 = $("#day5_start_time").val();        
    var p11 = $("#day5_end_time").val();
    var p12 = $("#day6_start_time").val();        
    var p13 = $("#day6_end_time").val();
    var p14 = $("#day7_start_time").val();        
    var p15 = $("#day7_end_time").val();
    var p16 = $("#comment").val();   
    
    var businessObject =
    {
    		businessId    			      :   p1,
    		day1StartTime   		   	  :   p2,
    		day1EndTime    		    	  :   p3,
    		day2StartTime   		   	  :   p4,
    		day2EndTime    		    	  :   p5,          
    		day3StartTime   		   	  :   p6,
    		day3EndTime    		    	  :   p7,
    		day4StartTime   		      :   p8,
    		day4EndTime    		    	  :   p9,
    		day5StartTime   		   	  :   p10,
    		day5EndTime    		    	  :   p11,          
    		day6StartTime   		   	  :   p12,
    		day6EndTime    		    	  :   p13,
    		day7StartTime   		   	  :   p14,
    		day7EndTime    		    	  :   p15,
    		comment              		  :   p16
    };
    
    return businessObject;
}

/* Edit booth - button:Save Business Location */
function saveBusinessLocation(){
	alert("saveBusinessLocation called!");
	//TODO 	
}

function getBusinessLocationObject(){
	alert("getBusinessLocationObject called!");
	//TODO 	
}