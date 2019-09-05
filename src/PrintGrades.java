import java.util.Scanner;

public class PrintGrades {
    public static void main(String[]args) {

        int score;
        String input;
        Boolean answer = null;

        Scanner keyboard = new Scanner(System.in);
        do
        {
            String grade;
            System.out.println("Enter an exam score:");
            score = keyboard.nextInt();

            if (score >= 97 && score <= 100) {
                grade = "A+";
                System.out.println("Good job. Your grade is " + grade);
            } else if (score >= 94 && score <= 96) {
                grade = "A";
                System.out.println("Good job. Your grade is " + grade);
            } else if (score >= 90 && score <= 93) {
                grade = "A-";
                System.out.println("Good job. Your grade is " + grade);
            } else if (score >= 87 && score <= 89) {
                grade = "B+";
                System.out.println("Good job. Your grade is " + grade);
            } else if (score >= 84 && score <= 86) {
                grade = "B";
                System.out.println("Good job. Your grade is " + grade);
            } else if (score >= 80 && score <= 83) {
                grade = "B-";
                System.out.println("Good job. Your grade is " + grade);
            } else if (score >= 77 && score <= 79) {
                grade = "C+";
                System.out.println("Good job. Your grade is " + grade);
            } else if (score >= 74 && score <= 76) {
                grade = "C";
                System.out.println("Good job. Your grade is " + grade);
            } else if (score >= 70 && score <= 73) {
                grade = "C-";
                System.out.println("Good job. Your grade is " + grade);
            } else if (score >= 60 && score <= 69) {
                grade = "D";
                System.out.println("Good job. Your grade is " + grade);
            } else {
                System.out.println("You failed! Go back and study more!");
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to enter another score (Y/N)?");
            input = scan.nextLine();
        }
        while(!input.equalsIgnoreCase("N"));
        }
    }

