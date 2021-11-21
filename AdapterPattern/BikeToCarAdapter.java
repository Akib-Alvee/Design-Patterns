public class BikeToCarAdapter extends Car {
    Bike bike;

    BikeToCarAdapter(Bike bike) {
        super(bike.weight_pound/2.20462, bike.kilometerPerLitre*0.621371);
        this.bike = bike;
    }

    @Override
    void start() {
        bike.begin();
        
    }

    @Override
    void steer(int left_right) {
        bike.control(left_right);
        
    }
    
}
