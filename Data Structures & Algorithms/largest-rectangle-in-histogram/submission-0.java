class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if(heights == null || n == 0) return 0;

        int[] left = new int[n];
        int[] right = new int[n];

        right[n-1] = n;
        left[0] = -1;

        for(int i = 0; i < n; i++){
            int p = i - 1;
            while(p >= 0 && heights[p] > heights[i]){
                p = left[p];
            }
            left[i] = p;
        } 

        for(int i = n - 2; i >= 0; i--){
            int p = i + 1;
            while(p < n && heights[p] >= heights[i]){
                p = right[p];
            }
            right[i] = p;
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, heights[i] * (right[i] - left[i] - 1));
        }
        return max;
    }
}
