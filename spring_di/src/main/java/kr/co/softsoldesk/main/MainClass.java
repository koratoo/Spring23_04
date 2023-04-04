package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.TV;
import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//#1
		TestBean t1 =new TestBean();
		t1.printData();
		System.out.println("-----------------------------");
		TestBean obj1 = ctx.getBean("obj1",TestBean.class);
		System.out.println("obj1"+obj1);
		System.out.println("==============================");
		
		//#2 int
		TestBean t2 =new TestBean(100);
		t2.printData();
		System.out.println("-----------------------------");
		TestBean obj2 = ctx.getBean("obj2",TestBean.class);
		System.out.println("obj2"+obj2);
		System.out.println("==============================");
		
		//#3 double
		TestBean t3 =new TestBean(11.11);
		t3.printData();
		System.out.println("-----------------------------");
		TestBean obj3 = ctx.getBean("obj3",TestBean.class);
		System.out.println("obj3"+obj3);
		System.out.println("==============================");
		
		//#4 String
		TestBean t4 =new TestBean("soldesk");
		t4.printData();
		System.out.println("-----------------------------");
		TestBean obj4 = ctx.getBean("obj4",TestBean.class);
		System.out.println("obj4"+obj4);
		System.out.println("==============================");

		//#5 All
		TestBean t5 =new TestBean(11,11.11,"soldesk");
		t5.printData();
		System.out.println("-----------------------------");
		TestBean obj5 = ctx.getBean("obj5",TestBean.class);
		System.out.println("obj5"+obj5);
		System.out.println("==============================");
		
		//#6 순서 변경
		//TestBean t6 =new TestBean(11,"softsol",11.11);
		//t6.printData();
		System.out.println("-----------------------------");
		TestBean obj6 = ctx.getBean("obj6",TestBean.class);
		System.out.println("obj6"+obj6);
		System.out.println("==============================");
		
		//#7 인덱스
		System.out.println("-----------------------------");
		TestBean obj7 = ctx.getBean("obj7",TestBean.class);
		obj7.printData();
		System.out.println("obj7"+obj7);
		System.out.println("==============================");
	
		
		//java
		DataBean d1 = new DataBean();
		DataBean d2 = new DataBean();
		TestBean1 t200 = new TestBean1(d1, d2);
		t200.printData();
		
		TestBean1 obj8 = ctx.getBean("obj8",TestBean1.class);
		obj8.printData();
		System.out.println("==============================");
		
		TestBean1 obj9 = ctx.getBean("obj9",TestBean1.class);
		obj9.printData();
		System.out.println("==============================");
		
		
		//활용
		TV tv = (TV)ctx.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumeDown();
		tv.volumeUp();
		
		ctx.close();
	}
}
