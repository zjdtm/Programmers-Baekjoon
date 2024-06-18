import java.util.Scanner;

public class Main {

    private static int count = 1;

    private static int recursion(String str, int l, int r) {
        if (l >= r) return 1;
        else if (str.charAt(l) != str.charAt(r)) return 0;
        else {
            count++;
            return recursion(str, l + 1, r - 1);
        }
    }

    private static int isPalindrome(String str) {
        return recursion(str, 0, str.length() - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int palindrome = isPalindrome(sc.next());
            sb.append(palindrome)
                    .append(" ")
                    .append(count)
                    .append("\n");

            count = 1;
        }

        System.out.println(sb.toString());

    }

}