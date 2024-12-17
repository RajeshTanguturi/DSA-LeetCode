class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c : letters){
            if((c-target) > 0 ) return c;
        }
        return letters[0];
    }
}