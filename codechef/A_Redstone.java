import java.util.Scanner;

public class A_Redstone {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[101];
            boolean isPossible = false;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                arr[num]++;
                if (arr[num] >= 2) {
                    isPossible = true;
                }
            }
            if (isPossible)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();
    }
}