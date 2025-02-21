class Solution {
    public int removeElement(int[] nums, int val) {
        int countVal = 0;
        for( int i = 0 ; i < nums.length ; i++ ){
            if(nums[i]!=val){
                int temp = nums[i - countVal];
                nums[i - countVal] = nums[i];
                nums[i] = temp;
            }else{
                countVal++;
            }
        }
        return nums.length - countVal;
    }
}