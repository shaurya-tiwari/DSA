// time complexity = O(n^2) not optimized 


public class selectionsort {
    public static void main(String[] args) {
        int array[] = { 3, 6, 8, 9, 5, 2, 6, 9, 4, 1, 5 };
        selectionSort(array);
        for (int arr : array) {
            System.out.print(arr + " ");
        }

    }

    // we take nestedloop when we neeed to compare two itrations
    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int minumum = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minumum] > array[j]) {
                    minumum = j;
                }
            }
            // swap
            int temp = array[i];
            array[i] = array[minumum];
            array[minumum] = temp;
        }  
        
    }
}
