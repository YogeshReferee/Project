package com.Employee1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;

	public Employee setEmployee(Employee e) throws SalaryException  {
		
		if(e.getSalary()<35000) {
			throw  new SalaryException("not allow for the DB");
		}else
		return dao.setEmployee(e);
	}
}
