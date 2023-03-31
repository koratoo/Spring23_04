package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.HelloWorld;
import kr.co.softsoldesk.beans.TV;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		HelloWorld hello1 = (HelloWorld)ctx.getBean("hello1");
	
		
		TV samtv = (TV)ctx.getBean("samtv");
		TV soltv = (TV)ctx.getBean("soltv");
		
		
		
		samtv.powerOff();
		samtv.powerOn();
		samtv.volumeDown();
		samtv.volumeUp();
		
		soltv.powerOff();
		soltv.powerOn();
		soltv.volumeDown();
		soltv.volumeUp();
		
		callhello(hello1);
		ctx.close();
	}
	
	public static void callhello(HelloWorld hello) {
		
		hello.sayHello();
	}
	
	public static void powerOn(TV tv) {
		tv.powerOn();
	}
	public static void powerdown(TV tv) {
		tv.powerOff();
	}
	public static void volumeUp(TV tv) {
		tv.volumeUp();
	}
	public static void volumnDown(TV tv) {
		tv.volumeDown();
	}
}

/* ClassPathXmlApplicationContext : 인스턴스 변수(객체)를 편리하게 생성하는 클래스 */