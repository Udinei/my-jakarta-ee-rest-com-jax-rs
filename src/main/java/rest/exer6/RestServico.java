package rest.exer6;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/servicos/")
public class RestServico {

    @Path("/horario")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hora() {
        return "hora servidor é = " + new Date().toString();
    }

    @Path("/soma")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Integer somar(@QueryParam("v1") Integer valor1, @QueryParam("v2") Integer valor2) {
        return valor1 + valor2;
    }
}
