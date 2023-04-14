package kr.co.softsoldesk.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import kr.co.softsoldesk.beans.DataBean;

public class DataBeanValidator implements Validator
{
    //클래스(DataBean)가 유효성 검사가 가능한지 확인
	@Override
	public boolean supports(Class<?> clazz) {
		
		return DataBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//rejectIfEmpty : 값이 0이거나 null이면 위배
		ValidationUtils.rejectIfEmpty(errors, "data2", "error2");
		//rejectIfEmptyOrWhitespace : 값이 0이거나 null 또는 공백으로 입력시 에러
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "data3", "error3");
		
		DataBean bean1=(DataBean)target;
		
		String data2=bean1.getData2();
		String data3=bean1.getData3();
		
		if(data2.length() > 10 ) {
			errors.rejectValue("data2", "error4");
		}
		
		if(data3.contains("@") == false) {
			errors.rejectValue("data3", "error5");
		}
	}

}
