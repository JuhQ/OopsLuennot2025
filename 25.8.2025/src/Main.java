import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Car car = new Car();
        //Car car;

        //System.out.println(car);

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna nimi:");
        String string1 = scanner.nextLine();
        //String string1 = scanner.nextLine().toLowerCase();
        String string2 = "Juha";

        // if (string1 == string2) {
        if (string1.equals(string2)) {
        //if (string1.equalsIgnoreCase(string2)) {
        //if (string1.equals(string2.toLowerCase())) {
            System.out.println("Annettu arvo on Juha");
        } else {
            System.out.println("epic fail");
        }
        */

        Person omistaja = new Person();
        omistaja.nimi = "Matti";

        Bicycle pyörä = new Bicycle(omistaja, "Tunturi", 24);
        pyörä.drive();

        Person ostaja = new Person();
        ostaja.nimi = "Juha";

        pyörä.vaihdaOmistaja(ostaja);

        pyörä.drive();

    }
}