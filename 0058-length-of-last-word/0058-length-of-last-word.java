class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        if(s.charAt(s.length()-1)!=' ') count++;
        for(int i = s.length()-2 ; i>=0; i--){
            if(s.charAt(i) == ' '&& s.charAt(i+1)!=' ') break;
            if(s.charAt(i)!=' ') count++;
        }
        return count;
    }
}