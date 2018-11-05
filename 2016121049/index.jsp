<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<head>

    <!-- Basic Page Needs
  ================================================== -->
	<meta charset="utf-8">
	<title>BLOG</title>
	<meta name="description" content="Free Responsive Html5 Css3 Templates ">
	<meta name="author" content="#">
	
    <!-- Mobile Specific Metas
	================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    
    <!-- CSS
	================================================== -->
  	<link rel="stylesheet" href="css/zerogrid.css">
	<link rel="stylesheet" href="css/style.css">
	
	<!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	
	
	<link rel="stylesheet" href="css/menu.css">
	<script src="js/jquery1111.min.js" type="text/javascript"></script>
	<script src="js/script.js"></script>
	
	<!-- Owl Carousel Assets -->
    <link href="owl-carousel/owl.carousel.css" rel="stylesheet">
	<!-- <link href="owl-carousel/owl.theme.css" rel="stylesheet"> -->
	
	<!--[if lt IE 8]>
       <div style=' clear: both; text-align:center; position: relative;'>
         <a href="http://windows.microsoft.com/en-US/internet-explorer/Items/ie/home?ocid=ie6_countdown_bannercode">
           <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
        </a>
      </div>
    <![endif]-->
    <!--[if lt IE 9]>
		<script src="js/html5.js"></script>
		<script src="js/css3-mediaqueries.js"></script>
	<![endif]-->
	
</head>

