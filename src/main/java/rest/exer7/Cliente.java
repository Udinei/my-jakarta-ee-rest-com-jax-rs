package rest.exer7;

import java.math.BigDecimal;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class Cliente {
    
    public static void viaXml() {
        Pessoa fernando = new Pessoa("Fernando", 35, new BigDecimal(1000));
        Client cliente = ClientBuilder.newClient();
        WebTarget web = cliente.target("http://localhost:8080/telefonia/xml");
        Response resposta = web.request().post(Entity.xml(fernando));
        if (resposta.getStatus() == 204) {
            // 204 resposta sem corpo.
            System.out.println("objeto pessoa enviado com sucesso via XML.");
        } else {
            System.out.println("erro na resposta = " + resposta.toString());
        }
        resposta.close();
        cliente.close();
    }

    public static void viaJson() {
        Pessoa fernando = new Pessoa("Fernando", 35, new BigDecimal(1000));
        Client cliente = ClientBuilder.newClient();
        WebTarget web = cliente.target("http://localhost:8080/telefonia/json");
        Response resposta = web.request().post(Entity.json(fernando));
        if (resposta.getStatus() == 204) {
            // 204 resposta sem corpo.
            System.out.println("objeto pessoa enviado com sucesso JSON.");
        } else {
            System.out.println("erro na resposta = " + resposta.toString());
        }
        resposta.close();
        cliente.close();
    }

    public static void main(String[] args) {
        viaXml();
        viaJson();
    }
}
