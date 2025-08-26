import java.util.Scanner;

public class A_One_and_Two {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int twos = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 2) {
                    twos++;
                }
            }
            if (twos == 0)
                System.out.println(1);
            else if ((twos & 1) == 1)
                System.out.println(-1);
            else {
                int curr = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 2)
                        curr++;
                    if (curr * 2 == twos) {
                        System.out.println(i + 1);
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}