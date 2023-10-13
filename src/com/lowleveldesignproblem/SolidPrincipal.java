package com.lowleveldesignproblem;

public class SolidPrincipal {

    /*
    S: The Single Responsibility Principle
    O: The Open-Closed Principle
    L: The Liskov Substitution Principle
    I: The Interface Segregation Principle
    D: The Dependency Inversion Principle
     */

    /*
    The Single Responsibility Principle states that a class should do one thing and
    therefore it should have only a single reason to change
     1. */



    /*
    The Liskov Substitution Principle states that subclasses should be substitutable for their base classes.
    This means that, given that class B is a subclass of class A, we should be able to pass an object of class B to any
    method that expects an object of class A and the method should not give any weird output in that case
     */

    /*
    Interface Segregation Principle
    Segregation means keeping things separated, and the Interface Segregation Principle is about separating the interfaces.
     */

    /*
    The Dependency Inversion principle states that our classes should depend upon interfaces or abstract classes
     instead of concrete classes and functions.

     1. High level modules should not depend on low level modules. Both should depend on abstractions
     2. Abstraction should not depend on details.Details should depend upon abstraction.

     Dependency in simple way:
     System.out.println(string)
     this line has dependency on out object because it is using println method of out object

     High level modules: it has business logic or rules
     Low level modules: any function that can be used anywhere
     */
}
