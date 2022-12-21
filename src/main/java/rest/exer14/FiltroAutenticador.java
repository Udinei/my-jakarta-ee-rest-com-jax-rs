package rest.exer14;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class FiltroAutenticador implements ContainerRequestFilter {
	@Override
	public void filter(ContainerRequestContext request) throws IOException {
		if (request.getHeaderString("usuario") == null) {
			request.abortWith(Response.status(Response.Status.FORBIDDEN)
					.entity("Usuario obrigatorio!").build());
		}
	}
}


