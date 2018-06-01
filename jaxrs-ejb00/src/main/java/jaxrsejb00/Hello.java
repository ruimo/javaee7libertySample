package jaxrsejb00;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;
import javax.ejb.Stateless;

@Path("hello")
public class Hello {
    @Inject
    HelloEjb helloEjb;
    
    @GET
    public String say(@QueryParam("name") String name) {
        return helloEjb.sayHello(name);
    }
}
