class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int left = 0 ; 
        int right = 0;
        int sum = 0;
        //using sliding window dynamically changing window size 
        while(right < n){
            sum += nums[right];
            while ( sum >= target ){
                int len = right - left + 1 ;
                min = Math.min(min,len);
                sum-=nums[left];
                left++;
            }
            right++;
        }

        return min == Integer.MAX_VALUE ? 0:min;
    }
}