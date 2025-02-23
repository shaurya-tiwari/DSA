public class Quicksort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 4, 7, 1, 9, 3, 4, 5,};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end) { // for the base case where the will itrate form start
                                                                  // to end

        if (end <= start) return;
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivotIndex = arr[end]; // pivot should be always at the end of the array ,
        int i = (start - 1); // Index of smaller element
        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivotIndex) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j]; /// swppping
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}
