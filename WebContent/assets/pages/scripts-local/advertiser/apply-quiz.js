/**
 * Package:	advertiser
 * Module:  application
 * Page:	advertiser_apply_quiz.jsp
 */

var currentPage = 0;
var lastPage = 0;
var maxPage = 5;
var totalScore = 0;

function nextPage() {
	currentPage = currentPage + 1;

	if (currentPage > 0 && currentPage < maxPage) {
		lastPage = currentPage - 1;
		$("#quiz_" + lastPage).hide();

		$("#quiz_" + currentPage).show();

		$("#btn_prev").show();
		$("#btn_next").show();

	}

	if (currentPage >= maxPage) {
		currentPage = maxPage;

		lastPage = currentPage - 1;
		$("#quiz_" + lastPage).hide();

		displayConfirm();
		$("#quiz_5").show();

		$("#form_action").hide();
		$("#form_action_last").show();
	}

	// alert("currentPage="+currentPage);
}

function prevPage() {
	// alert("currentPage="+currentPage);

	$("#form_action_last").hide();
	$("#form_action").show();

	if (currentPage < 1) {
		currentPage = 0;
		$("#quiz_" + currentPage).show();
		$("#btn_prev").hide();
		$("#btn_next").show();
	} else if (currentPage >= 1 && currentPage <= maxPage) {
		$("#quiz_" + currentPage).hide();
		currentPage = currentPage - 1;
		$("#quiz_" + currentPage).show();
		$("#btn_prev").show();
	} else {
		$("#form_action").hide();
		$("#form_action_last").show();
		currentPage = maxPage;
	}
}

function displayConfirm() {

	// alert("ok");
	var quizObj = getQuizObj();

	var r1 = $("input[name='q1']:checked").val();
	var r2 = $("input[name='q2']:checked").val();
	var r3 = $("input[name='q3']:checked").val();
	var r4 = $("input[name='q4']:checked").val();

	// var rt1 = "q1"+$("input[name='q1']:checked").val();
	// alert("r1,r2,r3,r4="+r1+","+r2+","+r3+","+r4);
	$("#q1").html(r1);
	$("#q2").html(r2);
	$("#q3").html(r3);
	$("#q4").html(r4);

	$("#aques1").text(getQuestion(quizObj, 1));
	$("#aques2").text(getQuestion(quizObj, 2));
	$("#aques3").text(getQuestion(quizObj, 3));
	$("#aques4").text(getQuestion(quizObj, 4));

	if (r1 == 'D') {
		totalScore = totalScore + 10;
	}
	if (r2 == 'D') {
		totalScore = totalScore + 10;
	}
	if (r3 == 'A') {
		totalScore = totalScore + 10;
	}
	if (r4 == 'A') {
		totalScore = totalScore + 10;
	}

}

function sumbitQuiz() {
	if (totalScore < 40) {
		alert("SORRY, hey not passed");
		window.location.href = "/acp/advertiser/apply/quiz";
	} else {
		alert("CONGRATULATION! You passed");
		window.location.href = "/acp/advertiser/";
	}

}




function getQuizObj() {
	var quizObj1 = {
		"ques" : "What is Adogo?",
		"A" : 'A. It is an e-commerce site like eBay, Amazon, etc.',
		"B" : 'B. It is a yellow-page-like site.',
		"C" : 'C. It is an ad-posting-like site.',
		"D" : 'D. It is an innovated, evolving web-based presence for everyone to do online branding and marketing which connects life and business.'
	};

	var quizObj2 = {
		"ques" : "What outstanding features make Adogo so different from other advertising website?",
		"A" : 'A. The Virtual Booth functioning as a micro-website conveys your CI (company image) to public.',
		"B" : 'B. The Ad Post shown in one-page style makes it possible to express by all means.',
		"C" : 'C. Effective search and recommendation',
		"D" : 'D. All of above'
	};

	var quizObj3 = {
		"ques" : "What is the role of Advertiser at Adogo?",
		"A" : 'A. A role defined as an Advertiser who has privileges to show her/his business profile, to build up booths in specific languages, to post a rich-content page of Ad, and more',
		"B" : 'B. An administrator of Adogo',
		"C" : 'C. A visitor or guest',
		"D" : 'D. A co-operator or distributor at Agodo'
	};

	var quizObj4 = {
		"ques" : "What is the first thing you should do right after passing this quiz?",
		"A" : 'A. To set up a business profile in detail as possible as you can and publish it right away',
		"B" : 'B. To post a piece of Ad',
		"C" : 'C. To build up a booth and publish it',
		"D" : 'D. To enjoy some beer'
	};

	var quizObj = {
		'quizObj1' : quizObj1,
		'quizObj2' : quizObj2,
		'quizObj3' : quizObj3,
		'quizObj4' : quizObj4

	};

	// alert(JSON.stringify(quizObj));
	return quizObj;
}

function getQuestion(quizObj, quesNo) {

	var question = quizObj['quizObj' + quesNo]["ques"];

	if (!question) {
		question = "";
	}

	return question;

}

function getAnswer(quizObj, quesNo, optNo) {
	var answer = quizObj['quizObj' + quesNo][optNo];

	if (!answer) {
		answer = "";
	}
	return answer;
}



function initQuizPage(quizObj) {

	for (var i = 1; i <= 4; i++) {
		$("#a" + i + "a").text(quizObj['quizObj' + i]['A']);
		$("#a" + i + "b").text(quizObj['quizObj' + i]['B']);
		$("#a" + i + "c").text(quizObj['quizObj' + i]['C']);
		$("#a" + i + "d").text(quizObj['quizObj' + i]['D']);
		$("#qt" + i).text(getQuestion(quizObj, i));
	}
}

function initQuizView() {
	$("#quiz_0").show();
	$("#quiz_1").hide();
	$("#quiz_2").hide();
	$("#quiz_3").hide();
	$("#quiz_4").hide();
	$("#quiz_5").hide();
	$("#form_action_last").hide();
	$("#form_action").show();
	$("#btn_prev").hide();
}


$(document).ready(function() {
	var quizObj = getQuizObj();
	initQuizView();
	initQuizPage(quizObj);

	// var ans = getAnswer(quizObj,1,'A');
	// var ques = getQuestion(quizObj,1);

	// alert(ques);

});