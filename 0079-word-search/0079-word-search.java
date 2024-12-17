class Solution {
    public boolean searchword(char[][] board, String word, boolean[][] visited, int row, int col, int idx) {
        // Base case: If we matched all characters in the word
        if (idx == word.length()) {
            return true;
        }

        // Out-of-bounds or already visited
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col]) {
            return false;
        }

        // Character does not match
        if (board[row][col] != word.charAt(idx)) {
            return false;
        }

        // Mark the cell as visited
        visited[row][col] = true;

        // Explore all 4 directions
        boolean found = searchword(board, word, visited, row - 1, col, idx + 1) || // Up
                        searchword(board, word, visited, row + 1, col, idx + 1) || // Down
                        searchword(board, word, visited, row, col - 1, idx + 1) || // Left
                        searchword(board, word, visited, row, col + 1, idx + 1);   // Right

        // Backtrack: Unmark the cell as visited
        visited[row][col] = false;

        return found;
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) { // Start search from matching first character
                    if (searchword(board, word, new boolean[m][n], i, j, 0)) { // Start idx = 0
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
