import java.util.Random;

public class ChocolateBoiler{
    private boolean empty,boiled;
    private int signature; 

    public String toString(){
        return "ChocolateBoiler  <"+signature+" >";
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
    private static ChocolateBoiler uniqueInstance = null;

    private ChocolateBoiler(String msg){
        empty = true;
        boiled = false;
        signature = new Random().nextInt(1000000);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
        }

        System.out.println(msg+ " >>> Created Chocolate Boiler < "+this+" >");
    }

    public String getStatus(String msg){
        return msg+" <> "+this+" <empty: "+this.empty+" ,boiled: "+this.boiled +" >";
    }

    public static ChocolateBoiler getUniqueInstance(String msg){
        System.out.println(msg + " >>> accessed method.");
        synchronized(ChocolateBoiler.class){
            if(uniqueInstance == null){
                System.out.println(msg+ " sync method::: Creating Chocolate Boiler instance for the first and last time");
                uniqueInstance=new ChocolateBoiler(msg);
            }
            else{
                System.out.println(msg + "  <<Instance exists>> ");
            }
        }

        return uniqueInstance;
    }

    public synchronized void fill(String msg){
        if(isEmpty()){
            System.out.println(msg+" >>>> "+this+ "  >> Filling Chocolate and Milk.");
            empty = false;
        }
        else{
            System.out.println(msg+" >>>> "+this+ " >> Can't fill as Boiler isn't empty");
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            System.out.println(this+ ">> Boiling Chocolate and Milk");
            boiled = true;
        }
        else{
            if(isEmpty()) System.out.println("Can't boil as Boiler is Empty");
            else System.out.println(this+ ">> Can't boil as already boiled.");
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            System.out.println(this+ ">> Draining chocolate mixture.");
            empty = true;
        }
        else{
            if(isEmpty()) System.out.println(this+ ">> Can't drain as boiler isn't empty");
            else System.out.println(this+ ">> Can't drain as not boiled yet.");
        }
    }
}