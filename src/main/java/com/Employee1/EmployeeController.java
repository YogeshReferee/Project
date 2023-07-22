package com.Employee1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService ser;

	@PostMapping(value = "/post")
	public Employee setEmployee(@RequestBody Employee e) throws SalaryException {
		return ser.setEmployee(e);
	}

}
