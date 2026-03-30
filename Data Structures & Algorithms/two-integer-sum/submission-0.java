class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>(); //map is created

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];        //difference of target anf=d current element

            if (m.containsKey(diff)) {
                return new int[] { m.get(diff), i };
            }
            m.put(nums[i], i);
        }
        return new int[] {};
    }
}
//Dry run 
// Input: 
// nums = [3,4,5,6], target = 7
// m= empty i=0 diff=4 if(m.contains(4)) == false    m.put(3,0)
// m=>3=0 i=1 diff=3 if(m.contains(3)) == true return(m.get(3)=0,1) Output:[0,1]

  
