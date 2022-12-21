package rest.exer6;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class Cliente {

    public static void cliente1() {
        Client cliente = ClientBuilder.newClient();
        WebTarget web = cliente.target("http://localhost:8080/servicos/horario");
        Response resposta = web.request().get();
        if (resposta.getStatus() == 200) {
            String horario = resposta.readEntity(String.class);
            System.out.println(horario);
        } else {
            System.out.println("erro na resposta = " + resposta.toString());
        }
        resposta.close();
        cliente.close();
    }

    public static void cliente2() {
        Client cliente = ClientBuilder.newClient();
        WebTarget web = cliente.target("http://localhost:8080/servicos/soma?v1=15&v2=15");
        Response resposta = web.request().get();
        if (resposta.getStatus() == 200) {
            Integer soma = resposta.readEntity(Integer.class);
            System.out.println("Soma é = " + soma);
        } else {
            System.out.println("erro na resposta = " + resposta.toString());
        }
        resposta.close();
        cliente.close();
    }

    public static void cliente3() {
        // chamada de endereço dinamico com parametros dinamicos.
        Client cliente = ClientBuilder.newClient();
        WebTarget web = cliente.target("http://localhost:8080/servicos");
        WebTarget requisicao = web.path("/soma").queryParam("v1", 20).queryParam("v2", 30);
        Response resposta = requisicao.request().get();
        if (resposta.getStatus() == 200) {
            Integer soma = resposta.readEntity(Integer.class);
            System.out.println("Soma é = " + soma);
        } else {
            System.out.println("erro na resposta = " + resposta.toString());
        }
        resposta.close();
        cliente.close();
    }

    public static void main(String[] args) {
        //cliente1();
       // cliente2();
        cliente3();
    }
}
