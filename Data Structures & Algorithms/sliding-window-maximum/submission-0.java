class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0){
            return new int[0];
        }

        Deque<Integer> dq = new LinkedList<>();
        int n = nums.length;
        int[] ans = new int[n-k+1];

        for(int i = 0; i < n; i++){
            while(!dq.isEmpty() && dq.peek() < i - k + 1){
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.offer(i);
            if(i >= k-1){
                ans[i-k+1] = nums[dq.peek()];
            }
        }
        return ans;
    }

}
