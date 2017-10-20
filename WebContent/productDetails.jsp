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
<s:iterator value = "selectList">
<div class = "main">
      <div class = "img">
            <s:param name="id" value="%{1}"/><img class="appli_img" src="<s:property value="img" />" height="250px" width="250px">
                  <input type=hidden value="id" />
      </div>
      <div class = "itemData">
            <h1><s:param name="id" value="%{1}"/><s:property value="item_name"/><input type=hidden value="id" /></h1>
            <div class = "price">
            <h3><s:param name="id" value="%{1}"/><s:property value="item_price"/><input type=hidden value="id" /></h3>
            </div>
            <div class = "descriptionOfItem">
            <h3><s:param name="id" value="%{1}"/><s:property value="comment"/><input type=hidden value="id" /></h3>
            </div>
            <div class = "paymentButton">
            <h3><h3><a href='<s:url action="BuyItemAction"></s:url>'><s:text name="購入する"/></a></h3></h3>
            </div>
            <div class = "homeButton">
            <h3><a href='<s:url action="CheckCreditAction"></s:url>'><s:text name="商品一覧へ戻る"/></a></h3>
           </div>
      </div>
</div>
</s:iterator>

<!-- フッター ------------------------------>
	<footer>
		<jsp:include page="footer.jsp" />
	</footer>
</body>
</html>