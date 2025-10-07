import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class A_conjecture_of_Paul_Erdos {
    public static void main(String[] args) {
        solve();
    }

    public static void createSieve(int n, int sieve[]) {
        for (int i = 2; i * i < n; i++) {
            if (sieve[i] == 0) {
                for (int j = i * i; j < n; j += i) {
                    sieve[j] = 1;
                }
            }
        }
    }

    public static void solve() {
        int size = 10000000 + 5;
        int sieve[] = new int[size];
        createSieve(size, sieve);

        SortedSet<Integer> set = new TreeSet<>();
        for (int i = 0; i * i < size; i++) {
            for (int j = 0; j * j * j * j < size; j++) {
                int value = i * i + j * j * j * j;
                if (value < size && value > 1 && sieve[value] == 0)
                    set.add(value);
            }
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for (int value : set)
            ls.add(value);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            int low = 0, high = ls.size() - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (ls.get(mid) <= n) {
                    ans = mid;
                    low = mid + 1;

                } else {
                    high = mid - 1;
                }
            }
            if (n == 1)
                System.out.println(0);
            else
                System.out.println(ans + 1);
        }
        sc.close();
    }
}