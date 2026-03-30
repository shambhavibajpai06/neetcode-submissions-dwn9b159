class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return;
    }

    void mergeSort(int a[], int start, int end){
        if(start >= end){
            return;
        }

        int mid = start + (end-start)/2;
        mergeSort(a, start, mid);
        mergeSort(a, mid+1, end);
        merge(a, start, mid, end);
    
    }

    void merge(int a[], int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int left = start, right = mid+1, idx = 0;

        while(left <= mid && right <= end){
            if(a[left] <= a[right]){
                temp[idx++] = a[left++];
            }
            else{
                temp[idx++] = a[right++];
            }
        }

            while(left <= mid){
                temp[idx++] = a[left++];
            }

            while(right <= end){
                temp[idx++] = a[right++];
        }

        idx = 0;
        while(start<=end){
            a[start++] = temp[idx++];
        }
        } 
    }
