public class ProCar extends Car{

    public ProCar(){
        moveBehavior = new MoveRocket();
        hornBehavior = new DiscoHorn();
    }

    
}