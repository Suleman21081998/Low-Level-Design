package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.factorymethod;

import com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.builderpattern.User;
import com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.builderpattern2.UserDTO;

public class Client {

    public static void main(String[] args) {
        printMessage(new JSONCreator());
        printMessage(new TextCreator());

    }

    public static void printMessage(MessageCreator creator){

        Message msg = creator.getMessage();

        System.out.println(msg);

    }
}
