import java.util.Scanner;

public class B_Fence {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = 0, sum = 0, start = 0;
        for (int i = 0; i <= k - 1; i++) {
            sum += arr[i];
        }
        min = sum;
        int l = 0, r = k - 1;
        while (r < n - 1) {
            r++;
            sum += arr[r];
            sum -= arr[l];
            l++;
            if (min > sum) {
                min = sum;
                start = l;
            }
        }
        System.out.println(start + 1);
        sc.close();
    }
}