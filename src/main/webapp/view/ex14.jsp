<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/01_servlet/Ex14" method="post">
		<fieldset>
			<legend>점수 계산</legend>
			<p>
				이름 : <input type="text" name="userName" required>
			</p>
			<p>
				국어 : <input type="number" name="kor" required>
			</p>
			<p>
				영어 : <input type="number" name="eng" required>
			</p>
			<p>
				수학 : <input type="number" name="math" required>
			</p>
			<input type="submit" value="결과보기"> <input type="reset"
				value="취소"> <input type="hidden" name="cmd" value="1">
		</fieldset>
	</form>
	<hr>

	<form action="/01_servlet/Ex14" method="post">
		<p>
			취미 : <input type="checkbox" name="hobby" value="운동">운동 <input
				type="checkbox" name="hobby" value="게임">게임 <input
				type="checkbox" name="hobby" value="영화">영화 <input
				type="checkbox" name="hobby" value="독서">독서
		</p>
		<input type="hidden" name="cmd" value="2"> <input
			type="submit" value="결과보기">
	</form>

</body>
</html>