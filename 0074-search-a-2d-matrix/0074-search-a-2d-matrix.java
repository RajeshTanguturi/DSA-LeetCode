class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowlen = matrix.length;
        int collen = matrix[0].length;

        int top = 0,bottom = rowlen-1;
        int left = 0,right = collen-1;

        while(top<=bottom){
            int mid = top + (bottom - top)/2;
            if(matrix[mid][0] <= target && matrix[mid][collen-1] >= target){ top = mid;break;}
            else if( matrix[mid][collen-1] > target) bottom = mid -1;
            else top = mid+1;
        }
        // System.out.println(top);
        if (top > bottom) return false; 
        int row = top;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(matrix[row][mid] == target) return true;
            else if(matrix[row][mid] > target) right  = mid-1;
            else left  = mid+1;
        }
        // System.out.println(top);
        return false;
    }
}