package org.perscholas.sbapractice;


	import java.io.File;

	import org.hibernate.SessionFactory;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.service.ServiceRegistry;
	import org.perscholas.sbapractice.models.*;

	public class HibernateUtil {

		public static ServiceRegistry registry;
		public static SessionFactory factory;

		public static void connection() {
			try {

				// configuration
				Configuration conf = new Configuration()
						.configure(new File("src/main/java/org/perscholas/sbapractice/hibernate.cfg.xml"));
				conf.addAnnotatedClass(Employee.class);
				conf.addAnnotatedClass(Office.class);
				// registry
				registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();

				factory = conf.buildSessionFactory(registry);

			} catch (Throwable ex) {
				ex.printStackTrace();
			}
		}

	}



