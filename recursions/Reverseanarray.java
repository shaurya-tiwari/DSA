
// import java.lang.reflect.Array;
import java.util.*;

public class Reverseanarray {

    int[] display() {
        int[] arr = { 5, 4, 3, 2, 1 };
        int left = 0; // initialize index
        int right = arr.length - 1;
        while (left < right) {
            // swap
            int temp = arr[left];
            arr[left] = arr[right]; // swap elements
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Reverseanarray Reverseanarray = new Reverseanarray();
        System.out.println(Arrays.toString(Reverseanarray.display()));

    }
}
