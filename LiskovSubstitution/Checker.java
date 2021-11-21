public class Checker {
    void check(MySQL db){
        db.connect();
        db.get();
        db.put(db);
        db.post(db);
        db.processSQLQuery("query");
    }
}
