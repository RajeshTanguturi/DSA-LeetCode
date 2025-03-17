class Solution {
    public boolean validUtf8(int[] data) {
        int c = 0;
        for( int n : data){
            if( c == 0){
                if((n >> 7) == 0b0) continue;
                else if(( n >> 5) == 0b110) c = 1;
                else if(( n >> 4) == 0b1110) c = 2;
                else if(( n >> 3) == 0b11110) c = 3;
                else return false;
            }else{
                if((n >> 6) != 0b10) return false;
                c--;
            }
        }
        if( c == 0) return true;
        else return false;
    }
}