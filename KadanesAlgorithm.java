// the intution of kadanes algorithm is to calculate the sum of two numbers were :
// positive + postive = positive
//  smallNgertive + bignegetive  = positive
//  but if 
// smallpositive + bignegetive = negetive
// whenwver our subaaray sum is became negetive then the kadanes algorithm reset it to (0)ZERO  
// means adding the zero is better then the adding the big negative numbers 

//  so we take currentsum and maxsum 
// itrate on the current and whenever the sum of elemnt became less then ZERO then reset to the 0; 
// then we start itrattin from the next element which is remove from  the suyba rray becoause of the negetive sum  
// time complexity will be O(n)

public class KadanesAlgorithm {
    public int maxSubArray(int[] nums) {
        // int result = nums[0];
        int currentsume = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i : nums) {
            currentsume += i;
            maxsum = Math.max(currentsume, maxsum);
            if (currentsume < 0) {
                currentsume = 0; // THE VALUE WIL BE REST TO ZRRO
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        KadanesAlgorithm KadanesAlgorithm = new KadanesAlgorithm();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(KadanesAlgorithm.maxSubArray(nums));
    }
}
