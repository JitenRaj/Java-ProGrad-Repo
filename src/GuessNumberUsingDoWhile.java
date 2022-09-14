import java.util.Scanner;

public class GuessNumberUsingDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberToBeGuessed = 7 ;

        System.out.println("Enter a number : ");
        int numberEnteredByUser = scan.nextInt();

        do{
            if( numberEnteredByUser > numberToBeGuessed )
                System.out.println("Too High. Try Again");

            else if( numberEnteredByUser < numberToBeGuessed)
                System.out.println("Too Low. Try Again");

            else
                System.out.println("Correct Answer.");

            System.out.println("Enter a number : ");
            numberEnteredByUser = scan.nextInt();

        } while (numberEnteredByUser != numberToBeGuessed) ;
    }
}

/*
do..while().. --> Write a program that generates a random number and
asks the user to guess what the number is. If the user's guess is
higher than the random number, the program should display "Too high, try again."
If the user's guess is lower than the random number, the program should
display "Too low, try again." The program should use a loop that repeats
until the user correctly guesses the random number.
 */
