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
public class list {
    

    private Node head;
    private Node tail;
    private int x = 0;

    public list() {
        head = null;
        tail = null;
    }
    public Node getHead(){
        return head;
    }
        public Node getTail(){
        return tail;
    }
          public int getX(){
        return x;
    }

    public void addT(Object i) {
        Node node = new Node(i, null);
        if ((head == null) && (tail == null)) {
            head = node;
            tail = node;
            x++;
            return;
        }
        tail.next = node;
        tail = node;
        x++;

    }

    public void addH(Object i) {
        Node node = new Node(i, null);
        if ((head == null) && (tail == null)) {
            head = node;
            tail = node;
            x++;
            return;
        }
        node.next = head;
        head = node;
        x++;
    }

    public Object remH() {
        Node n = head;

        if (head == null) {
            return n.item;
        }
        if (head == tail) {
            head = null;
            tail = null;
            x--;
            return n.item;
        }
        head = head.next;
        x--;
        return n.item;

    }

    public Object remT() {
        Node n = tail;

        if (head == null) {
            return null;
        }
        if (head == tail) {
            head = null;
            tail = null;
            x--;
            return n.item;
        }

        Node p = head;
        for (Node i = head; i != tail; i = i.next) {
            p = i;
        }
        tail = p;
        tail.next = null;
        x--;

        return n.item;
    }

    public String toString() {
        String out = "";
        if (head == null) {
            return "list is empty";
        }
        for (Node n = head; n != null; n = n.next) {
            if (n != tail) {
                out += n.item.toString() + "->";
            } else {
                out += n.item.toString() + ";";
            }
        }
        return out;
    }



    
}

