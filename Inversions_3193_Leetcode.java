import java.util.ArrayList;

public class Inversions_3193_Leetcode {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        int arr[] = new int[] { 2, 3, 4, 5, 6 };
        System.out.println(inversionCount(arr));
    }
    // public int numberOfPermutations(int n, int[][] requirements) {

    // }

    // GeeksForGeeks
    static int merge(int l, int m, int h, int arr[]) {
        ArrayList<Integer> ls = new ArrayList<>();
        int i = l, j = m + 1;
        int count = 0;
        while (i <= m && j <= h) {
            if (arr[i] <= arr[j]) {
                ls.add(arr[i]);
                i++;
            } else {
                count += (m - i + 1);
                ls.add(arr[j]);
                j++;
            }
        }
        while (i <= m) {
            ls.add(arr[i]);
            i++;
        }
        while (j <= h) {
            ls.add(arr[j]);
            j++;
        }
        for (i = l; i <= h; i++) {
            arr[i] = ls.get(i - l);
        }
        return count;

    }

    static int devide(int l, int h, int arr[]) {
        if (l >= h)
            return 0;
        int mid = l + (h - l) / 2;
        int total = 0;
        total += devide(l, mid, arr);
        total += devide(mid + 1, h, arr);
        total += merge(l, mid, h, arr);
        return total;
    }

    static int inversionCount(int arr[]) {
        // Code Here
        int l = 0, high = arr.length - 1;
        return devide(l, high, arr);

    }
}