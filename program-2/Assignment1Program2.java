import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {

// Create instances of Scanner class//

  Scanner scanner = new Scanner(System.in);

// Taking user input for base conversion//

  System.out.println(" ");
  System.out.println("Jeff's Base Conversion Program");
  System.out.println(" ");
  System.out.print("Please enter a base (2 - 9): ");
    double first_number = scanner.nextDouble();

  double first_number_base10 = Math.pow(first_number, 4) - 1;

// Output the maximum 4-digit number in the given base//

  System.out.println(" ");
  System.out.println("The maximum, 4-digit, base 10 number in base "
   + (int) first_number + " is " + (int) first_number_base10 + ".");
  System.out.println(" ");

// Taking user input for number to be converted//

  System.out.print("Now, enter a base 10 number in the range 0 to "
   + (int) first_number_base10 + " to convert: ");
    double second_number = scanner.nextDouble();
  System.out.println(" ");

// Converting the base 10 number to the given base//

  double remainder1 = second_number % first_number;
  double division1 = (second_number - remainder1) / first_number;
  double remainder2 = division1 % first_number;
  double division2 = (division1 - remainder2) / first_number;
  double remainder3 = division2 % first_number;
  double division3 = (division2 - remainder3) / first_number;
  double remainder4 = division3 % first_number;

// Output the converted number//

  System.out.println((int) second_number + " (base 10) = "
  + (int) remainder4 + (int) remainder3 + (int) remainder2
  + (int) remainder1 + " (base " + (int) first_number + ")");
  scanner.close();
   }
  }
