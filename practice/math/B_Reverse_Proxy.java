import java.util.Scanner;

public class B_Reverse_Proxy {

    public static void main(String[] args) {
        solve();
    }

    public static int findMin(int arr[]) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i + 1;
            }
        }
        return minIndex;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        int arr[] = new int[n];
        while (q > 0) {
            int ele = sc.nextInt();
            if (ele > 0) {
                arr[ele - 1] += 1;
                System.out.print(ele + " ");
            } else {
                int minIndex = findMin(arr);
                arr[minIndex - 1] += 1;
                System.out.print(minIndex + " ");
            }
            q--;
        }
        sc.close();
    }
}