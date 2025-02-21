class Solution {
    public void moveZeroes(int[] nums) {
        int right = 0;
        int countZeros = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[right-countZeros];
                nums[right-countZeros] = nums[right];
                nums[right] = temp;
            } else {
                countZeros++;
            }
            right++;
        }
    }
}