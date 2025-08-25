public class Radar extends Part {

    private double peakPower;

    public Radar(double peakPower, String identifier, String manufacturer, String description, double cost) {
        super(identifier, manufacturer, description, cost);
        this.peakPower = peakPower;

        System.out.println(this.getIdentifier());

    }

    public double getPeakPower() {
        return this.peakPower;
    }

    @Override
    public String toString() {
        this.helloWorld();
        return super.toString() + ", Peak power " + this.peakPower + "kW";
    }
}
