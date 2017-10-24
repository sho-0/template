<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/productDetails.css">
<title>クレジット情報入力画面</title>
</head>

<body>
      <s:form action = "CheckCreditAction">
            <s:textfield name = "credit_name" />
            <s:textfield name  = "credit_number" />
            <s:textfield name  = "security_code" />
            <s:textfield name  = "id_number" />
            <s:submit value = "購入する" />
      </s:form>
</body>
</html>