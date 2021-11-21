public class Mclaren extends Car {

    Mclaren() {
        super(2000,29.97);
    }

    @Override
    void start() {
        System.out.println("Mclaren is starting!");        
    }

    @Override
    void steer(int left_right) {
        System.out.println("Steering "+left_right);
    }
    
}
