class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<int[]> s = new Stack<>();
        int maxArea = 0;
        for(int i = 0 ; i < n ; i++ ){
            int start = i ; 
            while(!s.isEmpty() && heights[i] <= s.peek()[1]){
                int[] popped = s.pop();
                maxArea = Math.max(maxArea, popped[1] *(i - popped[0]));
                start = popped[0];
            }
            s.push(new int[]{start,heights[i]});
        }
        while(!s.isEmpty()){
            int[] popped = s.pop();
            maxArea = Math.max(maxArea, popped[1]*(n - popped[0]));
        }
        return maxArea;
    }

}