abstract class SortAlgo{
    int[] arr;

    void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    abstract void sort();
}