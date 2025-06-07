import java.util.Arrays;
import java.util.Scanner;

public class Bulk_Discount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();

        while (t != 0) {
            int sum = 0;
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                arr[i] = num;
            }
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                if (arr[i] - i >= 0) {
                    sum += (arr[i] - i);
                }
            }
            System.out.println(sum);
            t--;
        }
        sc.close();
    }
}