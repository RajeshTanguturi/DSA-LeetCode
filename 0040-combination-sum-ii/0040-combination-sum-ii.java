class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(candidates);
        helper(candidates,new ArrayList<>(),target,0,res);
        return new ArrayList<List<Integer>>(res);
    }
    public void helper(int[] candidates,List<Integer> curr, int target,int idx, Set<List<Integer>> res){
        if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = idx; i< candidates.length ; i++){
            if(i>idx && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] > target) break;
            curr.add(candidates[i]);
            helper(candidates,curr,target-candidates[i],i+1,res);
            curr.remove(curr.size() - 1);
        }
    }
}