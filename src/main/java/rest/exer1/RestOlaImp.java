package rest.exer1;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// Rest � diferente do soap por podemos enviar qualquer tipo de texto para ser visto no navegador.
// Por isso podemos testar os REST no navegador tambem. Soap envia o protocolo SOAP e por isso n�o da para
// ver nada no navegador e nem executar.
@Path("/ola")
public class RestOlaImp implements Ola {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String servico() {
        System.out.println("Executou o rest...");
        return new Date().toString();
    }
}