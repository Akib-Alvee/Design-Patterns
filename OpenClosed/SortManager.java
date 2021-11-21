class SortManager{
    SortAlgo algo;

    SortManager(int[] arr, SortAlgo algo){
        this.algo = algo;
        this.algo.arr = arr;
    }

    SortManager(int [] arr){
        this(arr, new BubbleSort());
    }

    void sort(){
        algo.sort();
    }
}