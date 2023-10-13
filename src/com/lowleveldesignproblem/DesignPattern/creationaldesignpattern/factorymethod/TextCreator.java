package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.factorymethod;

public class TextCreator  extends MessageCreator{
    @Override
    public Message createMessage() {
        return new Text();
    }
}
