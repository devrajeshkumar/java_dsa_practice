import java.util.Scanner;

public class Christmas_Gifts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int h = sc.nextInt();
            int l = sc.nextInt();
            int w = sc.nextInt();

            int area = 2 * (l * h + h * w + w * l);
            System.out.println(1000 / area);
            t--;
        }
        sc.close();
    }
}