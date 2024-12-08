class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res  = new ArrayList<>();
        generateSubsets(0,nums,res,new ArrayList<>());
        return res;
    }
    private void generateSubsets(int i,int[] nums,List<List<Integer>> res, List<Integer> current){
        if(i == nums.length){
            res.add(new ArrayList(current));
            return;
        }

        current.add(nums[i]);
        generateSubsets(i+1,nums,res,current);
        current.remove(current.size() - 1);
        generateSubsets(i+1,nums,res,current);
    }
}