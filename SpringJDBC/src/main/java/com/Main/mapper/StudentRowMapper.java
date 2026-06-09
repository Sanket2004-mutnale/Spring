package com.Main.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Main.bean.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student std =new Student();
		
		std.setName(rs.getNString("Name"));;
		std.setRoll_No(rs.getInt("Roll_No"));
		std.setMarks(rs.getInt("Marks"));
		
		return std;
	}

}
