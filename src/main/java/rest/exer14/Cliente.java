package rest.exer14;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class Cliente {
	public static void main(String[] args) {
		Client cliente = ClientBuilder.newClient();
		// Na primeira vez, execute sem registrar.
		// Na segunda vez, registre e veja liberar o 403
		cliente.register(FiltroCliente.class); // apos essa linha e que, sera executado o filtro de ContainerRequestFilter
		WebTarget web = cliente.target("http://localhost:8080/logar");

		Response resposta = web.request().get();

		if (resposta.getStatus() == 200) {
			String mensagem = resposta.readEntity(String.class);
			System.out.println(mensagem);
		} else {
			System.out.println("erro na resposta = " + resposta.toString());
		}
		resposta.close();
		cliente.close();
	}
}

