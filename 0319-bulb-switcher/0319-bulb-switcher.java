class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
        // // if( n == 0 || n == 1 ) return n;
        // boolean bulbs[] = new boolean[n];
        // for( int i = 0 ; i<n ; i+=2 ){
        //     bulbs[i] = true;
        // }
        // // for( int i = 1 ; i < n ; i+=2 ){
        // //     bulbs[i] = false;
        // // }
        // // System.out.println(Arrays.toString(bulbs));
        // for( int i = 2 ; i<n ; i++ ){
        //     for( int j = i ; j < n ; j=j+i+1 ){
        //         bulbs[j] = !bulbs[j];
        //     }
        //     // System.out.println(i+" "+Arrays.toString(bulbs));
        // }
        // // System.out.println(Arrays.toString(bulbs));
        // int onCount = 0;
        // for( int i = 0 ; i < n ; i++){
        //     if(bulbs[i]) onCount++;
        // }
        // return onCount;
    }
}