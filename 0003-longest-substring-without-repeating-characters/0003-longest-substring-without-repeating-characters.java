class Solution {
    public int lengthOfLongestSubstring(String s) {
        int currLen = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        int start = 0 ; 
        for( int end = 0 ; end<s.length() ; end++){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                maxLen = Math.max(end-start+1,maxLen);
            }else{
                while(s.charAt(start) != s.charAt(end)){
                    set.remove(s.charAt(start));
                    start++;
                }
                start++;
            }
        }
        return maxLen;
    }
}