class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        ans.add(s);
        backtrack(s,ans,0);
        return ans;
    }
    public void backtrack(String s, List<String> ans,int idx){
        if(idx == s.length()){
            return;
        }
        for(int i = idx ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                c-=32;
                String modifiedString = s.substring(0,i)+c+s.substring(i+1);
                ans.add(modifiedString);
                backtrack(modifiedString,ans,i+1);
                continue;
            }else if(c>='A' && c<='Z'){
                c+=32;
                String modifiedString = s.substring(0,i)+c+s.substring(i+1);
                ans.add(modifiedString);
                backtrack(modifiedString,ans,i+1);
                continue;
            }
        }
    }
}