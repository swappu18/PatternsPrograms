package patternPrograms;

public class demo4 {
    public static void main(String[] args) {
        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *
        for(int row=1;row<=5;row++)


        {
            for(int space=0;space<row;space++)
            // print space
            {
                System.out.print(" ");
            }
            for(int column=5;column>=row;column--)
            {
                System.out.print("* ");
            }
            System.out.println();
         }

    }
}
