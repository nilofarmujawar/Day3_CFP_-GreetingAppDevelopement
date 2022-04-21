package com.bridgelabz.greetingapplication.model;

/**
 * creating class name as Greeting
 */
public class Greeting {

    /**
     * private variables can only be accessed within the same class (an outside class has no access to it)
     * private = restricted access
     * However, it is possible to access them if we provide public get and set methods.
     */

    //variables
    private Long id;
    private String content;

    /**
     * create a parameterized constructor name as Greeting
     * @param id - in format
     * @param content - string format
     */
    public Greeting(Long id, String content) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        super();
        this.id = id;
        this.content = content;
    }

    /**
     * Used getter and setter to set and get the value.
     * Setter is used to set the value
     * Getter is used to get the value
     */


    /**
     * crete a get method name as getId
     * The get method returns the value of the variable
     * @return - id
     */
    public Long getId() {
        return id;
    }

    /**
     * The set method takes a parameter (id) and assigns it to the id variable
     * @param - id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * crete a get method name as getContent
     * The get method returns the value of the variable
     * @return - content
     */
    public String getContent() {
        return content;
    }

    /**
     * The set method takes a parameter (content) and assigns it to the content variable
     * @param - content
     */
    public void setContent(String content) {
        this.content = content;
    }
}