<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script type="text/javascript" src="./js/job.js"></script>
  <script type="text/javascript">
  /*
  *   window.onload = function(){}
  *
  */
  	window.onload=function(){
	  console.log("온로드 작동")
	  document.getElementsByTagName("button")[0].onclick = function(e){
		  location.href="./jobsWriteForm.do";
	  }
  }
  </script>
</head>
<body>
	<div class="container" style="width=970px">
	<button type="button" class="btn btn-primary btn-block">새글 작성</button>
	<span>${fn:length(lists)}</span>
	<div class="table-responsive">
		<table class="table">
			<thead>
				<tr class="info">
					<td>연번</td>
					<td>JOB_ID</td>
					<td>JOB_TITLE</td>
					<td>MIN_SALARY</td>
					<td>MAX_SALARY</td>
				</tr>
				<tbody>
					<c:forEach var="job" items="${lists}" varStatus="vs">
						<tr>
							<td>${fn:length(lists) - vs.index }</td>
							<td><a href="./getJobsDetail.do?id=${job.job_id}">${job.job_id}</a></td>
							<td>${job.job_title }</td>
							<td>${job.min_salary }</td>
							<td>${job.max_salary }</td>
						</tr>
					</c:forEach>
				</tbody>
			</thead>
		</table>
	</div>
	</div>
</body>
</html>