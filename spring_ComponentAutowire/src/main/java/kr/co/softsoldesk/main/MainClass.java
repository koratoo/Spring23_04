package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.config.BeanConfigClass;



public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
	
		TestBean1 t1 = ctx.getBean(TestBean1.class);
		System.out.println("-----------TestBean1-------------");
		System.out.println(t1.getData1());
		System.out.println(t1.getData2());
		System.out.println(t1.getData3());
		System.out.println(t1.getData4());
		System.out.println(t1.getData5());
		System.out.println();
		
		System.out.println("-----------TestBean2------------");
		TestBean2 t2 = ctx.getBean(TestBean2.class);
		System.out.println(t2.getData1());
		System.out.println(t2.getData2());
		System.out.println(t2.getData3());
		System.out.println(t2.getData4());
		
		System.out.println("-----------TestBean3------------");
//		TestBean3 java2 = ctx.getBean("java2",TestBean3.class);
//		System.out.println(java2.getData1());
//		System.out.println(java2.getData2());
//		System.out.println(java2.getData3());
//		System.out.println();
		
		TestBean3 t3 = ctx.getBean(TestBean3.class);
		System.out.println(t3.getData1());
		System.out.println(t3.getData2());
		
		
		
		ctx.close();
		
		
		
	}
}
