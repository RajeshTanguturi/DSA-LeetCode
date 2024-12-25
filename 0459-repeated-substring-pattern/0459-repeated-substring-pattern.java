class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length() == 1) return false;
        int maxsubstringlength = s.length()/2;
        for(int i = 1; i<=maxsubstringlength+1 ; i++){
            StringBuilder sb = new StringBuilder();
            String temp = s.substring(0,i);
            int multiple  = s.length()/i;
            for(int j = 0 ; j<multiple ; j++){
                sb.append(temp);
            }
            String res = sb.toString();
            if(res.equals(temp)) break;
            // System.out.println(i+ " "+sb.toString());
            if(res.equals(s)) return true;
        }
        return false;
    }
}