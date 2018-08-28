<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
	//한글을 3바이트로 받아줘서 안깨지게해주는것
	request.setCharacterEncoding("UTF-8");
//  cp = ~/study 까지 경로
	String cp = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Domain Object</title>
</head>
<body>

<h3>Domain Object</h3>
Action이 커지는것을 방지하기 위해 멤버변수를 별개의 클래스로 만듬

<form action="<%=cp%>/itwill/created_ok.action" method="post">
아이디 : <input type="text" name="user.userId"/><br/>
이름 : <input type="text" name="user.userName"/><br/>

<input type="submit" value="보내기"/>

</form>




<br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/>
</body>
</html>
