package com.employee;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.service.EmployeeHierarchyService;

/**
 * EmpHierachyApp: SpringBoot main class responsible to bootstrap the
 * application when started.
 * 
 * @author Bijoy Baral
 * @version 1.0
 * @since 30-Sep-2020 07:01:00 PM
 *
 */

@SpringBootApplication
public class EmployeeHierarchyAppApplication implements CommandLineRunner {

	private EmployeeHierarchyService employeeHierarchyService;

	public EmployeeHierarchyAppApplication(EmployeeHierarchyService employeeHierarchyService) {
		this.employeeHierarchyService = employeeHierarchyService;
	}

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(EmployeeHierarchyAppApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF); // disable spring banner
		springApplication.run(args);
	}

	/**
	 * Call print hierarchy method to print hierarchy in application console.
	 * 
	 * @param ..args
	 */
	@Override
	public void run(String... args) throws Exception {
		employeeHierarchyService.printHierarchy();
	}
}