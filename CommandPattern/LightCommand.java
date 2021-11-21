public class LightCommand implements Command{

    Light light;
    LightCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        if(!light.state) light.on();
        else light.off();
    }
    
}
