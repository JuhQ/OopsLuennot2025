import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Part, String> part_list = new HashMap<>();

        Part part3 = new Part("f9561", "Honeywell", "Primus 1000", 34100f);
        part_list.put(part3, "Airbus A400M");

        part_list.put(new Part("av3698", "Garmin", "G3000", 51200f), "Airbus A220");

        System.out.println(part_list.get(part3));
        System.out.println(part_list.get(new Part("f9561", "Honeywell", "Primus 1000", 34100f)));
        System.out.println(part_list.get(new Part(null, "Garmin", "G3000", 51200f)));

        System.out.println(part3.hashCode());
        System.out.println(new Part("f9561", "Honeywell", "Primus 1000", 34100f).hashCode());

        //System.out.println(part3.getIdentifier().hashCode());
    }
}
