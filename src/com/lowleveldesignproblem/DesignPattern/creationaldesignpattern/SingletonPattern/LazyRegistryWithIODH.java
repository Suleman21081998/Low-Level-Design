package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.SingletonPattern;

public class LazyRegistryWithIODH {

    private LazyRegistryWithIODH() {
        System.out.println("In LazyRegistryIODH singleton");
    }

    private static class RegistryHolder {
        static LazyRegistryWithIODH INSTANACE = new LazyRegistryWithIODH();
    }

    public static LazyRegistryWithIODH getInstance() {
        return RegistryHolder.INSTANACE;
    }
}
