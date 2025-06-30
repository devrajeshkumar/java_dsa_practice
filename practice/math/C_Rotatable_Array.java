import java.util.Scanner;

public class C_Rotatable_Array {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int rotation = 0;
        while (q > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                int index = sc.nextInt(), value = sc.nextInt();
                arr[index - 1] = value;
            } else if (type == 3) {
                int k = sc.nextInt();
                rotation = (k + rotation) % n;
                // System.out.println("type is " + type + " " + rotation + " " + k);
            } else {
                int index = sc.nextInt();
                int leftEle = index - 1;
                int newRotation = rotation;
                System.out.println("rotations are " + rotation);
                if (newRotation <= leftEle) {
                    System.out.println(arr[index - 1 - newRotation]);
                } else {
                    newRotation = newRotation - leftEle;
                    System.out.println(arr[n - newRotation]);
                }
            }
            q--;
        }
        sc.close();
    }
}