public class interpolationSearch {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4,8,16,32,64,128,256,512,1024 };
        int index = interpolation(array, 256);    //search fro number 8
  if (index!= -1) {
    System.out.println("element found at index " + index);
    
  }
  else {
    System.out.println("Element not found in array");
  }
    }

    private static int interpolation(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe / gueses : " + probe);
            if (array[probe] ==value) return probe;
            else if (array[probe] < value) {
                low = probe + 1;
            }
            else{
                high = probe - 1;
            }

        }
        return -1;
    }
}
// probe / gueses : 2
// probe / gueses : 4
// probe / gueses : 6
// probe / gueses : 7
// probe / gueses : 8
// element found at index 8