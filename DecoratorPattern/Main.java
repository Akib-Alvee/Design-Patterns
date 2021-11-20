public class Main{
    public static void main(String[] args) {
        Coffee coffee = new DarkRoast();
        System.out.printf("%s <> %d\n",coffee,coffee.cost());

        coffee = new SweetNuts(coffee);
        System.out.printf("%s <> %d\n",coffee,coffee.cost());

        coffee = new Chocolate(coffee);
        System.out.printf("%s <> %d\n",coffee,coffee.cost());

    }
}