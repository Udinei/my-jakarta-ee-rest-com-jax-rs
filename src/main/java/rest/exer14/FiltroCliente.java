package rest.exer14;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

public class FiltroCliente implements ClientRequestFilter {
	@Override
	public void filter(ClientRequestContext request) throws IOException {
		List<Object> header = new ArrayList<Object>();
		header.add("Fernando");
		request.getHeaders().add("usuario", header);
	}
}


