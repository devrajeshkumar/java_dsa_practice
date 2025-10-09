import java.util.Scanner;

public class A_Almost_Prime {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3001];
        for (int i = 2; i <= 3000; i++) {
            int num = i;
            int count = 0;
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    count++;
                    while (num % j == 0)
                        num = num / j;
                }

            }
            if (num >= 2)
                count++;
            if (count == 2) {
                arr[i] = 1;
            }
        }
        for (int i = 1; i <= 3000; i++) {
            arr[i] += arr[i - 1];
        }
        int n = sc.nextInt();
        System.out.println(arr[n]);
        sc.close();
    }
}