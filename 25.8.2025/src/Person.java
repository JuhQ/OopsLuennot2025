public class Person {
    public String nimi;

    public void drive(Bicycle bike, int km) {
        System.out.println("Lähdetään sotkemaan");
        System.out.println(this.nimi + " polkee");

        for (int i = 1; i <= km; i++) {
            System.out.println(bike.getSound() + " " + i + "km travelled");
        }
    }
}
