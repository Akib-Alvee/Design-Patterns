abstract class Feature {
    public String name, unit;
    
    Feature(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return this.name;
    }

    abstract String getCurrentValue();
}