package rest.exer3;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 *  Teste http://localhost:8080/cadastro/fernando
 *
 * */
@Path("/cadastro/{username: [a-zA-Z]*}")
public class RestCadatro {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String processarCadatro(@PathParam("username") String nome) {
        System.out.println("Processando cadastro de = " + nome);
        return "Cadastro feito com sucesso para " + nome;
    }
}
