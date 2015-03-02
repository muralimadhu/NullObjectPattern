package com.designpatterns;

/**
 * Created with IntelliJ IDEA.
 * User: mmurali
 * Date: 3/1/15
 * Time: 9:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataNode<E> extends Node<E> {
    @Override
    public boolean isNil() {
        return false;  // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public E getData() {
        return data;
    }

    @Override
    public Node<E> getNext() {
        return next;
    }

    @Override
    public void setData(E data) {
        this.data = data;
    }

    @Override
    public void setNext(Node<E> next) {
        this.next = next;
    }

}