<body>
	<div class="wrap-body">
		<div id='cssmenu' class="align-center">
			<ul>
			   <li class="active"><a href='index.jsp'><span>Home</span></a></li>
			   <li class=' has-sub'><a href='#'><span>Blog</span></a>
				  <ul >
					 <li class='has-sub'><a href='#'><span>Item 1</span></a>
						<ul>
						   <li><a href='#'><span>Sub Item</span></a></li>
						   <li class='last'><a href='#'><span>Sub Item</span></a></li>
						</ul>
					 </li>
					 <li class='has-sub'><a href='#'><span>Item 2</span></a>
						<ul>
						   <li><a href='#'><span>Sub Item</span></a></li>
						   <li class='last'><a href='#'><span>Sub Item</span></a></li>
						</ul>
					 </li>
				  </ul>
			   </li>
			   <li><a href='single.html'><span>About</span></a></li>
			   <li class='last'><a href='admin/login.jsp'><span>管理员登陆</span></a></li>
			</ul>
		</div>
		<header class="">
			<div class="logo">
				<a href="#"><img src="images/logo.png" /></a>
			</div>
			<div id="owl-slide" class="owl-carousel">
				<div class="item">
					<img src="images/slider-1.jpg" />
					<div class="carousel-caption">
						<div class="carousel-caption-inner">
							<p class="carousel-caption-title"><a href="#">Why Itâs Important To Struggle</a></p>
							<p class="carousel-caption-category"><a href="#" rel="category tag">Business</a>, 
							<a href="#" rel="category tag">Lifestyle</a>, <a href="#" rel="category tag">Pursuits</a>
							</p>
						</div>
					</div>
				</div>
				<div class="item">
					<img src="images/slider-2.jpg" />
					<div class="carousel-caption">
						<div class="carousel-caption-inner">
							<p class="carousel-caption-title"><a href="#">Why Itâs Important To Struggle</a></p>
							<p class="carousel-caption-category"><a href="#" rel="category tag">Business</a>, 
							<a href="#" rel="category tag">Lifestyle</a>, <a href="#" rel="category tag">Pursuits</a>
							</p>
						</div>
					</div>
				</div>
				<div class="item">
					<img src="images/slider-3.jpg" />
					<div class="carousel-caption">
						<div class="carousel-caption-inner">
							<p class="carousel-caption-title"><a href="#">Why Itâs Important To Struggle</a></p>
							<p class="carousel-caption-category"><a href="#" rel="category tag">Business</a>, 
							<a href="#" rel="category tag">Lifestyle</a>, <a href="#" rel="category tag">Pursuits</a>
							</p>
						</div>
					</div>
				</div>
				<div class="item">
					<img src="images/slider-4.jpg" />
					<div class="carousel-caption">
						<div class="carousel-caption-inner">
							<p class="carousel-caption-title"><a href="#">Why Itâs Important To Struggle</a></p>
							<p class="carousel-caption-category"><a href="#" rel="category tag">Business</a>, 
							<a href="#" rel="category tag">Lifestyle</a>, <a href="#" rel="category tag">Pursuits</a>
							</p>
						</div>
					</div>
				</div>
				<div class="item">
					<img src="images/slider-5.jpg" />
					<div class="carousel-caption">
						<div class="carousel-caption-inner">
							<p class="carousel-caption-title"><a href="#">Why Itâs Important To Struggle</a></p>
							<p class="carousel-caption-category"><a href="#" rel="category tag">Business</a>, 
							<a href="#" rel="category tag">Lifestyle</a>, <a href="#" rel="category tag">Pursuits</a>
							</p>
						</div>
					</div>
				</div>
				<div class="item">
					<img src="images/slider-6.jpg" />
					<div class="carousel-caption">
						<div class="carousel-caption-inner">
							<p class="carousel-caption-title"><a href="#">Why Itâs Important To Struggle</a></p>
							<p class="carousel-caption-category"><a href="#" rel="category tag">Business</a>, 
							<a href="#" rel="category tag">Lifestyle</a>, <a href="#" rel="category tag">Pursuits</a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</header>
        <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >ä¼ä¸ç½ç«æ¨¡æ¿</a></div>
		<!--////////////////////////////////////Container-->
		<section id="container">
			<div class="wrap-container">
			<c:forEach var='ar' items='${sessionScope.articlelist }'>
				<!-----------------Content-Box-------------------->
				<article class="post zerogrid">
					<div class="row wrap-post"><!--Start Box-->
						<div class="entry-header">
							<span class="time">June 8, 2016</span>
							<h2 class="entry-title"><a href="#">${ar.articleTitle }</a></h2>
							<span class="cat-links"><a href="#">BUSINESS</a>, <a href="#">LIFESTYLE</a></span>
						</div>
						<div class="post-thumbnail-wrap">
							<img src="images/1.jpg">
						</div>
						<div class="entry-content">
							<p>${ar.articleContent }</p>
							<p style='margin-top:30px;font-size:12px'>来自匿名的评论；${ar.articleComment }</p>
							<p><a href="single.jsp">More Details</a></p>
						</div>
					</div>
				</article>
				</c:forEach>
				<!-----------------Content-Box-------------------->  
				
			</div>
		</section>
		<!--////////////////////////////////////Footer-->
		<footer>
			<div class="zerogrid wrap-footer">
				<div class="row">
					<div class="col-1-3 col-footer-1">
						<div class="wrap-col">
							<h3>About</h3>
							<a href="index.html"><img src="images/avatar.jpg" /></a>
							<p>Ut volutpat consectetur aliquam. Curabitur auctor in nis ulum ornare. Sed consequat, augue condimentum fermentum gravida, metus elit vehicula dui.</p>
						</div>
					</div>
					<div class="col-1-3 col-footer-2">
						<div class="wrap-col">
							<h3>Categories</h3>
							<ul>
								<li><a href="#">Action</a></li>
								<li><a href="#">Romantic</a></li>
								<li><a href="#">Cartoon</a></li>
								<li><a href="#">Zombies</a></li>
							</ul>
						</div>
					</div>
					<div class="col-1-3 col-footer-3">
						<div class="wrap-col">
							<h3>Location</h3>
							<div class="wrap-map"></div>
						</div>
					</div>
					
				</div>
			</div>
			<div class="zerogrid copyright">
				<div class="wrapper">
					Copyright @ - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="æ¨¡æ¿ä¹å®¶">æ¨¡æ¿ä¹å®¶</a> - Collect from <a href="http://www.cssmoban.com/" title="ç½é¡µæ¨¡æ¿" target="_blank">ç½é¡µæ¨¡æ¿</a>
					<ul class="quick-link f-right">
						<li><a href="#">Privacy Policy</a></li>
						<li><a href="#">Terms of Use</a></li>
					</ul>
				</div>
			</div>
		</footer>
		<!-- carousel -->
		<script src="owl-carousel/owl.carousel.js"></script>
		<script>
		$(document).ready(function() {
		  $("#owl-slide").owlCarousel({
			autoPlay: 3000,
			items : 2,
			itemsDesktop : [1199,2],
			itemsDesktopSmall : [979,1],
			itemsTablet : [768, 1],
			itemsMobile : [479, 1],
			navigation: true,
			navigationText: ['<i class="fa fa-chevron-left fa-5x"></i>', '<i class="fa fa-chevron-right fa-5x"></i>'],
			pagination: false
		  });
		});
		</script>
	</div>
</body>
</html>