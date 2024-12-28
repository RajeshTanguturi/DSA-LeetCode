class Solution {
    public int calPoints(String[] operations) {
        List<Integer> res = new ArrayList<>();
        for(String s: operations){
            if(s.equals("C")){
                res.remove(res.size() - 1);
            }
            else if(s.equals("D")){
                res.add(2*res.get(res.size()-1));
            }
            else if(s.equals("+")){
                int lastIdx = res.size() - 1;
                res.add(res.get(lastIdx)+res.get(lastIdx-1));
            }else{
                int score = Integer.parseInt(s);
                res.add(score);
            }
        }
       
       int sum = 0;
        for(int i : res){
            sum+=i;
        }
        return sum;
    }
}