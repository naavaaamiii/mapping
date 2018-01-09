package resttest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.crud.dao.CampusMinds;
import com.rest.crud.restcrud.CampusResource;

public class RestTest {
	@Test
	public void testRetrive()
	{
		
		CampusResource m=new CampusResource();
		 List<CampusMinds> l=m.getMessage();
		assertEquals(l,m.getMessage());  
	}

}
