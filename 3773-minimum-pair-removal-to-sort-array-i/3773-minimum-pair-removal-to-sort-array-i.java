class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for (int i : nums)
            l.add(i);
        int operations = 0;
        while (!isIncreasing(l)) {
            int minSum = Integer.MAX_VALUE;
            int currSum;
            int idx = 0;
            for (int i = 0; i < l.size() - 1; i++) {
                currSum = l.get(i) + l.get(i + 1);
                if (currSum < minSum) {
                    minSum = currSum;
                    idx = i;
                }
            }
            l.remove(idx);
            l.remove(idx);
            l.add(idx, minSum);
            operations++;
        }
        return operations;
    }

    public boolean isIncreasing(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}