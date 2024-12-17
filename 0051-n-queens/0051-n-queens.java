class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        int board[][] = new int[n][n];
        backtrack(board, ans, 0);
        return ans;
    }

    public void backtrack(int[][] board, List<List<String>> ans, int idx) {
        if (idx == board.length) {
            List<String> res = new ArrayList<>();
            for(int i = 0 ; i< board.length ; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 0 ; j<board.length ; j++){
                    if(board[i][j] == 0){
                        sb.append(".");
                    }else{
                        sb.append("Q");
                    }
                }
                res.add(sb.toString());
            }
            ans.add(new ArrayList<>(res));
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, idx, i)){
                board[idx][i] = 1;// 1 represents queen
                backtrack(board, ans, idx + 1);
                board[idx][i] = 0;
            }
        }
    }

    public boolean isSafe(int board[][], int row, int col) {
        int n = board.length;

        // no need to check row as there is only one queen per row

        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check the left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check the right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

}