package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.config.BeanConfigClass;



public class MainClass {

	public static void main(String[] args) {
		
		
	
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
	
	
		
		
		ctx.close();
		
	}
}
