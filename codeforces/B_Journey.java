import java.util.Scanner;

public class B_Journey {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n, a, b, c;
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int sum = a + b + c;
            int steps = (n / sum) * 3;
            int total = (steps / 3) * sum;
            for (int i = 0; i < 3; i++) {
                if ((n - total) > 0) {
                    if (i == 0) {
                        total += a;
                    } else if (i == 1) {
                        total += b;
                    } else if (i == 2) {
                        total += c;
                    }
                    steps += 1;
                }
            }
            System.out.println(steps);
            t--;
        }
        sc.close();
    }
}