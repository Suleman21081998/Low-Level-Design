package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.factorymethod;

public class JSONMessage extends Message{
    @Override
    public String getContent() {
        return "{\"JSON\"}";
    }
}
