class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int n = piles.length;
        long total = 0;
        for (int p : piles) total += p;

        int left = (int) ((total - 1) / h) + 1;
        int right = (int) ((total - n) / (h - n + 1)) + 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int time = 0;
            for (int p : piles) {
                time += (p - 1) / mid + 1;
            }
            if (time > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;  
    }
}


// class Solution {
//     private int timetaken(int arr[], int rate){
//         int total = 0;
//         for(int i = 0 ; i< arr.length ; i++){
//             total+= Math.ceil((double)arr[i]/rate);
//         }
//         return total;
//     }
//     public int minEatingSpeed(int[] piles, int h) {
//         int maxele = 0; 
//         for(int i : piles){
//             maxele = Math.max(maxele,i);
//         }
//         int left = 1,right = maxele;
//         while(left <= right){
//             int mid = left+(right - left)/2;
//             int time = timetaken(piles,mid);
//             System.out.println(mid + " " +time);

//             if(time <= h){
//                 right = mid - 1 ; 
//             }
//             else if(time > h){
//                left  = mid+1;
//             }
//         }
//         return left;
//     }
// }