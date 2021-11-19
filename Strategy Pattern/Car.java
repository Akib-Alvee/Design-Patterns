public abstract class Car {
    HornBehavior hornBehavior;
    MoveBehavior moveBehavior;

    Car(){

    }

    public void setHornBehavior (HornBehavior hb) {
		hornBehavior = hb;
	}
 
	public void setMoveBehavior(MoveBehavior mb) {
		moveBehavior = mb;
	}


    public void performHorn() {
		hornBehavior.horn();
	}
 
	public void performMove() {
		moveBehavior.move();
	}
    
}
