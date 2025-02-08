class Solution {
    public int lengthOfLongestSubstring(String s) {
        int currLen = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        int start = 0 ; 
        for( int end = 0 ; end<s.length() ; end++){
            char currentChar = s.charAt(end);
            
            // If the character is already in the set, move the start pointer
            // to the right of the first occurrence of the character
            while (set.contains(currentChar)) {
                set.remove(s.charAt(start));
                start++;
            }
            
            // Add the current character to the set
            set.add(currentChar);
            
            // Update the maximum length if the current window is larger
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}