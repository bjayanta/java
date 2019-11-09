public class Rectangle {

    /*
                        * * * * * * * * *
                        *               *
                        *               *
                        *               *
                        *               *
                        * * * * * * * * *
     */
    static void rectangle_1(int n, int m) {
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= m; j++)
            {
                if (i == 1 || i == n || j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int rows = 6, columns = 20;

        rectangle_1(rows, columns);
    }
}
