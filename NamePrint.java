public class NamePrint {
    void display(int num, String name) {
        int count = 0;
        if (count == num) // base case.
            return;
        System.out.println(name);
        count++;
        display(num - 1, name);
    }

    public static void main(String[] args) {
        NamePrint n = new NamePrint();
        n.display(5, "kabir");
    }
}
