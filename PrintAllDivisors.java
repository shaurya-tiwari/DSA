public class PrintAllDivisors {

    public void printnumbers(int num) {
        for (int i = 1; i <= num; i++) { // not include 0 becouse  its infinite 
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        PrintAllDivisors p = new PrintAllDivisors();
        p.printnumbers(12);
    }
}
