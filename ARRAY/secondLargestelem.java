import java.util.Arrays;

public class secondLargestelem {
    public void findseceelem(int[] arr, int n) {
        if (n == 0 || n == 1) {
            System.out.println(-1 + " " + -1);
            return;
        }

        // initialize variables
        int smalles = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        int largestvalue = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        // find for smallest and largest
        for (int i = 0; i < n; i++) {
            // find small from array
            smalles = Math.min(smalles, arr[i]); // smalles in arr elements i
            largestvalue = Math.max(largestvalue, arr[i]);
        }
        // find second small with again traverse on array
        for (int i = 0; i < n; i++) {
            if (arr[i] < secondsmallest && arr[i] != smalles) { // if its largest and also unequal to smallest
                secondsmallest = arr[i];
            }
            if (arr[i] > secondlargest && arr[i] != largestvalue) {
                secondlargest = arr[i];
            }
        }
        System.out.println("sec smallest " + secondsmallest);
        System.out.println("sec largest  " + secondlargest);

    }

    public static void main(String[] args) {
        secondLargestelem secondLargestelem = new secondLargestelem();
        int[] arr = { 22, 11, 45, 77, 44, 26, 87, 98, 105 };

        secondLargestelem.findseceelem(arr, arr.length);
    }
    // Arrays.sort(arr);
    // return arr[n - 2];
    // }
}