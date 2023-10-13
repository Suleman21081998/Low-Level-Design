package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.prototypepattern;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        SwordsMan s1 = new SwordsMan();
        s1.move(new Point3D(-10,0,0), 20);
        s1.attack();

        System.out.println(s1);
        SwordsMan s2 = (SwordsMan)s1.clone();
        System.out.println("Cloned swordsman"+s2);

    }
}
