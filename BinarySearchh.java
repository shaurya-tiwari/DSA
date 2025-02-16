
import java.util.Arrays;

public class BinarySearchh {
    // public static void main(String[] args) {
    // // here we are using the in built feature to search binary search .
    // int[] arr = new int[1000];

    // int target = 42;
    // for (int i = 0; i < 1000; i++) {
    // arr[i] = i;
    // }
    // int index = Arrays.binarySearch(arr, target);
    // if (index == -1) {
    // System.out.println("not found " + target);

    // } else {
    // System.out.println("element found at: " + index);
    // }
    // }   output =element found at: 42
    public static void main(String[] args) {
        int[] arr = new int[1000];

        int target = 42;
        for (int i = 0; i < 1000; i++) {
            arr[i] = i;
        }
        int index = binarySearch(arr, target);
        if (index == -1) {
            System.out.println("not found " + target);

        } else {
            System.out.println("element found at: " + index);
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = arr[mid];   // setting arraus mid value

            if(value < target) left =mid+1;  // shifting value form middle to right position.
            else if(value > target) right = mid-1; // shifting value form middle to left position
            else return mid;  // if value matches, return mid index.  // else keep searching.

        }
        return -1; // -1 means elementy not found
    }
    // output = element found at: 42
}