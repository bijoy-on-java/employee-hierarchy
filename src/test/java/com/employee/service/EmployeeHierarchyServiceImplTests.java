package com.employee.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * EmpHierachyApp: Unit Test suite verify testing of multiple scenario's in the
 * service class.
 * 
 * @author Bijoy Baral
 * @version 1.0
 * @since 30-Sep-2020 07:01:00 PM
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class EmployeeHierarchyServiceImplTests {

	@InjectMocks
	EmployeeHierarchyServiceImpl employeeHierarchyService = new EmployeeHierarchyServiceImpl();
	
	/**
	 * Test scenario : This method is to verify successful display of employee
	 * hierarchy in display console.
	 * 
	 */
	@Test
	public void testPrintHierarchy() {
		employeeHierarchyService.printHierarchy();
	}

}
