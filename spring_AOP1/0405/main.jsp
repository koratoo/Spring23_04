<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">

*{
	margin: 0;
	padding: 0;
	
}

#header {
	width: 100%;
	height: 80px;
	position: fixed;
	background-color: #b29877;
	z-index: 10;
}
nav {
    overflow: hidden;
    position: fixed;
    transform: translateX(-100px);
    top: 110px;
    height: 72%;
    width: 200px;
    transition: all 800ms cubic-bezier(.8, 0, .33, 1);
    border-radius: 0 150px 150px 0;
    z-index: 5;
}


nav.nav-open {
    transform: translateX(0px);
    border-radius: 0 150px 150px 0; 
   background-color : #fff5ea;
}

nav .menu-btn {
    position: absolute;
    top: 50%;
    right: 5%;
    padding: 0;
    width: 30px;
    cursor: pointer;
    z-index: 5;
}

nav .menu-btn .line {
    padding: 0;
    width: 30px;
    background:black;
    height: 2px;
    margin: 5px 0;
    transition: all 700ms cubic-bezier(.9, 0, .33, 1);
}

nav .menu-btn .line.line--1 {
    width: 28px;
    transform: rotate(0) translateY(0);
}

nav .menu-btn .line.line--1.line-cross {
    width: 30px;
    transform: rotate(45deg) translateY(10px);
   background: rgba(0,0,0,0.6);
}

nav .menu-btn .line.line--2 {
    width: 28px;
    transform: translateX(0);
}

nav .menu-btn .line.line--2.line-fade-out {
    width: 28px;
    transform: translate(30px);
    opacity: 0;
}

nav .menu-btn .line.line--3 {
    width: 28px;
    transform: rotate(0) translateY(0);
}

nav .menu-btn .line.line--3.line-cross {
    width: 30px;
    transform: rotate(-45deg) translateY(-10px);
   background: rgba(0,0,0,0.6);
}

nav .nav-links {
    position: absolute;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    display: flex;
    flex-direction: column;
    /* align-items: left; */
    /* align-content: space-between; */
    justify-content: center; 
   
    transform: translateX(-100px);
    opacity: 0;
    transition: all 900ms cubic-bezier(.9, 0, .33, 1);
}
.nav-a {
	display: flex;
	flex-direction: column;
	align-content: space-between;
	
}

nav .nav-links.fade-in {
    opacity: 1;
    transform: translateX(0px);
}

nav .nav-links .link {

    margin: 10px 0;
    text-decoration: none;
    font-family: sans-serif;
    color: rgba(0,0,0,0.9);
    font-weight: 300;
    font-size: 15px;
    transition: all 300ms cubic-bezier(.9, 0, .33, 1);
}

nav .nav-links .link:hover {
    color: rgba(0, 0, 0, .5);
}


a{
 text-decoration: none;
  margin: 0 20px;
  color: #2a2c30;
  font-size: 16px;
  transition: all 300ms ease;
}

a:hover{
  color: gray;
}
section {
	
	position: relative;
	text-align: center;
	z-index: 3; /* 스크롤 될 때 header 가리지 않게 */

}

