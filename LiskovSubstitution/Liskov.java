public class Liskov {
    public static void main(String[] args) {
        MySQL sql = new MySQL();
        Checker check = new Checker();
        check.check(sql);
    }
}
