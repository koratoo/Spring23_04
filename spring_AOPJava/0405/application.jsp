<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
*{ 
	margin: 0; 
	padding: 0;
	box-sizing: border-box;	
}
#container {
	width: 70%;
  	margin: 0 auto; /* 가로로 중앙에 배치 */
  	padding-top: 10%; 
  	padding-bottom: 90px;
  	
}

.page {
	display: inline-block;
	border: 2px solid #e5c49c;
	border-radius: 8px;
	width: 20%;
	height: 50px;
	text-align: center;
	line-height: 50px;	
}

#btn_box {
	text-align: center;
	padding-bottom: 20px;
}
.button {
	margin-top: 50px;
	/* margin-left: 100px; */
	width: 300px;
	padding: 20px;
	border-style: none;
	border-radius: 6px;
	background-color: #ceaf8a;
	text-align: center;
	font-size: 26px;
	box-shadow: 0px 0px 2px 2px #d6b995;
}

.button:hover {
      background-color:#eac89f;
      transition: 0.2s;
  }
.text_box {
	padding-top: 12px;
}
#bordertop {
	border-top: 1px solid #6b5a46;
}
ul {
	list-style-type: square;
	text-align: left;
}

.h_title {
	font-size: 24px;
	font-weight: 600;
	color: #6b5a46;
}

.li_text {
	font-size: 18px;
	padding-top: 8px;
}

.point {
	color: red;
}
</style>
<title>PLORS_도서신청</title>
</head>
<body>

	<!-- 상단 header -->
	<%@ include file="header.jsp" %>

	<div id="container">
		<div id="page">
			<a class="page" href="notice.jsp" style="text-decoration: none"><span>공지사항</span></a>
			<a class="page" href="board.jsp" style="text-decoration: none"><span>자유게시판</span></a>
			<a class="page" href="q_a.jsp" style="text-decoration: none"><span>문의사항</span></a>
			<a class="page" href="application.jsp" style="text-decoration: none"><span>도서신청</span></a>
		</div>
		<div id="btn_box">
			<a href="application_page.jsp"><input class="button" type="button" value="신청하기"></a>
		</div>
		<div id="bordertop">
			<div class="text_box">
				<h4 class="h_title">신청자격</h4>
				<ul>
					<li class="li_text">PLORS 회원만 신청이 가능합니다.</li>
				</ul>
			</div>
			<div class="text_box">
				<h4 class="h_title">신청방법</h4>
				<ul>
					<li class="li_text">PLORS 홈페이지 로그인 -> 현 페이지의 신청하기 클릭</li>
				</ul>
			</div>
			<div class="text_box">
				<h4 class="h_title">희망도서 신청</h4>
				<ul>
					<li class="li_text">희망도서 직접입력시 서명, 저자, 발행처, ISBN(국제표준도서번호),
						발행년도 등을 정확하게 입력하시기 바랍니다. <br /> <span class="point">도서정보가
							부정확할 경우 구입이 지연 또는 구입불가 처리될 수도 있습니다.(도서정보는 인터넷 서점 등에서 검색 후 입력 가능)</span>
					</li>
				</ul>
			</div>
			<div class="text_box">
				<h4 class="h_title">희망도서 신청권수</h4>
				<ul>
					<li class="li_text">1인당 월 3권, 1년에 15권으로 제한</li>
				</ul>
			</div>
			<div class="text_box">
				<h4 class="h_title">희망도서 진행 절차(도서 예약)</h4>
				<ul>
					<li class="li_text">신청한 도서가 선정절차를 거쳐 구입되어 이용되기까지는 2~3주 간의 기간이
						소요됩니다.</li>
				</ul>
			</div>
			<div class="text_box">
				<h4 class="h_title">선정 제외 도서</h4>
				<ul>
					<li class="li_text">문제집, 수험서, 중고등 참고서</li>
					<li class="li_text">판타지, 로맨스소설, 무협지</li>
					<li class="li_text">웹툰, 라이트노벨 등 각종 만화류</li>
					<li class="li_text">연감, 백서, 보고서 등 참고도서류</li>
					<li class="li_text">출판된 지 5년 이상된 자료 (컴퓨터 과학 신학문 분야는 2년)</li>
					<li class="li_text">유사도서가 많이 소장되어 있는 경우</li>
					<li class="li_text">신판이 발간되었음에도 구판을 신청한 경우</li>
				</ul>
			</div>
		</div>
	</div>


	<!-- 좌측 슬라이드 메뉴 -->
	<%@ include file="left_menu.jsp" %>	

	<!-- 하단 footer -->
	<%@ include file="footer.jsp" %>

</body>
</html>