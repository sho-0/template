<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- cssリンク---------------------------------------------------- -->
<link rel="stylesheet" type="text/css" href="css/appliDetail.css">
<link rel="stylesheet" type="text/css" href="css/button.css">

<!-- 国際化---------------------------------------------------------------- -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.template.property.appliDetail"
var="lang" />

<title><s:text name="lang.appliDetail.appliDetail" /></title>
</head>
<body>
<!-- ヘッダー ------------------------------>
	<header>
		<jsp:include page="header.jsp" />
	</header>
<s:iterator value = "selectList">

<div class = "main">
<!-- 商品画像------------------------------------------------------------------------------------------------------------------------------ -->
      <div class = "img">
            <s:param name="img" value="%{1}"/><img class="appli_img" src="<s:property value="img" />" height="250px" width="250px">
                  <input type=hidden value="id" />
      </div>

<!-- 商品詳細------------------------------------------------------------------------------------------------------------------------------------------------------------------- -->
      <div class = "itemData">
            <h1><s:param name="item_name" value="%{1}"/><s:property value="item_name"/><input type=hidden value="id" /></h1>
            <div class = "price">
            <h3><s:text name="lang.appliDetail.price" />:&yen;<s:param name="price" value="%{1}"/><s:property value="item_price"/><input type=hidden value="id" /></h3>
            </div>
            <div class = "descriptionOfItem">
            <h3><s:text name="lang.appliDetail.descriptionOfItem" /><br>
             <s:param name="descriptionOfItem" value="%{1}"/><s:property value="comment"/><input type=hidden value="id" /></h3>
            </div>
      </div>

<!-- ボタン類-------------------------------------------------------------------------------------------------------------------- -->
      <div class = "button">
            <div class = "paymentButton">
            <h3><a href='<s:url action="GoCheckCreditAction"></s:url>' class="deg_btn"><s:text name="lang.appliDetail.buy"/></a></h3>
            </div>
            <div class = "homeButton">
            <h3><a href='<s:url action="AppliListAction"></s:url>' class="deg_btn"><s:text name="lang.appliDetail.backToAppliList"/></a></h3>
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