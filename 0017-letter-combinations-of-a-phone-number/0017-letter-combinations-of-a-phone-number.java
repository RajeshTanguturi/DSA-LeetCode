class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        Map<Character,char[]> map = new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});

        List<String> ans = new ArrayList<>();
        dfs(digits.toCharArray(), new ArrayList<>(), ans, map, 0);
        return ans;
    }
    public void dfs(char[] digits, List<Character> curr, List<String> ans, Map<Character,char[]> map, int idx){
        if(idx == digits.length){
            StringBuilder sb = new StringBuilder();
            for (Character ch : curr) {
                sb.append(ch);
            }
            ans.add(sb.toString());
            return;
        }
        char digit = digits[idx];
        char[] alphabets = map.get(digit);
        for(char alphabet : alphabets){
            curr.add(alphabet);
            // System.out.println(curr+" " +idx);
            dfs(digits,curr,ans,map,idx+1);
            curr.remove(curr.size()-1);
        }
    }

}