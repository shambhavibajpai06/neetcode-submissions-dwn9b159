class Solution {
    public int maxArea(int[] h) {
        int max_area = 0;
        int n = h.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int height = Math.min(h[i], h[j]);
                int width = j - i;
                int area = height * width;

                max_area = Math.max(max_area, area);
            }
        }
        return max_area;
    }
}
