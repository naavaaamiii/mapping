package com.dao.implimentation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dao.OrchardInterface;
import com.tables.mapping.CampusMinds;
import com.tables.mapping.Leads;
import com.tables.mapping.Orchard;

public class OrchardImplementation implements OrchardInterface {
	
	
	public void insertOrchardDetails(){
		// TODO Auto-generated method stub
		
	
	SessionFactory sessionfactory=new Configuration().configure("/com/hibernate/maps/hibernate.cfg.xml").buildSessionFactory();
	Scanner scan=new Scanner(System.in);
	
	try
	{
		
		Session session=sessionfactory.openSession();
        session.beginTransaction();
        int i=0;
        Leads l=new Leads();
        CampusMinds c=new CampusMinds();
      
        Orchard o=new Orchard();
        System.out.println("enter track_id");
        int b1=scan.nextInt();
        o.setTrack_id(b1);
        System.out.println("enter track_name");
        String b3=scan.next();
        o.setTrack_name(b3);
        
        //int i=0;
        session.save(o);
        while(i<2)
        {
        	LeadsImplimentation l1=new LeadsImplimentation();
        	l1.insertLeadsDeatails(o);
        	i++;
        	//session.save(o);
        }
        
    
    List<CampusMinds>list1=null;
	//List c = session.createQuery("from CampusMinds").list();
        Query query=(Query) session.createQuery("from CampusMinds");
        list1=query.list();
        for(CampusMinds arr:list1)
        {
        	System.out.println(arr.getMid()+" "+arr.getName()+ " "+arr.getPhno()+" "+arr.getL());
        }
        session.getTransaction().commit();
        session.close();
        sessionfactory.close();
    }
	
	catch(HibernateException e)
	{
		e.printStackTrace();
	}
	
}

	public void updateOrchard() {
		
		SessionFactory sessionfactory=new Configuration().configure("/com/hibernate/maps/hibernate.cfg.xml").buildSessionFactory();
		Scanner scan=new Scanner(System.in);
		try
		{
			LeadsImplimentation l=new LeadsImplimentation();
			Session session=sessionfactory.openSession();
			session.beginTransaction();
		// TODO Auto-generated method stub
			Orchard o=new Orchard();
			System.out.println("enter the id to update");
			int i=scan.nextInt();
			o.setTrack_id(i);
			System.out.println("enter the track_name to update");
			String name=scan.next();
			o.setTrack_name(name);
			 session.update(o);
			 session.getTransaction().commit();
	         System.out.println("orchard records updated!");
		}
	        catch(HibernateException e)
	    	{
	    		e.printStackTrace();
	    	}
	
	
}
}





