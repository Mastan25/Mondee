 package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration; 

public class Mainlogic { 

	
	public static void main(String[] args) {
        StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernet.xml")
        Metadata me = new MetadataSources(ssr).getMetadataBuilder().build()        		
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