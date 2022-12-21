package rest.exer5;

import java.math.BigDecimal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// Teste http://localhost:8080/funcionario/xml
// Teste http://localhost:8080/funcionario/json

@Path("/funcionario/")
public class RestEmpresa {

    private Funcionario criar() {
        Funcionario contato = new Funcionario();
        contato.setNome("Fernando Franzini");
        contato.setCpf(98012321323L);
        contato.setSalario(new BigDecimal("59999.99"));
        return contato;
    }

    @Path("/xml")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Funcionario servicoXml() {
        System.out.println("Criando objeto java xml");
        Funcionario contato = criar();
        return contato;
    }

    @Path("/json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Funcionario servicoJson() {
        System.out.println("Criando objeto java json");
        Funcionario contato = criar();
        return contato;
    }
}
