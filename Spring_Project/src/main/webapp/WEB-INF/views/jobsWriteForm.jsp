<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<form class="container" action="./jobsWrite.do" method="post">
		<div class="form-group">
			<label for="job_id">job_id:</label> <input type="text"
				class="form-control" id="job_id" name="job_id">
		</div>
		<div class="form-group">
			<label for="job_title">job_title:</label> <input type="text"
				class="form-control" id="job_title" name="job_title">
		</div>
		<div class="form-group">
			<label for="min_salary">min_salary:</label> <input type="text"
				class="form-control" id="min_salary" name="min_salary">
		</div>
		<div class="form-group">
			<label for="max_salary">max_salary:</label> <input type="text"
				class="form-control" id="max_salary" name="max_salary">
		</div>
		<button type="submit" class="btn btn-success btn-block" >Submit</button>
	</form>

</body>
<script type="text/javascript">
	window.onload = function(){
		var btn = document.querySelector(".btn.btn-success.btn-block");
		console.log(btn)
		btn.onclick=function(e){
			e.preventDefault();  // 제출버튼 입력시 넘기지 말고 멈춤.
			var id=document.getElementById("job_id");
			if(id.value == ""){
				alert("필수값을 입력해 주세요");
				id.focus();
			}else{
				document.forms[0].submit();
			}
		}
	}
	
</script>


</html>