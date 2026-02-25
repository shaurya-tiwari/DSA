
public class largestelem {
    public int findelem(int[] arr, int n) {
        int max = arr[0]; // initia[l maximum value .
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        largestelem largestment = new largestelem();
        int[] arr = { 1, 5, 3, 6, 9, 4, 2, 44, 7, 9, 99, 44, 22, 77, 25, 57, 60 };
        System.out.println(largestment.findelem(arr, arr.length));
    }
}
