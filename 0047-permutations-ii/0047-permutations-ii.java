class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        solve(nums, new ArrayList<>(), ans , new boolean[nums.length]);
        return ans;
    }
    private void solve( int[] nums, List<Integer> curr, List<List<Integer>> ans, boolean[] visited){
        if( curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for( int i = 0 ; i < nums.length ; i++){
            if(visited[i] == true) continue;
            if(i > 0 && nums[i-1] == nums[i] && visited[i-1] == false ) continue;
            curr.add(nums[i]);
            visited[i] = true;
            solve( nums, curr, ans, visited);
            visited[i] = false;
            curr.remove(curr.size()-1);
        }
    }
}