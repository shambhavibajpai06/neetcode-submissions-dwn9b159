class Solution {
    public int lastStoneWeight(int[] stones) {
        while(stones.length > 1){

        int n = stones.length;
        Arrays.sort(stones);
        int x = stones[n-2];
        int y = stones[n-1];

        int[] res;           
           
            if(x == y){
                res = new int[n-2];   
            }else{
             //Update res[] by removing x and y = y-x 
             res = new int[n-1];  
            }

            for (int i = 0; i < n - 2; i++) {
                res[i] = stones[i];
            }
            if(x != y) {
                res[n-2] = y - x;
            }
            stones = res;
        }
        // return stone[i] last remaining stone weight;
        if(stones.length == 1) return stones[0];
        else return 0;
       
    }
}
