public class mergesort {
    public static void main(String[] args) {
        // Merge Sort
        int[] array = { 2, 4, 7, 6, 3, 8, 9, 7, 1 };
        MergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void MergeSort(int[] array) {
        int length = array.length;
        if (length <= 1)
            return;
        int middle = length / 2;
        int[] leftarray = new int[middle];
        int[] rightarray = new int[length - middle];
        int i = 0; // left array
        int j = 0; // right array
        for (; i < length; i++) {
            if (i < middle) {
                leftarray[i] = array[i];
            } else {
                rightarray[j] = array[i];
                j++;
            }
        }
        MergeSort(leftarray);
        MergeSort(rightarray);
        Merge(leftarray, rightarray, array);

    }

    public static void Merge(int[] leftarray, int[] rightarray, int[] array) {
        int leftsize = array.length / 2;
        int rightsize = array.length - leftsize;
        int i = 0, l = 0, r = 0; // indices

        while (l < leftsize && r < rightsize) {
            if (leftarray[l] < rightarray[r]) {
                array[i] = leftarray[l];
                i++;
                l++;
            } else {
                array[i] = rightarray[r];
                i++;
                r++;
            }
        }
        while (l < leftsize) {
            array[i] = leftarray[l];
            i++;
            l++;
        }
        while (r < rightsize) {
            array[i] = rightarray[r];
            i++;
            r++;

        }
    }
}
