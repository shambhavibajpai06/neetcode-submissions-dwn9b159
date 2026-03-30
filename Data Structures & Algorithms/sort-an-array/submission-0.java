class Solution {

    //driver
    public int[] sortArray(int[] a) {
        Quicksort(a, 0, a.length - 1);
        return a;
    }
    
    //swap a[i] and a[pos]
    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //Quicksort
    void Quicksort(int[] a, int start, int end) {
        
        if(start >= end)
         return;

        int pivot = Partition(a, start, end);
        Quicksort(a,start, pivot-1);
        Quicksort(a,pivot+1, end);
    }

    //Partition algo
    int Partition(int[] a, int start, int end){
        int pos = start;
        for(int i = start; i <= end; i++){
            if(a[i] <= a[end]){
                swap(a, i, pos);
                pos++;
            }
        }
        return pos-1;
    }
}