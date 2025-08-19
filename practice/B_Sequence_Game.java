import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_Sequence_Game {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            int prev = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (i == 0 || val >= prev)
                    list.add(val);

                else {
                    list.add(val);
                    list.add(val);
                }
                prev = val;
            }
            System.out.println(list.size());
            for (Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}