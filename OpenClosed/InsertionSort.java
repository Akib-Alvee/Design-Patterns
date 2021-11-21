class InsertionSort extends SortAlgo{
    void sort(){
        System.out.println("doing insertion sort");
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]) swap(i, j);
            }
        }
    }
}