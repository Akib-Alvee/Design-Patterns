public class Chocolate extends Condiment{
    Chocolate(Coffee coffee){
        this.coffee = coffee;
    }
    public String toString(){
        return coffee.toString() +", Chocolate";
    }
    int cost(){
        return coffee.cost()+50;
    }
}
