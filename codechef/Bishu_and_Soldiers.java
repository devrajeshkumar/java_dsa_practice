import java.util.Arrays;
import java.util.Scanner;

public class Bishu_and_Soldiers {
    public static void main(String[] args) {
        solve();
    }

    public static int find(int arr[], int value) {
        int l = 0, r = arr.length - 1;
        int index = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= value) {
                index = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return index;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int preSum[] = new int[n];
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            preSum[i] = sum;
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int value = sc.nextInt();
            int index = find(arr, value);

            if (index != -1) {
                System.out.println((index + 1) + " " + preSum[index]);
            }
        }

        sc.close();
    }
}