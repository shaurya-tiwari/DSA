public class palindromeNumber {
    public boolean isPalindrome(int x) {
        int inputnumber = x;
        int reversednumber = 0;
        while (x > 0) {
            int lastdigit = x % 10;
            reversednumber = reversednumber * 10 + lastdigit;
            x /= 10;
        }
        return inputnumber == reversednumber;
    }

    public static void main(String[] args) {
        palindromeNumber palindromeNumber = new palindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121));
    }
}
