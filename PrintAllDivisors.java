public class PrintAllDivisors {

    public void printnumbers(int num) {
        for (int i = 1; i <= Math.sqrt(num); i++) { // not include 0 becouse its infinite
            if (num % i == 0) {
                System.out.println(i);

                if (i != num / i) {
                    System.out.println(num / i);
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintAllDivisors p = new PrintAllDivisors();
        p.printnumbers(12);
    }
}
