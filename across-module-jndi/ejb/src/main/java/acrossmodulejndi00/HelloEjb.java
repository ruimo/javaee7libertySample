package acrossmodulejndi00;

import javax.ejb.Stateless;

@Stateless(name = "hellobean")
public class HelloEjb {
    public String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }
}
