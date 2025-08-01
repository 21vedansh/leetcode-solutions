public class spiralMatrixll {
    public static int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int startRow = 0, startCol = 0;
        int endRow = n - 1, endCol = n - 1;
        int num = 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = num;
                num++;
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = num;
                num++;
            }
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                matrix[endRow][j] = num;
                num++;
            }
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                matrix[i][startCol] = num;
                num++;
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return matrix;
    }
    public static void display2Dmatrix(int matrix[][]) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n = 3;
        display2Dmatrix(generateMatrix(n));
    }
}