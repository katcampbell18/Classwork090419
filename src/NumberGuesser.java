/*
* Random Number Guesser
* K Campbell
* 09/04/19
* */
import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        // create instance of Random
        Random random = new Random();
        long from = 1;
        long to = 100;
        int randomNumber = random.nextInt((int)(to - from + 1)) + (int)from;

        // notice the data types of the variables declared so far
        // (int) is an explicit cast that will convert a 'long' data type to an 'int' data type

        // initialize guessedNumber variable
        int guessedNumber;

        // print message to user about range of numbers to guess in
        System.out.printf("The number is between %d and %d.\n", from, to);

        // use do-while loop
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
}


