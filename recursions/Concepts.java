// when fnction call itself until a specific condition ,, the bbase condition 
// recursion with print number n times
public class Concepts {
    void recursion(int n) {
        if (n > 5)
            return; // base condition
        System.out.println(n);
        recursion(n + 1); // increase count with +1
    }

    public static void main(String[] args) {
        Concepts c = new Concepts();
        c.recursion(0);
    }
}
