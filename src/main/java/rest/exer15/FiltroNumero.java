package rest.exer15;

import java.io.IOException;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;

public class FiltroNumero implements ClientResponseFilter {
	@Override
	public void filter(ClientRequestContext requestContext, 
			ClientResponseContext response) throws IOException {
		System.out.println("tamanho da resposta - "+ response.getLength());
	}
}


