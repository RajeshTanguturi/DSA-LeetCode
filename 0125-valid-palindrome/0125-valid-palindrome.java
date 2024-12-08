class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\p{Punct}|\\s", "").toLowerCase();
        return isValidPalindrome(s,0,s.length()-1);
    }
    private boolean isValidPalindrome(String s, int l, int r){
        if(l>=r) return true;
        if(s.charAt(l) != s.charAt(r)) return false;
        return isValidPalindrome(s,l+1,r-1);
    }
}