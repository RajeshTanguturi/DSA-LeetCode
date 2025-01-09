class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for( String word : words){
            // if(word.startsWith(pref)) count++;
            if(isPrefix(word,pref)) count++;

        }
        return count;
    }
    public boolean isPrefix(String word, String prefix){
        int n1 = word.length();
        int n2 = prefix.length();
        if(n1<n2) return false;

        for(int i = 0 ; i<n2 ; i++){
            if(word.charAt(i) != prefix.charAt(i)){
                return false;
            }
        }
        return true;
    }
}