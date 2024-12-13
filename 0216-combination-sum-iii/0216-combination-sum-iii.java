class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
        backtrack(arr,new ArrayList<>(),ans,0,k,n);
        return ans;
    }
    private static void backtrack(int []arr,List<Integer> curr, List<List<Integer>> ans, int idx, int k, int target){
        if(curr.size() == k && target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(idx == arr.length || target < 0 || curr.size() > k ) return;
        
        curr.add(arr[idx]);
        backtrack(arr,curr,ans,idx+1,k,target - arr[idx]);
        curr.remove(curr.size() -1 );
        backtrack(arr,curr,ans,idx+1,k,target);
    }
}