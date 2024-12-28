class Solution {
    public boolean isMonotonic(int[] nums) {
       boolean increases = true;
       boolean decreases = true;
       for(int i = 1 ; i< nums.length ; i++){
        if(nums[i] > nums[i-1]){
            decreases = false;
        }
        if(nums[i] < nums[i-1]){
            increases = false;
        }
       }
       return increases || decreases;
        
    }
}