package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.SingletonPattern;

public class Client {

    public static void main(String[] args) {
        //LazyRegistryIODH singleton;
       EagerRegistry registry = EagerRegistry.getInstance();
       EagerRegistry registry1 = EagerRegistry.getInstance();

       if(registry == registry1) {
           System.out.println("it is same");
       }



        LazyRegistryWithIODH singleton = LazyRegistryWithIODH.getInstance();
        LazyRegistryWithIODH singleton2 = LazyRegistryWithIODH.getInstance();
        System.out.println(singleton == singleton2);
    }
}
