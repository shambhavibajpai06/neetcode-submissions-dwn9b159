class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> subsets = new ArrayList<Integer>();

        fun(result, target, 0, subsets, nums);
        return result;
    }

    public void fun(List<List<Integer>> result, int target, int start, List<Integer> subsets, int[] nums){

        if(target == 0){
            result.add(new ArrayList<Integer>(subsets));
        }

        else if(target < 0){
        return;
        }

        for(int i = start; i < nums.length; i++){
            subsets.add(nums[i]);
            fun(result, target - nums[i], i, subsets, nums);
            subsets.remove(subsets.size() - 1); 
        }
    }

}
