package com.cs;

import java.util.ArrayList;
import java.util.List;

public class Util {
	
	public static List<Employee> getData(){
		List<Employee> emps= new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		//e1.setId(1);
//		e1.setName("John");
		e1.setEmail("name.com");
		emps.add(e1);
		
		
		
		Employee e2 = new Employee();		
		e2.setName("John");
		e2.setEmail("name.com");
		emps.add(e2);
		
		Employee e3 = new Employee();		
		e3.setName("John");
		e3.setEmail("name@.com");
		emps.add(e3);
		
		
		
		return emps;
	}
}
