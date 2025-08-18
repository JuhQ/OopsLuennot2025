//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println(Math.ceil(10.45));
        System.out.println(Math.floor(10.45));
        System.out.println(Math.round(10.45));

        System.out.println(Math.pow(10, 2));

        System.out.println(Math.max(100, 5));
        System.out.println(Math.min(100, 5));

        System.out.println(Math.PI);
        System.out.println(Math.E);


        int arvo = 5;

        System.out.println(arvo);
        System.out.println((double)arvo);
        System.out.println(arvo);

        System.out.println("5 / 2 =");
        int muuttuja = arvo / 2;
        double muuttuja2 = (double) arvo / 2;

        double arvo2 = 2.5;

        System.out.println(muuttuja);
        System.out.println(muuttuja2);

        System.out.println("Double to int");
        System.out.println((int) arvo2);
        System.out.println(Math.floor(arvo2));

        System.out.println(Double.parseDouble("2.5"));
        System.out.println((int)Double.parseDouble("2.5"));

    }
}