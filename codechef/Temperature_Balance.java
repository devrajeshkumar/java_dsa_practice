import java.util.Scanner;

public class Temperature_Balance {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int t = sc.nextInt();
        // while (t != 0) {
        // int n = sc.nextInt();
        // int balance = 0;
        // int total = 0;
        // for (int i = 0; i < n; i++) {
        // balance += sc.nextInt();
        // total += Math.abs(balance);
        // }
        // System.out.println(total);
        // t--;
        // }
        // sc.close();
        // "leetcode"
        // "ee*e"
        // "car"
        // "c*v"
        // "luck"
        // "u*"
        // "tokk"
        // "t*t"
        System.out.println(hasMatch("tokk", "t*t"));
    }

    public static boolean hasMatch(String s, String p) {
        int ind = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*') {
                ind = i;
            }
        }
        if (s.contains(p.substring(0, ind)) && s.contains(p.substring(ind + 1))) {
            return true;
        }

        return false;
    }
}