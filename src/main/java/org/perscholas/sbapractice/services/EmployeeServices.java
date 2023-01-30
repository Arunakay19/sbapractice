package org.perscholas.sbapractice.services;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.perscholas.sbapractice.HibernateUtil;
import org.perscholas.sbapractice.models.Employee;
import org.perscholas.sbapractice.models.Office;


public class EmployeeServices {
	
	public void createOrUpateStudent(Employee e) {

		Transaction tx = null;
		Session session = HibernateUtil.factory.openSession();
		try {

			tx = session.beginTransaction();
			//session.merge(e);
			tx.commit();

		} catch(
		HibernateException ex){
			ex.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
	}
		
		public void addOfficetoEmployee(int offId, int empId) {
            Office o=null;
            Transaction tx = null;
			Session session = HibernateUtil.factory.openSession();
			try {
		         Employee e = session.get(Employee.class, empId);
		         o = session.get(Office.class,offId );
				tx = session.beginTransaction();
				e.getOffice().add(o);
			
				tx.commit();
				
				Query<Employee> q = session
	    				.createQuery("from  Employee where id=:userId", Employee.class)
	    				.setParameter("userId", e.getId());
	        	
	        	Employee emp= q.getSingleResult();
	        	System.out.println("Sucessfully added "+e.getName()+" to "+ o.getOffice());
	        	System.out.println(emp);
	
			} catch(
			HibernateException ex){
				ex.printStackTrace();
				tx.rollback();
			}finally {
				session.close();
			}
		
		}
	}