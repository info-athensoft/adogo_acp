/**
 * Package:	support
 * Module:  support
 * Page:	common
 */

/* support - global variables and functions*/
function getBusinessObject(){	
//	create a json object
    var p1 = "";
    var p2 = $("#support-lang").val();        
    var p3 = $("#support-topic-title").val();
    var p4 = $("#support-topic-content").val();
    
    var businessObject =
    {
    		supportId    			      :   p1,
    		supportLangNo   		      :   p2,
    		supportTopicTitle    		  :   p3,
    		supportTopicContent    		  :   p4,
    };
    
    return businessObject;
}