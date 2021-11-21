public class Suzuki extends Bike {

    Suzuki() {
        super(2000, 75.56);
    }

    @Override
    void begin() {
        System.out.println("Suzuki is starting!");        
    }

    @Override
    void control(int left_right) {
        System.out.println("Steering "+left_right);
    }
    
}
