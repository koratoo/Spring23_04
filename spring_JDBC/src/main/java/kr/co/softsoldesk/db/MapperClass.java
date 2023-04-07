package kr.co.softsoldesk.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.co.softsoldesk.beans.JdbcBean;

@Component
public class MapperClass implements RowMapper<JdbcBean> {
//RowMapper<JdbcBean> 상속 : ResultSet으로 반환하는데 JdbcBean을 넘겨주겠다.
	public JdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		JdbcBean bean = new JdbcBean();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}
	
	
}

