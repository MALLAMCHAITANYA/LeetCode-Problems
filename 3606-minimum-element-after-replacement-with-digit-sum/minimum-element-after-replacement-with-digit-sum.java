class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int rem=0;
            while(nums[i]>0){
                rem+=nums[i]%10;
                nums[i]/=10;
            }
            min=Math.min(rem,min);
        }
        return min;
    }
}