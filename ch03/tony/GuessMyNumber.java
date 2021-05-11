import java.util.Random;
import java.util.Scanner;

/**
 * User guesses a random number.
 */
public class GuessMyNumber {

    public static void main(String[] args) {
        int number;
        int guess;

        Random random = new Random();
        number = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        Scanner in = new Scanner(System.in);
        guess = in.nextInt();
        in.nextLine();

        System.out.printf("Your guess is: %d\n", guess);
        System.out.printf("The number I was thinking of is: %d\n", number);
        System.out.printf("You were off by: %d\n", Math.abs(number - guess));
    }
}
