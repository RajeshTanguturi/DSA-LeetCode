class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        // Arrays.sort(candidates);
        helper(candidates,new ArrayList<>(),target,0,res);
        return res;
    }
    public void helper(int[] candidates,List<Integer> curr, int target,int idx, List<List<Integer>> res){
        if(target < 0 ) return;
        if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = idx ; i< candidates.length ; i++){
            curr.add(candidates[i]);
            helper(candidates,curr,target - candidates[i],i,res);
            curr.remove(curr.size()-1);
        }
    }
}