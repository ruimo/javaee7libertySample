package ejbjarxml;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;
import javax.ejb.Stateless;

@Path("hello")
public class Hello {
    @GET
    public String say(@QueryParam("name") String name) throws Exception {
        HelloEjb ejb = InitialContext.doLookup("java:app/hello-module/hellobean");
        return ejb.sayHello(name);
    }
}
