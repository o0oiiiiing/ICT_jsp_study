<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방 명 록</title>
<style type="text/css">
a {
	text-decoration: none;
}

table {
	width: 600px;
	border-collapse: collapse;
	text-align: left;
}

table, th, td {
	border: 1px solid black;
	padding: 3px;
	border: none;
}

div {
	width: 600px;
	margin: auto;
	text-align: center;
}
</style>

</head>
<body>
	<div>
		<h2>회원가입</h2>
		<hr />
		<form method="post" action="/01_servlet/Guest">
			<table>
				<tr align="center">
					<td>이름</td>
					<td>"${mvo.name}"</td>
				</tr>
				<tr align="center">
					<td>이메일</td>
					<td>"${mvo.email}"</td>
				</tr>
				<tr align="center">
					<td>주소</td>
					<td>"${mvo.addr}"</td>
				</tr>
				<tr align="center">
					<td>연락처</td>
					<td>"${mvo.phone}"</td>
				</tr>
				<tfoot>
					<tr align="center">
						<td colspan="2"><input type="submit" value="수정" /></td>
					</tr>
				</tfoot>
			</table>
			<input type="hidden" name="cmd" value="register">
		</form>
	</div>
</body>
</html>