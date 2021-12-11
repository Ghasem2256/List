/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_t3;

/**
 *
 * @author GHASEM nasiri
 */
public class List {

    private Node head;
    private Node tail;
    private int s = 0;

    public List() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public int size() {
        return s;
    }

    public Object get(int index) {
        int count = 0;
        Node m = null;
        for (Node n = head; n != null; n = n.next) {
            count++;
            if (count == index) {
                m = n;
            }

        }
        return m.item;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void addT(Object i) {
        Node node = new Node(i, null);
        if ((head == null) && (tail == null)) {
            head = node;
            tail = node;
            s++;

            return;
        }
        s++;
        tail.next = node;
        tail = node;

    }

    public void addH(Object i) {
        Node node = new Node(i, null);
        if ((head == null) && (tail == null)) {
            head = node;
            tail = node;
            s++;

            return;
        }

        node.next = head;
        head = node;
        s++;

    }

    public Object remH() {
        Node n = head;

        if (head == null) {
            s = 0;
            return n.item;

        }
        if (head == tail) {
            head = null;
            tail = null;
            s--;

            return n.item;

        }
        head = head.next;
        s--;

        return n.item;

    }

    public Object remT() {
        Node n = tail;

        if (head == null) {
            s = 0;
            return null;
        }
        if (head == tail) {
            head = null;
            tail = null;
            s--;

            return n.item;
        }

        Node p = head;
        for (Node i = head; i != tail; i = i.next) {
            p = i;
        }
        tail = p;
        tail.next = null;
        s--;

        return n.item;
    }

   /* public void add(int index, Object o) {
        Node node = new Node(o, null);
        int c = 0;
        for (Node i = head; c < index; i = i.next) {

            c++;
        }
        Node p = head;
        for (Node i = head; i != tail; i = i.next) {
            p = i;
        }
    }*/

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
