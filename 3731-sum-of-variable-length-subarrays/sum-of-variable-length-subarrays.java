class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int start=Math.max(0,i-nums[i]);start<=i;start++){
                sum+=nums[start];
            }
        }
        return sum;
    }
}