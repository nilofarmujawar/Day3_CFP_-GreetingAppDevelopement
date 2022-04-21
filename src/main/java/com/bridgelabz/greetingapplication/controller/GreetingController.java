package com.bridgelabz.greetingapplication.controller;//package name
/**
 * UC1 :- Using GreetingController return JSON for different HTTP Methods. Test using curl
 *
 */


/**
 * import classes
 */
import com.bridgelabz.greetingapplication.model.Greeting;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;
/**
 * 1) @RestController :-
 *           @RestController is used for making restful web services with the help of the @RestController annotation.
 *           This annotation is used at the class level and allows the class to handle the requests made by the client
 *
 * 2) @RequestMapping :-
 *           @RequestMapping is the most common and widely used annotation in Spring MVC.
 *           It is used to map web requests onto specific handler classes and/or handler methods. @RequestMapping can be applied to the controller class as well as methods.
 *           name: Assign a name to this mapping.
 *
 * 3) @GetMapping :-
 *           @GetMapping annotation maps HTTP GET requests onto specific handler methods.
 *           It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. GET)
 *
 * 4) @RequestParam :-
 *           @RequestParam is a Spring annotation used to bind a web request parameter to a method parameter.
 *           It has the following optional elements: defaultValue - used as a fallback when the request parameter is not provided or has an empty value.
 *           name - name of the request parameter to bind to
 *
 * 5) @PostMapping :-
 *           @PostMapping annotation maps HTTP POST requests onto specific handler methods.
 *           It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST)
 *
 * 6) @PathVariable :-
 *           @PathVariable is a Spring annotation which indicates that a method parameter should be bound to a URI template variable. It has the following optional elements: name - name of the path variable to bind to.
 *           required - tells whether the path variable is required.
 *
 *
 */

@RestController
/**
 * create a class name GreetingController
 */
public class GreetingController {
    private static final String template = "Hello %s";
    private static AtomicLong counter = new AtomicLong();

    /**
     * path-/getGreeting
     * create a method name as greeting
     */
    @GetMapping("/getGreeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    /**
     * path-/postGreeting
     * create a method name as sayHello
     */
    @PostMapping("/postGreeting")
    public Greeting sayHello(@RequestBody Greeting greeting) {
        return new Greeting(counter.incrementAndGet(), String.format(template, greeting.getContent()));
    }

    /**
     * path-/putMapping/{counter}
     * create a method name as sayHello
     */
    @PutMapping("/putMapping/{counter}")
    public Greeting sayHello(@PathVariable long counter, @RequestParam(value = "content") String content) {
        return new Greeting(counter, String.format(template, content));
    }
}
