class Solution {
    public int missingNumber(int[] nums) {
        boolean there[] = new boolean[nums.length+1];
        for(int i : nums){
            there[i] = true;
        }
        for(int i = 0 ; i<there.length ; i++){
            if(!there[i]) return i;
        }
        return -1;
    }
}