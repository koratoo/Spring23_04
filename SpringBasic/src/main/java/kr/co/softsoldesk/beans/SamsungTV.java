package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{

	
	public SamsungTV() {
		System.out.println("===> SaumsungTV 객체 생성");
	}

	public void powerOn() {
		System.out.println("삼성티비 켜기");
	}

	public void powerOff() {
		System.out.println("삼성티비 끄기");
		
	}

	public void volumeUp() {
		System.out.println("삼성티비 볼륨 높이기");
		
	}

	public void volumeDown() {
		System.out.println("삼성티비 볼륨 낮추기");

		
	}
	
	
}
