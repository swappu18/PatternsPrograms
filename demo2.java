package patternPrograms;

public class demo2 {
    public static void main(String[] args) {
        //Table from 20 to 40
        int startRange=20;
        int endRange=40;
        // outer for loop:loops from one number to another number
        for(int number=startRange;number<=endRange;number++)
        {
            //print the Table for number
            for(int i=1;i<=10;i++)
            {
                System.out.print(i*number+ " ");
            }
            System.out.println();
        }
    }
}
