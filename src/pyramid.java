public class pyramid {
    /*
            *
            * *
            * * *
            * * * *
            * * * * *
     */
    public static void example_1(int n) {
        int i, j;

        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++) {

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++) {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }

    /*
                *
              * *
            * * *
          * * * *
        * * * * *
     */
    public static void example_2(int n) {
        int i, j;

        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for(j=2*(n-i); j>=0; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }

    /*
                        *
                       *  *
                     *  *   *
                   *   *  *   *
                 *   *   *  *    *

     */

    public static void example_3(int n)
    {
        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<n; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }


    /*
            *
            * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            *
     */
    public static void example_4(int n) {
        int rows = n;

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

                        *********
                         *******
                          *****
                           ***
                            *

     */
    public static void example_5(int n) {
        int rows = n;

        for (int i=rows; i>=1; i--)
        {
            // Print star in decreasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
            // Print space in increasing order
            for (int j=rows; j>=i; j--)
            {
                System.out.print(" ");
            }

        }
    }

    public static void main(String[] args) {
        int n = 5;

        example_1(n);
        example_2(n);
        example_3(n);
        example_4(n);
        example_5(n);
    }

}
