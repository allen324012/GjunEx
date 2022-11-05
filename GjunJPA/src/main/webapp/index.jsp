<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<table width=500 align=center border=1>
		<tr height=100><td align=center><jsp:include page="title.jsp"/>
		<tr height=400><td align=center>
			<form action="" method="post">
				<table width=300 align=center>
					<tr>
						<td>帳號
						<td><input type="text" name="username">
					<tr>
				</table>
			</form>
		<tr height=50><td align=center><jsp:include page="end.jsp"/>		
	</table>

</body>
</html>