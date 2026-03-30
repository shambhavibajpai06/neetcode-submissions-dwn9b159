class Solution {
    public int characterReplacement(String s, int k) {

        int a[] = new int[26];
        int l = 0;
        int r = 0;
        int ans = 0;
        int max = 0;

        for(; r < s.length(); r++){
            max = Math.max(max, ++a[s.charAt(r) - 'A']);
            if(r - l + 1 - max > k){
                a[s.charAt(l) - 'A']--;
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
        
    }
}
