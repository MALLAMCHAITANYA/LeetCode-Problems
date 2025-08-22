class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1,sufix=1,max=0;
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++){
            if(prefix==0) prefix=1;
            if(sufix==0) sufix=1;
            prefix*=nums[i];
            sufix*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(prefix,sufix));
        }
        return max;
    }
}