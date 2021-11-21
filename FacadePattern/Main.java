public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.addLight(new Light("Light 1"));
        facade.addLight(new Light("Light 2"));
        facade.addLight(new Light("Light 3"));
        facade.addLight(new Light("Light 4"));
        facade.addLight(new Light("Light 5"));

        facade.addFan(new Fan("Fan 1"));
        facade.addFan(new Fan("Fan 2"));
        facade.addFan(new Fan("Fan 3"));
        facade.addFan(new Fan("Fan 4"));
        facade.addFan(new Fan("Fan 5"));

        facade.addPC(new PC("PC 1"));
        facade.addPC(new PC("PC 2"));
        facade.addPC(new PC("PC 3"));
        facade.addPC(new PC("PC 4"));
        facade.addPC(new PC("PC 5"));

        facade.setProjector(new Projector("Projector 1"));

        facade.startClass();
        facade.stopClass();
    }
}
