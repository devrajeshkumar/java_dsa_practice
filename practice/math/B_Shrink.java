import java.util.Scanner;

public class B_Shrink {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            System.out.print(1+" ");
            for(int i=3;i<=n;i++){
                System.out.print(i+" ");
            }
            System.out.println(2);
            t--;
        }
        sc.close();
    }
}