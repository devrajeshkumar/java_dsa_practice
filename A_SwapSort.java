import java.util.ArrayList;
import java.util.Scanner;

public class A_SwapSort {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0, end = 0;
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    end = j;
                }
            }
            if (i != end) {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                ls.add(i);
                ls.add(end);
            }
        }
        int sz = ls.size();
        if (sz == 0) {
            System.out.println(0);
        } else {
            System.out.println(sz / 2);
            for (int i = 0; i < sz; i += 2) {
                System.out.println(ls.get(i) + " " + ls.get(i + 1));
            }
        }
        sc.close();
    }
}