class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res  = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int num : nums){
            int size = res.size();
            for(int i= 0 ;i< size ;i++){
                List<Integer> newgen = new ArrayList<>(res.get(i));
                newgen.add(num);
                res.add(newgen);
            }
        }
        return res;
    }
}