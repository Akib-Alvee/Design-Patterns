import java.util.Random;

public class MyBST implements BST{

    @Override
    public int getMin() {
        return -1;
    }

    @Override
    public int getMax() {
        return 100;
    }

    @Override
    public boolean isNumThere(int N) {
        return false;
    }

    @Override
    public int findKthNumber(int K) {
        Random rand = new Random();
        return rand.nextInt();
    }

    @Override
    public int findNumPos(int N) {
        Random rand = new Random();
        return rand.nextInt();
    }

    @Override
    public void traverse() {
        System.out.println("Traversing the tree. ");;
        
    }

    @Override
    public void insertNum(int N) {
        System.out.println(N+" is inserted");
        
    }

    @Override
    public void deleteNum(int N) {
        System.out.println(N+" is Deleted");
    }
    
}
