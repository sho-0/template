<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- cssリンク----------------------------------------------------- -->
<link rel="stylesheet" type="text/css" href="css/index.css">
<link rel="stylesheet" type="text/css" href="css/imagehover.css">

<!-- 国際化--------------------------------------------------------- -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.template.property.index"
var="lang" />

<title><s:text name="lang.index.index" /></title>
</head>

<body>
<!-- ヘッダー ------------------------------>
	<header>
		<jsp:include page="header.jsp" />
	</header>

<!-- 入口ボタン------------------------------------------------------------------------------------------------------------------------ -->
<div class = "entranceButton">
      <figure class="imghvr-shutter-out-horiz">
             <img class = "iriguchi" src = img/iriguchi.jpg height="120px" width="260px">
      <figcaption>
             <h2><s:text name="lang.index.welcome" /></h2>
     </figcaption>
             <a href="AppliListAction"></a>
      </figure>
</div>
<h3><s:text name="lang.index.pleaseClickOnTheIriguchiButton" /></h3>

<!-- フッター ------------------------------>
	<footer>
		<jsp:include page="footer.jsp" />
	</footer>
</body>
</html>