import java.util.Scanner;

public class A_Twin_Permutations {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int ele : arr) {
                System.out.print((n + 1 - ele) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}