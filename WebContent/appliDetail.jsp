<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/appliDetail.css">
<link rel="stylesheet" type="text/css" href="css/button.css">
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
            <s:param name="img" value="%{1}"/><img class="appli_img" src="<s:property value="img" />" height="250px" width="250px">
                  <input type=hidden value="id" />
      </div>
      <div class = "itemData">
            <h1><s:param name="item_name" value="%{1}"/><s:property value="item_name"/><input type=hidden value="id" /></h1>
            <div class = "price">
            <h3>価格:&yen;<s:param name="price" value="%{1}"/><s:property value="item_price"/><input type=hidden value="id" /></h3>
            </div>
            <div class = "descriptionOfItem">
            <h3>詳細<br>
             <s:param name="descriptionOfItem" value="%{1}"/><s:property value="comment"/><input type=hidden value="id" /></h3>
            </div>
      </div>
      <div class = "button">
            <div class = "paymentButton">
            <h3><a href='<s:url action="GoCheckCreditAction"></s:url>' class="deg_btn"><s:text name="購入する"/></a></h3>
            </div>
            <div class = "homeButton">
            <h3><a href='<s:url action="AppliListAction"></s:url>' class="deg_btn"><s:text name="商品一覧へ戻る"/></a></h3>
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