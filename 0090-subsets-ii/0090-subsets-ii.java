class Solution {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();

        Arrays.sort(nums);

        calcSubset2(nums, 0, currentList, resultList);

        return resultList;
    }

    private static void calcSubset2(int[] nums, int start, List<Integer> currentList,
            List<List<Integer>> resultList) {

        resultList.add(new ArrayList<>(currentList)); // O(n) time to copy

        for (int i = start; i < nums.length; i++) {
            // Prune decision tree for duplicate numbers after the first occurence.
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            currentList.add(nums[i]);
            calcSubset2(nums, i + 1, currentList, resultList);
            currentList.remove(currentList.size() - 1);
        }
    }
}