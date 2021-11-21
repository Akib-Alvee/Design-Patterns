public class Projector {
    String name;
    Projector(String name){
        this.name = name;
    }

    void up(){
        System.out.println(name + " is up.");
    }

    void down(){
        System.out.println(name + " is down.");
    }
}