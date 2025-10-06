import java.util.Scanner;

public class Permutations {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
        } else if (n < 4) {
            System.out.println("NO SOLUTION");
        } else {
            int i = 1, j = 2;
            StringBuilder sb = new StringBuilder();
            while (j <= n) {
                sb.append(j).append(" ");
                j += 2;
            }
            while (i <= n) {
                sb.append(i).append(" ");
                i += 2;
            }
            System.out.println(sb);
        }
        sc.close();
    }

    public int getSecondLargest(int[] arr) {
        // code here
        int first = -1, second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
        }
        return second;
    }
}