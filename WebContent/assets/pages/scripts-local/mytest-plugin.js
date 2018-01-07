

function testme(){
	//alert("testme ok.");
	
	MyValidator.sampleValidation1();
	
}




var MyValidator = function(){
	var foo1 = function(){
		//console.log("foo1");
		alert("foo1");
	}
	
	var foo2 = function(){
		alert("foo2");
	}
	
	
	
	 var handleValidation1 = function() {
	        // for more info visit the official plugin documentation: 
	            // http://docs.jquery.com/Plugins/Validation

	            var form1 = $('#form_sample_1');
	            var error1 = $('.alert-danger', form1);
	            var success1 = $('.alert-success', form1);

	            form1.validate({
	                errorElement: 'span', //default input error message container
	                errorClass: 'help-block help-block-error', // default input error message class
	                focusInvalid: false, // do not focus the last invalid input
	                ignore: "",  // validate all fields including form hidden input
	                messages: {
	                    select_multi: {
	                        maxlength: jQuery.validator.format("Max {0} items allowed for selection"),
	                        minlength: jQuery.validator.format("At least {0} items must be selected")
	                    }
	                },
	                rules: {
	                    name: {
	                        minlength: 2,
	                        required: true
	                    },
	                    input_group: {
	                        email: true,
	                        required: true
	                    },
	                    email: {
	                        required: true,
	                        email: true
	                    },
	                    url: {
	                        required: true,
	                        url: true
	                    },
	                    number: {
	                        required: true,
	                        number: true
	                    },
	                    digits: {
	                        required: true,
	                        digits: true
	                    },
	                    creditcard: {
	                        required: true,
	                        creditcard: true
	                    },
	                    occupation: {
	                        minlength: 5,
	                    },
	                    select: {
	                        required: true
	                    },
	                    select_multi: {
	                        required: true,
	                        minlength: 1,
	                        maxlength: 3
	                    }
	                },

	                invalidHandler: function (event, validator) { //display error alert on form submit              
	                    success1.hide();
	                    error1.show();
	                    App.scrollTo(error1, -200);
	                },

	                errorPlacement: function (error, element) { // render error placement for each input type
	                    var cont = $(element).parent('.input-group');
	                    if (cont.size() > 0) {
	                        cont.after(error);
	                    } else {
	                        element.after(error);
	                    }
	                },

	                highlight: function (element) { // hightlight error inputs

	                    $(element)
	                        .closest('.form-group').addClass('has-error'); // set error class to the control group
	                },

	                unhighlight: function (element) { // revert the change done by hightlight
	                    $(element)
	                        .closest('.form-group').removeClass('has-error'); // set error class to the control group
	                },

	                success: function (label) {
	                    label
	                        .closest('.form-group').removeClass('has-error'); // set success class to the control group
	                },

	                submitHandler: function (form) {
	                    success1.show();
	                    error1.hide();
	                }
	            });


	    }
	
	
	
	
	
	return {
		foo1: function(){
			foo1();
		},
		
		foo2: function(){
			foo2();
		},
		
		sampleValidation1 : function(){
			handleValidation1();
		}
	
	
	}
}();

$(document).ready(function()
{
	//alert("index-test.jsp");
	
	testme();
});