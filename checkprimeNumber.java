
public class checkprimeNumber {

    public boolean print(int n) {
        if (n == 2)
            return true;
        if (n % 2 == 00) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        checkprimeNumber c = new checkprimeNumber();
        System.err.println(c.print(2));
    }
}
