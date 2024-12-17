class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        generatePartitions(s,new ArrayList<>(), ans , 0);
        return ans;
    }
    public void generatePartitions(String s,List<String> curr, List<List<String>> ans, int start){
        if(start == s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for( int end = start ; end < s.length() ; end++){
            if(isPalindrome(s,start,end)){
                curr.add(s.substring(start,end+1));
                generatePartitions(s, curr, ans , end+1);
                curr.remove(curr.size() - 1);
            }

        }
    }
    public boolean isPalindrome(String s, int start, int end){
        while(start< end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}