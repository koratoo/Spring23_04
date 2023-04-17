package kr.co.softsoldesk.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
	
	private Long mb_no;
	private String mb_name;
	private String mb_tel;
	private String mb_email;
	private String mb_pw;
	private String mb_addr;
	
	public Member(String mb_name, String mb_tel, String mb_email, String mb_pw, String mb_addr) {
	
		this.mb_name = mb_name;
		this.mb_tel = mb_tel;
		this.mb_email = mb_email;
		this.mb_pw = mb_pw;
		this.mb_addr = mb_addr;
	}
	
	

}
