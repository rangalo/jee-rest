package de.osb.greeting.boundary;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author: hardik
 * @since: 22.11.16
 */

@Stateless
@Path("/greetings")
public class GreetingResource {

    @GET
    public String greet() {

        return "Hello, World!";

    }
}
