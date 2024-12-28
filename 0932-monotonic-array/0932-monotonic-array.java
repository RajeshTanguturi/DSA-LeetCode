class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 0;

        //traversing till nums[i]!=nums[i+1]
        while(i < nums.length-1){
            if(nums[i]!=nums[i+1]) break;
            i++;
        }
        if(i==nums.length -1) return true;
        if(nums[i] > nums[i+1]){
            //checkdecresing
            int max = nums[i];
            int prev = nums[i];
            for(int j = i; j< nums.length ; j++){
                if(nums[j]> max || nums[j]>prev) return false;
                prev = nums[j];
            }
            return true;
        }else{
            System.out.println("second case");
            int min = nums[i];
            int prev = nums[i];
             for(int j = i; j< nums.length ; j++){
            // System.out.println(i+" "+ prev);
                if(nums[j]<min || nums[j]< prev) return false;
                prev = nums[j];
            }
            return true;
        }
    }
}