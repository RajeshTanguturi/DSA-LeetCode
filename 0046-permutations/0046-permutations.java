class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfsWithSwap(nums,new ArrayList<>(),ans,0);
        return ans;
    }
    public void dfsWithSwap(int nums[], List<Integer> curr, List<List<Integer>> ans, int idx){
        if(idx == nums.length){
            List<Integer> sol  = new ArrayList<>();
            for(int i = 0;i< nums.length ; i++){
                sol.add(nums[i]);
            }
            ans.add(new ArrayList<>(sol));
            return;
        }

        for(int i = idx ; i < nums.length ; i++){
            //swap idx and i 
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
            dfsWithSwap(nums,curr,ans,idx+1);
            //unswap 
            temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
        }
    }
}