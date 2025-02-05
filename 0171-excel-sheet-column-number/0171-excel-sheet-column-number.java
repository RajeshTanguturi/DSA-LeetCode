class Solution {
    public int titleToNumber(String columnTitle) {
        if( columnTitle.length() == 0) return 0;
        int ans = 0;
        for(char c : columnTitle.toCharArray()){
            ans = ans*26 + ( c - 'A' + 1);
        }
        return ans;
    }
}