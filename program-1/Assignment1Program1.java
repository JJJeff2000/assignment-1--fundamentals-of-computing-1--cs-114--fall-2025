import java.util.Scanner;
import java.util.Random;

public class Assignment1Program1 {

  // Method to remove the first and last character of a string//

  public static String removeFirstAndLastChar(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        return str.substring(1, str.length() - 1);
    }
  public static void main(String[] args) {

    // Create instances of Random and Scanner classes//

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    // Make an bubble letter output of my first and last initials//
    System.out.println(" ");
    System.out.println("JJJJJJJJJJ   SSSSSSSS ");
    System.out.println("    JJ      SS      SS");
    System.out.println("    JJ      SS");
    System.out.println("    JJ      SS");
    System.out.println("    JJ      SSSSSSSSSS");
    System.out.println("    JJ              SS");
    System.out.println("JJ  JJ              SS");
    System.out.println("JJ  JJ      SS      SS");
    System.out.println(" JJJJ        SSSSSSSS ");

    /*Prompt the user for a 5-character string
    and a temperature in Fahrenheit*/

    System.out.println(" ");
    System.out.print("Please enter a 5-character string: ");
    String five_cha_string = scanner.nextLine();

    StringBuilder sb = new StringBuilder(five_cha_string);
      String reversedStringSB = sb.reverse().toString();

    String trimmString = removeFirstAndLastChar(reversedStringSB);

    System.out.println(" ");
    System.out.print("Please enter a number in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();
    double celsius = (fahrenheit - 32) * 5.0 / 9.0;

    // Generate a random integer between 32 and 16384//

    int min = 32;
    int max = 16384;
    int randomNumberInRange = random.nextInt(max - min + 1) + min;

    System.out.println(" ");
    System.out.println("Random number generated. Continuing...");

    // Output the new string, converted temperature, and random number//

    System.out.println(" ");
    System.out.println("Your new string is " + celsius + trimmString
    + randomNumberInRange);
    System.out.println(" ");

    // Close the scanner//

    scanner.close();
  }
}
