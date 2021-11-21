public class MySQL extends Database {

    public String toString(){
        return "<<<<MySQL Database>>>>";
    }

    @Override
    boolean connect() {
        System.out.println("Connected to "+ this);
        return true;
    }

    @Override
    String get() {
        System.out.println("Get from "+this);
        return null;
    }

    @Override
    void put(Object obj) {
        System.out.println("Put from "+this);
        
    }

    @Override
    void post(Object obj) {
        System.out.println("Post from "+this);
    }

    void processSQLQuery(String query){
        System.out.println("Processing Sql query: "+query+"  "+this);
    }

    @Override
    void delete(Object obj) {
        
    }
    
}
