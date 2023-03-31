package kr.co.softsoldesk.beans;

public class SoldeskTV implements TV{
	public SoldeskTV() {
		System.out.println("===> 솔데TV 객체 생성");
	}

	public void powerOn() {
		System.out.println("솔데 켜기");
	}

	public void powerOff() {
		System.out.println("솔데 끄기");
		
	}

	public void volumeUp() {
		System.out.println("솔데 볼륨 높이기");
		
	}

	public void volumeDown() {
		System.out.println("솔데 볼륨 낮추기");

		
	}
	
}
