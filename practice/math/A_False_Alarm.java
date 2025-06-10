import java.util.Scanner;

public class A_False_Alarm {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt(), x = sc.nextInt();
            int first = -1, last = -1;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                if (first == -1 && ele == 1) {
                    first = i;
                } else if (first != -1 && ele == 1) {
                    last = i;
                }
            }
            if ((last - first+1) <= x)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
        sc.close();
    }
}