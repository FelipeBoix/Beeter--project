package edu.upc.eetac.dsa.FelipeBoix.Beeter.api;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import edu.upc.eetac.dsa.FelipeBoix.Beeter.api.model.BeeterError;

@Provider
public class WebApplicationExceptionMapper implements
		ExceptionMapper<WebApplicationException> {
	@Override
	public Response toResponse(WebApplicationException exception) {
		BeeterError error = new BeeterError(//estado del modelo de error
				exception.getResponse().getStatus(), exception.getMessage());
		return Response.status(error.getStatus()).entity(error)// en la identidad defines lo qe va a ir en el body
				.type(MediaType.BEETER_API_ERROR).build();//seran valores y se construye
	}
 
} 