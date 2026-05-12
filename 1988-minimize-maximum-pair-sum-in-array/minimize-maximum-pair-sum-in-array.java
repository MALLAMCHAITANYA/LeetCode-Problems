class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        int sum=0;

        while(l<r){
            sum=Math.max(nums[l]+nums[r],sum);
            l++;
            r--;
        }
        return sum;
    }
}