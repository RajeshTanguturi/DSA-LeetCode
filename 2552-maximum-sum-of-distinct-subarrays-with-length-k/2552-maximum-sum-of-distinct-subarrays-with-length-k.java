class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long currSum = 0;
        long maxSum = 0;
        Set<Integer> set = new HashSet<>();
        int begin = 0;
        for (int end = 0; end < nums.length; end++) {
            if (!set.contains(nums[end])) {
                currSum += nums[end];
                set.add(nums[end]);
                if (set.size() == k) {
                    maxSum = Math.max(maxSum, currSum);
                    currSum -= nums[begin];
                    set.remove(nums[begin]);
                    begin++;
                }
            } else {
                while (nums[begin] != nums[end]) {
                    currSum -= nums[begin];
                    set.remove(nums[begin]);
                    begin++;
                }
                begin++;
            }
        }
        return maxSum;
    }
}