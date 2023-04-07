package kr.co.softsoldesk.main;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.mapper.MapperInterface;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MapperInterface mapper = ctx.getBean("test_mapper",MapperInterface.class);
		
		//insert
//		JdbcBean bean2 = new JdbcBean();
//		bean2.setInt_data(11);
//		bean2.setStr_data("Spring Framework");
//		mapper.insert_data(bean2);
		
		//update
		JdbcBean bean3 = new JdbcBean();
//		bean3.setInt_data(11);
//		bean3.setStr_data("업데이트");
//		mapper.update_data(bean3);
		
		mapper.delete_data(11);
		
		//select
		List<JdbcBean> list = mapper.select_data();
		for(JdbcBean bean1 : list) {
			System.out.println(bean1.getInt_data());
			System.out.println(bean1.getStr_data());
			System.out.println("=======================");
		}
		ctx.close();
	}
}
