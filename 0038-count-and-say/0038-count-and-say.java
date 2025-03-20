class Solution {
    public String rle(String s){
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        int count  = 1;
        int i = 1;
        while( i < s.length()){
            char curr = s.charAt(i);
            if( curr == prev ){
                count++;
            }
            else{
                sb.append(count).append(prev);
                prev = curr;
                count = 1;
            }
            i++;
        }
        sb.append(count).append(prev);
        return sb.toString();
    }
    public String countAndSay(int n) {
        String ans = "1";
        for( int i = 0 ; i < n - 1; i++ ){
            ans = rle(ans);
        }
        return ans;
    }
}