public abstract class Bike {
    double weight_pound;
    double kilometerPerLitre;
    Bike(double weight_pound,double kilometerPerLitre){
        this.weight_pound = weight_pound;
        this.kilometerPerLitre = kilometerPerLitre;
    }
    abstract void begin();
    abstract void control(int left_right);
}
