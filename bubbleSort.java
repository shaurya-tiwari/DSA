public class bubbleSort {
    public static void main(String[] args) {
        int array[] = { 3, 4, 7, 1, 9, 6, 2, };
        bubbleSort(array);
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }

    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
