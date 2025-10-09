import java.util.Scanner;

public class B_Petr_and_a_Combination_Lock {
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
        sc.close();
        for (int num = 0; num < (1 << n); num++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ((num & (1 << i)) > 0) {
                    sum += arr[i];
                } else {
                    sum -= arr[i];
                }
            }
            if (sum % 360 == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }
}