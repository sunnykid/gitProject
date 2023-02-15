<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function jobDelete(id){
		console.log(id);
		location.href="./jobsDelete.do?id="+id;
	}
</script>
<body>
	<h3>
		${job}
		${job.job_id}
	</h3>
	<button>수정</button>
	<button onclick="jobDelete('${job.job_id}')">삭제</button><!-- 숫자, 문자 -->
</body>
<script type="text/javascript">
	var btn = document.querySelector("button");
	console.log(btn);
	btn.onclick = function(){
		location.href="./getJobsModify.do?id=${job.job_id}";  //자바스크립트와 자바객체는 합칠수가 없음
	}
</script>
</html>