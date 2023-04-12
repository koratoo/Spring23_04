<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>보유 도서 도서관 현황</title>
<!-- 메인페이지에서 도서 검색 후 실행되는 도서관&지도 화면 -->
<style>
        @font-face {
        font-family: 'GmarketSansMedium';
        src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.1/GmarketSansMedium.woff') format('woff');
        font-weight: normal;
        font-style: normal;
        }
        .container{
            font-family: 'GmarketSansMedium';
            width: 100%;
            height: 100%;
            background-color: rgb(253, 253, 253);
            display: flex;
            flex-direction: row;
        }
        
        /* 왼쪽 큰 박스 */
        .searchLibInfo{
            width: 700px;
            height: 800px;
            margin-left:30px;
            background-color: rgb(255, 255, 255);
            scrollbar-color: black white; 
        }
        

        .LibImage1{
            background-image: url('image/lib1.png');
            background-size: cover;      
            border-radius: 50%;          
            width: 150px;
            height: 150px;
            float: left;
        }
        .LibImage2{
            background-image: url('image/lib2.png');
            background-size: cover;   
            border-radius: 50%;          
            width: 150px;
            height: 150px;
            float: left;
        }
        .LibImage3{
            background-image: url('image/lib3.png');
            background-size: cover;  
            border-radius: 50%;          
            width: 150px;
            height: 150px;
            float: left;
        }
        /* 검색하면 나오는 도서관 div상자 */
        .aVenue{
            display: flex;
            width: 600px;
            height: 150px;
            background-color: rgb(255, 255, 255);
            margin-bottom: 10px;
        }
        #search{
            border-radius: 10px;
        }
        .libInfo1{
           text-align: left;
           padding: 40px 10px;
        }
        /* 지역 */
        #loc{
            margin-right: 100px;
            color:rgb(144, 209, 47);
            font-size: 15px;
        }
        

        .mapInfo{
            width: 1200px;
            height: 800px;
            background-color: rgb(255, 255, 255);
            background-image: url('image/sample_map.png');
        }

        #button{
            width: 80px;
            height: 40px;
            background-color:#0a0a23;
            color: #fff;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div style="text-align:center;">
    <h2>헤더영역</h2>
    <hr/>
        <div class="container">
            <div class="searchLibInfo">
                <div class="searchLibMainInfo">
                    <h2>{책이름} 보유 도서관 현황</h2>
                    <input id="search" type="text" style="width: 600px; height: 50px;" value="도서관 검색"><br><br>
                    <input id="button" type="button" value="카테고리" style="float: left; margin-left: 22px;">
                    <input id="button" type="button" value="세부선택" style="float: left; margin-left: 22px;"><br>
                    <h5>내 위치로 검색하기</h5>
                </div>
                <h6 style="text-align: left; margin-left: 20px; color:darkgrey">총 3 개의 검색 결과</h6>
                <hr/>
                <div class="aVenue">
                    <div class="LibImage1"></div>
                    <div class="libInfo1">
                        <span id="library">등빛도서관</span> <span id="loc">강서구</span> <br><br>
                        <span>서울특별시 강서구 등촌제3동 강서로62길 48</span>
                    </div> 
                </div>
                <div class="aVenue">
                    <div class="LibImage2"></div>
                    <div class="libInfo1">
                        <span id="library">강동구립 강일도서관</span> <span id="loc">강동구</span><br><br>
                        <span>서울특별시 강동구 아리수로93길 9-14 4,5층</span>
                    </div> 
                </div>
                <div class="aVenue">
                    <div class="LibImage3"></div>
                    <div class="libInfo1">
                        <span id="library">논현도서관</span> <span id="loc">강남구</span><br><br>
                        <span>	서울특별시 강남구 학동로43길 17</span>
                    </div> 
                </div>
            </div>

            <div class="mapInfo">

            </div>
        </div>
        <!--container-->
</div>
	
</body>
</html>