import java.util.Scanner;

public class A_MEX_Partition {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[101];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq[x]++;
            }
            int mex = 0;
            while (freq[mex] > 1)
                mex++;
            if (freq[mex] == 1) {
                mex++;
            }
            System.out.println(mex);
        }
        sc.close();
    }
}