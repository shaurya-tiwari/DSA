public class LinearSearchhh {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 8, 9, 4, 5, 6, 2, 4, 5, 0, 8, 6, 2, 6, 83 };
        int index = linearsearch(arr, 8);
        if (index != -1) {
            System.out.println("element index found "+index);
            
        } else {
            System.out.println("not found");
        }
    }
    
    public static int linearsearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;

            }
        }
        return -1;
    }
}
