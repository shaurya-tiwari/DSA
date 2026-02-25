// logic -> extraction of digit 
// time complexity = log10(n) -> if any division is hapen with log1,lo2,logn , then it will became logn(n)

class revernumberr {
    public int reverseNumber(int x) {
        int rev = 0;

        while (x != 0) {
            int lastdigit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = (rev * 10) + lastdigit;
            x = x / 10;
        }
        return rev;

    }

    public static void main(String[] args) {
        revernumberr solution = new revernumberr();
        System.out.println(solution.reverseNumber(1534236469));
    }
}