import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
    public void find(List<Integer> ls, List<List<Integer>> ans, int index, int arr[], int sum) {

        if (index == arr.length) {
            if (sum == 0)
                ans.add(new ArrayList<>(ls));
            return;
        }
        // pick
        if (arr[index] <= sum) {
            ls.add(arr[index]);
            find(ls, ans, index, arr, sum - arr[index]);
            ls.remove(ls.size() - 1);
        }
        find(ls, ans, index + 1, arr, sum);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        find(ls, ans, 0, candidates, target);
        return ans;
    }

}
