<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/creditInformationInput.css">
<title>クレジット情報入力画面</title>
</head>

<body>

<!-- ヘッダー ------------------------------>
	<header>
		<jsp:include page="header.jsp" />
	</header>
	      <s:form action = "CheckCreditAction">
	      <table>
	            <tr>
	            <th>クレジット会社名</th>
	            <td><input name="credit_name" id="CheckCreditAction" type="text" value=""></td>
	            </tr>
	            <tr>
	            <th>カード番号(半角数字16桁)</th>
	            <td><input name="credit_number" id="CheckCreditAction" type="text" value=""></td>
	            </tr>
	            <tr>
	            <th>セキュリティコード(半角数字4桁)</th>
	            <td><input name="security_code" id="CheckCreditAction4" type="password"></td>
	            </tr>
	            <tr>
	            <th>ID番号(半角数字4桁)</th>
	            <td><input name="id_number" id="CheckCreditAction4" type="text" value=""></td>
	            </tr>
	     </table>
	      <input id="CheckCreditAction_0" type="submit" value="購入を確定する" >
	      </s:form>

<!-- フッター ------------------------------>
	<footer>
		<jsp:include page="footer.jsp" />
	</footer>
</body>
</html>