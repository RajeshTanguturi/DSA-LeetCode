class Solution {
    public String getHappyString(int n, int k) {
        List<String> ans = new ArrayList<>();
        char []letters = new char[]{'a','b','c'};
        backtrack(ans,letters,n,new StringBuilder());
        // System.out.println(ans);
        if(ans.size() >= k ){
            return ans.get(k-1);
        }
        return "";
    }
    public void backtrack(List<String> ans, char[] letters,int n,StringBuilder sb){
        if(sb.length() == n ){
            ans.add(sb.toString());
            return;
        }
        for( char letter : letters ){
            if( sb.length() == 0 || sb.charAt(sb.length() -1 ) != letter ){
                sb.append(letter);
                backtrack(ans,letters,n,sb);
                sb.deleteCharAt(sb.length() - 1 );
            }
        }
    }
}