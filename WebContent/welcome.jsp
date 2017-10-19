<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/payComp.css">
<title>入り口</title>
</head>

<body>
<!-- ヘッダー ------------------------------>
	<header>
		<jsp:include page="header.jsp" />
	</header>

<li><a href='<s:url action="AppliListAction"></s:url>'><s:text name="入り口"/></a></li>

      <!-- フッター ------------------------------>
	<footer>
		<jsp:include page="footer.jsp" />
	</footer>
</body>
</html>