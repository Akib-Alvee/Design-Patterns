public class Prototype {
    public static void main(String[] args) {
        Villain v = new VillainType1(100,200);
        System.out.println(v);

        Villain clone = v.makeClone();
        System.out.println(clone);
    }
}
