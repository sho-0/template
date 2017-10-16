<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="css/NewHome.css">
<link rel="stylesheet" type="text/css" href="css/imagehover.css">
<link rel="stylesheet" type="text/css" href="css/slick-theme.css">
<link rel="stylesheet" type="text/css" href="css/slick.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="js/slick.min.js"></script>

<title>峠地図　関東版</title>
</head>

	<!-- ヘッダー ------------------------------>
	<header>
		<jsp:include page="header.jsp" />
	</header>

<body>
      <div class = "main">
           <div class="main_img">
                 <div class="img">
                       <figure class="imghvr-fade">
                             <img src="img/soukou.jpg">
                                   <figcaption>
                                         // ホバー時のコンテンツ
                                  </figcaption>
                                       <a href="#"></a>
                        </figure>
                </div>
                <div class="img">
                      <figure class="imghvr-fade">
                            <img src="img/soukou.jpg">
                                  <figcaption>
                                   // ホバー時のコンテンツ
                                  </figcaption>
                                        <a href="#"></a>
                     </figure>
                </div>
                <div class="img">
                      <figure class="imghvr-fade">
                            <img src="img/soukou.jpg">
                                  <figcaption>
                                  // ホバー時のコンテンツ
                                  </figcaption>
                                        <a href="#"></a>
                       </figure>
                </div>
      </div>

		<!-- カルーセルスライドのオプション ----->
	<script>
		$(function() {
			$('.main_img').slick({
				slidesToShow : 1,
				slidesToScroll : 1,
				autoplay : true,
				autoplaySpeed : 2000,
				arrows : true,
				dots : true,
			});
		});
	</script>
     </div>
</body>
</html>