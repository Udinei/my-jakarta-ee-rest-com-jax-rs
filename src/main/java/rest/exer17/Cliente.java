package rest.exer17;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import rest.exer16.Telefone;

public class Cliente {
    public static void main(String[] args) {
        Client cliente = ClientBuilder.newClient();
        // Execute a primeira vez e veja que vai dar exception pq o conteudo vem zipado.
        cliente.register(GzipCliente.class);
        WebTarget web = cliente.target("http://localhost:8080/telefones");
        Response resposta = web.request().get();
        List<Telefone> telefones = resposta.readEntity(new GenericType<List<Telefone>>() {
        });
        for (Telefone t : telefones) {
            System.out.println(t.getNome() + " - " + t.getFone());
        }
        resposta.close();
    }
}


