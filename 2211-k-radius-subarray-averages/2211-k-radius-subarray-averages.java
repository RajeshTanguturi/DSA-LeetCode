class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, -1);
         if (2 * k + 1 > n) return ans; 
        long currSum = 0;
        for( int i = 0 ; i < Math.min(n,2*k+1) ; i++ ){
            currSum += nums[i];
        }
        ans[k] = (int) (currSum/(2*k+1));
        for( int i = k+1 ; i<n-k ; i++ ){
            currSum -= nums[i-k-1];
            currSum += nums[i+k];
            ans[i] = (int)(currSum/(2*k+1));
        }
        return ans;
    }
}