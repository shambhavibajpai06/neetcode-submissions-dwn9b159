class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (int num : nums) {
            if (!seen.add(num)) { 
                duplicates.add(num);
            }
        }
        
        if (duplicates.isEmpty()) {
            return false;
        } else {
           return true;
        }
    }
}