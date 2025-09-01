//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            int result = numbers[5]; // Accessing an element outside the array bounds
            System.out.println("Result: " + result); // This line will not be executed

        } catch (Exception e) {
            System.out.println("VIRHE ArrayIndexOutOfBoundsException: " + e.getMessage());
            e.printStackTrace();

        } finally {
            System.out.println("Mennään finallyyn");
        }

        System.out.println("Koodajan elämä on kivaa ja stressivapaata");
    }
}