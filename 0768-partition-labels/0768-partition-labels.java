class Solution {
    public List<Integer> partitionLabels(String s) {
        //find the last occurences of each character
        int last[] = new int[26];
        for(int i = 0 ; i<s.length() ; i++){
            last[s.charAt(i) - 'a'] = i;
        }

        List<Integer> ans = new ArrayList<>();
        // anchor, j represents the first and last index of the partition 
        int j = 0, anchor = 0;
        for(int i = 0 ; i<s.length() ; i++){
            j = Math.max(j, last[s.charAt(i) - 'a']);
            if(i == j){
                ans.add(j-anchor+1);
                anchor = i+1;
            }
        }
        return ans;
    }
}