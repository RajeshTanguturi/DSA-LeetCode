class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) return 0;
        int maxcount = 0;
        for(int i = 0 ; i<s.length() ; i++){
            Set<Character> set = new HashSet<>();
            int count = 0;
            for(int j = i ; j<s.length() ; j++){
                if(set.add(s.charAt(j)) ){
                    count++;
                }else{
                    break;
                }
            }
            maxcount = Math.max(maxcount,count);
        }
        return Math.max(maxcount,1);


    }
}