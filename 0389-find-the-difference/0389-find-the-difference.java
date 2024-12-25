class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        // same xor cancels out : a^a = 0;
        for(char sc : s.toCharArray()) c^=sc;
        for(char tc : t.toCharArray()) c^=tc;
        return c;
    }
}