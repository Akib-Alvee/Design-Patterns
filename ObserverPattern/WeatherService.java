class WeatherService extends Subject{
    WeatherService(){
        this.addFeature(new Temperature());
        this.addFeature(new Humidity());
        this.addFeature(new Pressure());
    }

    @Override
    public void addObserver(Observer ob) {
        ob_array.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        ob_array.remove(ob);
    }

    @Override
    public void notifyObservers(){
        for(Observer ob: ob_array) {
            ob.update(this);
        }
    }

    @Override
    public String toString() {
        return "WeatherService";
    }
}