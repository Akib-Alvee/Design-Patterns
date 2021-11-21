class GoogleMap implements Observer {
    @Override
    public void update(Subject sub) {
        System.out.println("Update called from " + this);
        System.out.printf("Temperature %s\n", sub.features.get("Temperature").getCurrentValue() );         
    }

    public String toString() {
        return "Google Map";
    }
}