package com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.bridge;

public interface LinkList<T> {

    void addFirst(T element);

    T removeFirst();

    void addLast(T element);

    T removeLast();

    int getSize();
}
