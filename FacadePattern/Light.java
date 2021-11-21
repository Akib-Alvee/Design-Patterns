public class Light {
    String name;
    Light(String name){
        this.name = name;
    }

    void on(){
        System.out.println(name + " is now on.");
    }

    void off(){
        System.out.println(name + " is now off.");
    }
}
