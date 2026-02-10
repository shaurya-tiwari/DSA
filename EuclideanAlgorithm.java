class EuclideanAlgorithm {
    int code(int a, int b) {
        // ittrate till any of one goes to zero
        while (a > 0 && b > 0) {
            // if a will greater then b
            if (a > b) {
                // euclidean
                a = a % b; // dividing the number 52 -52 /10 =

            } else {
                b = b % a;

            }
            if (a == 0)
                return b;
        }
        return a;
    }

    public static void main(String[] args) {
        EuclideanAlgorithm euclideanAlgorithm = new EuclideanAlgorithm();
        int gcd = euclideanAlgorithm.code(52, 10);
        System.out.println(gcd);
    }
}