<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function ok(f) {
	const pwd = "${mvo.pwd}";
	const pwd2 = f.pwd.value;
	if (pwd == pwd2) {
		f.action = "/01_servlet/Guest";
		f.submit();
	} else {
		alert("비밀번호 틀림");
		f.pwd.value="";
		f.pwd.focus();
		return;
	}
}
</script>
</head>
<body>
	<form method="post">
		비밀번호 확인<input type="text" name="pwd">
		<input type="button" value="확인" onclick="ok(this.form)">
		<input type="hidden" name="cmd" value="pwd_confirm2">
		<input type="hidden" name="idx" value="${mvo.idx}">
	</form>

</body>
</html>