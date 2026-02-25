import java.util.*;

public class MINANDMAXXfrequencyNumber {

    public void findminmax(int[] arr, int n) {
        Map<Integer, Integer> mapelements = new HashMap<>();
        // Count how many times each element appears in the array
        for (int i = 0; i < n; i++) {
            mapelements.put(arr[i], mapelements.getOrDefault(arr[i], 0) + 1);
        }

        // Initialize variables to track the highest and lowest frequencies
        int maxfrequency = 0, minfrequency = n; // minfrequency starts at array length (worst case)
        int maxelement = 0, minelement = 0;

        // Go through each entry in the map to find max and min frequency elements
        for (Map.Entry<Integer, Integer> entry : mapelements.entrySet()) {
            int elements = entry.getKey();   // The element from the array
            int count = entry.getValue();    // How many times it appeared

            // Update maxelement if this element has a higher frequency
            if (count > maxfrequency) {
                maxfrequency = count;
                maxelement = elements;
            }
            // Update minelement if this element has a lower frequency
            if (count < minfrequency) {
                minfrequency = count;
                minelement = elements;
            }
        }

        // Print the elements with the highest and lowest frequencies
        System.out.println("Element with max frequency = " + maxelement);
        System.out.println("Element with min frequency = " + minelement);
    }

    // Main method to test the logic
    public static void main(String[] args) {
        MINANDMAXXfrequencyNumber objectclass = new MINANDMAXXfrequencyNumber();
        int[] arr = { 1, 2, 3, 4, 4, 7 };
        objectclass.findminmax(arr, arr.length);
    }
}