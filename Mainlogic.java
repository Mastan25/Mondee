 package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 

public class Mainlogic {

	
	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("hibernet.xml");
		@SuppressWarnings("deprecation")
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		student mastan = new student();
		mastan.setSid(9999);
		mastan.setSname(" dudekula vali");
	    mastan.setSmarks(1000);
		se.save(mastan);
		tx.commit();
		se.close();
		}	
	}