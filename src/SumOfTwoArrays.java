public class SumOfTwoArrays {


    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {6, 7, 8, 9, 10};

        for (int i = 0; i < num1.length; i++){
            System.out.println( num1[i] + " + " + num2[i] + " = " + (num1[i] + num2[i]));
        }
    }
}
