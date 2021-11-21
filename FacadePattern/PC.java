public class PC {
    String name;
    PC(String name){
        this.name = name;
    }

    void turnOn(){
        System.out.println(name + " is turned on.");
    }

    void turnOff(){
        System.out.println(name + " is switched off.");
    }
}
