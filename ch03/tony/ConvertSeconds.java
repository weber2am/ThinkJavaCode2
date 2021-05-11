import java.util.Scanner;

/**
 * Convert seconds to hours, minutes, and seconds.
 */
public class ConvertSeconds {

    public static void main(String[] args) {
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;
        int seconds;
        int orig_seconds;
        int minutes;
        int hours;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        seconds = in.nextInt();
        in.nextLine();
        orig_seconds = seconds;
        hours = seconds / SECONDS_PER_HOUR;
        seconds = seconds % SECONDS_PER_HOUR;
        minutes = seconds / SECONDS_PER_MINUTE;
        seconds = seconds % SECONDS_PER_MINUTE;
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n", orig_seconds, hours, minutes, seconds);
    }
}
