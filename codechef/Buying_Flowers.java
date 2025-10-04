import java.util.ArrayList;
import java.util.Scanner;

public class Buying_Flowers {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int coins = 0;
            if (n % 3 == 0) {
                coins = n / 3 * 5;
            } else if (n % 3 == 2) {
                coins = (n / 3) * 5 + 4;
            } else {
                coins = ((n / 3) - 1) * 5 + 8;
            }
            System.out.println(coins);
        }
        sc.close();
    }

    public int minJumps(int[] arr) {
        // code here

        int maxJump = 0;
        int jumps = 0, maxEnd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                return jumps;
            maxJump = Math.max(maxJump, i + arr[i]);
            if (i == maxEnd) {
                jumps++;
                maxEnd = maxJump;
            }
            if (i >= maxJump)
                return -1;
        }
        return jumps;

    }

    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int ladder = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i++) {
            ladder = Math.max(ladder, arr[i]);
            if (ans.isEmpty()) {
                ans.add(ladder);
            } else if (ans.get(ans.size() - 1) != ladder) {
                ans.add(ladder);
            }
        }
        ans.reversed();
        return ans;

    }

    public int findClosest(int x, int y, int z) {
        if (Math.abs(x - z) == Math.abs(y - z)) {
            return 0;
        } else if (Math.abs(x - z) < Math.abs(y - z)) {
            return 1;
        }
        return 2;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        if (n1 > n2)
            return findMedianSortedArrays(nums2, nums1);
        int left = (n1 + n2 + 1) / 2;
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < n1)
                r1 = nums1[mid1];
            if (mid2 < n2)
                r2 = nums2[mid2];
            if (mid1 - 1 >= 0)
                l1 = nums1[mid1 - 1];
            if (mid2 - 1 >= 0)
                l2 = nums2[mid2 - 1];

            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 0) {
                    return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
                }
                return Math.max(l1, l2);
            }

            if (l1 > r2) {
                high = mid1 - 1;
            } else
                low = mid1 + 1;
        }
        return 0.0;
    }

    public int kthElement(int nums1[], int nums2[], int k) {
        // code here
        int n1 = nums1.length, n2 = nums2.length;
        if (n1 > n2)
            return kthElement(nums2, nums1, k);
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = k - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < n1)
                r1 = nums1[mid1];
            if (mid2 < n2)
                r2 = nums2[mid2];
            if (mid1 - 1 >= 0)
                l1 = nums1[mid1 - 1];
            if (mid2 - 1 >= 0)
                l2 = nums2[mid2 - 1];

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            }

            if (l1 > r2) {
                high = mid1 - 1;
            } else
                low = mid1 + 1;
        }
        return 0;

    }

    public int findIndex(int arr[]) {
        int l = 0, r = arr.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            if (arr[mid] == 1) {
                ans = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        return ans;
    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int ans = 0;
        int ansIndex = 0;
        for (int i = 0; i < n; i++) {
            int index = findIndex(mat[i]);
            if (index != -1) {
                if (ans < (mat[i].length - index)) {
                    ans = mat[i].length - index;
                    ansIndex = i;
                }
            }
        }
        return mat[ansIndex];
    }

    public boolean check(int n) {
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0)
                return false;
            n = n / 10;

        }
        return true;
    }

    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if (check(i) && check(n - i)) {
                return new int[] { i, n - i };
            }
        }
        return new int[] { -1, -1 };
    }

    public int findIndex(int mat[][], int n, int mid) {
        int index = -1, maxEle = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][mid] > maxEle) {
                maxEle = mat[i][mid];
                index = i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int low = 0, high = m - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            int rowIndex = findIndex(mat, n, mid);
            int left = mid - 1 >= 0 ? mat[rowIndex][mid - 1] : -1;
            int right = mid + 1 < m ? mat[rowIndex][mid + 1] : -1;
            if (mat[rowIndex][mid] > left && mat[rowIndex][mid] > right) {
                return new int[] { rowIndex, mid };
            } else if (mat[rowIndex][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }
}
