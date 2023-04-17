class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
         
        List<Integer> result = new ArrayList<>();

        while (startRow <= endRow && startCol <= endCol) {
            // left to right row
            for (int i = startCol; i <= endCol; i++) {
                result.add(matrix[startRow][i]);
            }
            // up to down column
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            // right to left row
            for (int i = endCol - 1; i >= startCol && startRow != endRow; i--) {
                result.add(matrix[endRow][i]);
            }
            // down to up column
            for (int i = endRow - 1; i >= startRow + 1 && startCol != endCol; i--) {
                result.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        
        return result;
    }
}
