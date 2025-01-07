class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
	    int[] dp = new int[n];
        dp[0] = nums[0];
        if(n<2){
            return dp[0];
        }
        dp[1] = nums[1];
        
	    for (int i = 2; i<n; i++) {
            if(i <3){
                dp[2] = nums[2] + dp[0];
            }
            else {
                dp[i] = nums[i] + Math.max(dp[i-2], dp[i-3]);
	        }
        }
	    return Math.max(dp[n-1], dp[n-2]);
    }
}
