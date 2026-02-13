// package recursions;

public class factorial {

    int callfactorial(int n) {
        int sum = 0;
        if (n == 1) {
            return 1;
        }
        return n * callfactorial(n - 1);
    }

    public static void main(String[] args) {
        factorial fuck = new factorial();
        System.out.println(fuck.callfactorial(5));
    }
}
