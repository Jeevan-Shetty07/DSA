class Solution {
    public int numRookCaptures(char[][] board) {
        int row = -1, col = -1;
        int count = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    row = i;
                    col = j;
                }
            }

        }
        for (int i = col - 1; i >= 0; i--) {
            if (board[row][i] == '.') {
                continue;
            } else if (board[row][i] == 'p') {
                count++;
                break;
            } else {
                break;
            }

        }
        for (int i = col+1; i <board[0].length; i++) {
            if (board[row][i] == '.') {
                continue;
            } else if (board[row][i] == 'p') {
                count++;
                break;
            } else {
                break;
            }

        }
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == '.') {
                continue;
            } else if (board[i][col] == 'p') {
                count++;
                break;
            } else {
                break;
            }

        }
        for (int i =row+1; i <board.length; i++) {
            if (board[i][col] == '.') {
                continue;
            } else if (board[i][col] == 'p') {
                count++;
                break;
            } else {
                break;
            }

        }
        return count;
    }
}