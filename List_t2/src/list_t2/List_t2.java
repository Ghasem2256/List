/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_t2;

/**
 *
 * @author GHASEM nasiri
 */
public class List_t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List l = new List();
        l.addH(new Integer(5));
        l.addH(new Integer(14));
        l.addH(new Integer(96));
        l.addH(new Integer(85));
        l.addH(new Integer(25));

        System.out.println(display(l));
        System.out.println(reverse(l));
        System.out.println(count(l));
        System.out.println(removegt(l, 26));
        System.out.println(display(l));

    }

    public static List reverse(List l) {
        List l1 = new List();
        for (Node n = l.getHead(); n != null; n = n.next) {

            l1.addH(l.removeH());
        }

        for (Node n = l1.getHead(); n != null; n = n.next) {

            l.addT(l1.removeH());
        }

        return l;
    }

    public static String display(List l) {
        String out = "";
        if (l.getHead() == null) {
            return "list is empty";
        }
        for (Node n = l.getHead(); n != null; n = n.next) {
            if (n != l.getTail()) {
                out += n.item.toString() + "->";
            } else {
                out += n.item.toString() + ";";
            }
        }
        return out;
    }

    public static int count(List l) {
        int c = 0;
        for (Node n = l.getHead(); n != null; n = n.next) {
            c++;
        }
        return c;
    }

    public static String removegt(List l, int x) {
        String out = "";
        for (Node n = l.getHead(); n != null; n = n.next) {
            if (n == l.getHead()) {

                if ((int) n.item > x) {
                    out += l.removeH().toString() + "_";

                }
            }
            if (n == l.getTail()) {

                if ((int) n.item > x) {
                    out += l.removeT().toString() + "_";

                }

            }
            if ((int) n.item > x) {
                out += l.remove(n).toString() + "_";
            }

        }
        return out;
    }
}
