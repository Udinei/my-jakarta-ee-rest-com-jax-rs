package rest.exer12;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// Teste http://localhost:8080/horas3
@Path("/horas3")
public class RestHorario {
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String horario() {
        System.out.println("=>RestHorario.horario()");
        return sdf.format(new Date());
    }
}

