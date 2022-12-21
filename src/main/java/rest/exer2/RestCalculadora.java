package rest.exer2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
/**
 *
 *  1. http://localhost:8080/application.wadl
 *  2. http://localhost:8080/calculadora?v1=10&v2=10
 *
 * */
@Path("/calculadora")
public class RestCalculadora {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String somar(@QueryParam("v1") Integer valor1, @QueryParam("v2") Integer valor2) {
        return "Valor da soma de " + valor1 + " + " + valor2 + " = " + (valor1 + valor2);
    }
}
