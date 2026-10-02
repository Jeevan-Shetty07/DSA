class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {

        for (int i = 0; i < boxGrid.length; i++) {
            int lcount = 0;
            // boolean place = false;
            for (int j = 0; j < boxGrid[0].length; j++) {

                if (boxGrid[i][j] == '#') {
                    lcount++;
                    boxGrid[i][j] = '.';
                }
                if (boxGrid[i][j] == '*' || j == boxGrid[0].length - 1) {
                    int n = 0;
                    if (boxGrid[i][j] == '*')
                        n = j - 1;
                    else
                        n = j;

                    while (lcount > 0) {
                        boxGrid[i][n--] = '#';
                        lcount--;
                    }

                }
                // System.out.print(boxGrid[i][j]);
            }

        }
        char[][] mat = new char[boxGrid[0].length][boxGrid.length];
        for (int i = 0; i < boxGrid.length; i++) {

            for (int j = 0; j < boxGrid[0].length; j++) {
                mat[j][boxGrid.length - 1 - i] = boxGrid[i][j];
            }
        }

        return mat;
    }
}