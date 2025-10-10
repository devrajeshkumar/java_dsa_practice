import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum40 {
    public void find(List<Integer> ls, List<List<Integer>> ans, int index, int arr[], int sum) {

        if (sum == 0) {
            ans.add(new ArrayList<>(ls));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > sum)
                break;
            ls.add(arr[i]);
            find(ls, ans, i + 1, arr, sum - arr[i]);
            ls.remove(ls.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        find(ls, ans, 0, candidates, target);

        return ans;
    }

}
