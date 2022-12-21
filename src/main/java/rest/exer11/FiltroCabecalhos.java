package rest.exer11;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class FiltroCabecalhos implements ContainerRequestFilter {
	@Override
	public void filter(ContainerRequestContext request) throws IOException {
		request.getHeaders().forEach((h, l) -> {
			System.out.println("Header: " + h);
			l.forEach(i -> System.out.println("===>" + l));
		});
	}
}

