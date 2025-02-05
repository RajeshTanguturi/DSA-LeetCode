class Solution {
    public int titleToNumber(String columnTitle) {
        // if( columnTitle.length() == 0) return 0;
        int ans = 0;
        // for(char c : columnTitle.toCharArray()){
        //     ans = ans*26 + ( c - 'A' + 1);
        // }
        for( int i = 0 ; i< columnTitle.length() ; i++){
            ans = ans*26 + ( columnTitle.charAt(i) - 'A' + 1);
        }
        return ans;
    }
}