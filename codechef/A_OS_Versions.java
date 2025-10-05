import java.util.HashMap;
import java.util.Scanner;

public class A_OS_Versions {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hs = new HashMap<>();
        hs.put("Ocelot", 1);
        hs.put("Serval", 2);
        hs.put("Lynx", 3);
        String x = sc.next();
        String y = sc.next();
        if (hs.get(x) >= hs.get(y))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}