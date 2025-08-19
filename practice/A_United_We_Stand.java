import java.util.Arrays;
import java.util.Scanner;

public class A_United_We_Stand {
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
            Arrays.sort(arr);
            boolean flag = false;
            if (arr[0] == arr[n - 1]) {
                flag = true;
            }
            if (flag) {
                System.out.println("-1");
            } else {
                int ind = 0;
                while (arr[ind] == arr[0])
                    ind++;

                System.out.println(ind + " " + (n - ind));
                for (int i = 0; i < ind; i++)
                    System.out.print(arr[i] + " ");
                System.out.println();
                for (int i = ind; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

        }
        sc.close();
    }
}