import java.util.Scanner;

public class C_Target_Practice {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int count = 0;
            for (int i = 0; i < 10; i++) {
                String row = sc.nextLine();
                for (int j = 0; j < 10; j++) {
                    if (row.charAt(j) == 'X') {
                        if (i == 0 || i == 9 || j == 0 || j == 9)
                            count += 1;
                        else if (i == 1 || j == 1 || i == 8 || j == 8)
                            count += 2;
                        else if (i == 2 || j == 2 || i == 7 || j == 7)
                            count += 3;
                        else if (i == 3 || j == 3 || i == 6 || j == 6)
                            count += 4;
                        else
                            count += 5;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}