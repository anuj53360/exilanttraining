package com.exilant.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.exilant.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rownum) throws SQLException {
		
		Employee e=new Employee();
		e.setEmpid(rs.getInt("EMPID"));
		e.setEmpName(rs.getString("EMPNAME"));
		e.setEmpSal(rs.getInt("EMPSAL"));
		return e;
	}

}
