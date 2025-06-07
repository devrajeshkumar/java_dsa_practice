import java.util.HashSet;
import java.util.Scanner;

public class C_Preparing_for_the_Exam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n, m, k;
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            int a[] = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < k; i++) {
                set.add(sc.nextInt());
            }
            String result = "";
            for (int i = 0; i < m; i++) {
                boolean flag = true;
                for (int j = 1; j <= n; j++) {
                    if (a[i] != j && !set.contains(j)) {
                        flag = false;
                    }
                }
                if (flag)
                    result += '1';
                else
                    result += '0';
            }
            System.out.println(result);
            t--;
        }
        sc.close();
    }
}