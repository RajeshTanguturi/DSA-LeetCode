class Solution {
    public boolean isBoomerang(int[][] points) {
        if( (points[0][0] == points[1][0] && points[0][1] == points[1][1]) ||
            (points[0][0] == points[2][0] && points[0][1] == points[2][1]) ||
            (points[1][0] == points[2][0] && points[1][1] == points[2][1])
         ){
            return false;
         }
        int d1 = (points[1][0] - points[0][0]);
        int n1 = (points[1][1] - points[0][1]);
        float m1 = 0; 
        if(d1 == 0 && n1!= 0){
            m1 = Integer.MAX_VALUE;
        }else{
            m1 = (n1+0.0f)/d1;
        }
        System.out.println(m1);
        int d2 = (points[2][0] - points[0][0]);
        int n2 = (points[2][1] - points[0][1]);
        float m2 = 0; 
        if(d2 == 0 && n2 != 0){
            m2 = Integer.MAX_VALUE;
        }else{
            m2 = (n2+0.0f)/d2;
        }
        System.out.println(m2);
        return m1 != m2 ;
    }
}