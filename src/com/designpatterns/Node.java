package com.designpatterns;

/**
 * Created with IntelliJ IDEA.
 * User: mmurali
 * Date: 3/1/15
 * Time: 9:37 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Node<E> {

    protected E data;

    protected Node<E> next;

    public abstract boolean isNil();

    public abstract E getData();

    public abstract Node<E> getNext();

    public abstract void setData(E data);

    public abstract void setNext(Node<E> next);

}
