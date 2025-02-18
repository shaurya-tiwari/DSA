public class Recursion {
    public static void main(String[] args) {
        // walk(5);
       System.out.println( factorial(7));
    }

    // private static void walk(int steps) {

    // if (steps < 1)
    // return; // base case

    // System.out.println("takes step ");
    // walk(steps - 1); // recursive case

    // }

    private static int factorial(int n) {
        if (n < 1)
            return 1; // base case
        return n * factorial(n - 1); // recursive case
    }
}
