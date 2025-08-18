import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        double sumOfSquares = Math.pow(firstNumber, 2) + Math.pow(secondNumber, 2);

        System.out.println("\n");
        System.out.printf("The first number is:   %6.4f\n", firstNumber);
        System.out.printf("The first number is:   %3.4f\n", firstNumber);
        System.out.printf("The second number is:  %6.2f\n", secondNumber);
        System.out.printf("The sum of squares is: %6.2f\n", sumOfSquares);

        System.out.printf("First: %f, Second: %.3f, %d", firstNumber, secondNumber, 0);

        scanner.close();
    }
}