package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.factorymethod;

public abstract class MessageCreator {

    public Message getMessage(){
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        System.out.println(msg.getContent());
        return msg;
    }

    public abstract Message createMessage();
}
