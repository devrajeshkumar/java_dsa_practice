import java.util.Scanner;

public class B_Blank_Space {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int maxCount = 0, currCount = 0;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                if (ele == 0)
                    currCount++;
                else {

                    maxCount = Math.max(maxCount, currCount);
                    currCount = 0;
                }

            }
            maxCount = Math.max(maxCount, currCount);
            System.out.println(maxCount);
        }
        sc.close();
    }
}