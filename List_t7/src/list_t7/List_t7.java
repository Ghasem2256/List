package list_t7;

public class List_t7 {

    public static void main(String[] args) {
        List l = new List();
        //fill list until odd number
        l.addT(new Integer(2));
        l.addT(new Integer(28));
        l.addT(new Integer(25));
        l.addT(new Integer(23));
        l.addT(new Integer(83));
        l.addT(new Integer(53));
        l.addT(new Integer(63));
        l.addT(new Integer(548));
        l.addT(new Integer(54));
        System.out.println(l.toString());

        System.out.println(findMiddleNode(l));

    }

    public static Object findMiddleNode(List l) {
        Node slowPointer, fastPointer;
        slowPointer = fastPointer = l.getHead();

        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            if (fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }

        return slowPointer.item;

    }

}
