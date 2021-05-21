package com.parthik.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

	
	private static SessionFactory factory;
	
	private SessionUtil()
	{
		
	}
	
	static
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		factory = cfg.buildSessionFactory();
	}
	
	public static Session getSession() {
		
		Session ses = factory.openSession();
		return ses;
	}
}
