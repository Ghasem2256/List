package list_t.pkg9;

public class list {

    private Node head;
    private Node tail;

    public list() {
        head = null;
        tail = null;
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

            return;
        }
        tail.next = node;
        tail = node;

    }

    public void addH(Object i) {
        Node node = new Node(i, null);
        if ((head == null) && (tail == null)) {
            head = node;
            tail = node;

            return;
        }
        node.next = head;
        head = node;

    }

    public Object remH() {
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

    public Object remT() {
        Node n = tail;

        if (head == null) {
            return null;
        }
        if (head == tail) {
            head = null;
            tail = null;

            return n.item;
        }

        Node p = head;
        for (Node i = head; i != tail; i = i.next) {
            p = i;
        }
        tail = p;
        tail.next = null;

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

    public void sortList() {

        // Node current will point to head
        Node current = head, index = null;

        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {

                index = current.next;

                while (index != null) {

                    if ((int) current.item > (int) index.item) {
                        temp = (int) current.item;
                        current.item = index.item;
                        index.item = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }

}
