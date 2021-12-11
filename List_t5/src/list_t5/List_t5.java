/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_t5;

/**
 *
 * @author GHASEM nasiri
 */
public class List_t5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List l = new List();
        l.addH(new Integer(5));
        l.addH(new Integer(82));
        l.addH(new Integer(96));
        l.addH(new Integer(85));
        l.addH(new Integer(2));

        System.out.println(l);
        System.out.println(toString(l, 'W'));

    }

    public static String toString(List l, char d) {

        String out = "";
        for (Node n = l.getHead(); n != null; n = n.next) {
            for (Node m = l.getHead().next; m != null; m = m.next) {
                if (((int) m.item + (int) n.item) == (int) d) {

                    out += "(" + n.item + "," + m.item + ")" + " ";

                }

            }
        }
        if (out == "") {
            out += "dont exist";
        }
        return out;
    }

}
