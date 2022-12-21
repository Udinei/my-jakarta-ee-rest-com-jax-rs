package rest.exer9;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NegocioExceptionResponse implements ExceptionMapper<NegocioException> {
    @Override
    public Response toResponse(NegocioException exception) {
        return Response.status(Status.BAD_REQUEST).type(MediaType.TEXT_PLAIN).entity(exception.getMessage())
                .build();
    }
}