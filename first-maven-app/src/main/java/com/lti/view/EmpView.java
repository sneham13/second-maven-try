package com.lti.view;

import com.lti.model.Employee;

public class EmpView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		
		
		emp.setEmpId(1002);
		emp.setEmpName("Sneha");
		
		
		System.out.println("ID: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());

	}

}