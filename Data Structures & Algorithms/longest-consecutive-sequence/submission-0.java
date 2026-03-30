class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int lcs = 1, cs = 1;
        if(n == 0) return 0;

        Arrays.sort(nums);

        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]) continue;

            if(nums[i] == nums[i-1] + 1) {
                cs++;
            }
            else{
                cs = 1;
            }
            
            lcs = Math.max(lcs, cs);
        }
       
        return lcs;
    }
}
