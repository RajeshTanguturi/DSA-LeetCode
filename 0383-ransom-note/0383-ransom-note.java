class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        short[] chars  = new short[26];
        for( char c : magazine.toCharArray()){
            chars[c-'a']++;
        }
        for( char c : ransomNote.toCharArray()){
            if( chars[c-'a'] == 0) return false;
            else chars[c-'a']--;
        }
        return true;
    }
}