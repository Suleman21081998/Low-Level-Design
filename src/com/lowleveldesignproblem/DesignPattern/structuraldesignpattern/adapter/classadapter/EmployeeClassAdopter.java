package com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.adapter.classadapter;

public class EmployeeClassAdopter extends Employee implements Customer   {

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
