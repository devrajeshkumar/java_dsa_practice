import java.util.Scanner;

public class Count_Odd_Even_Divisors {

    public static void main(String[] args) throws java.lang.Exception {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int odd = 0, even = 0;
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    int div = n / i;
                    if (i % 2 == 0)
                        even++;
                    else
                        odd++;
                    if (div != i) {
                        if (div % 2 == 0)
                            even++;
                        else
                            odd++;
                    }
                }
            }
            System.out.println(odd + " " + even);
        }
        sc.close();
    }
}