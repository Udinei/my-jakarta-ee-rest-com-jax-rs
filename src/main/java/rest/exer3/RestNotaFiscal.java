package rest.exer3;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 *
 *  Teste http://localhost:8080/notafiscal/1552
 * */
@Path("/notafiscal/{id:[0-9]*}")
public class RestNotaFiscal {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String processarNotafiscal(@PathParam("id") Long id) {
        System.out.println("Processando nota fiscal = " + id);
        return "nota processado " + id;
    }
}
