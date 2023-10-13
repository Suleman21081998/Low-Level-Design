package com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.adapter;

import com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.adapter.classadapter.BusinessClassDesigner;
import com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.adapter.classadapter.Employee;
import com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.adapter.classadapter.EmployeeClassAdopter;
import com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.adapter.classadapter.EmployeeObjectAdopter;

public class AdapterPattern {

    /*

    Problem Solved: In design, adapters are used when we have a class (Client) expecting some type of object and we have an object (Adaptee) offering the same features but exposing a different interface.
    How: The adapter pattern convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces

    1.The client makes a request to the adapter by calling a method on it using the target interface.
    2.The adapter translates that request on the adaptee using the adaptee interface.
    3.Client receive the results of the call and is unaware of adapter’s presence.

    The client sees only the target interface and not the adapter.


    Implementation

    Adapter must implement client required class
     */

    public static void main (String[] args){
        EmployeeClassAdopter adapter = new EmployeeClassAdopter();
        setEmployeeData(adapter);
        BusinessClassDesigner client = new BusinessClassDesigner();
        String card = client.designCard(adapter);
        System.out.println(card);

        System.out.println("*** Here is objectAdapter ***");
        Employee employee = new Employee();
        setEmployeeData(employee);

        EmployeeObjectAdopter adopter1  = new EmployeeObjectAdopter(employee);
        BusinessClassDesigner client1 = new BusinessClassDesigner();
        String card1 = client1.designCard(adopter1);
        System.out.println(card1);


    }

    private static void setEmployeeData(Employee employee){
        employee.setFullName("suleman");
        employee.setJobTitle("SDE");
        employee.setOfficeLocation("banglore");


    }
}
