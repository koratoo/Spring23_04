package kr.co.softsoldesk.controller;
/* Java 1.8 샘플 코드 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import lombok.Data;
@Data
public class NaruBookSearch_16 {
	private String bookinfo;

	public static void main(String[] args) throws IOException {
		
	
	}

	public NaruBookSearch_16(String bookname) throws IOException {
		

		StringBuilder urlBuilder = new StringBuilder("http://data4library.kr/api/libSrchByBook"); /*URL*/
		urlBuilder.append("?authKey=" +  URLEncoder.encode("f3b4f68d3eecbe037cda6730e3b7da4c1067b66e97cd8d530cdbe385e09e0b9a","UTF-8") ); /*인증키 (sample사용시에는 호출시 제한됩니다.)*/
		urlBuilder.append("&keyword=" +  URLEncoder.encode(bookname,"UTF-8") ); 
		urlBuilder.append("&format=" +  URLEncoder.encode("json","UTF-8") ); 

		
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode()); /* 연결 자체에 대한 확인이 필요하므로 추가합니다.*/
		BufferedReader rd;

		// 서비스코드가 정상이면 200~300사이의 숫자가 나옵니다.
		if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
				rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
		}
		
		rd.close();
		conn.disconnect();
		bookinfo=sb.toString();
		System.out.println(sb.toString());
	}
	
}