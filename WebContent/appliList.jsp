<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="css/appliList.css">
<link rel="stylesheet" type="text/css" href="css/imagehover.css">
<link rel="stylesheet" type="text/css" href="css/slick-theme.css">
<link rel="stylesheet" type="text/css" href="css/slick.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="js/slick.min.js"></script>

<title>峠地図　関東版</title>
</head>


<body>
<!-- ヘッダー ------------------------------>
	<header>
		<jsp:include page="header.jsp" />
	</header>

	<h4>※マウスを乗せると詳細が表示されます</h4>

      <div class = "main">
           <div class="main_img">
                 <s:iterator value = "selectList">
                 <div class="img">
                       <figure class="imghvr-shutter-out-diag-1">
                            <s:param name="id" value="%{1}"/><img
                                  class="appli_img" src="<s:property value="img"/>" height="200px" width="200px">
                                    <input type=hidden value="id" />
                                   <figcaption>
                                         <form><b>詳細</b><br>
                                                    <s:param name ="comment" value="%{1}"/><s:property value="comment"/><input type=hidden value="id" /></form>
                                         <h3>価格:&yen;<s:param name ="item_price" value="%{1}"/><s:property value="item_price"/><input type=hidden value="id" /></h3>
                                  </figcaption>
                                       <a href='<s:url action="AppliDetailAction"><s:param name="id" value="id"/></s:url>'></a>
                        </figure>
                </div>
                </s:iterator>
      </div>

		<!-- カルーセルスライドのオプション ----->
	<script>
		$(function() {
			$('.main_img').slick({
				centerMode: true,
				  centerPadding: '80px',
				  slidesToShow: 2,
				});
			});
	</script>
     </div>
<!-- フッター ------------------------------>
	<footer>
		<jsp:include page="footer.jsp" />
	</footer>
</body>
</html>