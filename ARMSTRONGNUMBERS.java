
public class ARMSTRONGNUMBERS {

    boolean numbercheck(int n) {
        // example n =153
        int numberofdigit = (int) Math.log10(n) + 1;
        int sum = 0; /// take for local variable
        int original = n; // take it as variable becouse the n is goin to manupuate in this code 
        for (int i = 0; i < numberofdigit; i++) { // itration will happen 3 times
            int currentDigit = n % 10; // take last digit 3 from n = 153
            // calculate the power in sum
            sum += (int) Math.pow(currentDigit, numberofdigit); // current digit have power of 3

            n = n / 10; // now the n becames 15 , beaocuse we romoved the 3
        }

        return sum == original;
    }

    public static void main(String[] args) {
        ARMSTRONGNUMBERS armstrongnumbers = new ARMSTRONGNUMBERS();
        System.out.println(armstrongnumbers.numbercheck(153));

    }
}
