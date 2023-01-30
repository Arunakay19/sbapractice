package org.perscholas.sbapractice;

import java.util.Scanner;
import java.util.ArrayList;
/*
class Employee {
    private String name;
    private String password;

    public Employee(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public boolean validPassword(String password) {
        return this.password.equals(password);
    }
}

class Office {
    private String location;
    private ArrayList<Employee> employees;

    public Office(String location) {
        this.location = location;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}

class EmployeeSystem {
    private ArrayList<Office> offices;

    public EmployeeSystem() {
        offices = new ArrayList<>();
    }

    public void addOffice(Office office) {
        offices.add(office);
    }

    public Employee getEmployeeByName(String name) {
        for (Office office : offices) {
            for (Employee employee : office.getEmployees()) {
                if (employee.getName().equals(name)) {
                    return employee;
                }
            }
        }
        return null;
    }

    public ArrayList<Office> getAllOffices() {
        return offices;
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeSystem system = new EmployeeSystem();

        // Add offices
        system.addOffice(new Office("New York"));
        system.addOffice(new Office("London"));

        // Add employees
        system.getAllOffices().get(0).addEmployee(new Employee("John Smith", "password123"));
        system.getAllOffices().get(0).addEmployee(new Employee("Jane Doe", "password456"));
        system.getAllOffices().get(1).addEmployee(new Employee("Bob Smith", "password789"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. Get employee by name");
                System.out.println("2. Check password for employee");
                System.out.println("3. Get all offices");
                System.out.println("4. Quit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: {
                        System.out.println("Enter employee name:");
                        String name = scanner.next();
                        
                        Employee employee = getEmployeeByName(name);
                        if (employee == null) {
                            System.out.println("Employee not found");
                        } else {
                            System.out.println("Employee found: " + employee.get
                            		
*/
