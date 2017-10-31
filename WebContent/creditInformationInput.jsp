<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- cssリンク----------------------------------------------------------------- -->
<link rel="stylesheet" type="text/css" href="css/creditInformationInput.css">

<!--スクリプト---------------------------------------------------------------------  -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- 国際化--------------------------------------------------------------------------- -->
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.template.property.creditInformationInput"
var="lang" />

<title><s:text name="lang.creditInformationInput.creditInformationInput" /></title>
</head>

<body>

<!-- ヘッダー ------------------------------>
	<header>
		<jsp:include page="header.jsp" />
	</header>

<!-- クレジット情報入力フォーム----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -->
	      <s:form action = "CheckCreditAction">
	      <table>
	            <tr>
	            <th><s:text name="lang.creditInformationInput.creditCardCompany" /></th>
	            <td><input name="credit_name" id="CheckCreditAction" type="text" value="" required ></td>
	            </tr>
	            <tr>
	            <th><s:text name="lang.creditInformationInput.creditNumber" /></th>
	            <td><input name="credit_number" id="CheckCreditAction2" type="text" value=""  required maxlength='16' pattern="^[0-9A]+$" title=<s:text name="lang.creditInformationInput.pleaseEnterOneByteNumeral" />></td>
	            </tr>
	            <tr>
	            <th><s:text name="lang.creditInformationInput.securityCode" /></th>
	            <td><input name="security_code" id="CheckCreditAction2" type="password" required></td>
	            </tr>
	            <tr>
	            <th><s:text name="lang.creditInformationInput.idNumber" /></th>
	            <td><input name="id_number" id="CheckCreditAction3" type="text" value=""  required maxlength='4' pattern= "^[0-9A]+$"  title=<s:text name="lang.creditInformationInput.pleaseEnterOneByteNumeral" />></td>
	            </tr>
	     </table>
	     <input id="CheckCreditAction_0" type="submit" value= <s:text name="lang.creditInformationInput.buyDetermine" />>
	     </s:form>

<!-- フッター ------------------------------>
	<footer>
		<jsp:include page="footer.jsp" />
	</footer>

<!-- ブラウザバック禁止 -->
<script>
history.forward();
</script>
</body>
</html>