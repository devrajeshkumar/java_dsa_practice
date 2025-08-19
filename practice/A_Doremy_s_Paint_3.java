import java.util.Scanner;

public class A_Doremy_s_Paint_3 {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count1 = 0, count2 = 0, ele1 = -1, ele2 = -1;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                if (ele1 == -1) {
                    ele1 = ele;
                    count1++;
                } else if (ele2 == -1 && ele != ele1) {
                    ele2 = ele;
                    count2++;
                } else if (ele == ele1) {
                    count1++;
                } else if (ele == ele2) {
                    count2++;
                }

            }
            if ((count1 + count2) != n)
                System.out.println("No");
            else if (count1 > 0 && count2 > 0 && Math.abs(count1 - count2) > 1)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
        sc.close();
    }
}