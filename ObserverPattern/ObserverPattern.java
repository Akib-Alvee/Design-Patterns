public class ObserverPattern {
    public static void main(String[] args) {
        Subject weather = new WeatherService();
        
        Observer Gmap = new GoogleMap();
        Observer accu = new AccuWeather();
        
        weather.addObserver(Gmap);
        weather.addObserver(accu);
        
        weather.notifyObservers();

        weather.removeObserver(accu);
        weather.notifyObservers();
    }
}