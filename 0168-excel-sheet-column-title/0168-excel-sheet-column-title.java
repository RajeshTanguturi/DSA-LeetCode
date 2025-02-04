class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder(); 
        while(n>0){
        // System.out.println("n"+n);
        int rem = n%26;
        n = n/26;
        if(rem == 0){
            sb.append('Z');
            n--;
        }else{
            // System.out.println((char) ('A'+ rem));
            sb.append((char) ('A'+ rem-1));
        }
     }
    //  System.out.println("the answer is "+ sb.reverse().toString());
    return sb.reverse().toString();

    }
}