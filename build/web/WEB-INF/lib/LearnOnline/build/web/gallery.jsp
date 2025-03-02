<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1">
		
		<title>Car Workshop | Gallery</title>
		
		<!-- Loading third party fonts -->
		<link href="http://fonts.googleapis.com/css?family=Titillium+Web:300,400,700|" rel="stylesheet" type="text/css">
		<link href="fonts/font-awesome.min.css" rel="stylesheet" type="text/css">

		<!-- Loading main css file -->
		<link rel="stylesheet" href="style.css">
		
		<!--[if lt IE 9]>
		<script src="js/ie-support/html5.js"></script>
		<script src="js/ie-support/respond.js"></script>
		<![endif]-->

	</head>


	<body>
		
		<div id="site-content">
			
			<%@include file="header.jsp" %>
			<main class="main-content">
				
				<div class="fullwidth-block content">
					<div class="container">
						<h2 class="entry-title">Natus error sit voluptatem accusantium doloremque laudantium totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi architecto</h2>

						<div class="text-center">
							<div class="filter-links filterable-nav">
								<select class="mobile-filter">
									<option value="*">Show all</option>
									<option value=".cars">Cars</option>
									<option value=".interior">Interior</option>
									<option value=".race">Race</option>
									<option value=".other">Other</option>
								</select>
								<a href="#" class="current wow fadeInRight" data-filter="*">Show all</a>
								<a href="#" class="wow fadeInRight" data-wow-delay=".2s" data-filter=".cars">Cars</a>
								<a href="#" class="wow fadeInRight" data-wow-delay=".4s" data-filter=".interior">Interior</a>
								<a href="#" class="wow fadeInRight" data-wow-delay=".6s" data-filter=".race">Race</a>
								<a href="#" class="wow fadeInRight" data-wow-delay=".8s" data-filter=".other">Other</a>
							</div>
						</div>

						<div class="filterable-items">
							<div class="gallery-item filterable-item interior">
								<a href="dummy/large-gallery/gallery-1.jpg"><figure class="featured-image">
										<img src="dummy/gallery-1.jpg" alt="">
										<figcaption>Lorem ipsum dolor sit amet</figcaption>
									</figure></a>
							</div>
							<div class="gallery-item filterable-item other">
								<a href="dummy/large-gallery/gallery-2.jpg"><figure class="featured-image">
										<img src="dummy/gallery-2.jpg" alt="">
										<figcaption>Consectetur adipisicing elit</figcaption>
									</figure></a>
							</div>
							<div class="gallery-item filterable-item cars">
								<a href="dummy/large-gallery/gallery-3.jpg"><figure class="featured-image">
										<img src="dummy/gallery-3.jpg" alt="">
										<figcaption>Repellat fugit tenetur </figcaption>
									</figure></a>
							</div>
							<div class="gallery-item filterable-item race">
								<a href="dummy/large-gallery/gallery-4.jpg"><figure class="featured-image">
										<img src="dummy/gallery-4.jpg" alt="">
										<figcaption>Asperiores quas voluptatem</figcaption>
									</figure></a>
							</div>
							<div class="gallery-item filterable-item other">
								<a href="dummy/large-gallery/gallery-5.jpg"><figure class="featured-image">
										<img src="dummy/gallery-5.jpg" alt="">
										<figcaption>Ex quos ab perspiciatis</figcaption>
									</figure></a>
							</div>
							<div class="gallery-item filterable-item other">
								<a href="dummy/large-gallery/gallery-6.jpg"><figure class="featured-image">
										<img src="dummy/gallery-6.jpg" alt="">
										<figcaption>Natus dolores ad et ipsam</figcaption>
									</figure></a>
							</div>
							<div class="gallery-item filterable-item interior">
								<a href="dummy/large-gallery/gallery-7.jpg"><figure class="featured-image">
										<img src="dummy/gallery-7.jpg" alt="">
										<figcaption>Hic nisi. Animi placeat</figcaption>
									</figure></a>
							</div>
							<div class="gallery-item filterable-item race">
								<a href="dummy/large-gallery/gallery-8.jpg"><figure class="featured-image">
										<img src="dummy/gallery-8.jpg" alt="">
										<figcaption>Obcaecati quam exercitationem</figcaption>
									</figure></a>
							</div>
							<div class="gallery-item filterable-item race">
								<a href="dummy/large-gallery/gallery-9.jpg"><figure class="featured-image">
										<img src="dummy/gallery-9.jpg" alt="">
										<figcaption>quam exercitationem</figcaption>
									</figure></a>
							</div>
						</div>
					</div>
				</div>

			</main> <!-- .main-content -->

			<footer class="site-footer">
				<div class="container">
					<div class="subscribe-form">
						<form action="#">
							<input type="text" placeholder="Enter your email to subscribe...">
							<button type="submit"><img src="images/icon-envelope-white.png" alt=""></button>
						</form>
					</div>
					<div class="social-links">
						<a href="#"><i class="fa fa-facebook"></i></a>
						<a href="#"><i class="fa fa-twitter"></i></a>
						<a href="#"><i class="fa fa-google-plus"></i></a>
						<a href="#"><i class="fa fa-pinterest"></i></a>
					</div>
					<div class="copy">
						<p>Copyright 2014 Company name. Designed by Themeezy. All rights reserved.</p>
					</div>
				</div>
			</footer> <!-- .site-footer -->

		</div> <!-- #site-content -->

		

		<script src="js/jquery-1.11.1.min.js"></script>
		<script src="http://maps.google.com/maps/api/js?sensor=false&amp;language=en"></script>
		<script src="js/plugins.js"></script>
		<script src="js/app.js"></script>
		
	</body>

</html>