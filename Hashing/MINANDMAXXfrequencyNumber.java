import java.util.*;

public class MINANDMAXXfrequencyNumber {

    public void findminmax(int[] arr, int n) {
        Map<Integer, Integer> mapelements = new HashMap<>();
        // put all the elemets in map , and count it
        for (int i = 0; i < n; i++) {
            mapelements.put(arr[i], mapelements.getOrDefault(arr[i], 0) + 1); // bydfault its 0 if availablle it became
                                                                              // +1 count
        }
        // take maxim and minimum frequnecy and elements
        int maxfrequency = 0, minfrequency = n;// means the minimum frwuncy not more then the length of array
        int maxelement = 0, minelement = 0;
    }
    // traverse on the map
    // use for each for traversing
    for(

    Map.Entry<Integer, Integer> entry:mapelements.entrySet())
    {
        int elements = entry.getKey(); // get that elemt from the map
        int count = entry.getValue(); // how many times it appeared
    }

    public static void main(String[] args) {
        MINANDMAXXfrequencyNumber objectclass = new MINANDMAXXfrequencyNumber();
        int[] arr = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 4, 5, 7, 8, 9, 8, 7, 6, 5, 3, 5, 7, 8, 4 };
        objectclass.findminmax(arr, arr.length);
    }
}
