package rest.exer4;

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
            config.packages("rest.exer4");
            HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
            System.out.println("servidor no ar - " + server);
            // Teste http://localhost:8080/venda?nome=fernando franzini&produto=disco
            // Teste http://localhost:8080/venda?nome=fernando franzini&produto=bicicleta&tipo=texto
        } catch (Exception e) {
            System.out.println("Erro na execu��o do servidor JSE - " + e.getMessage());
        }
    }
}