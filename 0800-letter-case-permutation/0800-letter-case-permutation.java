class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(s.toCharArray(),ans,0);
        return ans;
    }
    public void backtrack(char[] s, List<String> ans,int idx){
        if(idx == s.length){
            ans.add(new String(s));
            return;
        }
        if(Character.isLetter(s[idx])){
            s[idx] = Character.toLowerCase(s[idx]);
            backtrack(s,ans,idx+1);
            s[idx] = Character.toUpperCase(s[idx]);
            backtrack(s,ans,idx+1);
        }
        else{
            backtrack(s,ans,idx+1);
        }
    }
}