package com.exilant.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;

import com.exilant.db.IEmployeeDAO;
import com.exilant.entity.Employee;
import com.exilant.rowmapper.EmployeeMapper;

public class EmployeeDAO implements IEmployeeDAO {

private	JdbcTemplate jdbctemplate;

private DataSource datasource;

	
	@Override
	public Employee getEmployee(int empId) {
		
	String sql="Select EMPID,EMPNAME,EMPSAL from employee where EMPID=? ";
//		
//	Employee employee=jdbctemplate.queryForObject(sql, new Object[] {empId},new BeanPropertyRowMapper<>(Employee.class));
		
		Employee employee=jdbctemplate.queryForObject(sql, new Object[] {empId},new EmployeeMapper());
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		String sql="Select * from employee";
		
		List<Employee> employee=new ArrayList<Employee>();
		
		List<Map<String, Object>> rows=jdbctemplate.queryForList(sql);
		for(Map row:rows) {
			Employee empl=new Employee();
			
			empl.setEmpid(Integer.parseInt(row.get("EMPID").toString()));
			empl.setEmpName((row.get("EMPNAME").toString()));
			empl.setEmpSal(Integer.parseInt(row.get("EMPSAL").toString()));
		
			employee.add(empl);
		}
		
		return employee;
	}

	@Override
	public void insertEmployee(Employee employee) {
	String sql="insert into employee (EMPID, EMPNAME, EMPSAL) values (?,?,?)";
	int x=jdbctemplate.update(sql,employee.getEmpid(),employee.getEmpName(),employee.getEmpSal());
	System.out.println(x);	
	}

	@Override
	public void deleteEmployee(int empId) {
	String sql="DELETE from employee where EMPID=?";
	int x=jdbctemplate.update(sql,new Object[] {empId},new BeanPropertyRowMapper<>(Employee.class));	
	System.out.println(x);	
	}

	@Override
	public void updateEmployee(int empId, int empNewSalary) {
		
		String sql="UPDATE employee SET EMPSAL = ? WHERE EMPID = ?";
		int x=jdbctemplate.update(sql,new Object[] {empId,empNewSalary},new BeanPropertyRowMapper<>(Employee.class));
	System.out.println(x);
	}

	@Override
	public void setDataSource(DataSource datasource) {
		this.datasource=datasource;
		this.jdbctemplate=new JdbcTemplate(datasource);
		
		
	}

}
