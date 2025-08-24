import java.util.Scanner;

public class A_Everybody_Likes_Good_Arrays {
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
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                if ((arr[i] % 2 == 1 && arr[i + 1] % 2 == 1) || (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0))
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}