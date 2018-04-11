package design;

import java.util.*;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo employeeInfo = new EmployeeInfo("", 0);
		//employeeInfo.employeeName();
		//employeeInfo.employeeId();
		//Name and ID of employees
		employeeInfo.EmployeeNameAndID();
		//Company Name
		System.out.println(EmployeeInfo.companyName);
		//Calculating Salary
		employeeInfo.calculateSalary(200, 6000);
		//Calculating Bonus
		EmployeeInfo.calculateEmployeeBonus(20, 200, 6000);
		//Maximum Salary
		employeeInfo.getMaxSalary(280000);
		//Benefits
		employeeInfo.benefitLayout(5, 10000);
		//Assigning employees to departments
		employeeInfo.assignDepartment();








	}

}
