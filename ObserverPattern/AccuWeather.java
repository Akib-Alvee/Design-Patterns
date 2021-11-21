class AccuWeather implements Observer {
    @Override
    public void update(Subject sub) {
        System.out.println("Update called from " + this);
        System.out.printf("Temperature %s\n", sub.features.get("Temperature").getCurrentValue() );
        System.out.printf("Pressure %s\n", sub.features.get("Pressure").getCurrentValue());
    }

    public String toString() {
        return "AccuWeather";
    }
}