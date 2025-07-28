class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxSoFar=nums[0];
        int maxEndingHere=nums[0];
        int minEndingHere=nums[0];
        for(int i=1;i<n;i++){
            int current=nums[i];
            int tempMax=maxEndingHere;

            maxEndingHere=Math.max(current,Math.max(current*maxEndingHere,current*minEndingHere));
            minEndingHere=Math.min(current,Math.min(current*tempMax,current*minEndingHere));

            maxSoFar=Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }
}