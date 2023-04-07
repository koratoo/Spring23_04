package kr.co.softsoldesk.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {

	public void beforeMethod() {
		System.out.println("BeforeMethod 호출!");
	}
	public void AfterMethod() {
		System.out.println("AftereMethod 호출!");
	}
	
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("aroundMethod호출1");
		
		Object obj = pjp.proceed();
		System.out.println("aroundMethod호출2");
		return obj;
	}
	public int aroundIntMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("aroundIntMethod호출1");
		
		int a1 =(Integer) pjp.proceed();
		System.out.println("aroundIntMethod호출2");
		return a1;
	}
	
	//정상적으로 끝났을 때
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 메소드 => 정상종료");
	}
	
	//예외 발생할때 실행되는 메서드
	public void afterThrowingMethod() {
		System.out.println("afterThrowingMethod 메소드 => 예외발생");
	}
}
