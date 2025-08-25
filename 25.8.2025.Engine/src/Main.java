import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine("Moottori", "abc-123", "Finnair", "Erittäin hyvä ja nopea moottori", 500);

        System.out.println(engine.getIdentifier());
        System.out.println(engine.getEngineType());

        Part part = new Part("xyz-123", "Finnair", "Toinen moottori", 100);

        System.out.println(part.getIdentifier());
        // Part luokka ei sisällä getEngineType metodia, sillä tämä metodi on määritelty Part luokan perivässä Engine luokassa
        // System.out.println(part.getEngineType());

        Boeing bojoing = new Boeing("747", "Supernopea moottori", "abc-123", "Finnair", "Hyvä", 1000);

        System.out.println(bojoing.getEngineType());

        ArrayList<Part> lista = new ArrayList<>();

        lista.add(part);
        lista.add(engine);
        lista.add(bojoing);
        // lista.add("Merkkijono");

        Radar tutka = new Radar(100, "tutka-123", "Tutkavalmistaja Oy", "hieno tutka", 500);

        lista.add(tutka);

        System.out.println(tutka.getIdentifier());

        System.out.println("-------");

        for (Part item: lista) {
            System.out.println(item.getIdentifier() + " - " + item.getManufacturer());
            System.out.println("    " + item);
        }


        System.out.println(part.toString());
        System.out.println(part);

        System.out.println(engine);
        System.out.println(bojoing);


        Part part1 = new Part("av3698", "Toyota", "G3000", 51200f);
        Part part2 = new Part("av3698", "Garmin", "G3000", 51200f);
        if (part1.equals(part2))
            System.out.println("Parts are equal");
        else
            System.out.println("Parts are not equal");
    }
}