package com.exilant.db;

import java.util.List;

import javax.sql.DataSource;

import com.exilant.entity.Employee;

public interface IEmployeeDAO {

	public Employee getEmployee(int empId);
	
	public List<Employee> getAllEmployee();
	
	public void insertEmployee(Employee employee);
	
	public void deleteEmployee(int empId);
	
	public void updateEmployee(int empId,int empNewSalary);
	
	
	public void setDataSource(DataSource datasource);
}
