class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int tSum=0;
        int lSum=0;
        for(int i=0;i<nums.length;i++){
            tSum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            lSum+=nums[i];
            int rSum=tSum-lSum;
            if((rSum-lSum)%2==0){
                count++;
            }
        }
        return count;
    }
}