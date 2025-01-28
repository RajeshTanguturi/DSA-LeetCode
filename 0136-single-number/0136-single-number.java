class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            int count = 0;
            for(int j : nums){
                if(i==j){
                    count++;
                }
                if(count>=2) break;
            }
            if(count == 1){
                return i;
            }
        }
        return -1;
    }
}