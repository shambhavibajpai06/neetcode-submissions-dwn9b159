class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0, r = n - 1;
        int Lmax = height[0], Rmax = height[r];
        int result = 0;

        while(l < r){
            if(height[l] < height[r]){
                Lmax = Math.max(Lmax, height[l]);
                if(Lmax - height[l] > 0){
                    result = result + (Lmax - height[l]);
                }
                l++;
            }
            else{
                Rmax = Math.max(Rmax, height[r]);
                if(Rmax - height[r] > 0){
                    result = result + (Rmax - height[r]);
                }
                r--;
            }
        }
        return result;
    }
}
