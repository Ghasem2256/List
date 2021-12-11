package list_t3;

public class List_t3 {

    public static void main(String[] args) {
        List l = new List();
        l.addT(49);
        l.addT(52);
        l.addT(65);
        l.addT(8);
        l.addT(5);
        l.addT(45);
        l.addT(69);
        l.addT(98);
        l.addT(78);
        l.addT(92);

        System.out.println(l.toString());
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.get(3));

        System.out.println(l.toString());

        System.out.println(add(l, 5, 1254));
        System.out.println(remove(l, 5));
        // System.out.println(removeAll(l));
        System.out.println(l.toString());

        System.out.println(swap(l, 8, 3));
    }

    public static String removeAll(List l) {
        String res = "";

        while (!l.isEmpty()) {
            res += l.getHead().item + " ";
            l.remH();
        }
        return res;
    }

    public static List add(List l, int index, Object o) {
        List l1 = new List();
        int count = 1;
        int c = 1;
        for (Node n = l.getHead(); count < index; n = n.next) {
            l1.addT(l.remH());

            count++;

        }
        l.addH(o);

        while (!l1.isEmpty()) {
            for (Node n = l1.getHead(); c < l1.size(); n = n.next) {
                l1.addH(l1.remH());
                c++;
            }
            l.addH(l1.remT());
        }

        return l;
    }

    public static Object remove(List l, int index) {
        List l1 = new List();
        int count = 1;
        int c = 1;
        for (Node n = l.getHead(); count <= index; n = n.next) {
            l1.addT(l.remH());

            count++;

        }
        l1.remT();

        while (!l1.isEmpty()) {
            for (Node n = l1.getHead(); c < l1.size(); n = n.next) {
                l1.addH(l1.remH());
                c++;
            }
            l.addH(l1.remT());
        }

        return l;
    }

    public static List swap(List l, int i, int j) {
        if (i > j) {
            int temp = i;
            i = j;
            j = temp;

        }
        List l1 = new List();
        List l2 = new List();
        int count = 1;
        int count1 = 1;
        int c = 1;
        for (Node n = l.getHead(); count <= i; n = n.next) {
            l1.addT(l.remH());

            count++;

        }
        for (Node n = l.getHead(); count1 <= j - i; n = n.next) {
            l2.addT(l.remH());

            count1++;

        }
        l.addH(l1.remT());
        l2.addH(l2.remT());

        while (l2.size() != 1) {
            for (Node n = l2.getHead().next; n != null; n = n.next) {
                l.addH(l2.remT());

            }

        }
        l.addH(l2.remH());

        while (!l1.isEmpty()) {

            l.addH(l1.remT());

        }

        return l;

    }
}
