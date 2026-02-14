
// public class palindrom {

//     boolean display(String s, int i, int n) {

//         if (i >= n / 2) {
//             return true;
//         }
//         if (s.charAt(i) != s.charAt(n - i - 1)) {
//             return false;
//         }

//         return display(s, i + 1, n);

//     }

//     public static void main(String[] args) {
//         palindrom palindrom = new palindrom();
//         String str = "M=A;D-A'M";
//         // System.out.println(str);
//         String NS = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
//         System.out.println(NS);
//         System.out.println(palindrom.display(NS, 0, NS.length()));
//     }
// }

public class palindrom {
    public boolean isPalindrome(String s) {
        String str2 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
                int n = str2.length();

        for (int i = 0; i <= n; i++) {
            if (str2.charAt(i) != str2.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        palindrom palindrom = new palindrom();
        String str = "A man, a plan, a canal: Panama";
        String str2 = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(palindrom.isPalindrome(str2));
    }
}