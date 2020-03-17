package com.hibernate;

import javax.net.ssl.SSLSession;
import javax.security.auth.login.Configuration;
import javax.sql.rowset.spi.TransactionalWriter;

public class save {
	public static void main(String args[])
	{
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		product product =new product();
		product.setProductId(101);
		product.setProName("iPhone");
		Transactional tx = session.beginTransaction();
		session.save(product);
		System.out.println("obj saved successfully");
		tx.commit();
		session.close();
		factory.close();
		
		
		
	}

}
