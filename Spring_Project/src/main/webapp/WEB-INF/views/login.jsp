<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>EL 사용하여 값 출력</legend>
		<div>
			servlet에서의 scope 객체는 값을 전달하기 위한 request객체이다.<br>
			자신이 선언한 객체 : page(현재값)<br>
			jsp -> jsp -> 전달 불가 :request(게시글, 상세.... mpa방식의 대부분의 페이지)<br>
			켜져있는 브라우저 : session(로그인 후 로그인 정보를 사용하거나, 로그인된 정보로 인증할 때)<br>
			context 및 전체 : application(다나와처럼 로그인없이 관심상품, 장바구니) => 쿠키에 담는다.
		</div>
		<ul>
			<li>같은 이름의 scope라면 requestScope : ${name }</li>
			<li>${SessionScope.name }</li>
			<li>${param.name }</li>
			<li>${param.name }</li>
			<li>${param.name }</li>
			<li>${applicationScope.LoginVo}</li>
		</ul>
	</fieldset>
</body>
</html>