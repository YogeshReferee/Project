package com.Employee1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository rep;

	public Employee setEmployee(Employee e) {
		return rep.save(e);
	}
}
