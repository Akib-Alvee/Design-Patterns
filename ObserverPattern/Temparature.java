import java.util.Random;

class Temperature extends Feature {
    Temperature(){
        super("Temperature", "Celsius");
    }

    @Override
    String getCurrentValue() {
        Random rand = new Random();
        Integer val = rand.nextInt(100);
        return val.toString() + " " + this.unit;
    }
    
}