package jaxrs00;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;

@Path("hello")
public class Hello {
    @GET
    public String say(@QueryParam("name") String name) {
        return String.format("Hello, %s!", name);
    }
}
