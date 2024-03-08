<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#t1 {
	display: <%=request.getAttribute("display")%>;
}

#t2 {
	display: none;
}
</style>
</head>
<body>
	<form action="/01_servlet/Guest" method="post">
		<input type="submit" value="guestbook"> <input type="hidden"
			name="cmd" value="list">
	</form>
	<div id="t1">
		<form action="/01_servlet/Guest" method="post">
			<input type="submit" value="로그인"> <input type="hidden"
				name="cmd" value="login_page">
		</form>

		<form action="/01_servlet/Guest" method="post">
			<input type="submit" value="회원가입"> <input type="hidden"
				name="cmd" value="reg_page">
		</form>
	</div>
	<div id="t2" style="display: <%=request.getAttribute("display_b")%>">
		<form method="post" action="/01_servlet/Guest?">
			<input type="hidden" name="idx" value="${mvo.idx}">
			<span><%=request.getAttribute("name")%>님 환영합니다.</span> <input
				type="submit" value="마이페이지">
				<input type="hidden" name="cmd" value="pwd_confirm">
		</form>
	</div>
</body>
</html>