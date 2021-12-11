/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_t8;

/**
 *
 * @author GHASEM nasiri
 */
public class List_t8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n = 4;

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

        find(l, n);

    }

    public static void find(list l, Object c) {

        int y = 0;

        for (Node n = l.getHead(); n != null; n = n.next) {
            if (y == (l.getX() - (int) c)) {
                System.out.println(n.item);
            }
            y++;
        }

    }

}
