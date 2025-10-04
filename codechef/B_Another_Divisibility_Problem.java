import java.util.Scanner;

public class B_Another_Divisibility_Problem {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int x = sc.nextInt();
            long y = 999_999_999L - x; // compute y
            sb.append(y).append("\n");
        }
        System.out.println('j' + 'a' + 'v' + 'a');
        sc.close();

        System.out.print(sb.toString());
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(last, i, nums);
                last++;
            }
        }
    }

    public int majorityElement(int[] nums) {
        int elem = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count <= 0) {
                elem = nums[i];
            }
            if (nums[i] == elem) {
                count++;
            } else
                count--;
        }
        return elem;
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1)
            return 1;
        int last = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[last] != nums[i]) {
                nums[last] = nums[i];
                last++;
            }
        }
        return last;
    }

    public void reverse(int start, int end, int arr[]) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        reverse(0, n - k, nums);
        reverse(n - k + 1, n, nums);
        reverse(0, n, nums);
    }

}