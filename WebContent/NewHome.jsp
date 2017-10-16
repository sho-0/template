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


<body>
<!-- ヘッダー ------------------------------>
	<header>
		<jsp:include page="header.jsp" />
	</header>

      <div class = "main">
           <div class="main_img">
                 <div class="img">
                       <figure class="imghvr-shutter-out-diag-1">
                             <img src="img/kankou.jpg" height="200px" width="200px">
                                   <figcaption>
                                         観光目的に特化した、地図アプリになります。<br>
                                         価格:!\xxxxxxxx
                                  </figcaption>
                                       <a href="#"></a>
                        </figure>
                </div>
                <div class="img">
                      <figure class= "imghvr-shutter-out-diag-1">
                            <img src="img/soukou.jpg" height="200px" width="200px">
                                  <figcaption>
                                         走る楽しみに特化した、地図アプリになります。<br>
                                         価格:!\xxxxxxxx
                                  </figcaption>
                                        <a href="#"></a>
                     </figure>
                </div>
                <div class="img">
                      <figure class= "imghvr-shutter-out-diag-1">
                            <img src="img/kanzen.jpg" height="200px" width="200px">
                                  <figcaption>
                                        観光地図アプリと観光地図アプリ両方を兼ねそなえた<br>
                                        アプリとなります。<br>
                                        価格:!\xxxxxxxx
                                  </figcaption>
                                        <a href="#"></a>
                       </figure>
                </div>
      </div>

		<!-- カルーセルスライドのオプション ----->
	<script>
		$(function() {
			$('.main_img').slick({
				centerMode: true,
				  centerPadding: '60px',
				  slidesToShow: 2,
				  responsive: [
				    {
				      breakpoint: 768,
				      settings: {
				        arrows: false,
				        centerMode: true,
				        centerPadding: '40px',
				        slidesToShow: 3
				      }
				    },
				    {
				      breakpoint: 480,
				      settings: {
				        arrows: false,
				        centerMode: true,
				        centerPadding: '40px',
				        slidesToShow: 1
				      }
				    }
				  ]
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