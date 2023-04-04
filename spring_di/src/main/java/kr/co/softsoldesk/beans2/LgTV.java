package kr.co.softsoldesk.beans2;

import kr.co.softsoldesk.beans.TV;

public class LgTV implements TV {

	private int price;
	private AppleSpeaker speaker;
	
	public LgTV() {
		System.out.println("LGTV 객체 생성");
	}
	
	
	
	public LgTV(int price, AppleSpeaker speaker) {
		this.price = price;
		this.speaker = speaker;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public AppleSpeaker getSpeaker() {
		return speaker;
	}



	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}



	public void powerOn() {
		System.out.println("LGTV 켜기");
		
	}

	public void powerOff() {
		System.out.println("LGTV 끄기");
		
	}

	public void volumeUp() {
		speaker.volumeUp();
		System.out.println("LGTV 소리올려");
		
	}

	public void volumeDown() {
		speaker.volumeDown();
		System.out.println("LGTV 소리내려");
		
	}

}
