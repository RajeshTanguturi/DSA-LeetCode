class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,ans,new ArrayList<>(),new boolean[nums.length]);
        return ans;
    }
    public void dfs(int[] nums, List<List<Integer>> ans, List<Integer> curr, boolean[] visited){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i =0 ; i< nums.length ; i++){
            if(visited[i]) continue;
            else if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
            else{
                visited[i] = true;
                curr.add(nums[i]);
                dfs(nums,ans,curr,visited);
                curr.remove(curr.size() - 1);
                visited[i] = false;
            }
        }
    }
}