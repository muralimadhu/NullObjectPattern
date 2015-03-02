package com.designpatterns;

/**
 * Created with IntelliJ IDEA.
 * User: mmurali
 * Date: 3/1/15
 * Time: 9:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class NodeFactory {
    public static Node createNode(boolean withData){
        if(withData){
            return new DataNode();
        }
        return new NullNode();
    }
}
