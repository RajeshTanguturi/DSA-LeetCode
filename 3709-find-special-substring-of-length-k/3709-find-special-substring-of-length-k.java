class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();
        int count = 1;
        for( int i = 1 ; i < n ; i++ ){
            if( s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                if( count == k) return true;
                count = 1;
            }      
        }
        return count == k ?  true :  false;
    }
}