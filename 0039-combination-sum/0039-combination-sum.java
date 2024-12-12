class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(candidates,new ArrayList<>(),target,0,res);
        return res;
    }
    public void helper(int[] candidates,List<Integer> curr, int target,int idx, List<List<Integer>> res){
        if(idx == candidates.length){
            if(target == 0) res.add(new ArrayList<>(curr));
            return;
        }
        if(candidates[idx] <= target){
        curr.add(candidates[idx]);
        helper(candidates,curr,target-candidates[idx],idx,res);
        curr.remove(curr.size() - 1);
        }

        helper(candidates,curr,target,idx+1,res);
    }
}