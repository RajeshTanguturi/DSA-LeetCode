class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        dfs(nums,new ArrayList<>(), ans,0);
        return new ArrayList<>(ans);
    }
    public void dfs(int[] nums, List<Integer>  curr, Set<List<Integer>> ans, int idx){
        if(idx == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(nums[idx]);
        dfs(nums, curr, ans, idx+1);
        curr.remove(curr.size() - 1);
        while (idx + 1 < nums.length && nums[idx] == nums[idx + 1]) {
            idx++;
        }
        dfs(nums, curr,ans , idx+1);
    }
}