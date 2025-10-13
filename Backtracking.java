
// Backtracking - is a technique used in solving problems by trying all possible combinations of solutions. means find aal solution of the problem. then use accordingly
// when we reached to the final then returning again to the tree ,then that process is callled backtracking

public class Backtracking {
    public static void printpermutaion(String str, String permu, int index) {
        if (str.length() == 0) {
            System.out.println(permu);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentchar = str.charAt(i);
            String newstring = str.substring(0, i) + str.substring(i + 1); // i will not include in the new string

            // now again call the function for complete the recursiveness
            printpermutaion(newstring, permu + currentchar, index + 1);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printpermutaion(str, "", 0);  // at first permutation will be empty
    }
}
