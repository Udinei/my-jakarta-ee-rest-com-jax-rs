package rest.exer12;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class FiltroRespostaHorario implements ContainerResponseFilter {
	@Override
	public void filter(ContainerRequestContext crc, 
			ContainerResponseContext response) throws IOException {
		System.out.println("-->filtro de response");
	}
}


