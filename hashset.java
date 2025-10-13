import java.util.HashSet;
// hash doesnot store same elemets becaouse there is only unique value are present .
// insert / add = constant time (O(1))
// search / contains = constant time (O(1))
// delete / remove  = constant time (O(1))
//  hashing use to covert KV to indices 
import java.util.Iterator;
// iterate over the elements and traversing on the all the elements .

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(50);
        System.out.println(set); // it will print only unique values {10, 20, 30, 40, 50}
        System.out.println(set.contains(30)); // it will return true if element is present in set
        System.out.println(set.contains(60)); // it will return false if element is not present in set
        // size of the set
        System.out.println(set.size()); // it will return 5
        // remove element from set
        set.remove(30);
        System.out.println(set); // it will print {10, 20, 40, 50}
        // clear the set
        // set.clear();
        System.out.println(set); // it will print {}
        // check if set is empty
        System.out.println(set.isEmpty()); // it will return true if set is empty else false.

        // Iterator________________________________________________________________________________________________________________________________
        Iterator it = set.iterator();
        // there are two main functions in iterator hasNext; next;
        // it.next: returns thr next value in the set.null- 1- 2-3 4-5 6.
        // it.hasNext: returns true if there is a next value else false.
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // there is no guarentee that the element will sorted.
        }

    }
}
