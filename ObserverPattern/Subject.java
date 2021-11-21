import java.util.ArrayList;
import java.util.HashMap;

abstract class Subject{
    ArrayList<Observer> ob_array = new ArrayList<>();
    HashMap<String, Feature> features = new HashMap<>();

    abstract void addObserver(Observer ob);
    abstract void removeObserver(Observer ob);
    abstract void notifyObservers();

    void addFeature(Feature f) {
        features.put(f.name, f);
        System.out.printf("Added <%s> to <%s>\n",f,this);
    }    
    void removeFeature(Feature f) {
        features.remove(f.name);
        System.out.printf("Removed <%s> from <%s>\n",f,this);
    }
    void removeFeature(String feature_name) {
        features.remove(feature_name);
        System.out.printf("Removed <%s> from <%s>\n",feature_name,this);
    }

    public abstract String toString(); 

}