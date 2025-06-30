import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        solve();
    }

    public static void build(int node, int l, int r, long tree[], boolean reduced[], int arr[]) {
        if (l == r) {
            tree[node] = arr[l];
            reduced[node] = arr[l] <= 9;
            return;
        }
        int mid = (l + r) / 2;
        build(2 * node + 1, l, mid, tree, reduced, arr);
        build(2 * node + 2, mid + 1, r, tree, reduced, arr);
        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        reduced[node] = reduced[2 * node + 1] && reduced[2 * node + 2];
    }

    public static long querySum(int node, int l, int r, int ql, int qr, long tree[]) {
        if (qr < l || ql > r)
            return 0;
        if (ql <= l && r <= qr)
            return tree[node];
        int mid = (l + r) / 2;
        return querySum(2 * node + 1, l, mid, ql, qr, tree) +
                querySum(2 * node + 2, mid + 1, r, ql, qr, tree);
    }

    private static void digitReduce(int node, int l, int r, int ql, int qr, boolean reduced[], long tree[]) {
        if (qr < l || ql > r || reduced[node])
            return;

        if (l == r) {
            tree[node] = digitSum((int) tree[node]);
            reduced[node] = tree[node] <= 9;
            return;
        }

        int mid = (l + r) / 2;
        digitReduce(2 * node + 1, l, mid, ql, qr, reduced, tree);
        digitReduce(2 * node + 2, mid + 1, r, ql, qr, reduced, tree);

        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        reduced[node] = reduced[2 * node + 1] && reduced[2 * node + 2];
    }

    private static int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int queries[][] = new int[q][2];
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        long tree[] = new long[4 * n];
        boolean reduced[] = new boolean[4 * n];
        build(0, 0, n - 1, tree, reduced, arr);
        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            long sum = querySum(0, 0, n - 1, l, r, tree);
            System.out.print(sum + " ");
            digitReduce(0, 0, n - 1, l, r, reduced, tree);
        }

        sc.close();
    }
}