class Solution {
    public int binarySearch(int[] nums, int target, int left, int right){
        while(left<=right){
            int mid = left + ((right - left) / 2);
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length ;
        int left = 0;
        int right = n-1;
        while(left<right){
            int mid = left + ((right - left) / 2);
            if(nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        int pivot = left;
        // return left;
        if(target >= nums[pivot] && target <= nums[n-1]){
            return binarySearch(nums,target,pivot,n-1);
        }else{
            return binarySearch(nums,target,0,pivot-1);
        }
    }
}