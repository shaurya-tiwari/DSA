import java.util.LinkedList;

public class Linkedlisttt {
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList<String> list = new LinkedList<String>();
        // 1.this method will add item in a form of stack
        // list.push("A");
        // list.push("B");
        // list.push("c");
        // list.push("d");
        // list.push("e");
        // output = [e, d, c, B, A]

        // 2.this method will add item in a form of queqe means the first item comes at
        // the top
        // list.offer("A");
        // list.offer("B");
        // list.offer("c");
        // list.offer("d");
        // list.offer("e");
        // list.poll(); // e will remove
        // System.out.println(list); // output =[A, B, c, d, e]

        // here we are adding a element in the middel of the stack
        list.offer("A");
        list.offer("B");
        list.offer("c");
        list.offer("d");
        list.offer("e");
        list.add(2, "new item");
        // list.remove( "new item"); // form here new item were removed form the stack
        System.out.println(list); // output [A, B, "new item", c, d, e],indexing is tarted from the 0 thats why
                                  // "new item" come at the 3rd position
        System.out.println(list.indexOf("new item")); // 2

        // we can also peek element from the fist and last of the stack
        System.out.println(list.peekFirst()); // it willpeek the first element form the stack A
        System.out.println(list.peekLast()); // it willpeek the last element form the stack E

        System.out.println(list); // output [A, B, "new item", c, d, e],indexing is tarted from the 0 thats why
                                  // "new item" come at the 3rd position

        // we also add element at first and last.
        list.addFirst("addfirst");
        list.addLast("addlast");
        System.out.println(list); // output = [addfirst, A, B, new item, c, d, e, addlast]

    }
}
