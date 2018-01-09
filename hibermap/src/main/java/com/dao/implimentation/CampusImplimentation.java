package com.dao.implimentation;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dao.CampusInterface;
import com.tables.mapping.CampusMinds;
import com.tables.mapping.Leads;
import com.tables.mapping.Orchard;

public class CampusImplimentation implements CampusInterface {

	public void insertDetails(Leads l) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionfactory=new Configuration().configure("/com/hibernate/maps/hibernate.cfg.xml").buildSessionFactory();
    	Scanner scan=new Scanner(System.in);
    	
    	try
    	{
    		
    		Session session=sessionfactory.openSession();
            session.beginTransaction();
           // int i=0;
            //Leads l=new Leads();
            CampusMinds c=new CampusMinds();
        System.out.println("enter  campus mid");
        int c1=scan.nextInt();
        c.setMid(c1);
        System.out.println("enter campus name ");
        String c2= scan.next();
        c.setName(c2);
        System.out.println("enter campus phno");
        long c3=scan.nextLong();
        c.setPhno(c3);
        c.setL(l);
        //session.save(l);
        session.save(c);
        
           
            //session.save(l);
            //session.save(c);
        session.getTransaction().commit();
        session.close();
        sessionfactory.close();
    }
    	catch(HibernateException e)
    	{
    		e.printStackTrace();
    	}
}
}
		
	
	
	


