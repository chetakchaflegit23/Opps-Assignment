package com.yash.opps1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test 
{
	public static void main(String[] args) throws ParseException {
		Department[] deptDepartments = new Department[2];
		deptDepartments[0] = new Department("Dept101", "Hr Department");
		deptDepartments[1] = new Department("Dept201", "It Department");

		String birthDate = "31/12/1993";
		Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);

		String joinDate = "22/7/2022";
		Date doj = new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);

		String regDate = "01/02/2022";
		Date dor = new SimpleDateFormat("dd/MM/yyyy").parse(regDate);

		Employee e = new Employee(1, "chetak", "warje", dob, 100000.00, doj, "nagpur", deptDepartments[1], 78945,
				"chetakchafle@gmail.com");

		Customer c = new Customer(101, "amit", "wadala", dob, dor, "Oune", 11450, "amitwag@gmail.com");

		System.out.println("Employee Details"); e.printEmployeeDetails();
		
		System.out.println("\ncustomer Details");c.printCustomerDetails();
		
	}

}
