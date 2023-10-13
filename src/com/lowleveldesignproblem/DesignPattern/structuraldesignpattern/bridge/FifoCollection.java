package com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.bridge;

public interface FifoCollection<T> {

    void offer(T element);

    //Removes & returns first element from collection
    T poll();
}
