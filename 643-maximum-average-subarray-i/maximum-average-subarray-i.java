class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int startIndex=0;
        int endIndex=k;
        int MaxSum=sum;
        while(endIndex<nums.length){
            sum-=nums[startIndex];
            startIndex++;

            sum+=nums[endIndex];
            endIndex++;

            MaxSum=Math.max(MaxSum,sum);

        }
        return (double) MaxSum/k;
    }
}