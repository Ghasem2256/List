package list_t.pkg9;

public class List_t9 {

    public static void main(String[] args) {

        list l = new list();

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

        System.out.println(add(l, 549));

    }

    public static list add(list l, Object o) {
        list l1 = new list();
        l.sortList();
        for (Node n = l.getHead(); n != null; n = n.next) {
            if ((int) n.item <= (int) o) {
                l1.addT(l.remH());
            }

        }
        l1.addT(o);
        for (Node n = l.getHead(); n != null; n = n.next) {
            l1.addT(l.remH());
        }
        return l1;
    }

}
