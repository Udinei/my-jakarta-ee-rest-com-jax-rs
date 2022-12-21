package rest.exer7;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/telefonia/")
public class RestTelefonia {

    @Path("/xml")
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public void gravar1(Pessoa pessoa) {
        System.out.println("gravando XML = " + pessoa);
    }
    
    @Path("/json")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void gravar2(Pessoa pessoa) {
        System.out.println("gravando JSON = " + pessoa);
    }
}