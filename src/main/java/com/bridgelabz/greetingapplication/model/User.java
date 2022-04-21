package com.bridgelabz.greetingapplication.model;

/**
 * creating a class name as User
 */
public class User {
    /**
     * variables
     */
    private String firstName;
    private String lastName;

    /**
     * default constructor
     */
    public User() {

    }

    /**
     * create a parameterized constructor
     *
     */
    public User(User user) {
        this.firstName=user.firstName;
        this.lastName=user.lastName;
    }

    /**
     * Used getter and setter to set and get the value.
     * Setter is used to set the value
     * Getter is used to get the value
     */

    public String getfirstName() {
        return firstName;
    }
    public void setfName(String fName) {
        this.firstName = fName;
    }
    public String getlastName() {
        return lastName;
    }
    public void setlastName(String lName) {
        this.lastName = lastName;
    }

}