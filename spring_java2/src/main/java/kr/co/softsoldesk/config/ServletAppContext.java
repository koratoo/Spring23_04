package kr.co.softsoldesk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan("kr.co.softsoldesk.controller")
@EnableWebMvc//controller로 등록되어 있는 클래스 세팅
@Configuration
public class ServletAppContext implements WebMvcConfigurer{//스캔할 패키지

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		//이미지 ,영상 ,소리 등 정적 파일 경로 매핑
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/",".jsp");
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//view경로와 확장자 셋팅
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}


}
