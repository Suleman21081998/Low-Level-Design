package com.lowleveldesignproblem.DesignPattern.structuraldesignpattern.bridge;

public class BridgePattern {


    /*
    Difference between adopter and bridge pattern :
    The Adapter pattern makes things work after they're designed; Bridge makes them work before they are
     */

    public static  void main(String[] args){

        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(10);
        collection.offer(40);
        collection.offer(99);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());

    }
}
