/* Java 1.8 샘플 코드 */

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class NaruBookSearch_13 {
	

	public static void main(String[] args) throws IOException {
		
	
		StringBuilder urlBuilder = new StringBuilder("http://data4library.kr/api/libSrchByBook"); /*URL*/
		urlBuilder.append("?authKey=" +  URLEncoder.encode("","UTF-8") ); /*인증키 (sample사용시에는 호출시 제한됩니다.)*/
		urlBuilder.append("&isbn=" +  URLEncoder.encode("9791161571188","UTF-8") ); 
		urlBuilder.append("&region=" +  URLEncoder.encode("11","UTF-8") ); 
	
		
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
		}
		rd.close();
		conn.disconnect();
		System.out.println(sb.toString());
	}
}