class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = r;

        while(l <= r){
          int mid = (l+r)/2;
          long t = 0;
          for(int p : piles){
            t += Math.ceil((double)p/mid);
          }

          if(t <= h){
            ans = mid;
            r = mid - 1;
          }
          else
           l = mid + 1;
        }

        return ans;
    }
}
