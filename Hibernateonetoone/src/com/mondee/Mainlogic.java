package com.mondee;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
public class Mainlogic {
public static void main(String[] args) {
		// TODO Auto-generated method stub
       StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
       Metadata me=new org.hibernate.boot.MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = me.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		vendor v=new vendor();
		v.setVendorId(99660);
		v.setVendorName("Amazon");
		
		vendor v1 =new vendor();
		v1.setVendorId(99880);
		v1.setVendorName("Flipkart");
		
		customers c1=new customers();
		c1.setCustomerId(11);
		c1.setCustomerName("Mourya");
		
		customers c2=new customers();
		c2.setCustomerId(12);
		c2.setCustomerName(" kalyan");
		
	    Set s=new HashSet();
		s.add(c1);
		s.add(c2);
		
		v1.setObj(s);
		se.save(v1);
		tx.commit();
		se.close();
		}
}