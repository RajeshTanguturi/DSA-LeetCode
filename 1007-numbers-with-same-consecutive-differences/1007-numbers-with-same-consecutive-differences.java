class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        backtrack(0,n,k,ans,0);
        int res[] = new int[ans.size()];
        for(int i = 0 ; i< ans.size() ; i++){
            res[i] = ans.get(i);
        }
        return res;
    }
    private void backtrack(int num, int n, int k , List<Integer> ans,int idx ){
        if(idx == n){
            if(num == 0) return; 
            ans.add(num);
            return;
        }
        for(int i = 0 ; i< 10 ; i++){
            if (idx == 0 && i!= 0){  // to stop leading zeros 
                backtrack(i,n,k,ans, idx + 1);
                continue;
            } 

            if( Math.abs((num%10) - i ) == k){
                num *=10;
                num +=i;
                backtrack(num, n, k , ans, idx+1);
                num -= i; // retrive the changes ;
                num /=10;
            }
        }

    }
}