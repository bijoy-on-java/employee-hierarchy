package com.employee.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * EmpHierachyApp: Service implementation class responsible to construct employee list and populates them based on their hierarchy. 
 * Where CEO does not have any manager.
 * 
 * @author Bijoy Baral
 * @version 1.0
 * @since 30-Sep-2020 07:01:00 PM
 *
 */

@Service
public class EmployeeHierarchyServiceImpl implements EmployeeHierarchyService {

	private Map<Integer, Employee> employeesMap = new HashMap<>(); // stores (id, employee) pair
	private Employee root;

	/**
	 * Method responsible to build and print the hierarchy tree.
	 * 
	 * @param
	 * @return
	 */
	@Override
	public void printHierarchy() {
		String[] employees = { "100 Alan 150", "220 Martin 100", "150 Jamie", "275 Alex 100", "400 Steve 150",
				"190 David 400" };
		final EmployeeHierarchyServiceImpl employeeTree = new EmployeeHierarchyServiceImpl();
		employeeTree.readDataAndCreateMap(employees);
		employeeTree.buildHierarchyTree(employeeTree.root);
		printToConsole(employeeTree);

	}
	
	/**
	 * Read data and build map, Iteration, Time O(n), Space O(n), n is number of employees
	 * 
	 * @param lines
	 */
	private void readDataAndCreateMap(final String[] lines) {
		Employee employee = null;
		for (final String strLine : lines) {
			final String[] values = strLine.split(" ");
			if (values.length >= 3)
				employee = new Employee(values[0], values[1], values[2]);
			else
				employee = new Employee(values[0], values[1], "0");
			employeesMap.put(employee.id, employee);
			if (employee.managerId == 0)
				root = employee;
		}
	}

	/**
	 * Build tree, Recursion, Time O(n), Space O(h), n is number of employees, h is levels of hierarchy tree
	 * 
	 * @param root
	 * @return
	 */
	private void buildHierarchyTree(Employee root) {
		final Employee employee = root;
		final List<Employee> subs = getSubsById(employee.id);
		employee.employees = subs;
		if (subs.size() == 0)
			return;
		for (final Employee em : subs)
			buildHierarchyTree(em);
	}

	/**
	 * Get subordinates list by given id, Time O(n), Space O(k) ~ O(n), k is number of employees(subordinates)
	 * 
	 * @param managerId
	 * @return
	 */
	private List<Employee> getSubsById(int managerId) {
		final List<Employee> subordinates = new ArrayList<Employee>();
		for (final Employee employee : employeesMap.values()) {
			if (employee.managerId == managerId)
				subordinates.add(employee);
		}
		return subordinates;
	}
	
	/**
	 * Print employee tree, adding Recursion with Time O(n) and Space O(h) complexity.
	 * 
	 * @param root
	 * @param level
	 */
	private void printHierarchyTree(final Employee root, final int level) {
		for (int i = 0; i < level; i++)
		System.out.print("\t");
		System.out.println(root.name);
		final List<Employee> subordinates = root.employees;
		for (final Employee employee : subordinates) {
			printHierarchyTree(employee, level + 1);
		}
	}
	
	/**
	 * Method contains Syout statement to print/output employee hierarchy to application console.
	 * 
	 * @param employeeTree
	 * @return 
	 */
	private void printToConsole(final EmployeeHierarchyServiceImpl employeeTree) {
		System.out.println("\n");
		System.out.println("##########################################" + "\n");
		employeeTree.printHierarchyTree(employeeTree.root, 0);
		System.out.println("\n");
		System.out.println("##########################################" + "\n");
	}
}
