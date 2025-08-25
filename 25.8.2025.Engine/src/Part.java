public class Part {
    private String identifier;
    private String manufacturer;
    private String description;
    private double cost;

    public Part(String identifier, String manufacturer, String description, double cost) {
        this.identifier   = identifier;
        this.manufacturer = manufacturer;
        this.description  = description;
        this.cost         = cost;
    }
    public String getIdentifier()   { return identifier; }
    public String getDescription()  { return description; }
    public String getManufacturer() { return manufacturer; }
    public double  getCost()        { return cost; }

    @Override
    public String toString() {
        return this.description + " (" + this.cost + "€)";
    }

    @Override
    public boolean equals(Object obj) {
        Part item = (Part) obj;

        return this.description.equals(item.description)
                && this.identifier.equals(item.identifier)
                && this.manufacturer.equals(item.manufacturer)
                && this.cost == item.cost;
    }

    @Override
    public int hashCode() {
        if (this.identifier == null) {
            return this.description.hashCode();
        }
        return this.identifier.hashCode() + this.description.hashCode() + (int) cost;
    }

    protected void helloWorld() {
        System.out.println("Hello");
    }
}