package list_t1;

import java.util.LinkedList;

public class Queue {

    LinkedList l = new LinkedList();

    public int size() {
        return l.size();
    }

    public boolean isEmpty() {
        return l.isEmpty();
    }
    public Object deQueue(){
        return l.removeFirst();
    }
    public void enQueue(Object o){
        l.addLast(o);
    }
        public Object peek() {
        return l.peekFirst();
    }
            public String toString() {
        String res = "";
        if (l.isEmpty()) {
            return "List is empty";
        }
        while (!l.isEmpty()) {
            res += l.pollLast().toString() + " ";
        }
        Object arr[] = res.split(" ");
        for (Object x : arr) {
            l.addFirst(x);
        }
        return res;
    }
}
