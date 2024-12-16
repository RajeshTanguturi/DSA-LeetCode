class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,new ArrayList<>(), ans,0);
        return ans;
    }
    public void dfs(int[] nums, List<Integer>  curr, List<List<Integer>> ans, int idx){
            ans.add(new ArrayList<>(curr));
        
        for(int i = idx ; i< nums.length ; i++){
            if( i> idx && nums[i] == nums[i-1] ) continue;
            curr.add(nums[i]);
            dfs(nums, curr, ans, i+1);
            curr.remove(curr.size() - 1);
        }
    }
}