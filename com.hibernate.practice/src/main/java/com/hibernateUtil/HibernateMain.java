package com.hibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.entity.Toy;

public class HibernateMain {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		config.setProperty("hibernate.connection.driver_class", "oracle.jdbc.OracleDriver");
		config.setProperty("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:xe");
		config.setProperty("hibernate.connection.username","system");
		config.setProperty("hibernate.connection.password","password");
		config.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle8iDialect");
		config.addAnnotatedClass(com.entity.Toy.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
		
        SessionFactory factory = config.buildSessionFactory(builder.build());
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
         
        Toy card = new Toy(1,"poker card", 4.5, 4.0);
         
        session.persist(card);
         
        transaction.commit();
         
        session.close();
        factory.close();
            

	}

}
