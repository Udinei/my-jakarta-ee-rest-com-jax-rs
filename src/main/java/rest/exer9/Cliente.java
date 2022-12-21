package rest.exer9;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class Cliente {
	
    private static WebTarget criar() {
        Client cliente = ClientBuilder.newClient();
        WebTarget web = cliente.target("http://localhost:8080/titulos");
        return web;
    }
    public static void criar(Titulo titulo) {
        WebTarget web = criar().path("/gravar");
        Response resposta = web.request().post(Entity.json(titulo));
        System.out.println(resposta.getStatus() + " - " + resposta.readEntity(String.class));
        resposta.close();
    }

    public static void listar() {
        WebTarget web = criar().path("/listar");
        Response resposta = web.request().get();
        System.out.println(resposta.getStatus());
        List<Titulo> titulos = resposta.readEntity(new GenericType<List<Titulo>>() {
        });
        for (Titulo titulo : titulos) {
            System.out.println(titulo.getSacado() + " - " + titulo.getValor());
        }
        resposta.close();
    }

    public static void deletar(String sacado) {
        WebTarget web = criar().path("/deletar");
        Response resposta = web.queryParam("sacado", sacado).request().delete();
        System.out.println(resposta.getStatus() + " - " + resposta.readEntity(String.class));
        resposta.close();
    }

    public static void main(String[] args) {
        criar(new Titulo());
        criar(new Titulo("Fernando", 120));
        criar(new Titulo("Luana", 220));
        criar(new Titulo("Xicao", 550));
        listar();
        deletar("bart");
        deletar("Xicao");
        listar();
    }
}


