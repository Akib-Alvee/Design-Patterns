public class FanCommand implements Command{

    Fan fan;
    FanCommand(Fan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        if(!fan.state) fan.start();
        else fan.stop();
    }
    
}

