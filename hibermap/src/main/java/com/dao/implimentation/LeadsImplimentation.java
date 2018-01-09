package com.dao.implimentation;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dao.LeadsInterface;
import com.tables.mapping.CampusMinds;
import com.tables.mapping.Leads;
import com.tables.mapping.Orchard;

public class LeadsImplimentation implements LeadsInterface {

	public void insertLeadsDeatails(Orchard o) {
		// TODO Auto-generated method stub
	SessionFactory sessionfactory=new Configuration().configure("/com/hibernate/maps/hibernate.cfg.xml").buildSessionFactory();
	Scanner scan=new Scanner(System.in);
	
	try
	{
		
		Session session=sessionfactory.openSession();
        session.beginTransaction();
        int i=0;
        Leads l=new Leads();
        
     
    
    System.out.println("enter  lead mid");
    int a=scan.nextInt();
    l.setL_mid(a);
    System.out.println("enter name");
    String b=scan.next();
    l.setL_name(b);
    l.setO(o);
   // l.setTrack("java");
    session.save(l);
    while(i<2)
    {
    	CampusImplimentation c=new CampusImplimentation();
    	c.insertDetails(l);
    	i++;
    }
   // session.save(l);
    	
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

	
		
	


