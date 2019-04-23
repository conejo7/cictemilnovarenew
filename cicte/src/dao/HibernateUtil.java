package dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory sessionFactoryObj = buildSessionFactoryObj();

	// Create The SessionFactory Object From Standard (Hibernate.cfg.xml)
	// Configuration File
	@SuppressWarnings("deprecation")
	public static SessionFactory buildSessionFactoryObj() {
		try {
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
			applySettings(configuration.getProperties());
			SessionFactory sessionFactoryObj = configuration.buildSessionFactory(builder.build());
			
			
		} catch (ExceptionInInitializerError exceptionObj) {
			exceptionObj.printStackTrace();
		}
		return sessionFactoryObj;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactoryObj;
	}
	public void shutdown() {
		getSessionFactory().close();
	}
	
	

	
}
