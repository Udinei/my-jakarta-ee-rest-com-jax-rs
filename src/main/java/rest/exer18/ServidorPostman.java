package rest.exer18;

import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class ServidorPostman {
    public static void main(String[] args) {
        try {
            URI uri = UriBuilder.fromUri("http://localhost/").port(8080).build();
            ResourceConfig config = new ResourceConfig();
            config.packages("rest.exer1");
            config.packages("rest.exer5");
            HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
            System.out.println("servidor no ar teste - " + server);
            // teste http://localhost:8080/application.wadl = veja que aparece todos os servi�os
            // Teste http://localhost:8080/ola
            // Teste http://localhost:8080/funcionario/xml
            // Teste http://localhost:8080/funcionario/json
        } catch (Exception e) {
            System.out.println("Erro na execucao do servidor JSE - " + e.getMessage());
        }
    }
}

