// recursion - function that calls itself .f(f(x)).

// outer f(x) = take steps ;
// asumme = ineer f will do rest of the work. then it will fove output .

// every data is stored in the form of stack 


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


// Basic understanding of recursion

// public class leet {
//     public static void printnumber(int n) {
//         // base case
//         if (n == 0) {
//             return;

//         }
//         // call itself strep 1
//         System.out.println(n);
//         // call rest of the function
//         printnumber(n - 1); // all the rest value from to les
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         printnumber(n);  
// output = 5,4,3,2,1,
//     }
// }