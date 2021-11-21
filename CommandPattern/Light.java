public class Light {
    String name;
    boolean state;
    Light(String name){
        this.name = name ;
        state = false;
    }

    void on(){
        System.out.println(name + " is now on.");
        state = true;
    }

    void off(){
        System.out.println(name + " is now off.");
        state = false;
    }
}
