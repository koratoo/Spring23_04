package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{
	
	private int price;
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성 ");
	}
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성 ");
		this.speaker = speaker;
	}
	public SamsungTV(int price,SonySpeaker speaker) {
		System.out.println("===> SamsungTV(3) 객체 생성 ");
		this.price=price;
		this.speaker = speaker;
	}
	
	public void powerOn() {
		
	}
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}
	public void volumeUp() {
		// TODO Auto-generated method stub
		
	}
	public void volumeDown() {
		// TODO Auto-generated method stub
		
	}

}
