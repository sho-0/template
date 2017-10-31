<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- cssリンク------------------------------------------------- -->
<link rel="stylesheet" type="text/css" href="css/payComp.css">

<!-- 国際化--------------------------------------------------------------- -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.template.property.payComp"
var="lang" />

<title><s:text name="lang.payComp.payComp" /></title>
</head>

<body>
<!-- ヘッダー ------------------------------>
	<header>
		<jsp:include page="header.jsp" />
	</header>

<div class = "main">
      <h1><s:text name="lang.payComp.thankYouForYourPurchase" /></h1>
      <h4><s:text name="lang.payComp.thisPageIsBrowserBackBan" /></h4>
      <h4><s:text name="lang.payComp.pleaseClickOnTheGoToAppliListButton" /></h4><br>
      <a href='<s:url action="AppliListAction" />' class = "button"><s:text name="lang.payComp.goToAppliList" /></a>
</div>

      <!-- フッター ------------------------------>
	<footer>
		<jsp:include page="footer.jsp" />
	</footer>
</body>
</html>