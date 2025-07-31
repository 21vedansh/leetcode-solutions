import java.util.*;
public class spiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int startRow = 0, startCol = 0;
        int endRow = matrix.length-1, endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol) {
            
            for(int j = startCol; j <= endCol; j++) {
                res.add(matrix[startRow][j]);
            }
            for(int i = startRow+1; i <= endRow; i++) {
                res.add(matrix[i][endCol]);
            }
            for(int j = endCol-1; j >= startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                res.add(matrix[endRow][j]);
            }
            for(int i = endRow-1; i >= startCol+1; i--) {
                if(startCol == endCol) {
                    break;
                }
                res.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return res;
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        spiralOrder(matrix).forEach(num -> System.out.print(num+" "));
    }
}