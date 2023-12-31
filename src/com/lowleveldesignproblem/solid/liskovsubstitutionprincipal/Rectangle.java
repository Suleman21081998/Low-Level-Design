package com.lowleveldesignproblem.solid.liskovsubstitutionprincipal;

public class Rectangle implements Shape{

    private int width;
    private int length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int computeArea(){
        return length*width;

    }
}
