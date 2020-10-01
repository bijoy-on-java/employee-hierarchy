package com.employee.service;

import java.util.List;

/**
 * EmpHierachyApp: POJO Class is responsible to hold id, manager id and name of the employees.
 * 
 * @author Bijoy Baral
 * @version 1.0
 * @since 30-Sep-2020 07:01:00 PM
 *
 */
public class Employee {

	protected int id, managerId;

	protected String name;

	protected List<Employee> employees;

	/**
	 * Constructor with Time O(1) and Space O(1) complexity.
	 * 
	 * @param id
	 * @param name
	 * @param managerId
	 */
	public Employee(String id, String name, String managerId) {
		this.id = Integer.parseInt(id);
		this.name = name;
		this.managerId = Integer.parseInt(managerId);
	}
}