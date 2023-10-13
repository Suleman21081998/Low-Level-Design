package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.factorymethod;

public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders(){

        System.out.println("Default");

    }

    public void encrypt(){

        System.out.println("encrypt");
    }
}
