package kr.co.softsoldesk.database;

import org.apache.ibatis.annotations.Insert;

import kr.co.softsoldesk.beans.Payment;

public interface PaymentMapperInterface {

	@Insert("insert into payment (user_id, amount) values (#{user_id}, #{amount} )")
	void insert_data(Payment payment);
}
