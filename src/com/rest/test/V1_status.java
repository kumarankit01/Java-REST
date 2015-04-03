/**
 * 
 */
package com.rest.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Kumar Ankit
 *
 */
@Path("/v1/status")
public class V1_status {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getStatus(){
		return "status is green!";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getStatus1(){
		return "status is yellow!";
	}
}
