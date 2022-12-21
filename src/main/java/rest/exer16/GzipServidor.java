package rest.exer16;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

@Provider
public class GzipServidor implements WriterInterceptor {
    @Override
    public void aroundWriteTo(WriterInterceptorContext ctx) 
    		throws IOException, WebApplicationException {
        GZIPOutputStream os = new GZIPOutputStream(ctx.getOutputStream());
        ctx.setOutputStream(os);
        ctx.proceed();
        return;
    }
}


