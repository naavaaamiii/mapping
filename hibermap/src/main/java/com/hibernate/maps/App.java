package com.hibernate.maps;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//import javax.persistence.Query;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.dao.implimentation.OrchardImplementation;
import com.tables.mapping.CampusMinds;
import com.tables.mapping.Leads;
import com.tables.mapping.Orchard;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args ) throws IllegalStateException, SystemException, SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException
    {
    	OrchardImplementation o=new OrchardImplementation();
    	//o.insertOrchardDetails();
    	o.updateOrchard();
    }
}
 
        


