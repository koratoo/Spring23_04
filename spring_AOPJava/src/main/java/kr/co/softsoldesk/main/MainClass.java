package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.config.BeanConfigClass;


public class MainClass {

	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
//		
//		ctx1.close();
	
		System.out.println("======================JAVA===================");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1 = ctx2.getBean(TestBean1.class);
		
		try {
			
			java1.method1();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		ctx2.close();
	}
}
