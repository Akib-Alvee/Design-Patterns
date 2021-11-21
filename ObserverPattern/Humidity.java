import java.util.Random;

class Humidity extends Feature {
    Humidity(){
        super("Humidity", "Percentage");
    }

    @Override
    String getCurrentValue() {
        Random rand = new Random();
        Integer val = rand.nextInt(100);
        return val.toString() + " " + this.unit;
    }    
}