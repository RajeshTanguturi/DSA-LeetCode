class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\p{Punct}|\\s", "").toLowerCase();
        StringBuilder reverse = new StringBuilder(s);
        return s.equals(reverse.reverse().toString());
    }
}