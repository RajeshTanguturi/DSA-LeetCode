class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int diagSq = 0, area = 0;
        for (int[] d : dimensions) {
            int ds = d[0] * d[0] + d[1] * d[1];
            int ar = d[0] * d[1];
            if (ds > diagSq) {
                area = ar;
                diagSq = ds;
            }
            else if (ds == diagSq && ar > area) area = ar;
        }
        return area;
    }
}