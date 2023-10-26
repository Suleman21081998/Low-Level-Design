package com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.decorator;

public class Decorator {

    /*
      Decorator pattern allows a user to add new functionality to an existing object dynamically without altering its structure.
     */

    public static void main(String [] args){

        Message m = new TextMessage("The <FORCE> is strong with this one!");
        System.out.println(m.getContent());

        Message decorator = new HtmlEncodedMessage(m);
        System.out.println(decorator.getContent());

        decorator = new Base64EncodedMessage(decorator);
        System.out.println(decorator.getContent());
    }


}
