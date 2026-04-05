class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        func(0, nums, new ArrayList(), ans);
        return ans;
    }

    public void func(int idx, int[] nums, List<Integer> curr,  List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));
        int n = nums.length;
        for(int i = idx; i < n; i++){
            curr.add(nums[i]);
            func(i+1, nums, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}
