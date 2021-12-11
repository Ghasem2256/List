/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_t5;

/**
 *
 * @author GHASEM nasiri
 */
public class Node {

    Object item;
    Node next;
    Node prev;

    public Node(Object o, Node p, Node n) {
        item = o;
        prev = p;
        next = n;

    }
}
