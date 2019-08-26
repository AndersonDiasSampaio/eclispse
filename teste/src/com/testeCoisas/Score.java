package com.testeCoisas;


import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;

@Path("/")
public class Score extends Application  {
	@GET @Path("/score/wins")@Produces("text/plain")
	public int getWins() {return 1;}
	     
	@GET @Path("/score/losses")@Produces("text/plain")
	public int getLosses() {return 1;}
	     
	@GET @Path("/score/ties")@Produces("text/plain")
	public int getTies() {return 1;}

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return null;
	}
}
