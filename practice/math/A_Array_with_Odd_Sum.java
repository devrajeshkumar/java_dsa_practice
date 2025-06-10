import java.util.Scanner;
 
public class A_Array_with_Odd_Sum {
 
    public static void main(String[] args) {
        solve();
    }
 
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int even = 0, odd = 0;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                if (ele % 2 == 0)
                    even++;
                else
                    odd++;
            }
 
            if (odd == 0)
                System.out.println("NO");
            else if (odd > 0 && even > 0 || (odd % 2 != 0 && even == 0))
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
        sc.close();
    }
}