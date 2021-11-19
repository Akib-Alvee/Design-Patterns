public class CarRacingGame {

    public static void main(String[] args) {
        Car model = new ModelCar();
        model.performMove();
        model.performHorn();

        model.setHornBehavior(new DiscoHorn());
        model.setMoveBehavior(new MoveRocket());

        System.out.println("No more long I am a noob. Now I'm Pro !");

        model.performMove();
        model.performHorn(); 
        
        
    }
    
}
