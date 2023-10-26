package com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.decorator;


public class HtmlEncodedMessage implements Message {

    private Message msg;

    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return msg.getContent() + " HTML";
    }


}
