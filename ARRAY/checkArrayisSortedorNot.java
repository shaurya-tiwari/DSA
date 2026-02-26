public class checkArrayisSortedorNot {
    public boolean check(int[] arr, int n) {

        for (int i = 0; i < n-1; i++) { // itrate till second last or check to next which the last 
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        checkArrayisSortedorNot checkArrayisSortedorNot = new checkArrayisSortedorNot();
        int[] arr = { 1, 2, 3, 4, 5, 8, 9 };
        int[] arr2 = { 6, 2, 3, 7, 5, 8, 9 };
        System.out.println(checkArrayisSortedorNot.check(arr2, arr2.length));
    }
}
