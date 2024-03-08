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
					<td>아이디</td>
					<td><input type="text" name="id" size="20" /></td>
				</tr>
				<tr align="center">
					<td>비밀번호</td>
					<td><input type="password" name="pwd" size="20" /></td>
				</tr>
				<tr align="center">
					<td>이름</td>
					<td><input type="text" name="name" size="20" /></td>
				</tr>
				<tr align="center">
					<td>이메일</td>
					<td><input type="text" name="email" size="20" /></td>
				</tr>
				<tr align="center">
					<td>주소</td>
					<td><input type="text" name="addr" size="20" /></td>
				</tr>
				<tr align="center">
					<td>연락처</td>
					<td><input type="text" name="phone" size="20" /></td>
				</tr>
				<tfoot>
					<tr align="center">
						<td colspan="2"><input type="submit" value="회원가입" /></td>
					</tr>
				</tfoot>
			</table>
			<input type="hidden" name="cmd" value="register">
		</form>
	</div>
</body>
</html>