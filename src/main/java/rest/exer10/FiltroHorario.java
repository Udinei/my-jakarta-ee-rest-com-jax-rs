package rest.exer10;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

// Executado antes da classe de serviço REST
@Provider
public class FiltroHorario implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext request) throws IOException {
        System.out.println("-->filtro de request");
    }
}


