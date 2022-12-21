package rest.exer13;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class FiltroRespostaHeader implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext crc, 
    		ContainerResponseContext response) throws IOException {
        response.getHeaders().add("Criado-Por", "AulaJava");
    }
}


