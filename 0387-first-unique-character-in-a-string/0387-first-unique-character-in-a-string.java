class Solution {
    public int firstUniqChar(String s) {
        int[] chars  = new int[26];
        char [] StringsIntoCharacter=s.toCharArray();
        for( char c : StringsIntoCharacter){
            chars[c-'a']++;
        }
        for( int i = 0 ; i<=StringsIntoCharacter.length-1; i++){
            if( chars[StringsIntoCharacter[i]-'a'] == 1) return i;
        }
        return -1;
    }
}