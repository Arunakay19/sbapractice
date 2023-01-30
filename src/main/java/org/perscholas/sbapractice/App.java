package org.perscholas.sbapractice;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.perscholas.sbapractice.HibernateUtil;
import org.perscholas.sbapractice.models.Employee;
import org.perscholas.sbapractice.models.Office;
import org.perscholas.sbapractice.services.EmployeeServices;


/**
 * Hello world!
 *
 */
public class App {
	static Employee[] employees = new Employee[] { new Employee(1, "John", "john123"),
			new Employee(2, "Jane", "jane123") };
	static Office[] offices = new Office[] { new Office(1, "NYC"), new Office(2, "LAX") };

	public static void main(String[] args) {
		HibernateUtil.connection();
		MyCommandLineRunner.addData();
		int option=0;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter # from menu:");
			System.out.println("1.Employee");
			System.out.println("2.Quit");
		    option = s.nextInt();
		    if(option==2) {
		    	break;
		    }
			s.nextLine();
			System.out.println("Enter Employee name:");
			Employee e = getEmployeeByName(s.next());
			System.out.println("Enter"+e.getName()+"'s password" );
			String pwd = s.next();
			boolean result = validPassword(e.getName(),pwd);
			if(result==true) {
				getAllOffices();
			}else
				continue;
			System.out.println("Enter office #");
			int choiceOfOffice = s.nextInt();
			EmployeeServices es = new EmployeeServices();
			es.addOfficetoEmployee(choiceOfOffice, e.getId());
		}while(option == 1);

	}
	
	
	

        public static Employee getEmployeeByName(String emp_name) {
        	Employee e = null;
        	Session session = HibernateUtil.factory.openSession();
        	try {
            	Query<Employee> q = session
        				.createQuery("from  Employee e where e.name = :userId", Employee.class)
        				.setParameter("userId", emp_name);
        	 e = q.getSingleResult();

        	} catch(
        	HibernateException ex){
        		ex.printStackTrace();
        	
        	}finally {
        		session.close();
        	}
       
            return e;
        }

        public static boolean validPassword(String emp_name,String emp_password) {
        	boolean result=false;
        	Session session = HibernateUtil.factory.openSession();
        	try {
            	Query<Employee> q = session
        				.createQuery("from  Employee e where e.name = :userId", Employee.class)
        				.setParameter("userId", emp_name);
        	 Employee e = q.getSingleResult();
        	 if(e.getPassword().equals(emp_password)) {
        		 result=true;
        	 }else
        		 result=false;

        	} catch(
        	HibernateException ex){
        		ex.printStackTrace();
        	
        	}finally {
        		session.close();
        	}
            return result;
        }

        public static void getAllOffices() {
          	Session session = HibernateUtil.factory.openSession();
        	try {
            	Query<Office> q = session
        				.createQuery("from  Office", Office.class);
            	
            	List<Office> off= q.getResultList();
            	System.out.println(off);
     
        	} catch(
        	HibernateException ex){
        		ex.printStackTrace();
        	
        	}finally {
        		session.close();
        	}

    }
}
