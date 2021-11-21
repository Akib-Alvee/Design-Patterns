public abstract class Car {
    double weight_kg;
    double milage;
    Car(double weight_kg,double milage){
        this.weight_kg = weight_kg;
        this.milage = milage;
    }
    abstract void start();
    abstract void steer(int left_right);
}
