public class Bicycle {
    private Person owner;
    private String model;
    private int gears;

    public Bicycle(Person omistaja, String model, int gears) {
        this.owner = omistaja;
        this.model = model;
        this.gears = gears;
    }

    public void drive() {
        System.out.println(this.owner.nimi + " polkee pyörää " + this.model);
        //System.out.println(owner.nimi + " polkee pyörää " + this.model);
    }

    public void vaihdaOmistaja(Person uusiOmistaja) {
        this.owner = uusiOmistaja;
    }

}
