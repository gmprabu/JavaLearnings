package com.learning.list;

public class ListTest {

    public static void main(String args[])
    {
        LinkedList list = new LinkedList();

        list.add(12);
        list.add(15);
        list.add(10);

        list.inserAtIndex(2,23);

        list.inserAtIndex(0,25);

        list.inserAtIndex(5,253);
        list.add(11);


        list.delete(0);
        list.delete(6);
        list.add(156);


        list.show();
    }
}
