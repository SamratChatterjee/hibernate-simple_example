package com.teksystems;

public class EmployeeService {
	public static void main(String[] args) {

		EmployeeDAO empDAO = new EmployeeDAO();

		/*
		 * Initializing the employee object here and then trying to insert the record
		 * Create operation of CRUD
		 */

		Employee createEmp1 = new Employee(1, "Sachin","R&D");
		Employee createEmp2 = new Employee(2, "Rohit","R&D");
		empDAO.insert(createEmp1);
		empDAO.insert(createEmp2);
		
		/*
		 * Read operation of CRUD
		 */

		Employee readEmp = empDAO.get(1); 
		System.out.println(readEmp);
		
		/*
		 * Update operation of CRUD
		 */

		Employee updateEmp = new Employee(1,"Sachin Tendulkar","R&D");        
		empDAO.update(updateEmp);
		
		/*
		 * Delete operation of CRUD
		 */

		empDAO.delete(1); 

	}
}
