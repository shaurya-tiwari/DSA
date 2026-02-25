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
        // traverse on the map
        // use for each for traversing , just like creating new , map for key and values

        for (Map.Entry<Integer, Integer> entry : mapelements.entrySet()) {
            int elements = entry.getKey(); // get that elemt from the map
            int count = entry.getValue(); // how many times it appeared

            // for maxmum vulue
            if (count > maxfrequency) {
                maxfrequency = count;
                maxelement = elements;
            }
            // for minimum frequency element
            if (count < minfrequency) {
                minfrequency = count;
                minelement = elements;
            }

        }
        // print
        System.out.println("max frewuncy = " + maxelement);
        System.out.println("min  frewuncy = " + minelement);
    }
    // main logic for count

    public static void main(String[] args) {
        MINANDMAXXfrequencyNumber objectclass = new MINANDMAXXfrequencyNumber();
        int[] arr = { 1, 2, 3, 4, 4, 7 };
        objectclass.findminmax(arr, arr.length);
    }
}