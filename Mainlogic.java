 package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 

public class Mainlogic {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cf = new Configuration();
		cf.configure("hibernate.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		student mastan = new student();
		mastan.setSid(999);
		mastan.setSname("mastan dudekula");
	    mastan.setSmarks(100);
		se.save(mastan);
		tx.commit();
		se.close();
		}	
	}