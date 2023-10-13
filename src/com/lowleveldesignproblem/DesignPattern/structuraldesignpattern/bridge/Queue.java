package com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.bridge;

public class Queue<T> implements FifoCollection<T> {

    private LinkList<T> list;

    public Queue(LinkList<T> list) {
        this.list = list;
    }

    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }
}
