package com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.adapter.classadapter;

public class EmployeeObjectAdopter implements Customer{

    private Employee employee;

    public EmployeeObjectAdopter (Employee employee){
        this.employee = employee;

    }
    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }
}
