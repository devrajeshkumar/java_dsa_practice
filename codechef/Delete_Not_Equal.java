import java.util.Scanner;

public class Delete_Not_Equal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            boolean flag = true;
            for (int j = 1; j < n; j++) {
                if (s.charAt(j) != s.charAt(j - 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(n);
            } else {
                System.out.println(1);
            }
        }
        sc.close();
    }
}