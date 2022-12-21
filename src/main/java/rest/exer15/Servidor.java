package rest.exer15;

import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Servidor {
    public static void main(String[] args) {
        try {
            URI uri = UriBuilder.fromUri("http://localhost/").port(8080).build();
            ResourceConfig config = new ResourceConfig();
            config.packages("rest.exer15");
            HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
            System.out.println("servidor no ar - " + server);

        } catch (Exception e) {
            System.out.println("Erro na execucao do servidor JSE - " + e.getMessage());
        }
    }
}


