import java.util.Scanner;

    public class FindAverage
    {
        public static void main( String[] args )
        {
            Scanner keyboard = new Scanner(System.in);

            System.out.print( "First temperature? " );
            int num1 = keyboard.nextInt();
            keyboard.nextLine();

            System.out.print( "Second temperature? " );
            int num2 = keyboard.nextInt();

            System.out.println("The average value is : " + ((num1 + num2)/2));
        }
    }

