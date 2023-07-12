package collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("F");
        ll.add("B");
        ll.add("D") ;
        ll.add("E") ;
        ll.add("C") ;
        ll.addLast( "Z" ) ;
        ll.addFirst("A");
        ll.add( 1 , "A2" ) ;

        System.out.println("Linked list start: " + ll);

        ll.remove("F");
        ll.remove(2);

        System.out.println("Linked list after deleting: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("Linked list after deleting first and last: " + ll);

        String val = ll.get(2);
        ll.set(2, val + "changed");

        System.out.println("Linked list after changing: " + ll);
    }
}
