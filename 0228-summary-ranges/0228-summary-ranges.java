class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0) return ans;
        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                end = nums[i];
            } else {
                if (start != end) {
                    ans.add(start + "->" + end);

                } else {
                    ans.add(start + "");

                }
                start = nums[i];
                end = nums[i];
            }
        }
        if (start != end) {
            ans.add(start + "->" + end);

        } else {
            ans.add(start + "");
        }
        return ans;
    }
}