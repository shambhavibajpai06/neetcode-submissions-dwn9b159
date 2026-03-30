class Solution {
    public boolean unique(String s, int start, int end){
        HashSet<Character> set = new HashSet<>();

        for(int i = start; i <= end; i++){
            if(set.contains(s.charAt(i))){
            return false;
            }
            set.add(s.charAt(i));
        }
         return true;
    }
    public int lengthOfLongestSubstring(String s) {
    int n = s.length();
        int maxLen = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){

                if(unique(s, i, j)){
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}
