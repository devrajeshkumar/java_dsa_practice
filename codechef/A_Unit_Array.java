import java.util.Scanner;

public class A_Unit_Array {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0, sum = 0;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                sum += ele;
                if (ele == -1) {
                    count++;
                }
            }
            if (sum >= 0) {
                if ((count & 1) == 1) {
                    System.out.println(1);
                } else
                    System.out.println(0);
            } else {
                sum = -1 * sum;
                int required = (sum & 1) == 1 ? sum / 2 + 1 : sum / 2;
                count = count - required;
                if ((count & 1) == 1)
                    System.out.println(required + 1);
                else
                    System.out.println(required);
            }

        }
        sc.close();
    }
}