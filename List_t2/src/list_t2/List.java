
package list_t2;

public class List {
    
    private Node head;
    private Node tail;

    public List() {
        head = null;
        tail = null;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void addH(Object o) {
        Node n = new Node(o, null, null);
        if (head == null && tail == null) {
            tail = n;
            head = n;
            return;

        }
        head.prev = n;
        n.next = head;
        head = n;

    }

    public void addT(Object o) {
        Node n = new Node(o, null, null);
        if (head == null && tail == null) {
            tail = n;
            head = n;
            return;

        }
        tail.next = n;
        n.prev = tail;
        tail = n;

    }
    public Object remove(Node x){
         Object i=x.item;
          x.next.prev=x.prev;
          x.prev.next=x.next;
          return i;
        }
          

    

    public Object removeH() {
        Node n = head;
        if (head == null) {
            return n.item;
        }
        if (head == tail) {
            head = null;
            tail = null;

            return n.item;
        }
        head = head.next;

        return n.item;

    }

    public Object removeT() {
        Node n = head;
        if (head == null) {
            return n.item;
        }
        if (head == tail) {
            head = null;
            tail = null;

            return n.item;
        }
        tail = tail.prev;
        tail.next = null;

        return n.item;

    }
        public boolean isEmpty(){
        if(head==null)
           return true;
        return false;
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
