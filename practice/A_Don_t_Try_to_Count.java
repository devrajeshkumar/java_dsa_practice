import java.util.Scanner;

public class A_Don_t_Try_to_Count {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            sc.nextLine();
            String x = sc.nextLine();
            String y = sc.nextLine();
            boolean found = false;
            for (int i = 0; i < 6; i++) {
                if (x.contains(y)) {
                    found = true;
                    System.out.println(i);
                    break;
                }
                x += x;
            }
            if (!found)
                System.out.println(-1);
        }

        sc.close();
    }
}