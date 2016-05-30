package com.lz.test.services;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lz.helper.ZXConstants;

@WebService
public interface TestService {

	@GET
	@Produces({ ZXConstants.APPLICATION_JSON_UTF8})
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("/getCatalogs/")
	public Object  getCatalogs(@PathParam("username") String username) throws Exception;
	
	
/*	@GET
	@Produces({ ZXConstants.APPLICATION_JSON_UTF8})
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("/getCatalogs/")
	public Object  getCatalogs(@QueryParam("hbounit") String hbounit) throws Exception;*/
}
