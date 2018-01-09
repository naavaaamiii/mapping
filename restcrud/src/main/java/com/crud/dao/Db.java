package com.crud.dao;

import java.util.HashMap;
import java.util.Map;

import com.crud.dao.*;

public class Db {
	
	private static Map<Integer,CampusMinds> campusmind=new HashMap();
	
	public static Map<Integer,CampusMinds> getMessage()
	{
		return campusmind;
	}

}
