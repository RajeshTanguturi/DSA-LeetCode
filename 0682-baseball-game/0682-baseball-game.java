class Solution {
    public int calPoints(String[] operations) {
        List<Integer> res = new ArrayList<>();
        for(String s: operations){
            if(s.equals("C")){
                res.remove(res.size() - 1);
                System.out.println(res);
            }
            else if(s.equals("D")){
                res.add(2*res.get(res.size()-1));
                System.out.println(res);
            }
            else if(s.equals("+")){
                int lastIdx = res.size() - 1;
                res.add(res.get(lastIdx)+res.get(lastIdx-1));
                System.out.println(res);
            }else{
                int score = Integer.parseInt(s);
                // System.out.println(score);
                res.add(score);
                System.out.println(res);
            }
        }
        System.out.println(res);

        return sum(res);
    }
    public int sum(List<Integer> nums){
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }
        return sum;
    }
}