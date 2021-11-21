public class SimpleThread implements Runnable{

    String name;
    SimpleThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        ChocolateBoiler boiler = ChocolateBoiler.getUniqueInstance(name);
        System.out.println(boiler.getStatus(name)); 
        boiler.fill(name);
        System.out.println(boiler.getStatus(name)); 
        
    }
        
}
