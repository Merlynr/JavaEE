<?php
// Free html5 templates : #

$text = "<span style='color:red; font-size: 35px; line-height: 40px; magin: 10px;'>Error! Please try again.</span>";

if(isset($_POST['submitcontact']))
{
	$name=$_POST['name'];
	$email=$_POST['email'];
	$message=$_POST['message'];
	$subject = $_POST['subject'];

	$to = "youremail@gmail.com";
	$subject = "Html5xcss3 - Testing Contact Form";
	$message = " Name: " . $name ."\r\n Email: " . $email . "\r\n Message:\r\n" . $message;
	 
	$from = "Html5xcss3 dot com";
	$headers = "From:" . $from . "\r\n";
	$headers .= "Content-type: text/plain; charset=UTF-8" . "\r\n"; 
	 
	if(@mail($to,$subject,$message,$headers))
	{
	  $text = "<span style='color:blue; font-size: 35px; line-height: 40px; margin: 10px;'>Your Message was sent successfully !</span>";
	}
}
?>

<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<head>

    <!-- Basic Page Needs
  ================================================== -->
	<meta charset="utf-8">
	<title>Kalaa</title>
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
			   <li><a href='index.html'><span>Home</span></a></li>
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
			   <li class='active last'><a href='contact.html'><span>Contacts</span></a></li>
			</ul>
		</div>
		<header class="">
			<div class="logo">
				<a href="#"><img src="images/logo.png" /></a>
			</div>
		</header>
		<!--////////////////////////////////////Container-->
		<section id="container">
			<div class="wrap-container">
				<!-----------------Content-Box-------------------->
				<section class="content-box zerogrid">
					<div class="row wrap-box"><!--Start Box-->
						<h3 class="t-center">Contact Form</h3>
						<!--Warning-->
						<center><?php echo $text;?></center>
						<!---->
						<div id="contact_form">
							<form name="form1" id="ff" method="post" action="contact.php">
								<label class="row">
									<div class="col-1-3">
										<div class="wrap-col">
											<input type="text" name="name" id="name" placeholder="Enter name" required="required" />
										</div>
									</div>
									<div class="col-1-3">
										<div class="wrap-col">
											<input type="email" name="email" id="email" placeholder="Enter email" required="required" />
										</div>
									</div>
									<div class="col-1-3">
										<div class="wrap-col">
											<input type="text" name="subject" id="subject" placeholder="Subject" required="required" />
										</div>
									</div>
								</label>
								<label class="row">
									<div class="wrap-col">
										<textarea name="message" id="message" class="form-control" rows="4" cols="25" required="required"
										placeholder="Message"></textarea>
									</div>
								</label>
								<center><input class="sendButton" type="submit" name="submitcontact" value="Submit"></center>
							</form>
						</div>
					</div>
				</section>
				
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
							<div class="wrap-map"><iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3164.289259162295!2d-120.7989351!3d37.5246781!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8091042b3386acd7%3A0x3b4a4cedc60363dd!2sMain+St%2C+Denair%2C+CA+95316%2C+Hoa+K%E1%BB%B3!5e0!3m2!1svi!2s!4v1434016649434" width="100%" height="200" frameborder="0" style="border:0"></iframe></div>
						</div>
					</div>
					
				</div>
			</div>
			<div class="zerogrid copyright">
				<div class="wrapper">
					Copyright @ - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
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