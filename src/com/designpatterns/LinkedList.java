package com.designpatterns;

/**
 * Created with IntelliJ IDEA.
 * User: mmurali
 * Date: 3/1/15
 * Time: 9:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedList<E> {

    private Node<E> head;
    private int size;

    public LinkedList(){
        head = NodeFactory.createNode(false);
    }

    public Node<E> insertBefore(E data){
       Node<E> newNode = NodeFactory.createNode(true); //create new data node

       // is this the first element ?
        if(size == 0){
            newNode.setData(data);
            head = newNode;
        }
        else{
           newNode.setNext(head);
           newNode.setData(data);
           head = newNode;

        }
        size ++;
        return newNode;
    }

    public int getSize(){
        return size;
    }

    public Node<E> getHead(){
        return head;
    }

    public static void main(String[] args){
        LinkedList<String> l = new LinkedList();
        System.out.println("Size is :"+l.size);
        System.out.println("Is Head a null node? "+l.getHead().isNil());
        l.insertBefore("First Element");
        System.out.println("Size is :"+l.size);
        System.out.println("Is Head a null node? "+l.getHead().isNil());
        l.insertBefore("Second Element");
        System.out.println("Size is :"+l.size);
        System.out.println("Is Head a null node? "+l.getHead().isNil());

    }
}
