package org.perscholas.sbapractice;

import java.util.Scanner;

import lombok.*;
/*
@Data
@NoArgsConstructor
@RequiredArgsConstructor
class Employee {
   @NonNull
   int id;
   @NonNull
   String name;
   @NonNull @ToString.Exclude
   String password;
   Office office;
}

@Data
@RequiredArgsConstructor
class Office {
   @NonNull
   int id;
   @NonNull
   String office;
}

public class Main {
   static Employee[] employees = new Employee[]{
           new Employee(1, "John", "john123"),
           new Employee(2, "Jane", "jane123")
   };
   static Office[] offices = new Office[]{
           new Office(1, "NYC"),
           new Office(2, "LAX")};

   public static void main(String[] args) {
   
	   Scanner scanner = new Scanner(System.in);

       while (true) {
           try {
               System.out.println("1. Get employee by name");
               System.out.println("2. Check password for employee");
               System.out.println("3. Get all offices");
               System.out.println("4. Quit");

               int choice = scanner.nextInt();

               switch (choice) {
                   case 1: 
                       System.out.println("Enter employee name:");
                       String name = scanner.next();
                       
                       Employee employee = getEmployeeByName(name);
                       if (employee == null) {
                           System.out.println("Employee not found");
                       } else {
                           System.out.println("Employee found: " + employee.getName());
                       }
                     break;
                  case 2:
                	  System.out.println("Enter employee name:");
                      String emp_name = scanner.next();
                      System.out.println("Enter employee password: ");
                      String emp_password = scanner.next();
                      
                      boolean valid = validPassword(emp_name, emp_password);
                      if (valid) {
                          System.out.println("Employee is not valid");
                      } else {
                          System.out.println("Employee is Valid");
                      }
                    break;
                   /*
                  case 3:
                	  System.out.println("Enter employee name:");
                      String emp_name = scanner.next();
                      System.out.println("Enter employee password: ");
                      String emp_password = scanner.next();
                      
                      boolean valid = validPassword(emp_name, emp_password);
                      if (valid) {
                          System.out.println("Employee is not valid");
                      } else {
                          System.out.println("Employee is Valid");
                      }
                    break;       	
                   	
               }
           }
           catch(Exception e) {
        	   System.out.println(e);
           }
       }
   }
                   


   public static Employee getEmployeeByName(String emp_name) {
       for (Employee employee : employees) {
           if (employee.getName().equals(emp_name)) {
               return employee;
           }
       }
       
       return null;
   }

   public static boolean validPassword(String emp_name,String emp_password) {
	   for (Employee employee : employees) {
           if (employee.getName().equals(emp_name)
        		   && employee.getPassword().equals(emp_password)) {
               return true;
           }
       }
       return false;
   }

   public static Office[] getAllOffices() {
       return offices;
   }
   
}
*/
