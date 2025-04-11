
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxarea = 0;
        while(left<=right){
            int minptr = Math.min(height[right],height[left]);
            int area = (right-left)*minptr;
            // System.out.println(area);
            maxarea = Math.max(maxarea,area);
            while(left<= right && height[right] <= minptr){
                // System.out.println(left+" "+right);
                right--;
            }
             while(left<= right && height[left] <= minptr){
                // System.out.println(left+" "+right);
                left++;
            }
        }

        return maxarea;
    }
}