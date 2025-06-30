import java.util.Scanner;

public class A_G_1 {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= k) {
                count++;
            }

        }
        System.out.println(count);
        sc.close();
    }
}