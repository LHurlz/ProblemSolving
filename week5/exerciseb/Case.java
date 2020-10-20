package week5.exerciseb;

public class Case {
    private String model;
    private String manufacturer;
    private int powerSupply;
    private Dimension dimensions;

    public Case(String model, String manufacturer, int powerSupply, Dimension dimensions){
        setModel(model);
        setManufacturer(manufacturer);
        setPowerSupply(powerSupply);
        setDimensions(dimensions);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public void setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public String toString() {
        return " Model: " + getModel()+"  Manufacturer:  " +getManufacturer()+"  Power Supply:  "+getPowerSupply()+"V  " +
                "Dimensions:  " +getDimensions();
    }
}
