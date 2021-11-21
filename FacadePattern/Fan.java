public class Fan {
    String name;
    Fan(String name){
        this.name = name;
    }

    void start(){
        System.out.println(name + " has now started.");
    }

    void stop(){
        System.out.println(name + " has stopped.");
    }
}
