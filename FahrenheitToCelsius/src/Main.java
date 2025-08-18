import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double fahrenheit;
        double celsius;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give fahrenheit:");
        fahrenheit = scanner.nextDouble();
        //fahrenheit = Double.parseDouble(scanner.nextLine());

        celsius = (fahrenheit - 32) * 5/9;

        //System.out.println("Fahrenheit: " + fahrenheit + "°F");
        System.out.printf("Celsius: %.1f°C", celsius);

    }
}