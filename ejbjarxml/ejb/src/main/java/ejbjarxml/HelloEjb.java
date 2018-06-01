package ejbjarxml;

import javax.ejb.Stateless;

public class HelloEjb {
    public String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }
}
