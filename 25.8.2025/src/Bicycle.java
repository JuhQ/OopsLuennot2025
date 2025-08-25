public class Bicycle {
    private Person owner;
    private String model;
    private int gears;
    private String sound;

    public Bicycle(Person omistaja, String model, int gears, String sound) {
        this.owner = omistaja;
        this.model = model;
        this.gears = gears;
        this.sound = sound;
    }

    public void drive() {
        System.out.println(this.owner.nimi + " polkee pyörää " + this.model);
        //System.out.println(owner.nimi + " polkee pyörää " + this.model);
    }

    public void vaihdaOmistaja(Person uusiOmistaja) {
        this.owner = uusiOmistaja;
    }

    public String getSound() {
        return this.sound;
    }
}
