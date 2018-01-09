package com.crud.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.crud.dao.*;

public class Service {
	
	
	
	private static Map<Integer,CampusMinds> c= Db.getMessage();
	
	public Service()
	{
		c.put(1, new CampusMinds("M1042933","akshatha","java"));
		c.put(2, new CampusMinds("M1042945","arpitha","testing"));
	}
			
		public List<CampusMinds> getAllCampusMinds()
		{
			return new ArrayList<CampusMinds>(c.values());
		}
			
	
	

}
