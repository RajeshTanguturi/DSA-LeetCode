class Solution {
    public boolean searchword(char[][] board, String word, int row, int col, int idx) {
        // Base case: If we matched all characters in the word
        if (idx == word.length()) {
            return true;
        }

        // Out-of-bounds or already visited
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length ) {
            return false;
        }

        // Character does not match
        if (board[row][col] != word.charAt(idx)) {
            return false;
        }

        // Mark the cell as visited
        board[row][col] = '#';

        // Explore all 4 directions
        boolean found = searchword(board, word, row - 1, col, idx + 1) || // Up
                        searchword(board, word, row + 1, col, idx + 1) || // Down
                        searchword(board, word, row, col - 1, idx + 1) || // Left
                        searchword(board, word, row, col + 1, idx + 1);   // Right

        // Backtrack: Unmark the cell as visited
        board[row][col] = word.charAt(idx);

        return found;
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) { // Start search from matching first character
                    if (searchword(board, word, i, j, 0)) { // Start idx = 0
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
