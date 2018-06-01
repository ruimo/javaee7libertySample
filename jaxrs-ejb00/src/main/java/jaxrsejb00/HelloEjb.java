package jaxrsejb00;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class HelloEjb {
    public String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }
}
