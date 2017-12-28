package com.learning.list;

import java.util.NoSuchElementException;

public class LinkedList {

    Node head;
    Node tail;

    public void add(int data){

        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail=node;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }

    public void insertFirst(int data){

        Node node = new Node(data);

        if(head == null){
            head = node;
            tail = node;
        } else {

            node.next = head;
            head = node;
        }
    }

    public void inserAtIndex(int index,int data){

        if (index == 0){
            insertFirst(data);
        }
        else {
            Node node = new Node(data);

            Node n = head;
            for(int i = 0 ; i < index -1 ; i++){
                n= n.next;
            }
            if (n == null) {
                throw new NoSuchElementException();
            } else if(node.next == null) {
                tail.next =node;
                tail = node;
            }else {
                node.next = n.next;
                n.next = node;
            }
        }
    }

    public  void delete(int index){

        if(index ==0){
            Node n = head;
            head = head.next;
        }else {

            Node n = head;
            for(int i = 0 ; i < index -1 ; i++){
                n= n.next;
            }
            Node n1 = n.next;
            if (n.next == null) {
                throw new NoSuchElementException();
            } else if(n1.next == null) {
                 tail =n;
                 tail.next = null;
            }else {
                n.next = n1.next;
                n1 = null;
            }
        }


    }

    public  void  show(){

        if(head != null)
        for (Node node = head ; node != null ; node = node.next)
            System.out.println(node.data);
    }
}
