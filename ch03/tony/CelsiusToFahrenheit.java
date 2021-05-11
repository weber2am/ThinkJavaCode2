import java.util.Scanner;

/**
 * Convert Celsius to Fahrenheit
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        celsius = in.nextDouble();
        in.nextLine();
        fahrenheit = celsius * 9;
        fahrenheit = fahrenheit / 5;
        fahrenheit = fahrenheit + 32;
        System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
    }
}
