class Solution {
    public boolean binarySearch(int[] a, int target){
        int n = a.length;
        int l = 0, h = n - 1;
         while(l <= h){
            int mid = l + (h - l) / 2;
            if(a[mid] == target) return true;
            else if(a[mid] < target) l = mid + 1;
            else h = mid - 1;
         }
         return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] row : matrix){
            if(binarySearch(row, target)) return true;
        }
        return false;
    }
}
