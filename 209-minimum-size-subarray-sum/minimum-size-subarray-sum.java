class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s=0;
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        
       
        for(int e=0;e<nums.length;e++){
            sum+=nums[e];
            while(sum>=target){
                minLen=Math.min(minLen,e-s+1);
                sum-=nums[s];
                s++;
            }
        }
        if(minLen==Integer.MAX_VALUE) return 0;
        else return minLen;
    }
}