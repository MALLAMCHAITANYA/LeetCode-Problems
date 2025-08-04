class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int skipFirst[]=new int[n-1];
        int skipLast[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            skipFirst[i]=nums[i+1];
            skipLast[i]=nums[i];
        }
        int skipFirstLoot=robHelper(skipLast,n-1);
        int skipLastLoot=robHelper(skipFirst,n-1);
        return Math.max(skipFirstLoot,skipLastLoot);
    }
    public int robHelper(int nums[],int n){
        if(n==0) return 0;
        if(n==1) return nums[0];
        int dp[]=new int[n+1];
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
}