class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length == 1){
             return new int[]{0};
        }
        int[] ans = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
           for(int j = i + 1; j < temperatures.length; j++){
            if(temperatures[j] > temperatures[i]){
                ans[i] = j - i;
                break;
                }
            }
        }
         return ans;

    }
}