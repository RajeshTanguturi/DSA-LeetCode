class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while(right < nums.length && left < nums.length){
            if(nums[right] != 0 ){
                while(left < right && nums[left] != 0){
                    left++;
                }
                if(left < nums.length){
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                // left = right;
            }
            right++;
        }
    }
}