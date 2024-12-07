class Solution {
    private int timetaken(int arr[], int rate){
        int total = 0;
        for(int i = 0 ; i< arr.length ; i++){
            total+= Math.ceil((double)arr[i]/rate);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxele = 0; 
        for(int i : piles){
            maxele = Math.max(maxele,i);
        }
        int left = 1,right = maxele;
        while(left <= right){
            int mid = left+(right - left)/2;
            int time = timetaken(piles,mid);
            System.out.println(mid + " " +time);

            if(time <= h){
                right = mid - 1 ; 
            }
            else if(time > h){
               left  = mid+1;
            }
        }
        return left;
    }
}