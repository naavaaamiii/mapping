package com.rest.crud.restcrud;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.crud.dao.Service;

import com.crud.dao.*;

@Path("/message")
public class CampusResource {
	
	Service s=new Service();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CampusMinds> getMessage()
	{
		//return "got it!";
		return s.getAllCampusMinds();
	}

}
