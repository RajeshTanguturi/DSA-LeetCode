class Solution {
    public int missingNumber(int[] nums) {
        int res = 0, i = 0;
        for( ; i<nums.length ; i++){
            // res = res ^ i;
            // res = res ^ nums[i];
            res = res ^ i ^ nums[i];
        }
        System.gc();
        return res ^ i ;
    }
}