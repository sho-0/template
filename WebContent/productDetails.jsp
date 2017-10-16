<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/productDetails.css">
<title>商品詳細</title>
</head>
<body>
<!-- ヘッダー ------------------------------>
	<header>
		<jsp:include page="header.jsp" />
	</header>

<div class = "main">
      <div class = "img">
      </div>
      <div class = "itemData">
            <h1>商品名</h1>
            <div class = "price">
            <h3>商品価格</h3>
            </div>
            <div class = "descriptionOfItem">
            <h3>商品説明</h3>
            </div>
            <div class = "paymentButton">
            <h3>購入方法確認画面</h3>
            </div>
            <div class = "homeButton">
            <h3>ホームへ戻る</h3>
           </div>
      </div>
</div>

<!-- フッター ------------------------------>
	<footer>
		<jsp:include page="footer.jsp" />
	</footer>
</body>
</html>