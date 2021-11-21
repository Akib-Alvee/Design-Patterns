public class NullCommand implements Command{

    @Override
    public void execute() {
        System.out.println("This button has yet to be assigned a valid command.");
        
    }
    
}
