import java.util.ArrayList;
import java.util.List;

public class CombinationSum216 {
    public void find(int k, int sum, int index, List<Integer> ls, List<List<Integer>> ans) {
        if (k == 0) {
            if (sum == 0)
                ans.add(new ArrayList<>(ls));
            return;
        }
        for (int i = index; i <= 9; i++) {
            if (i > sum)
                break;
            ls.add(i);
            find(k - 1, sum - i, i + 1, ls, ans);
            ls.remove(ls.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        find(k, n, 1, ls, ans);
        return ans;
    }

}
