class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        dfs(nums,ans,new ArrayList<>(),new boolean[nums.length]);
        return new ArrayList<>(ans);
    }
    public void dfs(int[] nums, Set<List<Integer>> ans, List<Integer> curr, boolean[] visited){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i =0 ; i< nums.length ; i++){
            if(!visited[i]){
                visited[i] = true;
                curr.add(nums[i]);
                dfs(nums,ans,curr,visited);
                curr.remove(curr.size() - 1);
                visited[i] = false;
            }
        }
    }
}