/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_t8;

/**
 *
 * @author GHASEM nasiri
 */
public class Node {

    Object item;
    Node next;

    public Node(Object o, Node n) {
        item = o;
        next = n;
    }
}