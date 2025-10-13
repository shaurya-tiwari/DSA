// staticvs dynaic arrays
//  static : fixed , memory allocation is donne durinng compile time 
// dynamic array : size is not fixed , change as per the requirements , ex: vector in java  

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class staticANDdynamic {

    public static void main(String[] args) {
        // array list
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // add use for insert element by order
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        // arrayList.remove(1); // remove 2 from index 1
        arrayList.add(2, 4); // element 4 at index 2
        // prinnt loop
        for (int x : arrayList) {
            System.out.println(x);
        }

        // list : as list
        ArrayList<String> stringlList = new ArrayList<>();
        // option2 for create list
        List<String> list2 = Arrays.asList("one", "two", "three", "four");
        // its not allow add or remove , jjust replace
        list2.set(2, "replcaed three "); // just change the element on the index 3

        for (String x : list2) {
            System.out.println(x);
        }

    }
}
