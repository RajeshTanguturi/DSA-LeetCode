class Solution {
    public boolean checkwinner(int[][] grid, int player) {
        if (grid[0][0] == player && grid[0][1] == player && grid[0][2] == player)
            return true;
        if (grid[1][0] == player && grid[1][1] == player && grid[1][2] == player)
            return true;
        if (grid[2][0] == player && grid[2][1] == player && grid[2][2] == player)
            return true;

        if (grid[0][0] == player && grid[1][0] == player && grid[2][0] == player)
            return true;
        if (grid[0][1] == player && grid[1][1] == player && grid[2][1] == player)
            return true;
        if (grid[0][2] == player && grid[1][2] == player && grid[2][2] == player)
            return true;

        if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player)
            return true;
        if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player)
            return true;
        return false;
    }

    public String tictactoe(int[][] moves) {
        int grid[][] = new int[3][3];
        boolean A_plays = true;
        for (int move[] : moves) {
            if (A_plays) {
                grid[move[0]][move[1]] = 1;
                if (checkwinner(grid, 1))
                    return new String("A");
            } else {
                grid[move[0]][move[1]] = 2;
                if (checkwinner(grid, 2))
                    return new String("B");
            }
            A_plays = !A_plays;
        }
        //checking pending
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                if(grid[i][j] == 0){
                    return new String("Pending");
                }
            }
        }
        return new String("Draw");
    }
}