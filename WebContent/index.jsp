<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/index.css">
<link rel="stylesheet" type="text/css" href="css/imagehover.css">
<title>峠地図　関東版</title>
</head>

<body>
<!-- ヘッダー ------------------------------>
	<header>
		<jsp:include page="header.jsp" />
	</header>

<!-- 入口ボタン------------------------------------------------------------------------------------------------------------------------ -->
<div class = "entranceButton">
      <figure class="imghvr-shutter-out-horiz">
      <img class = "iriguchi" src = img/iriguchi.jpg height="130px" width="100%">
      <figcaption>
       <h2>いらっしゃいませ</h2>
  </figcaption>
  <a href='<s:url action="AppliListAction"></s:url>'></a>
</figure>
</div>
<h3>"入口"ボタンをクリックしてください</h3>
<!-- フッター ------------------------------>
	<footer>
		<jsp:include page="footer.jsp" />
	</footer>
</body>
</html>