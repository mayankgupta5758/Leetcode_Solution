public class Spiral_Matrix54 {

    static void hells(int[][] matrix) {
        int left = 0;
        int top = 0;
        int right = matrix.length;
        // int botttom = matrix[0].length;

        for (int i = left; i < right; i++) {
            System.out.println(matrix[i][top]);
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        hells(matrix);

    }
}
