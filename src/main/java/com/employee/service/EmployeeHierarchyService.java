package com.employee.service;

import org.springframework.stereotype.Service;

/**
 * EmpHierachyApp: Service interface responsible to construct employee list and populates them based on their hierarchy. 
 * Where CEO does not have any manager.
 * 
 * @author Bijoy Baral
 * @version 1.0
 * @since 30-Sep-2020 07:01:00 PM
 *
 */

@Service
public interface EmployeeHierarchyService {
	
	public void printHierarchy();

}
