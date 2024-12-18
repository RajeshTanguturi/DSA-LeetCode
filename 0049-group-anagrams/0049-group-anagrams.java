class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int count[] = new int[26];
            for(char c : str.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder key = new StringBuilder();
            for(int i: count){
                key.append("#").append(i);
            }
            String k = key.toString();
            map.putIfAbsent(k,new ArrayList<>());
            map.get(k).add(str);
        }
        return new ArrayList<>(map.values());
    }
}