package list_t1;

public class List_t1 {

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(5);
        s.push(25);
        s.push(15);
        System.out.println(s.toString());
        System.out.println(s.size());
        s.pop();
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.toString());
        System.out.println(s.peek());
 
        
        System.out.println();
        System.out.println();

        Queue q = new Queue();
        q.enQueue(56);
        q.enQueue(87);
        q.enQueue(76);
        q.enQueue(43);
        q.enQueue(987);
        System.out.println(q.toString());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.deQueue());
        System.out.println(q.size());
        System.out.println(q.toString());

    }

}
