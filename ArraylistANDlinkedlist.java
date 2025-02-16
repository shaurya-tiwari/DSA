import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistANDlinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        ArrayList<Integer> arrylist = new ArrayList<>();
        Long starttime;
        Long endtime;
        Long elapsedtime;

        for (int i = 0; i <= 1000000; i++) {
            linkedlist.add(i);
            arrylist.add(i);
        }
        // __________________linked list_________________
        starttime = System.nanoTime();
        // linkedlist.get(870000);
        // linkedlist.remove(80000);
        linkedlist.remove(999999);
        endtime = System.nanoTime();
        elapsedtime = endtime - starttime;
        System.out.println("linkedlst:" + " elapsedtime:" + elapsedtime);
        // ________________________arraylist________________
        starttime = System.nanoTime();
        // arrylist.get(870000);
        // arrylist.remove(80000);
        arrylist.remove(999999);

        endtime = System.nanoTime();
        elapsedtime = endtime - starttime;
        System.out.println("ArrayList:" + " elapsedtime:" + elapsedtime);
    }
}

// answer for get
// linkedlst: elapsedtime:2197200
// ArrayList: elapsedtime:8900 array list is fast

// ____________________________
// answe for remove
// linkedlst: elapsedtime:4976500
// ArrayList: elapsedtime:605000
