class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxcount = 0;
        for(char c : s.toCharArray()){
            if (c == '(') count++;
            else if( c== ')') count--;
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }
}