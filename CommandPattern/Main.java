public class Main {
    public static void main(String[] args) {
        Remote remote =new Remote();

        int num_light=5,num_fan=4;
        for(int i=1;i<=num_light;i++){
            remote.setCommand(i,new LightCommand(new Light("Light "+i)));
        }

        
        for(int i=num_light+1;i<=num_light+num_fan;i++){
            remote.setCommand(i,new FanCommand(new Fan("Fan "+i)));
        }

        remote.pushButton(5);
    }
}
