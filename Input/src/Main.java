import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna nimi: ");
        String name = scanner.nextLine();

        System.out.println("Nimi: " + name);

        System.out.print("Anna ikäsi: ");

        String ageInput = scanner.nextLine();
        int age = Integer.parseInt(ageInput);
        //double age2 = Double.parseDouble(ageInput);

        System.out.println("Ikäsi on: " + age);
        //System.out.println("Ikäsi on (double): " + age2);
/*
        System.out.println("Ikäsi viiden vuoden päästä = " + (age + 5));
        System.out.println("Ikäsi viiden vuoden päästä = " + (ageInput + 5));

        System.out.println("Ikäsi viiden vuoden päästä = " + age + 5);
        System.out.println("Ikäsi viiden vuoden päästä = " + ageInput + 5);
*/

    }
}