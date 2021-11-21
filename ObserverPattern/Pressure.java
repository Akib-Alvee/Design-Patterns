import java.util.Random;

class Pressure extends Feature {
    Pressure(){
        super("Pressure", "Pascal");
    }

    @Override
    String getCurrentValue() {
        Random rand = new Random();
        Integer val = rand.nextInt(100);
        return val.toString() + " " + this.unit;
    }
    
}