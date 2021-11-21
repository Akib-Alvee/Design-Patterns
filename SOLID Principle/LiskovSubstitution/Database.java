public abstract class Database{
    abstract boolean connect();
    abstract String get();
    abstract void put(Object obj);
    abstract void post(Object obj);
    abstract void delete(Object obj);
    abstract void processSQLQuery(String query);
}