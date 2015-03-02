package com.designpatterns;

/**
 * Created with IntelliJ IDEA.
 * User: mmurali
 * Date: 3/1/15
 * Time: 9:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class NullNode<E> extends Node<E> {
    @Override
    public boolean isNil() {
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public E getData() {
        return null;     // return nothing
    }

    @Override
    public Node<E> getNext() {
        return null;  // return nothing
    }

    @Override
    public void setData(E data) {
       // do nothing
    }

    @Override
    public void setNext(Node<E> next) {
       // do nothing
    }
}
