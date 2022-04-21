package com.bridgelabz.greetingapplication.service;

/**
 * import
 */
import org.springframework.stereotype.Service;

/**
 * 1) @Service :-
 *          It is used to mark the class as a service provider.
 *          So overall @Service annotation is used with classes that provide some business functionalities.
 *          Spring context will autodetect these classes when annotation-based configuration and classpath scanning is used.
 */
@Service
//create a class name as greetingService
public class GreetingService {

    //create a method name as getMessge
    public String getMessage() {
        return "Hello World";
    }
}