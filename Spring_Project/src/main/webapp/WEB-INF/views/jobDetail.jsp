<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		${job}
		${job.job_id}
	</h3>
	<button>수정</button>
</body>
<script type="text/javascript">
	var btn = document.querySelector("button");
	console.log(btn);
	btn.onclick = function(){
		location.href="./getJobsModify.do?id=${job.job_id}";
	}
</script>
</html>