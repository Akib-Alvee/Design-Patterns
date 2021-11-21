public interface BST {
    int getMin();
    int getMax();

    void insertNum(int N);
    void deleteNum(int N);

    boolean isNumThere(int N);
    int findKthNumber(int N);
    int findNumPos(int N);

    void traverse();
}
