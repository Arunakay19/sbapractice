package org.perscholas.sbapractice;


import org.perscholas.sbapractice.models.Employee;
import org.perscholas.sbapractice.models.Office;
import org.perscholas.sbapractice.services.EmployeeServices;
import org.perscholas.sbapractice.services.OfficeServices;

public class MyCommandLineRunner {
   public static void addData() {
	

    EmployeeServices es = new EmployeeServices();
    es.createOrUpateStudent(App.employees[0]);
    es.createOrUpateStudent(App.employees[1]);
    
  
    
    OfficeServices os = new OfficeServices();
    os.createOrUpateOffices(App.offices[0]);
    os.createOrUpateOffices(App.offices[1]);
     
   }
    		
}