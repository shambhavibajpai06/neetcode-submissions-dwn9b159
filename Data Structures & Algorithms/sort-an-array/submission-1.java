class Solution {

    void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        buildHeap(nums, n);

        for(int i = n-1; i>=0; i--){
            swap(nums, 0, i);
            Heapify(nums, 0, i);
        
        }
        return nums;
    }



    //Heapify
    void Heapify(int a[], int index, int n){
        int largest = index;
        int left = 2*index + 1;
        int right = 2*index + 2;

        if(left < n && a[left] > a[largest])
         largest = left;

        if(right < n && a[right] > a[largest])
         largest = right;

         if(largest != index){
            swap(a, largest, index);
            Heapify(a,largest,n);
         }
        
    }

    //Build-heap
    void buildHeap(int a[], int n){
        for(int i = n/2 + 1; i >= 0; i--){
            Heapify(a,i,n);
        }
    }
}