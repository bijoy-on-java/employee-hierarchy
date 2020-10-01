Project Name
-------------
Hierarchical relationship among employees.

Abstract Overview
------------------
Below is employee data of a small company. It represents the hierarchical relationship among employees. CEO of the company doesn't
have a manager.

Prerequisites/ Installing
--------------------------
Following tools and technologies are used/required to implement, build and run this project.
1. Java 1.8
2. Spring Boot 2.1.1.RELEASE
3. Mockito API
4. Unit test using JUnit 
5. JUnit code coverage
6. Tomcat
7. Eclipse IDE
8. Github repository
9. Windows OS
10. Gradle Build

You need to install, configure and setup above in your system.

Build / Deployment
-------------------
You can follow the steps below in order to build and run this project in your local machine.
1. Clone the project from the repository by executing following command to you local workspace by using GIT tools:
   git clone https://github.com/bijoy-on-java/employee-hierarchy.git
2. Resolve all compilation issues in your local dev environment using Eclipse/IntelliJ IDE.
3. Run 'gradle build' from project root directory
4. Once the project successfully build run the project using 'gradlew.bat bootRun'. or you can run through Eclipse main application class or run through test service
   class.
    
Design Specification and REST API Data flow
-------------------------------------------
EmployeeHierarchyAppApplication -> EmployeeHierarchyService 

1. EmployeeHierarchyAppApplication.class bootstrap the application when started.
2. Service method printHierarchy() get called when application run.

Running test(s)[End Point Testing and Mockito/Junit with approximately 90% code coverage]
---------------------------------------------------------------------------
Following test has to be performed to check for validation or any exception edge-case scenarios:

	1. All unit test cases can be covered by using Mockito/Junit API. Almost every method(s) are void. Hence Test cases not required.
	However I have written one Test case for 90% code coverage to meet the expectation.

Build and Deployment
--------------------
	1. Gradle is used to build the project.
	2. Deployment have been done using Spring Boot's embeded Tomcat Apache Server.

Cucumber BDD
------------
Sample feature files have been created for demonstration purpose, considering time factor(s). These features are not automated.

Screenshots
----------------------------------------------------------
Separate doc file has been created to capture all the screenshots. Please find document labeled as 'Employee-Hierarchy.docx'



Approach: Application deployment using Docker container
------------------------------------------------------
Application can be containerized using Docker.
	

Author(s)
---------
Name: Bijoy Baral

Conclusion(s)
-------------
Hope I have made some positive contribution toward(s) this project. WIll be happy to get more idea(s) and suggestion(s)

Thank you so much in advance for any idea(s)/suggestion(s)


Best R,
Bijoy
   	  

 
