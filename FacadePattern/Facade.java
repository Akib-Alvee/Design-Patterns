import java.util.ArrayList;

class Facade{
    ArrayList<Light> light_arr = new ArrayList<>();
    ArrayList<Fan> fan_arr = new ArrayList<>();
    ArrayList<PC> pc_arr = new ArrayList<>();
    Projector projector;

    void addLight(Light light){
        light_arr.add(light);
    }

    
    void addFan(Fan fan){
        fan_arr.add(fan);
    }

    void setProjector(Projector proj){
        this.projector = proj;
    }
    
    void addPC(PC pc){
        pc_arr.add(pc);
    }

    void startClass(){
        for(Light light:light_arr) light.on();
        for(Fan fan:fan_arr) fan.start();
        for(PC pc:pc_arr) pc.turnOn();
        projector.down();
    }

    
    void stopClass(){
        for(Light light:light_arr) light.off();
        for(Fan fan:fan_arr) fan.stop();
        for(PC pc:pc_arr) pc.turnOff();
        projector.up();
    }
}