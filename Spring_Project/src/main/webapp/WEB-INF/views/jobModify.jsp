<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="frm" name="frm" action="./jobModifyWrite.do" method="post">
	<input type="text" name="job_id" value=${job.job_id} readonly>
	<input type="text" name="job_title" value=${job.job_title}>
	<input type="text" value=${job.min_salary } readonly>
	<input type="text" value=${job.max_salary } readonly>
	<input type="submit" value="전송">

</form>

</body>
<script type="text/javascript">
//	var frm = document.frm
// 	frm.submit();
//	frm.action="test.do";
//	console.log(frm);
</script>
</html>