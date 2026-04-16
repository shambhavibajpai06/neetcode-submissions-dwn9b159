class Solution {
    int[] dp;

    public int solve(int[] cost, int n){
        if(n <= 1) return 0;
        if(dp[n] != -1) return dp[n];
        if(n == 2) return Math.min(cost[0], cost[1]);
        return dp[n] = Math.min(solve(cost, n-1) + cost[n-1], solve(cost, n-2) + cost[n-2]);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(cost, n);
    }
}
