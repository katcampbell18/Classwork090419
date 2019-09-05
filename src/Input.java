import java.util.Scanner;

public class Input {
    public static void main(PetQuestions[]args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter  your first initial:");
        String firstInitial = keyboard.nextLine();

        System.out.println("Enter your last name:");
        String lastName = keyboard.nextLine();

        System.out.println("Enter your house number:");
        int houseNumber = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter your street name:");
        String streetName = keyboard.nextLine();

        System.out.println("Enter your street type:");
        String streetType = keyboard.nextLine();

        System.out.println("Enter your city:");
        String city = keyboard.nextLine();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
