package rest.exer4;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
/**
 *   Teste http://localhost:8080/venda?nome=fernando franzini&produto=disco
 *   Teste http://localhost:8080/venda?nome=fernando franzini&produto=bicicleta&tipo=texto
 *
 * */
@Path("/venda")
public class RestVenda {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String vender(@QueryParam("nome") String nome, @QueryParam("produto") String produto,
            @QueryParam("tipo") @DefaultValue("pdf") String tipo) {
        System.out.println("Venda=" + nome);
        System.out.println("produto=" + produto);
        System.out.println("tipo=" + tipo);
        return "NOTA FISCAL=" + nome + "  - " + tipo;
    }
}
