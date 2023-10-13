package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.factorymethod;

public class JSONCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
