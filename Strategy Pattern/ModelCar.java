public class ModelCar extends Car{

    public ModelCar(){
        moveBehavior = new MoveSlowly();
        hornBehavior = new BoringHorn();
    }

}

