abstract class JuiceMaker{
    void pourWater(){
        System.out.println("Water is poured");
    }
    void serve(){
        System.out.println("Juice is served");
    }
    void blend(Object obj){
        System.out.println(obj + " is blended. ");
    }
    void addSugar(int quantity){
        System.out.println(quantity+" spoons of sugar is added.");
    }
    void refrigerate(int time){
        System.out.println(time+" minutes in fridge.");
    }
    void makeJuice(){
        pourWater();
        customize();
        serve();
    }
    
    abstract void customize();
}

