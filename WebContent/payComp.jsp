<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/payComp.css">
<title>お買い上げ</title>
</head>

<body>
<!-- ヘッダー ------------------------------>
	<header>
		<jsp:include page="header.jsp" />
	</header>

<div class = "main">
      <h1>お買い上げ、ありがとうございました。</h1>
      <h4>※このページはブラウザバックを禁止しております。</h4>
      <h4>　お手数ですが、こちらのボタンからお戻りください。</h4><br>
      <a href='<s:url action="AppliListAction" />' class = "button">商品選択へ戻る</a>
</div>

      <!-- フッター ------------------------------>
	<footer>
		<jsp:include page="footer.jsp" />
	</footer>
</body>
</html>