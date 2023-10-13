package com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.adapter.classadapter;

public class BusinessClassDesigner {

    public String designCard(Customer customer) {
        String card = "";
        card += customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }
}
