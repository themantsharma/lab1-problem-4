package com.org.lab1.collection;

import java.util.ArrayList;
import java.util.List;
import com.org.lab1.employee.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Collection {

	private List<Employee> empList= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		empList.add(new Employee(100, "Hemant",890000.0));
		empList.add(new Employee(101,"ashu",95000.0));
		empList.add(new Employee(112,"deepak", 20000.0));
		empList.add(new Employee(113,"kalyan",55000.0));
		
		return empList;
	}
}
