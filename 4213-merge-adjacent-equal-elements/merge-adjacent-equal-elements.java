import java.util.*;

class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        ArrayList<Long> list = new ArrayList<>();

        for (int num : nums) {
            long curr = num;

            while (!list.isEmpty() && list.get(list.size() - 1) == curr) {
                list.remove(list.size() - 1);
                curr *= 2;
            }

            list.add(curr);
        }

        return list;
    }
}