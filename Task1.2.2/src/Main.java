import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double a = 1.0, b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku:");

        //a = scanner.nextDouble();
        //scanner.nextLine(); // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        a = Double.parseDouble(scanner.nextLine());

        System.out.println("Anna toinen luku:");

        //b = scanner.nextDouble();
        b = Double.parseDouble(scanner.nextLine());

        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double hypotenuse2 = Math.sqrt(a * a + b * b);

        System.out.println(hypotenuse);
        System.out.println(hypotenuse2);

    }
}