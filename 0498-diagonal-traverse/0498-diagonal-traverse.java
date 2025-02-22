class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        List<Integer> ans = new ArrayList<>();
       // Traversing diagonals starting from first row
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            int row = 0;
            int col = i;

            while (row < m && col >= 0) {
                temp.add(mat[row][col]);
                row++;
                col--;
            }

            // Reverse the even-indexed diagonals
            if (i % 2 == 0) {
                Collections.reverse(temp);
            }
            ans.addAll(temp);
        }

        // Traversing diagonals starting from last column (excluding first row)
        for (int i = 1; i < m; i++) {
            List<Integer> temp = new ArrayList<>();
            int row = i;
            int col = n - 1;

            while (row < m && col >= 0) {
                temp.add(mat[row][col]);
                row++;
                col--;
            }

            // Reverse the even-indexed diagonals
            if (n % 2 == 0) {
                if (i % 2 != 0) Collections.reverse(temp);
            } else {
                if (i % 2 == 0) Collections.reverse(temp);
            }
            
            ans.addAll(temp);
        }

        // Convert List to Array
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}