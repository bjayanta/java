public class SumOf2DArray {

    public static void main(String[] args) {
        int[][] num1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] num2 = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

        for (int i = 0; i < num1.length; i++){
            for (int j = 0; j < num1[i].length; j++){
                System.out.println(num1[i][j] + " + " + num2[i][j] + " = " + (num1[i][j] + num2[i][j]));
            }
        }
    }
}
