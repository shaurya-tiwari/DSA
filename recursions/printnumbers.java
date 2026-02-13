// package recursions;

public class printnumbers {
    void display(int n) {
        if (n == 0) {
            return;
        }
        //print not here -------
        display(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printnumbers printnumbers = new printnumbers();
        printnumbers.display(7);
    }
}
