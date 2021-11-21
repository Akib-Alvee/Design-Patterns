public class Fan {
    String name;
    boolean state;

    Fan(String name){
        this.name = name;
        state = false;
    }

    void start(){
        System.out.println(name + " has now started.");
        state = true;
    }

    void stop(){
        System.out.println(name + " has stopped.");
        state = false;
    }
}
