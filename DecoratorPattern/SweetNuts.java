public class SweetNuts extends Condiment {
    SweetNuts(Coffee coffee){
        this.coffee = coffee;
    }
    public String toString(){
        return coffee.toString() +", Sweet Nuts";
    }
    int cost(){
        return coffee.cost()+30;
    }
}
