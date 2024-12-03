class Solution {
    public String addSpaces(String s, int[] spaces) {
        //beats 95
        int n = s.length();
        int m = spaces.length;
        char[] newstr = new char[n+m];
        int j = 0;
        for(int i = 0 ; i<n ;i++){
            if(j<m && i == spaces[j]){
                newstr[i+j] = ' ';
                j++;
            }
            newstr[i+j] = s.charAt(i);
        }
        return new String(newstr);
    }
}