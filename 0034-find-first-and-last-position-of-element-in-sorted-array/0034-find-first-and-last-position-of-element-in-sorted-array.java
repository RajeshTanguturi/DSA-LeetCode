class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums , target, true);
        int last  = binarySearch(nums , target, false);
        return new int[]{first,last};

    }
    public static int binarySearch(int nums[] , int target, boolean leftBias){
        int left = 0;
        int right = nums.length - 1;
        int idx = -1;
        while(left <= right){
            int mid = left +(right - left)/2;
            if (nums[mid] > target){
                right = mid -1;
            }
            else if( nums[mid] < target ){
                left = mid + 1;
            }
            else{
                idx = mid;
                if (leftBias){ // if true then search for left side or vice versa 
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return idx;
    }
}