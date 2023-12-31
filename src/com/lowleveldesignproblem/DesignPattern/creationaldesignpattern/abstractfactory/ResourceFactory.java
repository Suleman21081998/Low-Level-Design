package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.abstractfactory;

public interface  ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMib);
}