#s1 {
	top: 80px;
	height: 650px;
	background-image: url("CherryBlossom.jpg");
}
#s1_box {
	position: relative;
	top: 35%;
}
#s2 {
	top: 150px;
	height: 500px;
}
#s3 {
	height: 400px;
}
#intro {
	font-family: 'Hahmlet', serif;
	color: black;
	font-size: xx-large;
	padding-bottom: 40px;
}
#search_bar{
	padding-left: 8px;
	border-radius: 8px;
	border-color: lightgray;
	height: 50px;
	width: 500px;
}
.text_box {
	border: 3px solid #b29877;
	border-radius: 8px;
	display: inline-block;
	width: 100px;
	height: 100px;

}
.text_box p{
	font-family: 'Hahmlet', serif;
	padding-top: 23px; 
}
#footer {
	background-color:#b29877;
	height: 70px;
	padding: 20px;
	text-align: center;
	position: relative;
	bottom: 0;
}
#up_icon {
	position: fixed;	 
	bottom: 15px;
	right: 15px;
}
#up_img {
	width: 24px;
	cursor: pointer;
}
</style>
<link rel="stylesheet" href="mainP.css" />
<title>PLORS_main</title>
</head>
<body>

	<header id="header">	
		<a href="main.jsp"><img id="img_title" src="img/title_white.png"/></a>
	</header>

	<nav>
		<div class="menu-btn">
			<div class="line line--1"></div>
			<div class="line line--2"></div>
			<div class="line line--3"></div>
		</div>
		
		<div class="nav-links">
			<div class="nav-a">
				<a href="http://www.naver.com">로그인</a>
				<div>&nbsp;</div>
			</div>
			<div class="nav-a">
				<a href="#mypage">마이페이지</a> 
				<a href="#about">회원정보수정</a> 
				<a href="#wishlist">장바구니</a> 
				<a href="#wishlist">대여내역</a> 
				<a href="#wishlist">배송조회</a> 
				<a href="#wishlist">포인트충전</a> 
				<a href="#wishlist">기부</a> 
				<a href="#wishlist">포인트내역</a> 
				<a href="#wishlist">나의리뷰</a> 
				<a href="#wishlist">나의문의</a>
				<div>&nbsp;</div>
			</div>
			<div class="nav-a">
				<a href="notice.jsp">공지사항</a> 
				<a href="board.jsp">게시판</a> 
				<a href="q_a.jsp">문의</a> 
				<a href="application.jsp">도서신청</a>
				<div>&nbsp;</div>
			</div>
			<div class="nav-a">
				<a href="#review">리뷰</a>
				<div>&nbsp;</div>
			</div>
			<div class="nav-a">
				<a href="#mypage">도서관조회</a> 
				<a href="mainP.html">도서조회</a>
			</div>
		</div>
	</nav>
	
	<!-- 검색엔진 -->
	<section id="s1">		
		<div id="s1_box" class="section_div">
			<h2 id="intro">반갑습니다, 서울시 공공 도서관 온라인 대여 서비스입니다.</h2>
			<input id="search_bar" type="search" placeholder="찾으시는 도서의 제목을 입력해주세요." />
		</div>
	</section>
	<!-- 소개 PLORS-->
	<section id="s2" class="section_div">	
		<div id="s2_box">
		<h2>
			<b>Public Library Online Rental Service</b>
		</h2>
		<p>
			공공 도서관 온라인 대여 서비스 <br>도서관 굳이 안 가도 돼~ <br>집에서 편하게 빌려 볼 수
			있어염~ <br>반납도 올 필요 없어요~
		</p>
		</div>
	</section>
	<!-- 통계 
		(회원 / 책/ 대여/ 신간) -->
	<section id="s3" class="section_div">		
		<div class="text_box">
			<p>
				1,501<br>
				<strong>회원 수</strong>
			</p>			
		</div>
		<div class="text_box">
			<p>
				222,222<br>
				<strong>보유 도서</strong>
			</p>			
		</div>
		<div class="text_box">
			<p>
				789<br>
				<strong>대여</strong>
			</p>			
		</div>
		<div class="text_box">
			<p>
				510<br>
				<strong>신간 도서</strong>
			</p>			
		</div>
	</section>
	
	<!-- 정보 -->
	<footer id="footer">		
		<p>Copyright © PLORS All rights reserved.</p>
	</footer>
	
	<!-- 위로 올라가는 버튼 -->
	<div id="up_icon">
		<a href="#"><img id="up_img" src="img/up-arrow.png"></a>
	</div>
	
	
<script type="text/javascript">
		var menuBtn = document.querySelector('.menu-btn');
		var nav = document.querySelector('nav');
		var lineOne = document.querySelector('nav .menu-btn .line--1');
		var lineTwo = document.querySelector('nav .menu-btn .line--2');
		var lineThree = document.querySelector('nav .menu-btn .line--3');
		var link = document.querySelector('nav .nav-links');
		menuBtn.addEventListener('click', () => {
		    nav.classList.toggle('nav-open');
		    lineOne.classList.toggle('line-cross');
		    lineTwo.classList.toggle('line-fade-out');
		    lineThree.classList.toggle('line-cross');
		    link.classList.toggle('fade-in');
		})
</script>
</body>
</html>