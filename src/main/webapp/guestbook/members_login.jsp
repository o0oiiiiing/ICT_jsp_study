<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
a {
	text-decoration: none;
}

table {
	width: 600px;
	border-collapse: collapse;
	text-align: center;
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
		<h2>로그인</h2>
		<hr />
		<form method="post" action="/01_servlet/Guest">
			<table>
				<tr align="center">
					<td>아이디</td>
					<td><input type="text" name="id" size="20" /></td>
				</tr>
				<tr align="center">
					<td>패스워드</td>
					<td><input type="password" name="pwd" size="20" /></td>
				</tr>
				<tfoot>
					<tr align="center">
						<td colspan="2"><input type="submit" value="로그인" /></td>
					</tr>
				</tfoot>
			</table>
			<input type="hidden" name="cmd" value="login">
		</form>
	</div>
</body>
</html>