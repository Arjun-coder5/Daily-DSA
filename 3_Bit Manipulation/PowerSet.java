import java.util.*;

public class PowerSet {
    public static List<List<Integer>> powerSet(int[] arr) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int mask = 0; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) subset.add(arr[i]);
            }
            res.add(subset);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ps = powerSet(arr);
        System.out.println(ps); // [[], [1], [2], [1,2], ...]
    }
}
