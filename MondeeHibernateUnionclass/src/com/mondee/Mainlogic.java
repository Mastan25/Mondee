package com.mondee;
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
       StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
       Metadata me=new org.hibernate.boot.MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = me.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		CreditCard cc=new CreditCard();
		cc.setPaymentId(388);
		cc.setAmount(9988);
		cc.setCreditCardType("VISA");
		
		Cheque cq=new Cheque();
		cq.setPaymentId(80);
		cq.setAmount(8870);
		cq.setChequeType("ICICI");
		 se.save(cc);
		 se.save(cq);
		tx.commit();
		se.close();
		}
}