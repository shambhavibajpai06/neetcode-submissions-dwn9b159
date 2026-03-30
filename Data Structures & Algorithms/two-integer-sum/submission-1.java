class Solution {
    public int[] twoSum(int[] nums, int sum) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){            
            int remaining = sum - nums[i];

        if(map.containsKey(remaining)){ //O(1)
            return new int[] {map.get(remaining), i};
        }
        map.put(nums[i], i);
        }
        return new int[] {}; //Never reach here acc to problem statement
    }
}
