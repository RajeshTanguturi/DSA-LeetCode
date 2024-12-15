class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean visited[] = new boolean[nums.length];
        dfs(nums, new ArrayList<>(), ans, visited);
        return ans;
    }
    public void dfs(int[] nums, List<Integer> curr, List<List<Integer>> ans, boolean[] visited){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        // System.out.println(curr);
        for(int i = 0 ; i< nums.length ; i++){
            if(visited[i] == false){
                curr.add(nums[i]);
                visited[i] = true;
                dfs(nums,curr,ans,visited);
                curr.remove(curr.size()-1);
                visited[i] = false;
            }
        }
    }
}