package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.TV;

public class TVMain {

	public static void main(String[] args) {
		
//		스프링 컨테이너 구동
//		AbstractApplicationContext : BeanFactory + ApplicationContext
//		GenericXmlApplicationContext : 파일과 클래스 관리 설정(xml)
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//컨테이너로부터 필요한 객체를 요청하기
		TV tv1 = (TV)ctx.getBean("samtv");
		TV tv2 = (TV)ctx.getBean("soltv");
		tv1.volumeUp();
		tv2.volumeDown();
		tv1.powerOn();
		tv2.powerOff();
	}
}
