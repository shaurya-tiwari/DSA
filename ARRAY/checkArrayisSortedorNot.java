public class checkArrayisSortedorNot {
    public boolean check(int[] nums, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) { // itrate till second last or check to next which the last
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        checkArrayisSortedorNot checkArrayisSortedorNot = new checkArrayisSortedorNot();
        int[] nums = { 1, 2, 3, 4, 5, 8, 9 };
        int[] nums2 = { 2, 1, 3, 4 };
        System.out.println(checkArrayisSortedorNot.check(nums2, nums2.length));
    }
}
