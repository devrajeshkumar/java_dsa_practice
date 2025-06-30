import java.util.Scanner;

public class M3375 {

    public static void main(String[] args) {
        solve();
    }

    public static int makeEqual(int arr[], int target){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=target) count++;
        }
        if(arr[n-1] == target) return count;
        return Integer.MAX_VALUE;
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if(makeEqual(arr, 1)<=k || makeEqual(arr, -1)<=k){
            System.out.println(1);
        }
        else{
            System.err.println(0);
        }
        sc.close();
    }
}