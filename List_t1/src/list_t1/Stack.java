package list_t1;

import java.util.LinkedList;

public class Stack {

    LinkedList f = new LinkedList();

    public Object pop() {
        /*    if (f.isEmpty()) {
            return "List is empty";}
         */
        return f.pop();

    }

    public void push(Object o) {
        f.push(o);
    }

    public int size() {
        return f.size();
    }

    public boolean isEmpty() {
        return f.isEmpty();
    }

    public Object peek() {
        return f.peekFirst();
    }

    public String toString() {
        String res = "";
        if (f.isEmpty()) {
            return "List is empty";
        }
        while (!f.isEmpty()) {
            res += f.pollLast().toString() + " ";
        }
        Object arr[] = res.split(" ");
        for (Object x : arr) {
            f.addFirst(x);
        }
        return res;
    }

}
