/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_t6;

/**
 *
 * @author GHASEM nasiri
 */
public class List_t6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     List l = new List();
        l.addT(new Integer(2));
        l.addT(new Integer(28));
        l.addT(new Integer(25));
        l.addT(new Integer(23));
        l.addT(new Integer(83));
        l.addT(new Integer(53));
        l.addT(new Integer(63));
        l.addT(new Integer(548));
        System.out.println(l.toString());
        System.out.println(Del(4, 2, l));

    }

    public static List Del(Object a, Object b, List l) {
        System.out.println(a + "\t" + "پیمایش");
        System.out.println(b + "\t" + "تعداد حذف شدن");
        System.out.println();
        int c = 1;
        int x = 1;
        List l1 = new List();

        while ((int) a >= x) {

            l1.addT(l.remH());
            x++;

        }
        while ((int) b >= c) {
            System.out.println(l.remH());
            c++;
        }

        for (Node n = l.getHead(); n != null; n = n.next) {
            l1.addT(l.remH());
        }
        return l1;
    }

}
