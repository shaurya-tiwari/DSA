// package recursions;

public class sumofnumber {
    int display(int n) {
        if (n == 0) {
            return 0;
        }
        // formula = n*(n+1)/2 for find sum of all the integers in constant time O(1)
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        sumofnumber sumofnumber = new sumofnumber();
        System.out.println(sumofnumber.display(7));
    }
}
