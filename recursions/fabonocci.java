public class fabonocci {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int current = 0;
        int next = 1;
        for (int i = 2; i <= n; i++) {
            int upnext = current + next;
            current = next;
            next = upnext;
        }
        return next;
    }

    public static void main(String[] args) {
        fabonocci fb = new fabonocci();
        System.out.println(fb.fib(4));
    }
}
