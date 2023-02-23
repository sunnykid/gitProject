<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./insertBoard.do" method="post">
	<div>
		title : <input type="text" name="title" value="글 작성합니다. 테스트"><br>
		content : <textarea rows="5" cols="40" name="content">컨텐트영역입니다.</textarea>
	</div>
	<div>
		<input type="submit" value="입력값 전송">
	</div>
	</form>
	
	<fieldset>
		<legend>변경된 textarea</legend>
		<div id="result">
		
		</div>
		<textarea id="result2" row="10" cols="40">
		
		</textarea>
	</fieldset>
	
	<button onclick="checkValue()">textArea값 확인</button>
	<button onclick="convertValue()"></button>
	
	<script type="text/javascript">
		function checkValue(){
			var obj = document.getElementsByName("content")[0].value;
			var obj2 = document.getElementsByName("content")[0].textContent;
			console.log(obj);
			console.log(obj2);
			document.getElementsByName("content")[0].value='새로운 값';
		}
		
		function convertValue(){
			var obj = document.getElementsByName("content")[0].value;
			document.getElementById("result").textContent = obj;
			document.getElementById("result2").value = obj;			
		}
		
		
		<!--Transaction 확인, textArea는 value / textContent 중 어느것이 넘어갈까? 한줄 내림의 정체는? -->
	</script>
</body>
</html>