import java.util.Scanner;

public class A_Deranged_Deletions {

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
            boolean flag = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    flag = true;
                    System.out.println("YES");
                    System.out.println(2);
                    System.out.println(arr[i] + " " + arr[i + 1]);
                    break;
                }
            }
            if (!flag) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}