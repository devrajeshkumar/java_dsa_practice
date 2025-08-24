import java.util.Scanner;

public class A_Extremely_Round {
    public static void main(String[] args) {
        solve();
    }

    public static int check(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 != 0)
                count++;
            n = n / 10;
        }
        return count > 1 ? 0 : 1;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[1000000];
        for (int i = 1; i <= 999999; i++) {
            arr[i] = check(i) + arr[i - 1];
        }
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(arr[n]);
        }
        sc.close();
    }
}