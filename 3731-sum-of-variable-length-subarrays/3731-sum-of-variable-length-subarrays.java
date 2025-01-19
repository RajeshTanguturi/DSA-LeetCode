class Solution {
    public int subarraySum(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for( int i = 0 ; i < n ; i++ ){
            int start = Math.max(0, i - nums[i]);
            int end = i;
            int sum = 0;
            for( int j = start ; j <= end ; j++ ){
                sum +=nums[j];
            }
            System.out.println(start+" "+end+" "+sum);
            totalSum +=sum;
        }
        return totalSum;
    }
}