<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="job" items="${lists}" varStatus="vs">
		<div><a href="./getJobsDetail.do?id=${job.job_id}">${job.job_id}</a></div>
		<div>${job.job_title }</div>
		<div>${job.min_salary }</div>
		<div>${job.max_salary }</div>
	</c:forEach>
</body>
</html>