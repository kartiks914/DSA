class Solution {
    public int[] findColumnWidth(int[][] grid) {
       
    int numCols = grid[0].length;
    int[] colWidths = new int[numCols];
    for (int i = 0; i < numCols; i++) {
        for (int j = 0; j < grid.length; j++) {
            int num = grid[j][i];
            int len = (num == 0) ? 1 : 0; // handle zero case
            while (num != 0) {
                len++;
                num /= 10;
            }
            if (grid[j][i] < 0) {
                len++; // add 1 for negative sign
            }
            if (len > colWidths[i]) {
                colWidths[i] = len;
            }
        }
    }
    return colWidths;
}

        
    }
