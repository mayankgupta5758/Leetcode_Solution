package Arrays;
import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int startCol = 0;
        int startRow = 0;
        int lastRow = arr.length - 1;
        int lastCol = arr[0].length - 1;
        List<Integer> list = new ArrayList<>();

        while (startCol <= lastCol && startRow <= lastRow) {
            for (int i = startCol; i <= lastCol; i++) {
                list.add(arr[startRow][i]);
            }

            for (int i = startRow + 1; i <= lastRow; i++) {
                list.add(arr[i][lastCol]);
            }

            for (int i = lastCol - 1; i >= startCol; i--) {
                if (startRow == lastRow) {
                    break;
                }
                list.add(arr[lastRow][i]);
            }

            for (int i = lastRow - 1; i >= startRow + 1; i--) {
                if (startCol == lastCol) {
                    break;
                }
                list.add(arr[i][startCol]);
            }

            startCol++;
            startRow++;
            lastCol--;
            lastRow--;
        }
        return list;
    }
}